
package rs.uns.ftn.xml.tim11.poc.obavestenje.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTPodnosiocZahteva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTPodnosiocZahteva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Adresa" type="{obavestenje}CTAdresa"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTPodnosiocZahteva", namespace = "obavestenje", propOrder = {
    "ime",
    "prezime",
    "naziv",
    "adresa"
})
public class CTPodnosiocZahteva {

    @XmlElement(name = "Ime", namespace = "obavestenje", required = true)
    protected String ime;
    @XmlElement(name = "Prezime", namespace = "obavestenje", required = true)
    protected String prezime;
    @XmlElement(name = "Naziv", namespace = "obavestenje", required = true)
    protected String naziv;
    @XmlElement(name = "Adresa", namespace = "obavestenje", required = true)
    protected CTAdresa adresa;

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
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


    @Override
    public String toString() {
        return "Podaci o podnosiocu zahteva: \n" +
                "\tIme: " + getIme() +
                "\n\tPrezime: " + getPrezime() +
                "\n\tNaziv: " + getNaziv() +
                "\n\t" + getAdresa() + "\n";
    }
}
