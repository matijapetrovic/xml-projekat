package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OdbijenZahtev")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RejectZahtevRequest {

    @XmlElement(name = "Poruka")
    private String poruka;
}
