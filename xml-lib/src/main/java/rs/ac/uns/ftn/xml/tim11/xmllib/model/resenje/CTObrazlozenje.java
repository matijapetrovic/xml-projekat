
package rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="PredmetZalbe" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTPredmetZalbe"/&gt;
 *         &lt;element name="Postupak" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTPostupak"/&gt;
 *         &lt;element name="Odluka" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTOdluka"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="about" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="vocab" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTObrazlozenje", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", propOrder = {
    "predmetZalbe",
    "postupak",
    "odluka"
})
public class CTObrazlozenje {

    @XmlElement(name = "PredmetZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTPredmetZalbe predmetZalbe;
    @XmlElement(name = "Postupak", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTPostupak postupak;
    @XmlElement(name = "Odluka", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTOdluka odluka;
    @XmlAttribute(name = "about", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String about;
    @XmlAttribute(name = "vocab", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String vocab;

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

    /**
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbout(String value) {
        this.about = value;
    }

    /**
     * Gets the value of the vocab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocab() {
        return vocab;
    }

    /**
     * Sets the value of the vocab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocab(String value) {
        this.vocab = value;
    }

}
