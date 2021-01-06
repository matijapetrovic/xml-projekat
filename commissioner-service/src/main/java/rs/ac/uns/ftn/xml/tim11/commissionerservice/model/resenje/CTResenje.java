
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="OrganVlasti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    protected String organVlasti;
    @XmlElement(name = "CTUstanova", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTUstanova ctUstanova;
    @XmlElement(name = "Ishod", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected String ishod;

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

}
