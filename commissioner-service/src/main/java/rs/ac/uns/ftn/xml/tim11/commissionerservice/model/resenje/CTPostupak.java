
package rs.uns.ftn.xml.tim11.poc.resenje.model;

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
 *         &lt;element ref="{resenje}CTUstanova"/&gt;
 *         &lt;element name="Zakon" type="{resenje}CTZakon"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTPostupak", namespace = "resenje", propOrder = {
    "datumPostupka",
    "ctUstanova",
    "zakon"
})
public class CTPostupak {

    @XmlElement(name = "DatumPostupka", namespace = "resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPostupka;
    @XmlElement(name = "CTUstanova", namespace = "resenje", required = true)
    protected CTUstanova ctUstanova;
    @XmlElement(name = "Zakon", namespace = "resenje", required = true)
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

    @Override
    public String toString() {
        return "\t\t\tDatum postupka: " + getDatumPostupka() + "\n" +
                "\t\t\tUstanova: \n" + getCTUstanova() + "\n" +
                "\t\t\tZakon: \n" + getZakon();
    }
}
