
package rs.uns.ftn.xml.tim11.poc.zalbacutanje.model;

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
 *       &lt;sequence&gt;
 *         &lt;element name="primalac"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Adresa" type="{zalbacutanje}CTAdresa"/&gt;
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
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="10"/&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
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
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="3"/&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
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
 *                             &lt;element name="ImePosiljaoca" type="{zalbacutanje}CTAutor"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Adresa" type="{zalbacutanje}CTAdresa"/&gt;
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
@XmlRootElement(name = "zalba", namespace = "zalbacutanje")
public class Zalba {

    @XmlElement(namespace = "zalbacutanje", required = true)
    protected Zalba.Primalac primalac;
    @XmlElement(name = "Sadrzaj", namespace = "zalbacutanje", required = true)
    protected Zalba.Sadrzaj sadrzaj;
    @XmlElement(name = "PodnosilacZalbe", namespace = "zalbacutanje", required = true)
    protected Zalba.PodnosilacZalbe podnosilacZalbe;
    @XmlElement(namespace = "zalbacutanje", required = true)
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

        @XmlElement(name = "Mesto", namespace = "zalbacutanje", required = true)
        protected String mesto;
        @XmlElement(name = "Dan", namespace = "zalbacutanje")
        protected int dan;
        @XmlElement(name = "Godina", namespace = "zalbacutanje")
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
     *                   &lt;element name="ImePosiljaoca" type="{zalbacutanje}CTAutor"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Adresa" type="{zalbacutanje}CTAdresa"/&gt;
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

        @XmlElement(name = "Naziv", namespace = "zalbacutanje", required = true)
        protected Zalba.PodnosilacZalbe.Naziv naziv;
        @XmlElement(name = "Adresa", namespace = "zalbacutanje", required = true)
        protected CTAdresa adresa;
        @XmlElement(namespace = "zalbacutanje", required = true)
        protected String drugiPodaci;
        @XmlElement(name = "Potpis", namespace = "zalbacutanje", required = true)
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
         *         &lt;element name="ImePosiljaoca" type="{zalbacutanje}CTAutor"/&gt;
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

            @XmlElement(name = "ImePosiljaoca", namespace = "zalbacutanje", required = true)
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
     *         &lt;element name="Adresa" type="{zalbacutanje}CTAdresa"/&gt;
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

        @XmlElement(name = "Adresa", namespace = "zalbacutanje", required = true)
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
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="10"/&gt;
     *                         &lt;maxLength value="100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
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
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="3"/&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
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

        @XmlElement(name = "ZaglavljeZalbe", namespace = "zalbacutanje", required = true)
        protected Zalba.Sadrzaj.ZaglavljeZalbe zaglavljeZalbe;
        @XmlElement(name = "RazlogSlanja", namespace = "zalbacutanje", required = true)
        protected Zalba.Sadrzaj.RazlogSlanja razlogSlanja;
        @XmlElement(name = "PodaciOZahtevu", namespace = "zalbacutanje", required = true)
        protected Zalba.Sadrzaj.PodaciOZahtevu podaciOZahtevu;
        @XmlElement(name = "Zakljucak", namespace = "zalbacutanje", required = true)
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

            @XmlElement(name = "Godina", namespace = "zalbacutanje")
            protected int godina;
            @XmlElement(name = "PodaciOZahtevuIInformacijama", namespace = "zalbacutanje", required = true)
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

            @XmlElement(name = "NijePostupio", namespace = "zalbacutanje")
            protected String nijePostupio;
            @XmlElement(name = "NijePostupioUCelosti", namespace = "zalbacutanje")
            protected String nijePostupioUCelosti;
            @XmlElement(name = "UZakonsomRoku", namespace = "zalbacutanje")
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
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="10"/&gt;
         *               &lt;maxLength value="100"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="3"/&gt;
         *               &lt;maxLength value="50"/&gt;
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
            "clan",
            "zakon",
            "predmetSlanja",
            "nazivOrgana"
        })
        public static class ZaglavljeZalbe {

            @XmlElement(name = "Clan", namespace = "zalbacutanje")
            protected int clan;
            @XmlElement(name = "Zakon", namespace = "zalbacutanje", required = true)
            protected String zakon;
            @XmlElement(name = "PredmetSlanja", namespace = "zalbacutanje", required = true)
            protected String predmetSlanja;
            @XmlElement(name = "NazivOrgana", namespace = "zalbacutanje", required = true)
            protected String nazivOrgana;

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
             *     {@link String }
             *     
             */
            public String getNazivOrgana() {
                return nazivOrgana;
            }

            /**
             * Sets the value of the nazivOrgana property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNazivOrgana(String value) {
                this.nazivOrgana = value;
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

            @XmlElement(name = "Predlog", namespace = "zalbacutanje", required = true)
            protected String predlog;
            @XmlElement(name = "Dokaz", namespace = "zalbacutanje", required = true)
            protected Zalba.Sadrzaj.Zakljucak.Dokaz dokaz;
            @XmlElement(name = "Napomena", namespace = "zalbacutanje", required = true)
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

                @XmlElement(name = "Opis", namespace = "zalbacutanje", required = true)
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

    private String printPodnosilacZalbe() {
        return  getPodnosilacZalbe().getNaziv().getImePosiljaoca() + "\n" +
                "\n" + getPodnosilacZalbe().getAdresa() + "\n" +
                "\t\tDrugi podaci: " +  getPodnosilacZalbe().getDrugiPodaci() + "\n" +
                "\t\tPotpis: " + getPodnosilacZalbe().getPotpis();
    }

    private String printPodaciOPodnosenjuZahteva() {
        return  "\t\tMesto: " + getPodaciOPodnosenjuZahteva().getMesto() + "\n" +
                "\t\tDan: " + getPodaciOPodnosenjuZahteva().getDan() + "\n" +
                "\t\tGodina: " + getPodaciOPodnosenjuZahteva().getGodina();
    }

    private String printZaglavljeZalbe() {
        return "\t\tClan: " + getSadrzaj().getZaglavljeZalbe().getClan() + "\n" +
                "\t\t\tZakon: " + getSadrzaj().getZaglavljeZalbe().getZakon() + "\n" +
                "\t\t\tPredmet slanja: " + getSadrzaj().getZaglavljeZalbe().getPredmetSlanja() + "\n" +
                "\t\t\tNaziv organa: " + getSadrzaj().getZaglavljeZalbe().getNazivOrgana();
    }

    private String printRazlogSlanja() {
        return "\t\tNije postupio: " + getSadrzaj().getRazlogSlanja().getNijePostupio();
    }

    private String printpodaciOZahtevu() {
        return "\t\tGodina: " + getSadrzaj().getPodaciOZahtevu().getGodina() + "\n" +
                "\t\t\tPodaci o zahtevu i informacijama: " + getSadrzaj().getPodaciOZahtevu().getPodaciOZahtevuIInformacijama();
    }

    private String printZakljucak() {
        return "\t\tPredlog: " + getSadrzaj().getZakljucak().getPredlog() + "\n" +
                "\t\t\tDokaz: " + getSadrzaj().getZakljucak().getDokaz().getOpis() + "\n" +
                "\t\t\tNapomena: " + getSadrzaj().getZakljucak().getNapomena();
    }

    private String printSadrzaj() {
        return "\t\tZaglavlje zalbe:\n\t" + printZaglavljeZalbe() + "\n" +
                "\t\tRazlog slanja:\n\t" + printRazlogSlanja() + "\n" +
                "\t\tPodaci o zahtevu:\n\t" + printpodaciOZahtevu() + "\n" +
                "\t\tZakljucak:\n\t" + printZakljucak() + "\n";
    }

    @Override
    public String toString() {
        return "Podaci o zalbi: \n" +
                "\tPrimalac:\n\t" + getPrimalac().getAdresa() + "\n" +
                "\tSadrzaj: " + "\n" + printSadrzaj() + "\n" +
                "\tPodnosilac zalbe: " + "\n" + printPodnosilacZalbe() + "\n" +
                "\tPodaci o podnosenju zahteva: \n" + printPodaciOPodnosenjuZahteva();
    }

}
