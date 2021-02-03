
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence&gt;
 *         &lt;element name="OrganVlasti" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTOrganVlasti"/&gt;
 *         &lt;element name="ZaglavljeZalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Clan"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="1000"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Zakon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTAdresa"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RazlogSlanja"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="NijePostupio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NijePostupioUCelosti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="UZakonsomRoku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PodaciOZahtevu" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTPodaciOZahtevu"/&gt;
 *         &lt;element name="PodnosilacZalbe" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTPodnosilacZalbe"/&gt;
 *         &lt;element name="OstaliPodaci" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTOstaliPodaci"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vocab" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="http://www.ftn.uns.ac.rs/xml/tim11/predicate" /&gt;
 *       &lt;attribute name="about" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organVlasti",
    "zaglavljeZalbe",
    "razlogSlanja",
    "podaciOZahtevu",
    "podnosilacZalbe",
    "ostaliPodaci"
})
@XmlRootElement(name = "ZalbaCutanje", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
public class ZalbaCutanje {

    @XmlElement(name = "OrganVlasti", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected CTOrganVlasti organVlasti;
    @XmlElement(name = "ZaglavljeZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected ZalbaCutanje.ZaglavljeZalbe zaglavljeZalbe;
    @XmlElement(name = "RazlogSlanja", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected ZalbaCutanje.RazlogSlanja razlogSlanja;
    @XmlElement(name = "PodaciOZahtevu", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected CTPodaciOZahtevu podaciOZahtevu;
    @XmlElement(name = "PodnosilacZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected CTPodnosilacZalbe podnosilacZalbe;
    @XmlElement(name = "OstaliPodaci", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected CTOstaliPodaci ostaliPodaci;
    @XmlAttribute(name = "vocab", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String vocab;
    @XmlAttribute(name = "about", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String about;

    /**
     * Gets the value of the organVlasti property.
     * 
     * @return
     *     possible object is
     *     {@link CTOrganVlasti }
     *     
     */
    public CTOrganVlasti getOrganVlasti() {
        return organVlasti;
    }

    /**
     * Sets the value of the organVlasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOrganVlasti }
     *     
     */
    public void setOrganVlasti(CTOrganVlasti value) {
        this.organVlasti = value;
    }

    /**
     * Gets the value of the zaglavljeZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaCutanje.ZaglavljeZalbe }
     *     
     */
    public ZalbaCutanje.ZaglavljeZalbe getZaglavljeZalbe() {
        return zaglavljeZalbe;
    }

    /**
     * Sets the value of the zaglavljeZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaCutanje.ZaglavljeZalbe }
     *     
     */
    public void setZaglavljeZalbe(ZalbaCutanje.ZaglavljeZalbe value) {
        this.zaglavljeZalbe = value;
    }

    /**
     * Gets the value of the razlogSlanja property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaCutanje.RazlogSlanja }
     *     
     */
    public ZalbaCutanje.RazlogSlanja getRazlogSlanja() {
        return razlogSlanja;
    }

    /**
     * Sets the value of the razlogSlanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaCutanje.RazlogSlanja }
     *     
     */
    public void setRazlogSlanja(ZalbaCutanje.RazlogSlanja value) {
        this.razlogSlanja = value;
    }

    /**
     * Gets the value of the podaciOZahtevu property.
     * 
     * @return
     *     possible object is
     *     {@link CTPodaciOZahtevu }
     *     
     */
    public CTPodaciOZahtevu getPodaciOZahtevu() {
        return podaciOZahtevu;
    }

    /**
     * Sets the value of the podaciOZahtevu property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPodaciOZahtevu }
     *     
     */
    public void setPodaciOZahtevu(CTPodaciOZahtevu value) {
        this.podaciOZahtevu = value;
    }

    /**
     * Gets the value of the podnosilacZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link CTPodnosilacZalbe }
     *     
     */
    public CTPodnosilacZalbe getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPodnosilacZalbe }
     *     
     */
    public void setPodnosilacZalbe(CTPodnosilacZalbe value) {
        this.podnosilacZalbe = value;
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
            return "http://www.ftn.uns.ac.rs/xml/tim11/predicate";
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="NijePostupio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NijePostupioUCelosti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="UZakonsomRoku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "nijePostupio",
        "nijePostupioUCelosti",
        "uZakonsomRoku"
    })
    public static class RazlogSlanja {

        @XmlElement(name = "NijePostupio", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
        protected String nijePostupio;
        @XmlElement(name = "NijePostupioUCelosti", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
        protected String nijePostupioUCelosti;
        @XmlElement(name = "UZakonsomRoku", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
        protected String uZakonsomRoku;

        /**
         * Gets the value of the nijePostupio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNijePostupio() {
            return nijePostupio;
        }

        /**
         * Sets the value of the nijePostupio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNijePostupio(String value) {
            this.nijePostupio = value;
        }

        /**
         * Gets the value of the nijePostupioUCelosti property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNijePostupioUCelosti() {
            return nijePostupioUCelosti;
        }

        /**
         * Sets the value of the nijePostupioUCelosti property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNijePostupioUCelosti(String value) {
            this.nijePostupioUCelosti = value;
        }

        /**
         * Gets the value of the uZakonsomRoku property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUZakonsomRoku() {
            return uZakonsomRoku;
        }

        /**
         * Sets the value of the uZakonsomRoku property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUZakonsomRoku(String value) {
            this.uZakonsomRoku = value;
        }

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
     *         &lt;element name="Clan"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="1000"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Zakon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTAdresa"/&gt;
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
        "clan",
        "zakon",
        "adresa"
    })
    public static class ZaglavljeZalbe {

        @XmlElement(name = "Clan", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
        protected int clan;
        @XmlElement(name = "Zakon", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected String zakon;
        @XmlElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected CTAdresa adresa;

        /**
         * Gets the value of the clan property.
         * 
         */
        public int getClan() {
            return clan;
        }

        /**
         * Sets the value of the clan property.
         * 
         */
        public void setClan(int value) {
            this.clan = value;
        }

        /**
         * Gets the value of the zakon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZakon() {
            return zakon;
        }

        /**
         * Sets the value of the zakon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZakon(String value) {
            this.zakon = value;
        }

        /**
         * Gets the value of the adresa property.
         * 
         * @return
         *     possible object is
         *     {@link CTAdresa }
         *     
         */
        public CTAdresa getAdresa() {
            return adresa;
        }

        /**
         * Sets the value of the adresa property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTAdresa }
         *     
         */
        public void setAdresa(CTAdresa value) {
            this.adresa = value;
        }

    }

}
