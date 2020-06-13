package XML;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "page")
@Getter
@Setter
@NoArgsConstructor
public class XMLparserPage {

    @XmlElement(name = "width")
    private int width;

    @XmlElement(name = "height")
    private int height;
}
