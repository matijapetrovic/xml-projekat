package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ZalbaNaCutanjeMetadataSearchRequest")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZalbaNaCutanjeMetadataSearchRequest {
	@XmlElement(name = "NazivOrganaVlasti", required = true)
    protected String nazivOrganaVlasti;

    @XmlElement(name = "ImePodnosioca", required = true)
    protected String imePodnosioca;

    @XmlElement(name = "PrezimePodnosioca", required = true)
    protected String prezimePodnosioca;
    
    @XmlElement(name = "podnesenU", required = true)
    protected String podnesenU;	

    @XmlElement(name = "podnesenDatuma", required = true)
    protected String podnesenDatuma;
}