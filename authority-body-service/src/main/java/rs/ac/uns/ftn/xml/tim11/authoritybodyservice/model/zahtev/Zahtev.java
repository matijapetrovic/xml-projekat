
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev;

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
 *         &lt;element name="Organ" type="{http://www.ftn.uns.ac.rs/xml/tim11/zahtev}CTOrgan"/&gt;
 *         &lt;element name="Zahtevi" type="{http://www.ftn.uns.ac.rs/xml/tim11/zahtev}CTZahtevi"/&gt;
 *         &lt;element name="OpisInformacije" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OstaliPodaci" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTOstaliPodaci"/&gt;
 *         &lt;element name="TrazilacInformacija" type="{http://www.ftn.uns.ac.rs/xml/tim11/zahtev}CTTrazilacInformacija"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vocab" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="http://www.ftn.uns.ac.rs/xml/tim11/predicate/" /&gt;
 *       &lt;attribute name="about" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="prihvacen" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organ",
    "zahtevi",
    "opisInformacije",
    "ostaliPodaci",
    "trazilacInformacija"
})
@XmlRootElement(name = "Zahtev", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev")
public class Zahtev {

    @XmlElement(name = "Organ", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    protected CTOrgan organ;
    @XmlElement(name = "Zahtevi", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    protected CTZahtevi zahtevi;
    @XmlElement(name = "OpisInformacije", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    protected String opisInformacije;
    @XmlElement(name = "OstaliPodaci", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    protected CTOstaliPodaci ostaliPodaci;
    @XmlElement(name = "TrazilacInformacija", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    protected CTTrazilacInformacija trazilacInformacija;
    @XmlAttribute(name = "vocab", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String vocab;
    @XmlAttribute(name = "about", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String about;
    @XmlAttribute(name = "prihvacen")
    protected Boolean prihvacen;

    /**
     * Gets the value of the organ property.
     * 
     * @return
     *     possible object is
     *     {@link CTOrgan }
     *     
     */
    public CTOrgan getOrgan() {
        return organ;
    }

    /**
     * Sets the value of the organ property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOrgan }
     *     
     */
    public void setOrgan(CTOrgan value) {
        this.organ = value;
    }

    /**
     * Gets the value of the zahtevi property.
     * 
     * @return
     *     possible object is
     *     {@link CTZahtevi }
     *     
     */
    public CTZahtevi getZahtevi() {
        return zahtevi;
    }

    /**
     * Sets the value of the zahtevi property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZahtevi }
     *     
     */
    public void setZahtevi(CTZahtevi value) {
        this.zahtevi = value;
    }

    /**
     * Gets the value of the opisInformacije property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpisInformacije() {
        return opisInformacije;
    }

    /**
     * Sets the value of the opisInformacije property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpisInformacije(String value) {
        this.opisInformacije = value;
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
     * Gets the value of the trazilacInformacija property.
     * 
     * @return
     *     possible object is
     *     {@link CTTrazilacInformacija }
     *     
     */
    public CTTrazilacInformacija getTrazilacInformacija() {
        return trazilacInformacija;
    }

    /**
     * Sets the value of the trazilacInformacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTrazilacInformacija }
     *     
     */
    public void setTrazilacInformacija(CTTrazilacInformacija value) {
        this.trazilacInformacija = value;
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
     * Gets the value of the prihvacen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrihvacen() {
        return prihvacen;
    }

    /**
     * Sets the value of the prihvacen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrihvacen(Boolean value) {
        this.prihvacen = value;
    }

}
