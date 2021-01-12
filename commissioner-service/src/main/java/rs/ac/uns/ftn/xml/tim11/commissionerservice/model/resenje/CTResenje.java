
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CTResenje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTResenje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganVlasti"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                 &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTUstanova"/&gt;
 *         &lt;element name="Ishod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTResenje", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", propOrder = {
    "organVlasti",
    "ctUstanova",
    "ishod"
})
public class CTResenje {

    @XmlElement(name = "OrganVlasti", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTResenje.OrganVlasti organVlasti;
    @XmlElement(name = "CTUstanova", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTUstanova ctUstanova;
    @XmlElement(name = "Ishod", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected String ishod;

    /**
     * Gets the value of the organVlasti property.
     * 
     * @return
     *     possible object is
     *     {@link CTResenje.OrganVlasti }
     *     
     */
    public CTResenje.OrganVlasti getOrganVlasti() {
        return organVlasti;
    }

    /**
     * Sets the value of the organVlasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTResenje.OrganVlasti }
     *     
     */
    public void setOrganVlasti(CTResenje.OrganVlasti value) {
        this.organVlasti = value;
    }

    /**
     * Gets the value of the ctUstanova property.
     * 
     * @return
     *     possible object is
     *     {@link CTUstanova }
     *     
     */
    public CTUstanova getCTUstanova() {
        return ctUstanova;
    }

    /**
     * Sets the value of the ctUstanova property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUstanova }
     *     
     */
    public void setCTUstanova(CTUstanova value) {
        this.ctUstanova = value;
    }

    /**
     * Gets the value of the ishod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIshod() {
        return ishod;
    }

    /**
     * Sets the value of the ishod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIshod(String value) {
        this.ishod = value;
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
    public static class OrganVlasti {

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
