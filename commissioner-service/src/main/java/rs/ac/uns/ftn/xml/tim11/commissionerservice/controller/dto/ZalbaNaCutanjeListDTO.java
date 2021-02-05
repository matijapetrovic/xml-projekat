package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "zalbaNaCutanje"
})
@XmlRootElement(name = "ZalbeNaCutanje")
public class ZalbaNaCutanjeListDTO {
	@XmlElement(name = "ZalbaNaCutanje")
    protected List<ZalbaCutanje> zalbaNaCutanje;

    public List<ZalbaCutanje> getZalbaNaCutanje() {
        if (zalbaNaCutanje == null)
        	zalbaNaCutanje = new ArrayList<>();
        return zalbaNaCutanje;
    }

    public void setZalbaNaCutanje(List<ZalbaCutanje> zalbaNaCutanje) {
        this.zalbaNaCutanje = zalbaNaCutanje;
    }

}
