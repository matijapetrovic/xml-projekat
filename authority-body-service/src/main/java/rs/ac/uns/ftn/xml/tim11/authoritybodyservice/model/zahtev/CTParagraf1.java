
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CTParagraf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTParagraf1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="stav" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="zakon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sluzbeniGlasnik"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="naziv"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                           &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="brojevi"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="broj" maxOccurs="unbounded"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;pattern value="[1-9][0-9]*\/[0-9]{2}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTParagraf1", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", propOrder = {
    "clan",
    "stav",
    "zakon",
    "sluzbeniGlasnik"
})
public class CTParagraf1 {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger clan;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stav;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    protected String zakon;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    protected CTParagraf1 .SluzbeniGlasnik sluzbeniGlasnik;

    /**
     * Gets the value of the clan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClan() {
        return clan;
    }

    /**
     * Sets the value of the clan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClan(BigInteger value) {
        this.clan = value;
    }

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStav(BigInteger value) {
        this.stav = value;
    }

    /**
     * Gets the value of the zakon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZakon() {
        return zakon;
    }

    /**
     * Sets the value of the zakon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZakon(String value) {
        this.zakon = value;
    }

    /**
     * Gets the value of the sluzbeniGlasnik property.
     * 
     * @return
     *     possible object is
     *     {@link CTParagraf1 .SluzbeniGlasnik }
     *     
     */
    public CTParagraf1 .SluzbeniGlasnik getSluzbeniGlasnik() {
        return sluzbeniGlasnik;
    }

    /**
     * Sets the value of the sluzbeniGlasnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTParagraf1 .SluzbeniGlasnik }
     *     
     */
    public void setSluzbeniGlasnik(CTParagraf1 .SluzbeniGlasnik value) {
        this.sluzbeniGlasnik = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="naziv"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                 &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="brojevi"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="broj" maxOccurs="unbounded"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;pattern value="[1-9][0-9]*\/[0-9]{2}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "naziv",
        "brojevi"
    })
    public static class SluzbeniGlasnik {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
        protected CTParagraf1 .SluzbeniGlasnik.Naziv naziv;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
        protected CTParagraf1 .SluzbeniGlasnik.Brojevi brojevi;

        /**
         * Gets the value of the naziv property.
         * 
         * @return
         *     possible object is
         *     {@link CTParagraf1 .SluzbeniGlasnik.Naziv }
         *     
         */
        public CTParagraf1 .SluzbeniGlasnik.Naziv getNaziv() {
            return naziv;
        }

        /**
         * Sets the value of the naziv property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTParagraf1 .SluzbeniGlasnik.Naziv }
         *     
         */
        public void setNaziv(CTParagraf1 .SluzbeniGlasnik.Naziv value) {
            this.naziv = value;
        }

        /**
         * Gets the value of the brojevi property.
         * 
         * @return
         *     possible object is
         *     {@link CTParagraf1 .SluzbeniGlasnik.Brojevi }
         *     
         */
        public CTParagraf1 .SluzbeniGlasnik.Brojevi getBrojevi() {
            return brojevi;
        }

        /**
         * Sets the value of the brojevi property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTParagraf1 .SluzbeniGlasnik.Brojevi }
         *     
         */
        public void setBrojevi(CTParagraf1 .SluzbeniGlasnik.Brojevi value) {
            this.brojevi = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="broj" maxOccurs="unbounded"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="[1-9][0-9]*\/[0-9]{2}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
            "broj"
        })
        public static class Brojevi {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
            protected List<String> broj;

            /**
             * Gets the value of the broj property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the broj property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBroj().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getBroj() {
                if (broj == null) {
                    broj = new ArrayList<String>();
                }
                return this.broj;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
        public static class Naziv {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String type;
            @XmlAttribute(name = "property", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String property;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
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

}