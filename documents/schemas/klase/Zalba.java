
package klase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="primalac"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTAdresa"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sadrzaj"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ZaglavljeZalbe"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Clan"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                   &lt;maxInclusive value="1000"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Zakon"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PredmetSlanja"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="5"/&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NazivOrgana"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RazlogSlanja"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="NijePostupio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NijePostupioUCelosti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="UZakonsomRoku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PodaciOZahtevu"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Godina"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;minInclusive value="1900"/&gt;
 *                                   &lt;maxInclusive value="2020"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PodaciOZahtevuIInformacijama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Zakljucak"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Predlog"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="0"/&gt;
 *                                   &lt;maxLength value="200"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Dokaz"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Opis"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="0"/&gt;
 *                                             &lt;maxLength value="200"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Napomena"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="0"/&gt;
 *                                   &lt;maxLength value="200"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PodnosilacZalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Naziv"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ImePosiljaoca" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTAutor"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTAdresa"/&gt;
 *                   &lt;element name="drugiPodaci"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="0"/&gt;
 *                         &lt;maxLength value="200"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Potpis"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="podaciOPodnosenjuZahteva"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Mesto"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="2"/&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Dan"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="31"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Godina"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="1900"/&gt;
 *                         &lt;maxInclusive value="2020"/&gt;
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
@XmlType(name = "", propOrder = {
    "primalac",
    "sadrzaj",
    "podnosilacZalbe",
    "podaciOPodnosenjuZahteva"
})
@XmlRootElement(name = "zalba", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
public class Zalba {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected Zalba.Primalac primalac;
    @XmlElement(name = "Sadrzaj", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected Zalba.Sadrzaj sadrzaj;
    @XmlElement(name = "PodnosilacZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected Zalba.PodnosilacZalbe podnosilacZalbe;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
    protected Zalba.PodaciOPodnosenjuZahteva podaciOPodnosenjuZahteva;

    /**
     * Gets the value of the primalac property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.Primalac }
     *     
     */
    public Zalba.Primalac getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.Primalac }
     *     
     */
    public void setPrimalac(Zalba.Primalac value) {
        this.primalac = value;
    }

    /**
     * Gets the value of the sadrzaj property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.Sadrzaj }
     *     
     */
    public Zalba.Sadrzaj getSadrzaj() {
        return sadrzaj;
    }

    /**
     * Sets the value of the sadrzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.Sadrzaj }
     *     
     */
    public void setSadrzaj(Zalba.Sadrzaj value) {
        this.sadrzaj = value;
    }

    /**
     * Gets the value of the podnosilacZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.PodnosilacZalbe }
     *     
     */
    public Zalba.PodnosilacZalbe getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.PodnosilacZalbe }
     *     
     */
    public void setPodnosilacZalbe(Zalba.PodnosilacZalbe value) {
        this.podnosilacZalbe = value;
    }

    /**
     * Gets the value of the podaciOPodnosenjuZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.PodaciOPodnosenjuZahteva }
     *     
     */
    public Zalba.PodaciOPodnosenjuZahteva getPodaciOPodnosenjuZahteva() {
        return podaciOPodnosenjuZahteva;
    }

    /**
     * Sets the value of the podaciOPodnosenjuZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.PodaciOPodnosenjuZahteva }
     *     
     */
    public void setPodaciOPodnosenjuZahteva(Zalba.PodaciOPodnosenjuZahteva value) {
        this.podaciOPodnosenjuZahteva = value;
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
     *         &lt;element name="Mesto"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="2"/&gt;
     *               &lt;maxLength value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Dan"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="31"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Godina"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="1900"/&gt;
     *               &lt;maxInclusive value="2020"/&gt;
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
        "mesto",
        "dan",
        "godina"
    })
    public static class PodaciOPodnosenjuZahteva {

        @XmlElement(name = "Mesto", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected String mesto;
        @XmlElement(name = "Dan", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
        protected int dan;
        @XmlElement(name = "Godina", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
        protected int godina;

        /**
         * Gets the value of the mesto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMesto() {
            return mesto;
        }

        /**
         * Sets the value of the mesto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMesto(String value) {
            this.mesto = value;
        }

        /**
         * Gets the value of the dan property.
         * 
         */
        public int getDan() {
            return dan;
        }

        /**
         * Sets the value of the dan property.
         * 
         */
        public void setDan(int value) {
            this.dan = value;
        }

        /**
         * Gets the value of the godina property.
         * 
         */
        public int getGodina() {
            return godina;
        }

        /**
         * Sets the value of the godina property.
         * 
         */
        public void setGodina(int value) {
            this.godina = value;
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
     *         &lt;element name="Naziv"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ImePosiljaoca" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTAutor"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTAdresa"/&gt;
     *         &lt;element name="drugiPodaci"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="200"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Potpis"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="100"/&gt;
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
        "naziv",
        "adresa",
        "drugiPodaci",
        "potpis"
    })
    public static class PodnosilacZalbe {

        @XmlElement(name = "Naziv", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected Zalba.PodnosilacZalbe.Naziv naziv;
        @XmlElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected CTAdresa adresa;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected String drugiPodaci;
        @XmlElement(name = "Potpis", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected String potpis;

        /**
         * Gets the value of the naziv property.
         * 
         * @return
         *     possible object is
         *     {@link Zalba.PodnosilacZalbe.Naziv }
         *     
         */
        public Zalba.PodnosilacZalbe.Naziv getNaziv() {
            return naziv;
        }

        /**
         * Sets the value of the naziv property.
         * 
         * @param value
         *     allowed object is
         *     {@link Zalba.PodnosilacZalbe.Naziv }
         *     
         */
        public void setNaziv(Zalba.PodnosilacZalbe.Naziv value) {
            this.naziv = value;
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

        /**
         * Gets the value of the drugiPodaci property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDrugiPodaci() {
            return drugiPodaci;
        }

        /**
         * Sets the value of the drugiPodaci property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDrugiPodaci(String value) {
            this.drugiPodaci = value;
        }

        /**
         * Gets the value of the potpis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPotpis() {
            return potpis;
        }

        /**
         * Sets the value of the potpis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPotpis(String value) {
            this.potpis = value;
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
         *         &lt;element name="ImePosiljaoca" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTAutor"/&gt;
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
            "imePosiljaoca"
        })
        public static class Naziv {

            @XmlElement(name = "ImePosiljaoca", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
            protected CTAutor imePosiljaoca;

            /**
             * Gets the value of the imePosiljaoca property.
             * 
             * @return
             *     possible object is
             *     {@link CTAutor }
             *     
             */
            public CTAutor getImePosiljaoca() {
                return imePosiljaoca;
            }

            /**
             * Sets the value of the imePosiljaoca property.
             * 
             * @param value
             *     allowed object is
             *     {@link CTAutor }
             *     
             */
            public void setImePosiljaoca(CTAutor value) {
                this.imePosiljaoca = value;
            }

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
     *         &lt;element name="Adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje}CTAdresa"/&gt;
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
        "adresa"
    })
    public static class Primalac {

        @XmlElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected CTAdresa adresa;

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
     *         &lt;element name="ZaglavljeZalbe"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Clan"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                         &lt;maxInclusive value="1000"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Zakon"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PredmetSlanja"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="5"/&gt;
     *                         &lt;maxLength value="100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NazivOrgana"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
     *         &lt;element name="PodaciOZahtevu"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Godina"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;minInclusive value="1900"/&gt;
     *                         &lt;maxInclusive value="2020"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PodaciOZahtevuIInformacijama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Zakljucak"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Predlog"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="0"/&gt;
     *                         &lt;maxLength value="200"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Dokaz"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Opis"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="0"/&gt;
     *                                   &lt;maxLength value="200"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Napomena"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="0"/&gt;
     *                         &lt;maxLength value="200"/&gt;
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
    @XmlType(name = "", propOrder = {
        "zaglavljeZalbe",
        "razlogSlanja",
        "podaciOZahtevu",
        "zakljucak"
    })
    public static class Sadrzaj {

        @XmlElement(name = "ZaglavljeZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected Zalba.Sadrzaj.ZaglavljeZalbe zaglavljeZalbe;
        @XmlElement(name = "RazlogSlanja", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected Zalba.Sadrzaj.RazlogSlanja razlogSlanja;
        @XmlElement(name = "PodaciOZahtevu", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected Zalba.Sadrzaj.PodaciOZahtevu podaciOZahtevu;
        @XmlElement(name = "Zakljucak", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
        protected Zalba.Sadrzaj.Zakljucak zakljucak;

        /**
         * Gets the value of the zaglavljeZalbe property.
         * 
         * @return
         *     possible object is
         *     {@link Zalba.Sadrzaj.ZaglavljeZalbe }
         *     
         */
        public Zalba.Sadrzaj.ZaglavljeZalbe getZaglavljeZalbe() {
            return zaglavljeZalbe;
        }

        /**
         * Sets the value of the zaglavljeZalbe property.
         * 
         * @param value
         *     allowed object is
         *     {@link Zalba.Sadrzaj.ZaglavljeZalbe }
         *     
         */
        public void setZaglavljeZalbe(Zalba.Sadrzaj.ZaglavljeZalbe value) {
            this.zaglavljeZalbe = value;
        }

        /**
         * Gets the value of the razlogSlanja property.
         * 
         * @return
         *     possible object is
         *     {@link Zalba.Sadrzaj.RazlogSlanja }
         *     
         */
        public Zalba.Sadrzaj.RazlogSlanja getRazlogSlanja() {
            return razlogSlanja;
        }

        /**
         * Sets the value of the razlogSlanja property.
         * 
         * @param value
         *     allowed object is
         *     {@link Zalba.Sadrzaj.RazlogSlanja }
         *     
         */
        public void setRazlogSlanja(Zalba.Sadrzaj.RazlogSlanja value) {
            this.razlogSlanja = value;
        }

        /**
         * Gets the value of the podaciOZahtevu property.
         * 
         * @return
         *     possible object is
         *     {@link Zalba.Sadrzaj.PodaciOZahtevu }
         *     
         */
        public Zalba.Sadrzaj.PodaciOZahtevu getPodaciOZahtevu() {
            return podaciOZahtevu;
        }

        /**
         * Sets the value of the podaciOZahtevu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Zalba.Sadrzaj.PodaciOZahtevu }
         *     
         */
        public void setPodaciOZahtevu(Zalba.Sadrzaj.PodaciOZahtevu value) {
            this.podaciOZahtevu = value;
        }

        /**
         * Gets the value of the zakljucak property.
         * 
         * @return
         *     possible object is
         *     {@link Zalba.Sadrzaj.Zakljucak }
         *     
         */
        public Zalba.Sadrzaj.Zakljucak getZakljucak() {
            return zakljucak;
        }

        /**
         * Sets the value of the zakljucak property.
         * 
         * @param value
         *     allowed object is
         *     {@link Zalba.Sadrzaj.Zakljucak }
         *     
         */
        public void setZakljucak(Zalba.Sadrzaj.Zakljucak value) {
            this.zakljucak = value;
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
         *         &lt;element name="Godina"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;minInclusive value="1900"/&gt;
         *               &lt;maxInclusive value="2020"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PodaciOZahtevuIInformacijama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "godina",
            "podaciOZahtevuIInformacijama"
        })
        public static class PodaciOZahtevu {

            @XmlElement(name = "Godina", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
            protected int godina;
            @XmlElement(name = "PodaciOZahtevuIInformacijama", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
            protected String podaciOZahtevuIInformacijama;

            /**
             * Gets the value of the godina property.
             * 
             */
            public int getGodina() {
                return godina;
            }

            /**
             * Sets the value of the godina property.
             * 
             */
            public void setGodina(int value) {
                this.godina = value;
            }

            /**
             * Gets the value of the podaciOZahtevuIInformacijama property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPodaciOZahtevuIInformacijama() {
                return podaciOZahtevuIInformacijama;
            }

            /**
             * Sets the value of the podaciOZahtevuIInformacijama property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPodaciOZahtevuIInformacijama(String value) {
                this.podaciOZahtevuIInformacijama = value;
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
         *               &lt;minInclusive value="0"/&gt;
         *               &lt;maxInclusive value="1000"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Zakon"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PredmetSlanja"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="5"/&gt;
         *               &lt;maxLength value="100"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NazivOrgana"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
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
        @XmlType(name = "", propOrder = {
            "clan",
            "zakon",
            "predmetSlanja",
            "nazivOrgana"
        })
        public static class ZaglavljeZalbe {

            @XmlElement(name = "Clan", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje")
            protected int clan;
            @XmlElement(name = "Zakon", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
            protected Zalba.Sadrzaj.ZaglavljeZalbe.Zakon zakon;
            @XmlElement(name = "PredmetSlanja", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
            protected String predmetSlanja;
            @XmlElement(name = "NazivOrgana", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
            protected Zalba.Sadrzaj.ZaglavljeZalbe.NazivOrgana nazivOrgana;

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
             *     {@link Zalba.Sadrzaj.ZaglavljeZalbe.Zakon }
             *     
             */
            public Zalba.Sadrzaj.ZaglavljeZalbe.Zakon getZakon() {
                return zakon;
            }

            /**
             * Sets the value of the zakon property.
             * 
             * @param value
             *     allowed object is
             *     {@link Zalba.Sadrzaj.ZaglavljeZalbe.Zakon }
             *     
             */
            public void setZakon(Zalba.Sadrzaj.ZaglavljeZalbe.Zakon value) {
                this.zakon = value;
            }

            /**
             * Gets the value of the predmetSlanja property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPredmetSlanja() {
                return predmetSlanja;
            }

            /**
             * Sets the value of the predmetSlanja property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPredmetSlanja(String value) {
                this.predmetSlanja = value;
            }

            /**
             * Gets the value of the nazivOrgana property.
             * 
             * @return
             *     possible object is
             *     {@link Zalba.Sadrzaj.ZaglavljeZalbe.NazivOrgana }
             *     
             */
            public Zalba.Sadrzaj.ZaglavljeZalbe.NazivOrgana getNazivOrgana() {
                return nazivOrgana;
            }

            /**
             * Sets the value of the nazivOrgana property.
             * 
             * @param value
             *     allowed object is
             *     {@link Zalba.Sadrzaj.ZaglavljeZalbe.NazivOrgana }
             *     
             */
            public void setNazivOrgana(Zalba.Sadrzaj.ZaglavljeZalbe.NazivOrgana value) {
                this.nazivOrgana = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
            public static class NazivOrgana {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "type", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlAttribute(name = "property", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String property;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
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
                    return property;
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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
            public static class Zakon {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "type", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlAttribute(name = "property", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String property;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
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
                    return property;
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
         *         &lt;element name="Predlog"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="0"/&gt;
         *               &lt;maxLength value="200"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Dokaz"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Opis"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="0"/&gt;
         *                         &lt;maxLength value="200"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Napomena"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="0"/&gt;
         *               &lt;maxLength value="200"/&gt;
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
            "predlog",
            "dokaz",
            "napomena"
        })
        public static class Zakljucak {

            @XmlElement(name = "Predlog", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
            protected String predlog;
            @XmlElement(name = "Dokaz", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
            protected Zalba.Sadrzaj.Zakljucak.Dokaz dokaz;
            @XmlElement(name = "Napomena", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
            protected String napomena;

            /**
             * Gets the value of the predlog property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPredlog() {
                return predlog;
            }

            /**
             * Sets the value of the predlog property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPredlog(String value) {
                this.predlog = value;
            }

            /**
             * Gets the value of the dokaz property.
             * 
             * @return
             *     possible object is
             *     {@link Zalba.Sadrzaj.Zakljucak.Dokaz }
             *     
             */
            public Zalba.Sadrzaj.Zakljucak.Dokaz getDokaz() {
                return dokaz;
            }

            /**
             * Sets the value of the dokaz property.
             * 
             * @param value
             *     allowed object is
             *     {@link Zalba.Sadrzaj.Zakljucak.Dokaz }
             *     
             */
            public void setDokaz(Zalba.Sadrzaj.Zakljucak.Dokaz value) {
                this.dokaz = value;
            }

            /**
             * Gets the value of the napomena property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNapomena() {
                return napomena;
            }

            /**
             * Sets the value of the napomena property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNapomena(String value) {
                this.napomena = value;
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
             *         &lt;element name="Opis"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="0"/&gt;
             *               &lt;maxLength value="200"/&gt;
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
            public static class Dokaz {

                @XmlElement(name = "Opis", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje", required = true)
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

        }

    }

}
