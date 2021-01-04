
package rs.uns.ftn.xml.tim11.poc.zahtev.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="posta" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="elektronskaPosta" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="faks" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="drugo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="opis"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "posta",
        "elektronskaPosta",
        "faks",
        "drugo"
})
@XmlRootElement(name = "CTNacinDostave", namespace = "zahtev")
public class CTNacinDostave {

    @XmlElement(namespace = "zahtev")
    protected Object posta;
    @XmlElement(namespace = "zahtev")
    protected Object elektronskaPosta;
    @XmlElement(namespace = "zahtev")
    protected Object faks;
    @XmlElement(namespace = "zahtev")
    protected CTNacinDostave.Drugo drugo;

    /**
     * Gets the value of the posta property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getPosta() {
        return posta;
    }

    /**
     * Sets the value of the posta property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setPosta(Object value) {
        this.posta = value;
    }

    /**
     * Gets the value of the elektronskaPosta property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getElektronskaPosta() {
        return elektronskaPosta;
    }

    /**
     * Sets the value of the elektronskaPosta property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setElektronskaPosta(Object value) {
        this.elektronskaPosta = value;
    }

    /**
     * Gets the value of the faks property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getFaks() {
        return faks;
    }

    /**
     * Sets the value of the faks property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setFaks(Object value) {
        this.faks = value;
    }

    /**
     * Gets the value of the drugo property.
     *
     * @return
     *     possible object is
     *     {@link CTNacinDostave.Drugo }
     *
     */
    public CTNacinDostave.Drugo getDrugo() {
        return drugo;
    }

    /**
     * Sets the value of the drugo property.
     *
     * @param value
     *     allowed object is
     *     {@link CTNacinDostave.Drugo }
     *
     */
    public void setDrugo(CTNacinDostave.Drugo value) {
        this.drugo = value;
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
     *         &lt;element name="opis"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
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
            "opis"
    })
    public static class Drugo {

        @XmlElement(namespace = "zahtev", required = true)
        protected String opis;

        /**
         * Gets the value of the opis property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOpis() {
            return opis;
        }

        /**
         * Sets the value of the opis property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOpis(String value) {
            this.opis = value;
        }

    }

    @Override
    public String toString() {

        String retVal = "";
        if(getPosta() != null)
            retVal += "\n\t\t\t\t\t-postom\n";
        if(getElektronskaPosta() != null)
            retVal += "\n\t\t\t\t\t-elektronskom postom\n";
        if(getFaks() != null)
            retVal += "\n\t\t\t\t\t-faksom\n";
        if(getDrugo() != null) {
            retVal += "\n\t\t\t\t\t-na drugi nacin: " + getDrugo().getOpis();
        }
        return retVal;

    }
}
