
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CTPostupak complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTPostupak"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatumPostupka" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTUstanova"/&gt;
 *         &lt;element name="Zakon" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTZakon"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTPostupak", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", propOrder = {
    "datumPostupka",
    "ctUstanova",
    "zakon"
})
public class CTPostupak {

    @XmlElement(name = "DatumPostupka", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPostupka;
    @XmlElement(name = "CTUstanova", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTUstanova ctUstanova;
    @XmlElement(name = "Zakon", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTZakon zakon;

    /**
     * Gets the value of the datumPostupka property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPostupka() {
        return datumPostupka;
    }

    /**
     * Sets the value of the datumPostupka property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPostupka(XMLGregorianCalendar value) {
        this.datumPostupka = value;
    }

    /**
     * Gets the value of the ctUstanova property.
     * 
     * @return
     *     possible object is
     *     {@link CTUstanova }
     *     
     */
    public CTUstanova getCTUstanova() {
        return ctUstanova;
    }

    /**
     * Sets the value of the ctUstanova property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUstanova }
     *     
     */
    public void setCTUstanova(CTUstanova value) {
        this.ctUstanova = value;
    }

    /**
     * Gets the value of the zakon property.
     * 
     * @return
     *     possible object is
     *     {@link CTZakon }
     *     
     */
    public CTZakon getZakon() {
        return zakon;
    }

    /**
     * Sets the value of the zakon property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZakon }
     *     
     */
    public void setZakon(CTZakon value) {
        this.zakon = value;
    }

}
