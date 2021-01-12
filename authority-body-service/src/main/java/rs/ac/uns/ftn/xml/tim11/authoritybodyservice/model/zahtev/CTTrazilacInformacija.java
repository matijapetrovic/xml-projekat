
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTTrazilacInformacija complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTTrazilacInformacija"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z][a-z]+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="prezime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z][a-z]+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="adresa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kontakt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTTrazilacInformacija", namespace = "zahtev", propOrder = {
    "ime",
    "prezime",
    "adresa",
    "kontakt"
})
public class CTTrazilacInformacija {

    @XmlElement(namespace = "zahtev", required = true)
    protected String ime;
    @XmlElement(namespace = "zahtev", required = true)
    protected String prezime;
    @XmlElement(namespace = "zahtev", required = true)
    protected String adresa;
    @XmlElement(namespace = "zahtev", required = true)
    protected String kontakt;

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresa(String value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontakt() {
        return kontakt;
    }

    /**
     * Sets the value of the kontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontakt(String value) {
        this.kontakt = value;
    }

}
