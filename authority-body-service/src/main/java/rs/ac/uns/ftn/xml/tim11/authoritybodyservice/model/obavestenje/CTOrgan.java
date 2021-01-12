
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTOrgan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTOrgan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sediste" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTOrgan", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", propOrder = {
    "naziv",
    "sediste"
})
public class CTOrgan {

    @XmlElement(name = "Naziv", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected String naziv;
    @XmlElement(name = "Sediste", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected String sediste;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the sediste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSediste() {
        return sediste;
    }

    /**
     * Sets the value of the sediste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSediste(String value) {
        this.sediste = value;
    }

}
