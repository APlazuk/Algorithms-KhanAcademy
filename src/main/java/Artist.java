import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Artist {
    private int id;
    @JacksonXmlProperty(localName = "firstname")
    private String firstName;
    @JacksonXmlProperty(localName = "lastname")
    private String lastName;
    private String pseudonym;
    private String profession;
    private boolean alive;
}
