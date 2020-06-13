package XML;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


//Парсинг XML документа <column>
@XmlRootElement(name = "column")
@Getter
@Setter
@NoArgsConstructor
public class XMLparserColumn {

    @XmlElement(name = "title")
    private String title;

    @XmlElement(name = "width")
    private int width;
}

