package XML;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

//Парсинг XML документа <settings>
@XmlRootElement(name = "settings")
@Getter
@Setter
@NoArgsConstructor
public class XMLparserSettings {

        @XmlElement(name = "page")
        private XMLparserPage page;

        @XmlElementWrapper(name="columns")
        @XmlElement(name = "column")
        private List<XMLparserColumn> columns;

}
