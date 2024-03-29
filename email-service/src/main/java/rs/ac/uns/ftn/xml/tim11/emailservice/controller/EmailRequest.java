package rs.ac.uns.ftn.xml.tim11.emailservice.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Email")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequest {
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
