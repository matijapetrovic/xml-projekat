package rs.ac.uns.ftn.xml.tim11.xmllib.email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@XmlType(name = "", propOrder = {
        "to",
        "subject",
        "text",
        "pdfAttachment",
        "xhtmlAttachment"
})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Email")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessage {
    @XmlElement(name = "to")
    private String to;
    @XmlElement(name = "subject")
    private String subject;
    @XmlElement(name = "text")
    private String text;
    @XmlElement(name = "pdfAttachment")
    private byte[] pdfAttachment;
    @XmlElement(name = "xhtmlAttachment")
    private byte[] xhtmlAttachment;
}