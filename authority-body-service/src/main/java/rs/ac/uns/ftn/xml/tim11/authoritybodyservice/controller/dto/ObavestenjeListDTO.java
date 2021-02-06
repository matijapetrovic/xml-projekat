package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.dto;


import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "obavestenje"
})
@XmlRootElement(name = "Obavestenja")
public class ObavestenjeListDTO {
    @XmlElement(name = "Obavestenje")
    protected List<Obavestenje> obavestenje;

    public List<Obavestenje> getObavestenje() {
        if (obavestenje == null)
            obavestenje = new ArrayList<>();
        return obavestenje;
    }

    public void setObavestenje(List<Obavestenje> obavestenje) {
        this.obavestenje = obavestenje;
    }
}
