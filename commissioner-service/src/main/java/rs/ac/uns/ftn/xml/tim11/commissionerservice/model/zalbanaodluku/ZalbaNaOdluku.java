
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku;

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
 *                   &lt;element name="adresaPrimaoca" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZAdresa"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sadrzaj"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="paragraf1"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="predmetSlanja"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                   &lt;maxLength value="300"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="osoba" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZOsoba"/&gt;
 *                             &lt;element name="naziv"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZAdresa"/&gt;
 *                             &lt;element name="sediste"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                                   &lt;maxInclusive value="50"/&gt;
 *                                   &lt;minInclusive value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="paragraf2"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="nazivOrgana"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="300"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="broj"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                                   &lt;maxInclusive value="300"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="godina"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                                   &lt;minInclusive value="2000"/&gt;
 *                                   &lt;maxInclusive value="2100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="paragraf3"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="dan"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                                   &lt;maxInclusive value="31"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="godina"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                                   &lt;minExclusive value="2000"/&gt;
 *                                   &lt;maxExclusive value="2100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="razlog"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="500"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="paragraf4"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="zakljucak"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="razlog"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="500"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="zakonPodnosenjaZalbe"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="500"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
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
 *         &lt;element name="podnosilacZalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="osoba" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZOsoba"/&gt;
 *                   &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZAdresa"/&gt;
 *                   &lt;element name="drugiPodaci" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="0"/&gt;
 *                         &lt;maxLength value="500"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="potpis"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="podaciPodnosenjaZalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mesto"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="200"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="dan"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                         &lt;maxInclusive value="31"/&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="godina"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                         &lt;maxInclusive value="2100"/&gt;
 *                         &lt;minInclusive value="2000"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="napomena"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="lista"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="stavka1"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="500"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="stavka2"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="500"/&gt;
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
    "podaciPodnosenjaZalbe",
    "napomena"
})
@XmlRootElement(name = "ZalbaNaOdluku", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
public class ZalbaNaOdluku {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
    protected ZalbaNaOdluku.Primalac primalac;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
    protected ZalbaNaOdluku.Sadrzaj sadrzaj;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
    protected ZalbaNaOdluku.PodnosilacZalbe podnosilacZalbe;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
    protected ZalbaNaOdluku.PodaciPodnosenjaZalbe podaciPodnosenjaZalbe;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
    protected ZalbaNaOdluku.Napomena napomena;

    /**
     * Gets the value of the primalac property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaNaOdluku.Primalac }
     *     
     */
    public ZalbaNaOdluku.Primalac getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaNaOdluku.Primalac }
     *     
     */
    public void setPrimalac(ZalbaNaOdluku.Primalac value) {
        this.primalac = value;
    }

    /**
     * Gets the value of the sadrzaj property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaNaOdluku.Sadrzaj }
     *     
     */
    public ZalbaNaOdluku.Sadrzaj getSadrzaj() {
        return sadrzaj;
    }

    /**
     * Sets the value of the sadrzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaNaOdluku.Sadrzaj }
     *     
     */
    public void setSadrzaj(ZalbaNaOdluku.Sadrzaj value) {
        this.sadrzaj = value;
    }

    /**
     * Gets the value of the podnosilacZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaNaOdluku.PodnosilacZalbe }
     *     
     */
    public ZalbaNaOdluku.PodnosilacZalbe getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaNaOdluku.PodnosilacZalbe }
     *     
     */
    public void setPodnosilacZalbe(ZalbaNaOdluku.PodnosilacZalbe value) {
        this.podnosilacZalbe = value;
    }

    /**
     * Gets the value of the podaciPodnosenjaZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaNaOdluku.PodaciPodnosenjaZalbe }
     *     
     */
    public ZalbaNaOdluku.PodaciPodnosenjaZalbe getPodaciPodnosenjaZalbe() {
        return podaciPodnosenjaZalbe;
    }

    /**
     * Sets the value of the podaciPodnosenjaZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaNaOdluku.PodaciPodnosenjaZalbe }
     *     
     */
    public void setPodaciPodnosenjaZalbe(ZalbaNaOdluku.PodaciPodnosenjaZalbe value) {
        this.podaciPodnosenjaZalbe = value;
    }

    /**
     * Gets the value of the napomena property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaNaOdluku.Napomena }
     *     
     */
    public ZalbaNaOdluku.Napomena getNapomena() {
        return napomena;
    }

    /**
     * Sets the value of the napomena property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaNaOdluku.Napomena }
     *     
     */
    public void setNapomena(ZalbaNaOdluku.Napomena value) {
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
     *         &lt;element name="lista"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="stavka1"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="500"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="stavka2"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="500"/&gt;
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
        "lista"
    })
    public static class Napomena {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected ZalbaNaOdluku.Napomena.Lista lista;

        /**
         * Gets the value of the lista property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaNaOdluku.Napomena.Lista }
         *     
         */
        public ZalbaNaOdluku.Napomena.Lista getLista() {
            return lista;
        }

        /**
         * Sets the value of the lista property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaNaOdluku.Napomena.Lista }
         *     
         */
        public void setLista(ZalbaNaOdluku.Napomena.Lista value) {
            this.lista = value;
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
         *         &lt;element name="stavka1"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="500"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="stavka2"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="500"/&gt;
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
            "stavka1",
            "stavka2"
        })
        public static class Lista {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected String stavka1;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected String stavka2;

            /**
             * Gets the value of the stavka1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStavka1() {
                return stavka1;
            }

            /**
             * Sets the value of the stavka1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStavka1(String value) {
                this.stavka1 = value;
            }

            /**
             * Gets the value of the stavka2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStavka2() {
                return stavka2;
            }

            /**
             * Sets the value of the stavka2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStavka2(String value) {
                this.stavka2 = value;
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
     *         &lt;element name="mesto"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="200"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="dan"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *               &lt;maxInclusive value="31"/&gt;
     *               &lt;minInclusive value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="godina"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *               &lt;maxInclusive value="2100"/&gt;
     *               &lt;minInclusive value="2000"/&gt;
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
    public static class PodaciPodnosenjaZalbe {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected String mesto;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
        protected int dan;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
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
     *         &lt;element name="osoba" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZOsoba"/&gt;
     *         &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZAdresa"/&gt;
     *         &lt;element name="drugiPodaci" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="500"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="potpis"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
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
        "osoba",
        "adresa",
        "drugiPodaci",
        "potpis"
    })
    public static class PodnosilacZalbe {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected ZOsoba osoba;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected ZAdresa adresa;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
        protected String drugiPodaci;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected String potpis;

        /**
         * Gets the value of the osoba property.
         * 
         * @return
         *     possible object is
         *     {@link ZOsoba }
         *     
         */
        public ZOsoba getOsoba() {
            return osoba;
        }

        /**
         * Sets the value of the osoba property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZOsoba }
         *     
         */
        public void setOsoba(ZOsoba value) {
            this.osoba = value;
        }

        /**
         * Gets the value of the adresa property.
         * 
         * @return
         *     possible object is
         *     {@link ZAdresa }
         *     
         */
        public ZAdresa getAdresa() {
            return adresa;
        }

        /**
         * Sets the value of the adresa property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZAdresa }
         *     
         */
        public void setAdresa(ZAdresa value) {
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
     *         &lt;element name="adresaPrimaoca" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZAdresa"/&gt;
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
        "adresaPrimaoca"
    })
    public static class Primalac {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected ZAdresa adresaPrimaoca;

        /**
         * Gets the value of the adresaPrimaoca property.
         * 
         * @return
         *     possible object is
         *     {@link ZAdresa }
         *     
         */
        public ZAdresa getAdresaPrimaoca() {
            return adresaPrimaoca;
        }

        /**
         * Sets the value of the adresaPrimaoca property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZAdresa }
         *     
         */
        public void setAdresaPrimaoca(ZAdresa value) {
            this.adresaPrimaoca = value;
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
     *         &lt;element name="paragraf1"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="predmetSlanja"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="2"/&gt;
     *                         &lt;maxLength value="300"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="osoba" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZOsoba"/&gt;
     *                   &lt;element name="naziv"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="2"/&gt;
     *                         &lt;maxLength value="100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZAdresa"/&gt;
     *                   &lt;element name="sediste"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *                         &lt;maxInclusive value="50"/&gt;
     *                         &lt;minInclusive value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="paragraf2"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="nazivOrgana"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="300"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="broj"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *                         &lt;maxInclusive value="300"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="godina"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *                         &lt;minInclusive value="2000"/&gt;
     *                         &lt;maxInclusive value="2100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="paragraf3"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="dan"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *                         &lt;maxInclusive value="31"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="godina"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *                         &lt;minExclusive value="2000"/&gt;
     *                         &lt;maxExclusive value="2100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="razlog"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="500"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="paragraf4"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="zakljucak"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="razlog"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="500"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="zakonPodnosenjaZalbe"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="500"/&gt;
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
        "paragraf1",
        "paragraf2",
        "paragraf3",
        "paragraf4"
    })
    public static class Sadrzaj {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected ZalbaNaOdluku.Sadrzaj.Paragraf1 paragraf1;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected ZalbaNaOdluku.Sadrzaj.Paragraf2 paragraf2;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected ZalbaNaOdluku.Sadrzaj.Paragraf3 paragraf3;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
        protected ZalbaNaOdluku.Sadrzaj.Paragraf4 paragraf4;

        /**
         * Gets the value of the paragraf1 property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf1 }
         *     
         */
        public ZalbaNaOdluku.Sadrzaj.Paragraf1 getParagraf1() {
            return paragraf1;
        }

        /**
         * Sets the value of the paragraf1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf1 }
         *     
         */
        public void setParagraf1(ZalbaNaOdluku.Sadrzaj.Paragraf1 value) {
            this.paragraf1 = value;
        }

        /**
         * Gets the value of the paragraf2 property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf2 }
         *     
         */
        public ZalbaNaOdluku.Sadrzaj.Paragraf2 getParagraf2() {
            return paragraf2;
        }

        /**
         * Sets the value of the paragraf2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf2 }
         *     
         */
        public void setParagraf2(ZalbaNaOdluku.Sadrzaj.Paragraf2 value) {
            this.paragraf2 = value;
        }

        /**
         * Gets the value of the paragraf3 property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf3 }
         *     
         */
        public ZalbaNaOdluku.Sadrzaj.Paragraf3 getParagraf3() {
            return paragraf3;
        }

        /**
         * Sets the value of the paragraf3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf3 }
         *     
         */
        public void setParagraf3(ZalbaNaOdluku.Sadrzaj.Paragraf3 value) {
            this.paragraf3 = value;
        }

        /**
         * Gets the value of the paragraf4 property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf4 }
         *     
         */
        public ZalbaNaOdluku.Sadrzaj.Paragraf4 getParagraf4() {
            return paragraf4;
        }

        /**
         * Sets the value of the paragraf4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf4 }
         *     
         */
        public void setParagraf4(ZalbaNaOdluku.Sadrzaj.Paragraf4 value) {
            this.paragraf4 = value;
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
         *         &lt;element name="predmetSlanja"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="2"/&gt;
         *               &lt;maxLength value="300"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="osoba" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZOsoba"/&gt;
         *         &lt;element name="naziv"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="2"/&gt;
         *               &lt;maxLength value="100"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku}ZAdresa"/&gt;
         *         &lt;element name="sediste"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
         *               &lt;maxInclusive value="50"/&gt;
         *               &lt;minInclusive value="1"/&gt;
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
            "predmetSlanja",
            "osoba",
            "naziv",
            "adresa",
            "sediste"
        })
        public static class Paragraf1 {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected String predmetSlanja;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected ZOsoba osoba;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected String naziv;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected ZAdresa adresa;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
            protected int sediste;

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
             * Gets the value of the osoba property.
             * 
             * @return
             *     possible object is
             *     {@link ZOsoba }
             *     
             */
            public ZOsoba getOsoba() {
                return osoba;
            }

            /**
             * Sets the value of the osoba property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZOsoba }
             *     
             */
            public void setOsoba(ZOsoba value) {
                this.osoba = value;
            }

            /**
             * Gets the value of the naziv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaziv() {
                return naziv;
            }

            /**
             * Sets the value of the naziv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaziv(String value) {
                this.naziv = value;
            }

            /**
             * Gets the value of the adresa property.
             * 
             * @return
             *     possible object is
             *     {@link ZAdresa }
             *     
             */
            public ZAdresa getAdresa() {
                return adresa;
            }

            /**
             * Sets the value of the adresa property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZAdresa }
             *     
             */
            public void setAdresa(ZAdresa value) {
                this.adresa = value;
            }

            /**
             * Gets the value of the sediste property.
             * 
             */
            public int getSediste() {
                return sediste;
            }

            /**
             * Sets the value of the sediste property.
             * 
             */
            public void setSediste(int value) {
                this.sediste = value;
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
         *         &lt;element name="nazivOrgana"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="300"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="broj"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
         *               &lt;maxInclusive value="300"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="godina"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
         *               &lt;minInclusive value="2000"/&gt;
         *               &lt;maxInclusive value="2100"/&gt;
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
            "nazivOrgana",
            "broj",
            "godina"
        })
        public static class Paragraf2 {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected String nazivOrgana;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
            protected int broj;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
            protected int godina;

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

            /**
             * Gets the value of the broj property.
             * 
             */
            public int getBroj() {
                return broj;
            }

            /**
             * Sets the value of the broj property.
             * 
             */
            public void setBroj(int value) {
                this.broj = value;
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
         *         &lt;element name="dan"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
         *               &lt;maxInclusive value="31"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="godina"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
         *               &lt;minExclusive value="2000"/&gt;
         *               &lt;maxExclusive value="2100"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="razlog"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="500"/&gt;
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
            "dan",
            "godina",
            "razlog"
        })
        public static class Paragraf3 {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
            protected int dan;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku")
            protected int godina;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected String razlog;

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

            /**
             * Gets the value of the razlog property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRazlog() {
                return razlog;
            }

            /**
             * Sets the value of the razlog property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRazlog(String value) {
                this.razlog = value;
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
         *         &lt;element name="zakljucak"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="razlog"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="500"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="zakonPodnosenjaZalbe"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="500"/&gt;
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
            "zakljucak"
        })
        public static class Paragraf4 {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
            protected ZalbaNaOdluku.Sadrzaj.Paragraf4 .Zakljucak zakljucak;

            /**
             * Gets the value of the zakljucak property.
             * 
             * @return
             *     possible object is
             *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf4 .Zakljucak }
             *     
             */
            public ZalbaNaOdluku.Sadrzaj.Paragraf4 .Zakljucak getZakljucak() {
                return zakljucak;
            }

            /**
             * Sets the value of the zakljucak property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZalbaNaOdluku.Sadrzaj.Paragraf4 .Zakljucak }
             *     
             */
            public void setZakljucak(ZalbaNaOdluku.Sadrzaj.Paragraf4 .Zakljucak value) {
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
             *         &lt;element name="razlog"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="500"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="zakonPodnosenjaZalbe"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="500"/&gt;
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
                "razlog",
                "zakonPodnosenjaZalbe"
            })
            public static class Zakljucak {

                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
                protected String razlog;
                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku", required = true)
                protected String zakonPodnosenjaZalbe;

                /**
                 * Gets the value of the razlog property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRazlog() {
                    return razlog;
                }

                /**
                 * Sets the value of the razlog property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRazlog(String value) {
                    this.razlog = value;
                }

                /**
                 * Gets the value of the zakonPodnosenjaZalbe property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZakonPodnosenjaZalbe() {
                    return zakonPodnosenjaZalbe;
                }

                /**
                 * Sets the value of the zakonPodnosenjaZalbe property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZakonPodnosenjaZalbe(String value) {
                    this.zakonPodnosenjaZalbe = value;
                }

            }

        }

    }

}
