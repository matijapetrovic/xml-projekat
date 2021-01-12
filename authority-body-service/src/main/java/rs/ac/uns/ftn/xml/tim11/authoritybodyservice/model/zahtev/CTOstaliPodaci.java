
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CTOstaliPodaci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTOstaliPodaci"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mesto"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="([A-Z][a-z]+)(\s[A-Z][a-z]+)*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="trazilacInformacija" type="{zahtev}CTTrazilacInformacija"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTOstaliPodaci", namespace = "zahtev", propOrder = {
    "mesto",
    "datum",
    "trazilacInformacija"
})
public class CTOstaliPodaci {

    @XmlElement(namespace = "zahtev", required = true)
    protected String mesto;
    @XmlElement(namespace = "zahtev", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(namespace = "zahtev", required = true)
    protected CTTrazilacInformacija trazilacInformacija;

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesto(String value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
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

}
