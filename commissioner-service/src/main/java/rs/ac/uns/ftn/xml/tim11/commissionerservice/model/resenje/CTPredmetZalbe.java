
package rs.uns.ftn.xml.tim11.poc.resenje.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CTPredmetZalbe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTPredmetZalbe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatumIzjave" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="OrganVlasti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatumPotrazivanjaInformacija" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTPredmetZalbe", namespace = "resenje", propOrder = {
    "datumIzjave",
    "organVlasti",
    "datumPotrazivanjaInformacija"
})
public class CTPredmetZalbe {

    @XmlElement(name = "DatumIzjave", namespace = "resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumIzjave;
    @XmlElement(name = "OrganVlasti", namespace = "resenje", required = true)
    protected String organVlasti;
    @XmlElement(name = "DatumPotrazivanjaInformacija", namespace = "resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPotrazivanjaInformacija;

    /**
     * Gets the value of the datumIzjave property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumIzjave() {
        return datumIzjave;
    }

    /**
     * Sets the value of the datumIzjave property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumIzjave(XMLGregorianCalendar value) {
        this.datumIzjave = value;
    }

    /**
     * Gets the value of the organVlasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganVlasti() {
        return organVlasti;
    }

    /**
     * Sets the value of the organVlasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganVlasti(String value) {
        this.organVlasti = value;
    }

    /**
     * Gets the value of the datumPotrazivanjaInformacija property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPotrazivanjaInformacija() {
        return datumPotrazivanjaInformacija;
    }

    /**
     * Sets the value of the datumPotrazivanjaInformacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPotrazivanjaInformacija(XMLGregorianCalendar value) {
        this.datumPotrazivanjaInformacija = value;
    }

    @Override
    public String toString() {
        return "\t\t\tDatum izjave: " + getDatumIzjave() + "\n" +
                "\t\t\tOrgan vlasti: " + getOrganVlasti() + "\n" +
                "\t\t\tDatum potrazivanja informacija: " + getDatumPotrazivanjaInformacija();
    }
}
