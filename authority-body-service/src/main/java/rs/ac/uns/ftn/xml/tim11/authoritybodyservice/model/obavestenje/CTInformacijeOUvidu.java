
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CTInformacijeOUvidu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTInformacijeOUvidu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datum"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                 &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Satnica" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="SatnicaOd" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="SatnicaDo" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="Adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/obavestenje}CTAdresa"/&gt;
 *         &lt;element name="BrojKancelarije" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTInformacijeOUvidu", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", propOrder = {
    "datum",
    "satnica",
    "satnicaOd",
    "satnicaDo",
    "adresa",
    "brojKancelarije"
})
public class CTInformacijeOUvidu {

    @XmlElement(name = "Datum", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected CTInformacijeOUvidu.Datum datum;
    @XmlElement(name = "Satnica", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnica;
    @XmlElement(name = "SatnicaOd", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnicaOd;
    @XmlElement(name = "SatnicaDo", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnicaDo;
    @XmlElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected CTAdresa adresa;
    @XmlElement(name = "BrojKancelarije", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger brojKancelarije;

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link CTInformacijeOUvidu.Datum }
     *     
     */
    public CTInformacijeOUvidu.Datum getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTInformacijeOUvidu.Datum }
     *     
     */
    public void setDatum(CTInformacijeOUvidu.Datum value) {
        this.datum = value;
    }

    /**
     * Gets the value of the satnica property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnica() {
        return satnica;
    }

    /**
     * Sets the value of the satnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnica(XMLGregorianCalendar value) {
        this.satnica = value;
    }

    /**
     * Gets the value of the satnicaOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnicaOd() {
        return satnicaOd;
    }

    /**
     * Sets the value of the satnicaOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnicaOd(XMLGregorianCalendar value) {
        this.satnicaOd = value;
    }

    /**
     * Gets the value of the satnicaDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnicaDo() {
        return satnicaDo;
    }

    /**
     * Sets the value of the satnicaDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnicaDo(XMLGregorianCalendar value) {
        this.satnicaDo = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link CTAdresa }
     *     
     */
    public CTAdresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAdresa }
     *     
     */
    public void setAdresa(CTAdresa value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the brojKancelarije property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojKancelarije() {
        return brojKancelarije;
    }

    /**
     * Sets the value of the brojKancelarije property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojKancelarije(BigInteger value) {
        this.brojKancelarije = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
     *       &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Datum {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "property", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String property;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets the value of the property property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty() {
            return property;
        }

        /**
         * Sets the value of the property property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty(String value) {
            this.property = value;
        }

    }

}
