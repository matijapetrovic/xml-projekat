
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="BrojPredmeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datum"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                 &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="pred:podnesenoDatuma" /&gt;
 *                 &lt;attribute name="datatype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="xs:date" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Organ" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTOrganVlasti"/&gt;
 *         &lt;element name="PodnosilacZahteva" type="{http://www.ftn.uns.ac.rs/xml/tim11/obavestenje}CTPodnosilacZahteva"/&gt;
 *         &lt;element name="TrazenaInformacija" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTPodaciOZahtevu"/&gt;
 *         &lt;element name="InformacijeOUvidu" type="{http://www.ftn.uns.ac.rs/xml/tim11/obavestenje}CTInformacijeOUvidu"/&gt;
 *         &lt;element name="Troskovi" type="{http://www.ftn.uns.ac.rs/xml/tim11/obavestenje}CTTroskovi"/&gt;
 *         &lt;element name="InformacijeOUplati" type="{http://www.ftn.uns.ac.rs/xml/tim11/obavestenje}CTInformacijeOUplati"/&gt;
 *         &lt;element name="Dostavljeno"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Imenovanom"/&gt;
 *               &lt;enumeration value="Arhivi"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vocab" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="http://www.ftn.uns.ac.rs/xml/tim11/predicate/" /&gt;
 *       &lt;attribute name="about" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "brojPredmeta",
    "datum",
    "organ",
    "podnosilacZahteva",
    "trazenaInformacija",
    "informacijeOUvidu",
    "troskovi",
    "informacijeOUplati",
    "dostavljeno"
})
@XmlRootElement(name = "Obavestenje", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje")
public class Obavestenje {

    @XmlElement(name = "BrojPredmeta", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected String brojPredmeta;
    @XmlElement(name = "Datum", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected Obavestenje.Datum datum;
    @XmlElement(name = "Organ", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected CTOrganVlasti organ;
    @XmlElement(name = "PodnosilacZahteva", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected CTPodnosilacZahteva podnosilacZahteva;
    @XmlElement(name = "TrazenaInformacija", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected CTPodaciOZahtevu trazenaInformacija;
    @XmlElement(name = "InformacijeOUvidu", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected CTInformacijeOUvidu informacijeOUvidu;
    @XmlElement(name = "Troskovi", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected CTTroskovi troskovi;
    @XmlElement(name = "InformacijeOUplati", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected CTInformacijeOUplati informacijeOUplati;
    @XmlElement(name = "Dostavljeno", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/obavestenje", required = true)
    protected String dostavljeno;
    @XmlAttribute(name = "vocab", required = true)
    protected String vocab;
    @XmlAttribute(name = "about", required = true)
    protected String about;
    @XmlAttribute(name = "rel", required = true)
    protected String rel;
    @XmlAttribute(name = "href", required = true)
    protected String href;

    /**
     * Gets the value of the brojPredmeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojPredmeta() {
        return brojPredmeta;
    }

    /**
     * Sets the value of the brojPredmeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojPredmeta(String value) {
        this.brojPredmeta = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link Obavestenje.Datum }
     *     
     */
    public Obavestenje.Datum getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obavestenje.Datum }
     *     
     */
    public void setDatum(Obavestenje.Datum value) {
        this.datum = value;
    }

    /**
     * Gets the value of the organ property.
     * 
     * @return
     *     possible object is
     *     {@link CTOrganVlasti }
     *     
     */
    public CTOrganVlasti getOrgan() {
        return organ;
    }

    /**
     * Sets the value of the organ property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOrganVlasti }
     *     
     */
    public void setOrgan(CTOrganVlasti value) {
        this.organ = value;
    }

    /**
     * Gets the value of the podnosilacZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link CTPodnosilacZahteva }
     *     
     */
    public CTPodnosilacZahteva getPodnosilacZahteva() {
        return podnosilacZahteva;
    }

    /**
     * Sets the value of the podnosilacZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPodnosilacZahteva }
     *     
     */
    public void setPodnosilacZahteva(CTPodnosilacZahteva value) {
        this.podnosilacZahteva = value;
    }

    /**
     * Gets the value of the trazenaInformacija property.
     * 
     * @return
     *     possible object is
     *     {@link CTPodaciOZahtevu }
     *     
     */
    public CTPodaciOZahtevu getTrazenaInformacija() {
        return trazenaInformacija;
    }

    /**
     * Sets the value of the trazenaInformacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPodaciOZahtevu }
     *     
     */
    public void setTrazenaInformacija(CTPodaciOZahtevu value) {
        this.trazenaInformacija = value;
    }

    /**
     * Gets the value of the informacijeOUvidu property.
     * 
     * @return
     *     possible object is
     *     {@link CTInformacijeOUvidu }
     *     
     */
    public CTInformacijeOUvidu getInformacijeOUvidu() {
        return informacijeOUvidu;
    }

    /**
     * Sets the value of the informacijeOUvidu property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTInformacijeOUvidu }
     *     
     */
    public void setInformacijeOUvidu(CTInformacijeOUvidu value) {
        this.informacijeOUvidu = value;
    }

    /**
     * Gets the value of the troskovi property.
     * 
     * @return
     *     possible object is
     *     {@link CTTroskovi }
     *     
     */
    public CTTroskovi getTroskovi() {
        return troskovi;
    }

    /**
     * Sets the value of the troskovi property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTroskovi }
     *     
     */
    public void setTroskovi(CTTroskovi value) {
        this.troskovi = value;
    }

    /**
     * Gets the value of the informacijeOUplati property.
     * 
     * @return
     *     possible object is
     *     {@link CTInformacijeOUplati }
     *     
     */
    public CTInformacijeOUplati getInformacijeOUplati() {
        return informacijeOUplati;
    }

    /**
     * Sets the value of the informacijeOUplati property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTInformacijeOUplati }
     *     
     */
    public void setInformacijeOUplati(CTInformacijeOUplati value) {
        this.informacijeOUplati = value;
    }

    /**
     * Gets the value of the dostavljeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDostavljeno() {
        return dostavljeno;
    }

    /**
     * Sets the value of the dostavljeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDostavljeno(String value) {
        this.dostavljeno = value;
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
        if (vocab == null) {
            return "http://www.ftn.uns.ac.rs/xml/tim11/predicate/";
        } else {
            return vocab;
        }
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
     * Gets the value of the rel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRel() {
        return rel;
    }

    /**
     * Sets the value of the rel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRel(String value) {
        this.rel = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
     *       &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="pred:podnesenoDatuma" /&gt;
     *       &lt;attribute name="datatype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="xs:date" /&gt;
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
    public static class Datum {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "property", required = true)
        protected String property;
        @XmlAttribute(name = "datatype", required = true)
        protected String datatype;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
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
            if (property == null) {
                return "pred:podnesenoDatuma";
            } else {
                return property;
            }
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

        /**
         * Gets the value of the datatype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatatype() {
            if (datatype == null) {
                return "xs:date";
            } else {
                return datatype;
            }
        }

        /**
         * Sets the value of the datatype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatatype(String value) {
            this.datatype = value;
        }

    }

}
