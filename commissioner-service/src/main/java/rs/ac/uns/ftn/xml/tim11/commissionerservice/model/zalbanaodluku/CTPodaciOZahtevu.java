
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CTPodaciOZahtevu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTPodaciOZahtevu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatumZahteva" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TrazenaInformacija" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTPodaciOZahtevu", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/common", propOrder = {
    "datumZahteva",
    "trazenaInformacija"
})
public class CTPodaciOZahtevu {

    @XmlElement(name = "DatumZahteva", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/common", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZahteva;
    @XmlElement(name = "TrazenaInformacija", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/common", required = true)
    protected String trazenaInformacija;

    /**
     * Gets the value of the datumZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZahteva() {
        return datumZahteva;
    }

    /**
     * Sets the value of the datumZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZahteva(XMLGregorianCalendar value) {
        this.datumZahteva = value;
    }

    /**
     * Gets the value of the trazenaInformacija property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrazenaInformacija() {
        return trazenaInformacija;
    }

    /**
     * Sets the value of the trazenaInformacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrazenaInformacija(String value) {
        this.trazenaInformacija = value;
    }

}
