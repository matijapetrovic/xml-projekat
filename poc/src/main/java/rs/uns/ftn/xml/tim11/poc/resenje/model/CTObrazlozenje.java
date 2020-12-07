
package rs.uns.ftn.xml.tim11.poc.resenje.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTObrazlozenje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTObrazlozenje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PredmetZalbe" type="{resenje}CTPredmetZalbe"/&gt;
 *         &lt;element name="Postupak" type="{resenje}CTPostupak"/&gt;
 *         &lt;element name="Odluka" type="{resenje}CTOdluka"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTObrazlozenje", namespace = "resenje", propOrder = {
    "predmetZalbe",
    "postupak",
    "odluka"
})
public class CTObrazlozenje {

    @XmlElement(name = "PredmetZalbe", namespace = "resenje", required = true)
    protected CTPredmetZalbe predmetZalbe;
    @XmlElement(name = "Postupak", namespace = "resenje", required = true)
    protected CTPostupak postupak;
    @XmlElement(name = "Odluka", namespace = "resenje", required = true)
    protected CTOdluka odluka;

    /**
     * Gets the value of the predmetZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link CTPredmetZalbe }
     *     
     */
    public CTPredmetZalbe getPredmetZalbe() {
        return predmetZalbe;
    }

    /**
     * Sets the value of the predmetZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPredmetZalbe }
     *     
     */
    public void setPredmetZalbe(CTPredmetZalbe value) {
        this.predmetZalbe = value;
    }

    /**
     * Gets the value of the postupak property.
     * 
     * @return
     *     possible object is
     *     {@link CTPostupak }
     *     
     */
    public CTPostupak getPostupak() {
        return postupak;
    }

    /**
     * Sets the value of the postupak property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPostupak }
     *     
     */
    public void setPostupak(CTPostupak value) {
        this.postupak = value;
    }

    /**
     * Gets the value of the odluka property.
     * 
     * @return
     *     possible object is
     *     {@link CTOdluka }
     *     
     */
    public CTOdluka getOdluka() {
        return odluka;
    }

    /**
     * Sets the value of the odluka property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOdluka }
     *     
     */
    public void setOdluka(CTOdluka value) {
        this.odluka = value;
    }

    @Override
    public String toString() {
        return "\t\tPredmet zalbe: \n" + getPredmetZalbe() + "\n" +
                "\t\tPostupak: \n" + getPostupak() + "\n" +
                "\t\tOdluka: \n" + getOdluka();
    }
}
