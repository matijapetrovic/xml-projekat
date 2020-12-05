
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTSadrzaj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTSadrzaj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paragraf1" type="{http://zahtevcir}CTParagraf1"/&gt;
 *         &lt;element name="zahtevi" type="{http://zahtevcir}CTZahtevi"/&gt;
 *         &lt;element name="ostaliPodaci" type="{http://zahtevcir}CTOstaliPodaci"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTSadrzaj", namespace = "http://zahtevcir", propOrder = {
    "paragraf1",
    "zahtevi",
    "ostaliPodaci"
})
public class CTSadrzaj {

    @XmlElement(namespace = "http://zahtevcir", required = true)
    protected CTParagraf1 paragraf1;
    @XmlElement(namespace = "http://zahtevcir", required = true)
    protected CTZahtevi zahtevi;
    @XmlElement(namespace = "http://zahtevcir", required = true)
    protected CTOstaliPodaci ostaliPodaci;

    /**
     * Gets the value of the paragraf1 property.
     * 
     * @return
     *     possible object is
     *     {@link CTParagraf1 }
     *     
     */
    public CTParagraf1 getParagraf1() {
        return paragraf1;
    }

    /**
     * Sets the value of the paragraf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTParagraf1 }
     *     
     */
    public void setParagraf1(CTParagraf1 value) {
        this.paragraf1 = value;
    }

    /**
     * Gets the value of the zahtevi property.
     * 
     * @return
     *     possible object is
     *     {@link CTZahtevi }
     *     
     */
    public CTZahtevi getZahtevi() {
        return zahtevi;
    }

    /**
     * Sets the value of the zahtevi property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZahtevi }
     *     
     */
    public void setZahtevi(CTZahtevi value) {
        this.zahtevi = value;
    }

    /**
     * Gets the value of the ostaliPodaci property.
     * 
     * @return
     *     possible object is
     *     {@link CTOstaliPodaci }
     *     
     */
    public CTOstaliPodaci getOstaliPodaci() {
        return ostaliPodaci;
    }

    /**
     * Sets the value of the ostaliPodaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOstaliPodaci }
     *     
     */
    public void setOstaliPodaci(CTOstaliPodaci value) {
        this.ostaliPodaci = value;
    }

}
