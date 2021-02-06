
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
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
    "content"
})
public class CTObrazlozenje {

    @XmlElementRefs({
        @XmlElementRef(name = "PredmetZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", type = JAXBElement.class),
        @XmlElementRef(name = "Postupak", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", type = JAXBElement.class),
        @XmlElementRef(name = "Odluka", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "about", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String about;
    @XmlAttribute(name = "vocab", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String vocab;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CTPredmetZalbe }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPostupak }{@code >}
     * {@link JAXBElement }{@code <}{@link CTOdluka }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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
