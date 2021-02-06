
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="BrojResenja"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{3}-\d{2}-\d{4}/\d{4}-\d{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Svrha"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ZalbaOsnovanaNalazeSe"/&gt;
 *               &lt;enumeration value="ZalbaNeosnovanaOdbijaSe"/&gt;
 *               &lt;enumeration value="OdbijaSeZahtev"/&gt;
 *               &lt;enumeration value="PonistavaSe"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DatumResenja" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PodnosilacZalbe" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTPodnosilacZahteva"/&gt;
 *         &lt;element name="Uvod" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTUvod"/&gt;
 *         &lt;element name="Sadrzaj" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTResenje"/&gt;
 *         &lt;element name="Obrazlozenje" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTObrazlozenje"/&gt;
 *         &lt;element name="Poverenik" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTPoverenik"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vocab" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="http://www.ftn.uns.ac.rs/xml/tim11/predicate/" /&gt;
 *       &lt;attribute name="about" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rel" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="pred:resava" /&gt;
 *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "brojResenja",
    "svrha",
    "datumResenja",
    "podnosilacZalbe",
    "uvod",
    "sadrzaj",
    "obrazlozenje",
    "poverenik"
})
@XmlRootElement(name = "Resenje", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje")
public class Resenje {

    @XmlElement(name = "BrojResenja", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected String brojResenja;
    @XmlElement(name = "Svrha", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected String svrha;
    @XmlElement(name = "DatumResenja", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumResenja;
    @XmlElement(name = "PodnosilacZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTPodnosilacZahteva podnosilacZalbe;
    @XmlElement(name = "Uvod", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTUvod uvod;
    @XmlElement(name = "Sadrzaj", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTResenje sadrzaj;
    @XmlElement(name = "Obrazlozenje", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTObrazlozenje obrazlozenje;
    @XmlElement(name = "Poverenik", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected CTPoverenik poverenik;
    @XmlAttribute(name = "vocab", required = true)
    protected String vocab;
    @XmlAttribute(name = "about", required = true)
    protected String about;
    @XmlAttribute(name = "rel", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rel;
    @XmlAttribute(name = "href", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String href;

    /**
     * Gets the value of the brojResenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojResenja() {
        return brojResenja;
    }

    /**
     * Sets the value of the brojResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojResenja(String value) {
        this.brojResenja = value;
    }

    /**
     * Gets the value of the svrha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrha() {
        return svrha;
    }

    /**
     * Sets the value of the svrha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrha(String value) {
        this.svrha = value;
    }

    /**
     * Gets the value of the datumResenja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumResenja() {
        return datumResenja;
    }

    /**
     * Sets the value of the datumResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumResenja(XMLGregorianCalendar value) {
        this.datumResenja = value;
    }

    /**
     * Gets the value of the podnosilacZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link CTPodnosilacZahteva }
     *     
     */
    public CTPodnosilacZahteva getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPodnosilacZahteva }
     *     
     */
    public void setPodnosilacZalbe(CTPodnosilacZahteva value) {
        this.podnosilacZalbe = value;
    }

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link CTUvod }
     *     
     */
    public CTUvod getUvod() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUvod }
     *     
     */
    public void setUvod(CTUvod value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the sadrzaj property.
     * 
     * @return
     *     possible object is
     *     {@link CTResenje }
     *     
     */
    public CTResenje getSadrzaj() {
        return sadrzaj;
    }

    /**
     * Sets the value of the sadrzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTResenje }
     *     
     */
    public void setSadrzaj(CTResenje value) {
        this.sadrzaj = value;
    }

    /**
     * Gets the value of the obrazlozenje property.
     * 
     * @return
     *     possible object is
     *     {@link CTObrazlozenje }
     *     
     */
    public CTObrazlozenje getObrazlozenje() {
        return obrazlozenje;
    }

    /**
     * Sets the value of the obrazlozenje property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTObrazlozenje }
     *     
     */
    public void setObrazlozenje(CTObrazlozenje value) {
        this.obrazlozenje = value;
    }

    /**
     * Gets the value of the poverenik property.
     * 
     * @return
     *     possible object is
     *     {@link CTPoverenik }
     *     
     */
    public CTPoverenik getPoverenik() {
        return poverenik;
    }

    /**
     * Sets the value of the poverenik property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPoverenik }
     *     
     */
    public void setPoverenik(CTPoverenik value) {
        this.poverenik = value;
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
        if (rel == null) {
            return "pred:resava";
        } else {
            return rel;
        }
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

}
