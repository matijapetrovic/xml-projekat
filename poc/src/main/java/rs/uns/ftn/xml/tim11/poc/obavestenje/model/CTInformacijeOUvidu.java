
package rs.uns.ftn.xml.tim11.poc.obavestenje.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CTInformacijeOUvidu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTInformacijeOUvidu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Satnica" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="SatnicaOd" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="SatnicaDo" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="Adresa" type="{obavestenje}CTAdresa"/&gt;
 *         &lt;element name="BrojKancelarije" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTInformacijeOUvidu", namespace = "obavestenje", propOrder = {
    "datum",
    "satnica",
    "satnicaOd",
    "satnicaDo",
    "adresa",
    "brojKancelarije"
})
public class CTInformacijeOUvidu {

    @XmlElement(name = "Datum", namespace = "obavestenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "Satnica", namespace = "obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnica;
    @XmlElement(name = "SatnicaOd", namespace = "obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnicaOd;
    @XmlElement(name = "SatnicaDo", namespace = "obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnicaDo;
    @XmlElement(name = "Adresa", namespace = "obavestenje", required = true)
    protected CTAdresa adresa;
    @XmlElement(name = "BrojKancelarije", namespace = "obavestenje", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger brojKancelarije;

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
     * Gets the value of the satnica property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnica() {
        return satnica;
    }

    /**
     * Sets the value of the satnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnica(XMLGregorianCalendar value) {
        this.satnica = value;
    }

    /**
     * Gets the value of the satnicaOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnicaOd() {
        return satnicaOd;
    }

    /**
     * Sets the value of the satnicaOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnicaOd(XMLGregorianCalendar value) {
        this.satnicaOd = value;
    }

    /**
     * Gets the value of the satnicaDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnicaDo() {
        return satnicaDo;
    }

    /**
     * Sets the value of the satnicaDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnicaDo(XMLGregorianCalendar value) {
        this.satnicaDo = value;
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
     * Gets the value of the brojKancelarije property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojKancelarije() {
        return brojKancelarije;
    }

    /**
     * Sets the value of the brojKancelarije property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojKancelarije(BigInteger value) {
        this.brojKancelarije = value;
    }

    @Override
    public String toString() {
        return "Podaci o uvidu: \n" +
                "\tDatum: " + getDatum() +
                "\n\tSatnica: " + getSatnica() +
                "\n\tSatnica Od: " + getSatnicaOd() +
                "\n\tSatnica Do: " +getSatnicaDo() +
                "\n\t" + getAdresa() +
                "\tBroj kancelarije: " + getBrojKancelarije() + "\n";
    }
}
