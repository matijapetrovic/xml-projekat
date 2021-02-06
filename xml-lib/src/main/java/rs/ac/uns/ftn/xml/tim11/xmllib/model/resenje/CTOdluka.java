
package rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


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
 *         &lt;element name="Mesto"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                 &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    protected CTOdluka.Mesto mesto;
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
     *     {@link CTOdluka.Mesto }
     *
     */
    public CTOdluka.Mesto getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     *
     * @param value
     *     allowed object is
     *     {@link CTOdluka.Mesto }
     *
     */
    public void setMesto(CTOdluka.Mesto value) {
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
    public static class Mesto {

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
