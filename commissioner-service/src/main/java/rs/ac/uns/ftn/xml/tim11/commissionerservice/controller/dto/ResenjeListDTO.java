package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "resenje"
})
@XmlRootElement(name = "Resenja")
public class ResenjeListDTO {
    @XmlElement(name = "Resenje")
    protected List<Resenje> resenje;

    public List<Resenje> getResenje() {
        if (resenje == null)
            resenje = new ArrayList<>();
        return resenje;
    }

    public void setResenje(List<Resenje> resenje) {
        this.resenje = resenje;
    }

}
