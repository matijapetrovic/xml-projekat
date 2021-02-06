package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "zalbaNaOdluku"
})
@XmlRootElement(name = "ZalbeNaOdluku")
public class ZalbaNaOdlukuListDTO {
	@XmlElement(name = "ZalbaNaOdluku")
    protected List<ZalbaNaOdluku> zalbeNaOdluku;

    public List<ZalbaNaOdluku> getZalbaNaOdluku() {
        if (zalbeNaOdluku == null)
        	zalbeNaOdluku = new ArrayList<>();
        return zalbeNaOdluku;
    }

    public void setZalbaNaOdluku(List<ZalbaNaOdluku> zalbaNaOdluku) {
        this.zalbeNaOdluku = zalbaNaOdluku;
    }
}
