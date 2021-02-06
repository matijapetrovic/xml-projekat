
package rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje;

import javax.xml.bind.annotation.*;
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
 *         &lt;element name="Ustanova" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTUstanova"/&gt;
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
    "ustanova",
    "zakon"
})
public class CTPostupak {

    @XmlElement(name = "DatumPostupka", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPostupka;
    @XmlElement(name = "Ustanova", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTUstanova ustanova;
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
     * Gets the value of the ustanova property.
     * 
     * @return
     *     possible object is
     *     {@link CTUstanova }
     *     
     */
    public CTUstanova getUstanova() {
        return ustanova;
    }

    /**
     * Sets the value of the ustanova property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUstanova }
     *     
     */
    public void setUstanova(CTUstanova value) {
        this.ustanova = value;
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
