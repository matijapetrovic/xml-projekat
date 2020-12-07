
package rs.uns.ftn.xml.tim11.poc.zalbanaodlukucir.model;

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
 *                   &lt;element name="adresaPrimaoca" type="{zalbaO}ZAdresa"/&gt;
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
 *                             &lt;element name="osoba" type="{zalbaO}ZOsoba"/&gt;
 *                             &lt;element name="naziv"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="adresa" type="{zalbaO}ZAdresa"/&gt;
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
 *                   &lt;element name="osoba" type="{zalbaO}ZOsoba"/&gt;
 *                   &lt;element name="adresa" type="{zalbaO}ZAdresa"/&gt;
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
@XmlRootElement(name = "zalbaO", namespace = "zalbaO")
public class ZalbaO {

    @XmlElement(namespace = "zalbaO", required = true)
    protected ZalbaO.Primalac primalac;
    @XmlElement(namespace = "zalbaO", required = true)
    protected ZalbaO.Sadrzaj sadrzaj;
    @XmlElement(namespace = "zalbaO", required = true)
    protected ZalbaO.PodnosilacZalbe podnosilacZalbe;
    @XmlElement(namespace = "zalbaO", required = true)
    protected ZalbaO.PodaciPodnosenjaZalbe podaciPodnosenjaZalbe;
    @XmlElement(namespace = "zalbaO", required = true)
    protected ZalbaO.Napomena napomena;

    /**
     * Gets the value of the primalac property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaO.Primalac }
     *     
     */
    public ZalbaO.Primalac getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaO.Primalac }
     *     
     */
    public void setPrimalac(ZalbaO.Primalac value) {
        this.primalac = value;
    }

    /**
     * Gets the value of the sadrzaj property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaO.Sadrzaj }
     *     
     */
    public ZalbaO.Sadrzaj getSadrzaj() {
        return sadrzaj;
    }

    /**
     * Sets the value of the sadrzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaO.Sadrzaj }
     *     
     */
    public void setSadrzaj(ZalbaO.Sadrzaj value) {
        this.sadrzaj = value;
    }

    /**
     * Gets the value of the podnosilacZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaO.PodnosilacZalbe }
     *     
     */
    public ZalbaO.PodnosilacZalbe getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaO.PodnosilacZalbe }
     *     
     */
    public void setPodnosilacZalbe(ZalbaO.PodnosilacZalbe value) {
        this.podnosilacZalbe = value;
    }

    /**
     * Gets the value of the podaciPodnosenjaZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaO.PodaciPodnosenjaZalbe }
     *     
     */
    public ZalbaO.PodaciPodnosenjaZalbe getPodaciPodnosenjaZalbe() {
        return podaciPodnosenjaZalbe;
    }

    /**
     * Sets the value of the podaciPodnosenjaZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaO.PodaciPodnosenjaZalbe }
     *     
     */
    public void setPodaciPodnosenjaZalbe(ZalbaO.PodaciPodnosenjaZalbe value) {
        this.podaciPodnosenjaZalbe = value;
    }

    /**
     * Gets the value of the napomena property.
     * 
     * @return
     *     possible object is
     *     {@link ZalbaO.Napomena }
     *     
     */
    public ZalbaO.Napomena getNapomena() {
        return napomena;
    }

    /**
     * Sets the value of the napomena property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZalbaO.Napomena }
     *     
     */
    public void setNapomena(ZalbaO.Napomena value) {
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

        @XmlElement(namespace = "zalbaO", required = true)
        protected ZalbaO.Napomena.Lista lista;

        /**
         * Gets the value of the lista property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaO.Napomena.Lista }
         *     
         */
        public ZalbaO.Napomena.Lista getLista() {
            return lista;
        }

        /**
         * Sets the value of the lista property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaO.Napomena.Lista }
         *     
         */
        public void setLista(ZalbaO.Napomena.Lista value) {
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

            @XmlElement(namespace = "zalbaO", required = true)
            protected String stavka1;
            @XmlElement(namespace = "zalbaO", required = true)
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

        @XmlElement(namespace = "zalbaO", required = true)
        protected String mesto;
        @XmlElement(namespace = "zalbaO")
        protected int dan;
        @XmlElement(namespace = "zalbaO")
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
     *         &lt;element name="osoba" type="{zalbaO}ZOsoba"/&gt;
     *         &lt;element name="adresa" type="{zalbaO}ZAdresa"/&gt;
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

        @XmlElement(namespace = "zalbaO", required = true)
        protected ZOsoba osoba;
        @XmlElement(namespace = "zalbaO", required = true)
        protected ZAdresa adresa;
        @XmlElement(namespace = "zalbaO")
        protected String drugiPodaci;
        @XmlElement(namespace = "zalbaO", required = true)
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
     *         &lt;element name="adresaPrimaoca" type="{zalbaO}ZAdresa"/&gt;
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

        @XmlElement(namespace = "zalbaO", required = true)
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
     *                   &lt;element name="osoba" type="{zalbaO}ZOsoba"/&gt;
     *                   &lt;element name="naziv"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="2"/&gt;
     *                         &lt;maxLength value="100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="adresa" type="{zalbaO}ZAdresa"/&gt;
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

        @XmlElement(namespace = "zalbaO", required = true)
        protected ZalbaO.Sadrzaj.Paragraf1 paragraf1;
        @XmlElement(namespace = "zalbaO", required = true)
        protected ZalbaO.Sadrzaj.Paragraf2 paragraf2;
        @XmlElement(namespace = "zalbaO", required = true)
        protected ZalbaO.Sadrzaj.Paragraf3 paragraf3;
        @XmlElement(namespace = "zalbaO", required = true)
        protected ZalbaO.Sadrzaj.Paragraf4 paragraf4;

        /**
         * Gets the value of the paragraf1 property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaO.Sadrzaj.Paragraf1 }
         *     
         */
        public ZalbaO.Sadrzaj.Paragraf1 getParagraf1() {
            return paragraf1;
        }

        /**
         * Sets the value of the paragraf1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaO.Sadrzaj.Paragraf1 }
         *     
         */
        public void setParagraf1(ZalbaO.Sadrzaj.Paragraf1 value) {
            this.paragraf1 = value;
        }

        /**
         * Gets the value of the paragraf2 property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaO.Sadrzaj.Paragraf2 }
         *     
         */
        public ZalbaO.Sadrzaj.Paragraf2 getParagraf2() {
            return paragraf2;
        }

        /**
         * Sets the value of the paragraf2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaO.Sadrzaj.Paragraf2 }
         *     
         */
        public void setParagraf2(ZalbaO.Sadrzaj.Paragraf2 value) {
            this.paragraf2 = value;
        }

        /**
         * Gets the value of the paragraf3 property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaO.Sadrzaj.Paragraf3 }
         *     
         */
        public ZalbaO.Sadrzaj.Paragraf3 getParagraf3() {
            return paragraf3;
        }

        /**
         * Sets the value of the paragraf3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaO.Sadrzaj.Paragraf3 }
         *     
         */
        public void setParagraf3(ZalbaO.Sadrzaj.Paragraf3 value) {
            this.paragraf3 = value;
        }

        /**
         * Gets the value of the paragraf4 property.
         * 
         * @return
         *     possible object is
         *     {@link ZalbaO.Sadrzaj.Paragraf4 }
         *     
         */
        public ZalbaO.Sadrzaj.Paragraf4 getParagraf4() {
            return paragraf4;
        }

        /**
         * Sets the value of the paragraf4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZalbaO.Sadrzaj.Paragraf4 }
         *     
         */
        public void setParagraf4(ZalbaO.Sadrzaj.Paragraf4 value) {
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
         *         &lt;element name="osoba" type="{zalbaO}ZOsoba"/&gt;
         *         &lt;element name="naziv"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="2"/&gt;
         *               &lt;maxLength value="100"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="adresa" type="{zalbaO}ZAdresa"/&gt;
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

            @XmlElement(namespace = "zalbaO", required = true)
            protected String predmetSlanja;
            @XmlElement(namespace = "zalbaO", required = true)
            protected ZOsoba osoba;
            @XmlElement(namespace = "zalbaO", required = true)
            protected String naziv;
            @XmlElement(namespace = "zalbaO", required = true)
            protected ZAdresa adresa;
            @XmlElement(namespace = "zalbaO")
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

            @XmlElement(namespace = "zalbaO", required = true)
            protected String nazivOrgana;
            @XmlElement(namespace = "zalbaO")
            protected int broj;
            @XmlElement(namespace = "zalbaO")
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

            @XmlElement(namespace = "zalbaO")
            protected int dan;
            @XmlElement(namespace = "zalbaO")
            protected int godina;
            @XmlElement(namespace = "zalbaO", required = true)
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

            @XmlElement(namespace = "zalbaO", required = true)
            protected ZalbaO.Sadrzaj.Paragraf4 .Zakljucak zakljucak;

            /**
             * Gets the value of the zakljucak property.
             * 
             * @return
             *     possible object is
             *     {@link ZalbaO.Sadrzaj.Paragraf4 .Zakljucak }
             *     
             */
            public ZalbaO.Sadrzaj.Paragraf4 .Zakljucak getZakljucak() {
                return zakljucak;
            }

            /**
             * Sets the value of the zakljucak property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZalbaO.Sadrzaj.Paragraf4 .Zakljucak }
             *     
             */
            public void setZakljucak(ZalbaO.Sadrzaj.Paragraf4 .Zakljucak value) {
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

                @XmlElement(namespace = "zalbaO", required = true)
                protected String razlog;
                @XmlElement(namespace = "zalbaO", required = true)
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

    private String printParagraf1() {
        return "\t\tNaziv Organa: " + getSadrzaj().getParagraf1().getNaziv() + "\n" +
                "\t\t\tPredmet slanja: " + getSadrzaj().getParagraf1().getPredmetSlanja() + "\n" +
                "\t\t\tOsoba: \n\t" + getSadrzaj().getParagraf1().getOsoba() + "\n" +
                "\t\t\tSediste: " + getSadrzaj().getParagraf1().getSediste() + "\n" +
                "\t\t\tAdresa: " + getSadrzaj().getParagraf1().getAdresa() + "\n" +
                "\t\t\tSediste: " + getSadrzaj().getParagraf1().getOsoba();
    }
    private String printParagraf2() {
        return "\t\tNaziv Organa: " + getSadrzaj().getParagraf2().getNazivOrgana() + "\n" +
                "\t\t\tBroj: " + getSadrzaj().getParagraf2().getBroj() + "\n" +
                "\t\t\tGodina: " + getSadrzaj().getParagraf2().getGodina();
    }
    private String printParagraf3() {
        return "\t\tDan: " + getSadrzaj().getParagraf3().getDan() + "\n" +
                "\t\t\tGodina: " + getSadrzaj().getParagraf3().getGodina() + "\n" +
                "\t\t\tRazlog: " + getSadrzaj().getParagraf3().getRazlog();
    }
    private String printParagraf4() {
        return "\t\tZakljucak:\n\t\t " + printZakljucak();
    }
    
    private String printZakljucak() {
    	return "\t\tRazlog: " + getSadrzaj().getParagraf4().getZakljucak().getRazlog()+ "\n" +
                "\t\t\tZakon: " + getSadrzaj().getParagraf4().getZakljucak().getZakonPodnosenjaZalbe();
    }
    
    private String printSadrzaj() {
        return "\t\tParagraf1:\n\t" + printParagraf1() + "\n" +
                "\t\tParagraf2:\n\t" + printParagraf2() + "\n" +
                "\t\tParagraf3:\n\t" + printParagraf3() + "\n" +
                "\t\tParagraf4:\n\t" + printParagraf4();
    }
   
    private String printPodnosilacZalbe() {
    	return	"\t\tOsoba:\n\t" + getPodnosilacZalbe().getOsoba() + "\n" +
                "\t\tAdresa:\n\t" + getPodnosilacZalbe().getAdresa() + "\n" +
                "\t\tDrugi Podaci:\n\t\t\t" + getPodnosilacZalbe().getDrugiPodaci() + "\n" +
                "\t\tPotpis:\n\t\t\t" + getPodnosilacZalbe().getPotpis();
    }
    
    private String printNapomena() {
    	return  "\t\tStavke:\n" + printLista();
    }
    
    private String printLista() {
    	return  "\t\t\tStavka1:\n\t\t\t\t" + getNapomena().getLista().getStavka1() + "\n" +
                "\t\t\tStavka2:\n\t\t\t\t" + getNapomena().getLista().getStavka2() + "\n";
    }
    
    private String printPodaciPodnosenjaZalbe(){
    	return  "\t\tMesto:\n\t\t\t" + getPodaciPodnosenjaZalbe().getMesto() + "\n" +
                "\t\tDan:\n\t\t\t" + getPodaciPodnosenjaZalbe().getDan() + "\n" +
                "\t\tGodina:\n\t\t\t" + getPodaciPodnosenjaZalbe().getGodina();
    }
    
    @Override
    public String toString() {
        return "Podaci o zalbi: \n" +
                "\tPrimalac:\n\t" + getPrimalac().getAdresaPrimaoca() + "\n" +
                "\tSadrzaj: " + "\n" + printSadrzaj() + "\n" +
                "\tPodnosilac zalbe: " + "\n" + printPodnosilacZalbe() + "\n" +
                "\tPodaci Podnosenja Zalbe: " + "\n" + printPodaciPodnosenjaZalbe() + "\n" +
                "\tNapomena: \n" + printNapomena();
    }
}