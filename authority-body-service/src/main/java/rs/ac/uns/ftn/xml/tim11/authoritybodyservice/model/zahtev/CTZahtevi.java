
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTZahtevi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTZahtevi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Obavestenje" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Uvid" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Kopija" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DostavljanjeKopije" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NacinDostave" type="{http://www.ftn.uns.ac.rs/xml/tim11/zahtev}CTNacinDostave"/&gt;
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
@XmlType(name = "CTZahtevi", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", propOrder = {
    "obavestenje",
    "uvid",
    "kopija",
    "dostavljanjeKopije"
})
public class CTZahtevi {

    @XmlElement(name = "Obavestenje", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev")
    protected Object obavestenje;
    @XmlElement(name = "Uvid", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev")
    protected Object uvid;
    @XmlElement(name = "Kopija", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev")
    protected Object kopija;
    @XmlElement(name = "DostavljanjeKopije", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev")
    protected CTZahtevi.DostavljanjeKopije dostavljanjeKopije;

    /**
     * Gets the value of the obavestenje property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObavestenje() {
        return obavestenje;
    }

    /**
     * Sets the value of the obavestenje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObavestenje(Object value) {
        this.obavestenje = value;
    }

    /**
     * Gets the value of the uvid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUvid() {
        return uvid;
    }

    /**
     * Sets the value of the uvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUvid(Object value) {
        this.uvid = value;
    }

    /**
     * Gets the value of the kopija property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKopija() {
        return kopija;
    }

    /**
     * Sets the value of the kopija property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKopija(Object value) {
        this.kopija = value;
    }

    /**
     * Gets the value of the dostavljanjeKopije property.
     * 
     * @return
     *     possible object is
     *     {@link CTZahtevi.DostavljanjeKopije }
     *     
     */
    public CTZahtevi.DostavljanjeKopije getDostavljanjeKopije() {
        return dostavljanjeKopije;
    }

    /**
     * Sets the value of the dostavljanjeKopije property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZahtevi.DostavljanjeKopije }
     *     
     */
    public void setDostavljanjeKopije(CTZahtevi.DostavljanjeKopije value) {
        this.dostavljanjeKopije = value;
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
     *         &lt;element name="NacinDostave" type="{http://www.ftn.uns.ac.rs/xml/tim11/zahtev}CTNacinDostave"/&gt;
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
        "nacinDostave"
    })
    public static class DostavljanjeKopije {

        @XmlElement(name = "NacinDostave", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
        protected CTNacinDostave nacinDostave;

        /**
         * Gets the value of the nacinDostave property.
         * 
         * @return
         *     possible object is
         *     {@link CTNacinDostave }
         *     
         */
        public CTNacinDostave getNacinDostave() {
            return nacinDostave;
        }

        /**
         * Sets the value of the nacinDostave property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTNacinDostave }
         *     
         */
        public void setNacinDostave(CTNacinDostave value) {
            this.nacinDostave = value;
        }

    }

}
