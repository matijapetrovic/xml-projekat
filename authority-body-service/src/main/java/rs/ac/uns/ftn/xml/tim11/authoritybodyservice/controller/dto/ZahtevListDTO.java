package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.dto;


import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "zahtev"
})
@XmlRootElement(name = "Zahtevi")
public class ZahtevListDTO {
    @XmlElement(name = "Zahtev")
    protected List<Zahtev> zahtev;

    public List<Zahtev> getZahtev() {
        if (zahtev == null)
            zahtev = new ArrayList<>();
        return zahtev;
    }

    public void setZahtev(List<Zahtev> zahtev) {
        this.zahtev = zahtev;
    }
}
