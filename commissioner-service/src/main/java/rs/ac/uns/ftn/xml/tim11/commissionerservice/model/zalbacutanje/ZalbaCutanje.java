
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganVlasti" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTOrganVlasti"/&gt;
 *         &lt;element name="RazlogSlanja"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NijePostupio"/&gt;
 *               &lt;enumeration value="NijePostupioUCelosti"/&gt;
 *               &lt;enumeration value="UZakonsomRoku"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PodaciOZahtevu" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTPodaciOZahtevu"/&gt;
 *         &lt;element name="PodnosilacZalbe" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTPodnosilacZalbe"/&gt;
 *         &lt;element name="OstaliPodaci" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTOstaliPodaci"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vocab" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="http://www.ftn.uns.ac.rs/xml/tim11/predicate/" /&gt;
 *       &lt;attribute name="about" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="rel" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="pred:zalbaNa" /&gt;
 *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organVlasti",
    "razlogSlanja",
    "podaciOZahtevu",
    "podnosilacZalbe",
    "ostaliPodaci"
})
@XmlRootElement(name = "ZalbaCutanje", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
public class ZalbaCutanje {

    @XmlElement(name = "OrganVlasti", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected CTOrganVlasti organVlasti;
    @XmlElement(name = "RazlogSlanja", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected String razlogSlanja;
    @XmlElement(name = "PodaciOZahtevu", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected CTPodaciOZahtevu podaciOZahtevu;
    @XmlElement(name = "PodnosilacZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected CTPodnosilacZalbe podnosilacZalbe;
    @XmlElement(name = "OstaliPodaci", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected CTOstaliPodaci ostaliPodaci;
    @XmlAttribute(name = "vocab", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String vocab;
    @XmlAttribute(name = "about", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String about;
    @XmlAttribute(name = "rel", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rel;
    @XmlAttribute(name = "href", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String href;

    /**
     * Gets the value of the organVlasti property.
     * 
     * @return
     *     possible object is
     *     {@link CTOrganVlasti }
     *     
     */
    public CTOrganVlasti getOrganVlasti() {
        return organVlasti;
    }

    /**
     * Sets the value of the organVlasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOrganVlasti }
     *     
     */
    public void setOrganVlasti(CTOrganVlasti value) {
        this.organVlasti = value;
    }

    /**
     * Gets the value of the razlogSlanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazlogSlanja() {
        return razlogSlanja;
    }

    /**
     * Sets the value of the razlogSlanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazlogSlanja(String value) {
        this.razlogSlanja = value;
    }

    /**
     * Gets the value of the podaciOZahtevu property.
     * 
     * @return
     *     possible object is
     *     {@link CTPodaciOZahtevu }
     *     
     */
    public CTPodaciOZahtevu getPodaciOZahtevu() {
        return podaciOZahtevu;
    }

    /**
     * Sets the value of the podaciOZahtevu property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPodaciOZahtevu }
     *     
     */
    public void setPodaciOZahtevu(CTPodaciOZahtevu value) {
        this.podaciOZahtevu = value;
    }

    /**
     * Gets the value of the podnosilacZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link CTPodnosilacZalbe }
     *     
     */
    public CTPodnosilacZalbe getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPodnosilacZalbe }
     *     
     */
    public void setPodnosilacZalbe(CTPodnosilacZalbe value) {
        this.podnosilacZalbe = value;
    }

    /**
     * Gets the value of the ostaliPodaci property.
     * 
     * @return
     *     possible object is
     *     {@link CTOstaliPodaci }
     *     
     */
    public CTOstaliPodaci getOstaliPodaci() {
        return ostaliPodaci;
    }

    /**
     * Sets the value of the ostaliPodaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOstaliPodaci }
     *     
     */
    public void setOstaliPodaci(CTOstaliPodaci value) {
        this.ostaliPodaci = value;
    }

    /**
     * Gets the value of the vocab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocab() {
        if (vocab == null) {
            return "http://www.ftn.uns.ac.rs/xml/tim11/predicate/";
        } else {
            return vocab;
        }
    }

    /**
     * Sets the value of the vocab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocab(String value) {
        this.vocab = value;
    }

    /**
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbout(String value) {
        this.about = value;
    }

    /**
     * Gets the value of the rel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRel() {
        if (rel == null) {
            return "pred:zalbaNa";
        } else {
            return rel;
        }
    }

    /**
     * Sets the value of the rel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRel(String value) {
        this.rel = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

}
