
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primalac"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="naziv" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                 &lt;attribute name="adresa" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sadrzaj" type="{zahtev}CTSadrzaj"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "primalac",
    "naslov",
    "sadrzaj"
})
@XmlRootElement(name = "Zahtev", namespace = "zahtev")
public class Zahtev {

    @XmlElement(namespace = "zahtev", required = true)
    protected Zahtev.Primalac primalac;
    @XmlElement(namespace = "zahtev", required = true)
    protected String naslov;
    @XmlElement(namespace = "zahtev", required = true)
    protected CTSadrzaj sadrzaj;

    /**
     * Gets the value of the primalac property.
     * 
     * @return
     *     possible object is
     *     {@link Zahtev.Primalac }
     *     
     */
    public Zahtev.Primalac getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zahtev.Primalac }
     *     
     */
    public void setPrimalac(Zahtev.Primalac value) {
        this.primalac = value;
    }

    /**
     * Gets the value of the naslov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaslov() {
        return naslov;
    }

    /**
     * Sets the value of the naslov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaslov(String value) {
        this.naslov = value;
    }

    /**
     * Gets the value of the sadrzaj property.
     * 
     * @return
     *     possible object is
     *     {@link CTSadrzaj }
     *     
     */
    public CTSadrzaj getSadrzaj() {
        return sadrzaj;
    }

    /**
     * Sets the value of the sadrzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSadrzaj }
     *     
     */
    public void setSadrzaj(CTSadrzaj value) {
        this.sadrzaj = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="naziv" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *       &lt;attribute name="adresa" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Primalac {

        @XmlAttribute(name = "naziv")
        @XmlSchemaType(name = "anySimpleType")
        protected String naziv;
        @XmlAttribute(name = "adresa")
        @XmlSchemaType(name = "anySimpleType")
        protected String adresa;

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

    }

}
