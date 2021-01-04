
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.obavestenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="BrojPredmeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Organ" type="{obavestenje}CTOrgan"/&gt;
 *         &lt;element name="PodnosiocZahteva" type="{obavestenje}CTPodnosiocZahteva"/&gt;
 *         &lt;element name="TrazenaInformacija" type="{obavestenje}CTTrazenaInformacija"/&gt;
 *         &lt;element name="InformacijeOUvidu" type="{obavestenje}CTInformacijeOUvidu"/&gt;
 *         &lt;element name="Troskovi" type="{obavestenje}CTTroskovi"/&gt;
 *         &lt;element name="InformacijeOUplati" type="{obavestenje}CTInformacijeOUplati"/&gt;
 *         &lt;element name="Dostavljeno"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Imenovanom"/&gt;
 *               &lt;enumeration value="Arhivi"/&gt;
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
    "brojPredmeta",
    "datum",
    "organ",
    "podnosiocZahteva",
    "trazenaInformacija",
    "informacijeOUvidu",
    "troskovi",
    "informacijeOUplati",
    "dostavljeno"
})
@XmlRootElement(name = "Obavestenje", namespace = "obavestenje")
public class Obavestenje {

    @XmlElement(name = "BrojPredmeta", namespace = "obavestenje", required = true)
    protected String brojPredmeta;
    @XmlElement(name = "Datum", namespace = "obavestenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "Organ", namespace = "obavestenje", required = true)
    protected CTOrgan organ;
    @XmlElement(name = "PodnosiocZahteva", namespace = "obavestenje", required = true)
    protected CTPodnosiocZahteva podnosiocZahteva;
    @XmlElement(name = "TrazenaInformacija", namespace = "obavestenje", required = true)
    protected CTTrazenaInformacija trazenaInformacija;
    @XmlElement(name = "InformacijeOUvidu", namespace = "obavestenje", required = true)
    protected CTInformacijeOUvidu informacijeOUvidu;
    @XmlElement(name = "Troskovi", namespace = "obavestenje", required = true)
    protected CTTroskovi troskovi;
    @XmlElement(name = "InformacijeOUplati", namespace = "obavestenje", required = true)
    protected CTInformacijeOUplati informacijeOUplati;
    @XmlElement(name = "Dostavljeno", namespace = "obavestenje", required = true)
    protected String dostavljeno;

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the organ property.
     * 
     * @return
     *     possible object is
     *     {@link CTOrgan }
     *     
     */
    public CTOrgan getOrgan() {
        return organ;
    }

    /**
     * Sets the value of the organ property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOrgan }
     *     
     */
    public void setOrgan(CTOrgan value) {
        this.organ = value;
    }

    /**
     * Gets the value of the podnosiocZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link CTPodnosiocZahteva }
     *     
     */
    public CTPodnosiocZahteva getPodnosiocZahteva() {
        return podnosiocZahteva;
    }

    /**
     * Sets the value of the podnosiocZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPodnosiocZahteva }
     *     
     */
    public void setPodnosiocZahteva(CTPodnosiocZahteva value) {
        this.podnosiocZahteva = value;
    }

    /**
     * Gets the value of the trazenaInformacija property.
     * 
     * @return
     *     possible object is
     *     {@link CTTrazenaInformacija }
     *     
     */
    public CTTrazenaInformacija getTrazenaInformacija() {
        return trazenaInformacija;
    }

    /**
     * Sets the value of the trazenaInformacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTrazenaInformacija }
     *     
     */
    public void setTrazenaInformacija(CTTrazenaInformacija value) {
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

    @Override
    public String toString() {

        return "Podaci o obavestenju: \n\n" +
                "Broj predmeta: " + getBrojPredmeta() + "\n" +
                "Primerak dostavljen: " + getDostavljeno() + "\n" +
                "Datum kreiranja obavestenja: " + getDatum() + "\n\n" +
                getOrgan() + "\n" +
                getPodnosiocZahteva() + "\n" +
                getTrazenaInformacija() + "\n" +
                getInformacijeOUvidu() + "\n" +
                getTroskovi() + "\n" +
                getInformacijeOUplati() + "\n";
    }

}
