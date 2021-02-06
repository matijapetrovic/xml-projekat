
package rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CTPozivNaZakon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTPozivNaZakon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zakon" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTZakon"/&gt;
 *         &lt;element name="BrojeviSluzbenogGlasnika"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Broj" maxOccurs="unbounded"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[1-9][0-9]*<!---->/[0-9]{2}"/&gt;
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
@XmlType(name = "CTPozivNaZakon", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", propOrder = {
    "zakon",
    "brojeviSluzbenogGlasnika"
})
public class CTPozivNaZakon {

    @XmlElement(name = "Zakon", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTZakon zakon;
    @XmlElement(name = "BrojeviSluzbenogGlasnika", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTPozivNaZakon.BrojeviSluzbenogGlasnika brojeviSluzbenogGlasnika;

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
     * Gets the value of the brojeviSluzbenogGlasnika property.
     *
     * @return
     *     possible object is
     *     {@link CTPozivNaZakon.BrojeviSluzbenogGlasnika }
     *
     */
    public CTPozivNaZakon.BrojeviSluzbenogGlasnika getBrojeviSluzbenogGlasnika() {
        return brojeviSluzbenogGlasnika;
    }

    /**
     * Sets the value of the brojeviSluzbenogGlasnika property.
     *
     * @param value
     *     allowed object is
     *     {@link CTPozivNaZakon.BrojeviSluzbenogGlasnika }
     *
     */
    public void setBrojeviSluzbenogGlasnika(CTPozivNaZakon.BrojeviSluzbenogGlasnika value) {
        this.brojeviSluzbenogGlasnika = value;
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
     *         &lt;element name="Broj" maxOccurs="unbounded"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[1-9][0-9]*<!---->/[0-9]{2}"/&gt;
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
    public static class BrojeviSluzbenogGlasnika {

        @XmlElement(name = "Broj", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
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

}
