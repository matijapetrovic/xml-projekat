
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTOdluka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTOdluka"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zakon" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTZakon"/&gt;
 *         &lt;element name="Lice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Iznos" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTOdluka", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", propOrder = {
    "zakon",
    "lice",
    "mesto",
    "iznos"
})
public class CTOdluka {

    @XmlElement(name = "Zakon", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTZakon zakon;
    @XmlElement(name = "Lice", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected String lice;
    @XmlElement(name = "Mesto", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected String mesto;
    @XmlElement(name = "Iznos", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger iznos;

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

    /**
     * Gets the value of the lice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLice() {
        return lice;
    }

    /**
     * Sets the value of the lice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLice(String value) {
        this.lice = value;
    }

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
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIznos(BigInteger value) {
        this.iznos = value;
    }

}
