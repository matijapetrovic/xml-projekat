
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

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
@XmlType(name = "CTPredmetZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", propOrder = {
    "datumIzjave",
    "organVlasti",
    "datumPotrazivanjaInformacija"
})
public class CTPredmetZalbe {

    @XmlElement(name = "DatumIzjave", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumIzjave;
    @XmlElement(name = "OrganVlasti", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected String organVlasti;
    @XmlElement(name = "DatumPotrazivanjaInformacija", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
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

}
