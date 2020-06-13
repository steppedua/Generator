package TSV;

import XML.XMLparserSettings;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


//Парсинг XML файла с помощью JAXB
public class XMLparser {

    private static XMLparserSettings Settings;

    public static void parse(String fileName) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(XMLparserSettings.class);
            XMLStreamReader xss = XMLInputFactory.newFactory().createXMLStreamReader(new FileInputStream(fileName));
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            xss.nextTag();
            Settings = (XMLparserSettings) unmarshaller.unmarshal(xss);
        } catch (XMLStreamException | JAXBException | FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
