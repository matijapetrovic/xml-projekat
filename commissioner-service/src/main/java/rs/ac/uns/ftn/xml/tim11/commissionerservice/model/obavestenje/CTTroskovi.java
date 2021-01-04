
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.obavestenje;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTTroskovi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTTroskovi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CenaA4" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CenaA3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CenaCD" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CenaDisketa" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CenaDVD" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CenaAudioKaseta" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CenaVideoKaseta" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CenaEDokument" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTTroskovi", namespace = "obavestenje", propOrder = {
    "cenaA4",
    "cenaA3",
    "cenaCD",
    "cenaDisketa",
    "cenaDVD",
    "cenaAudioKaseta",
    "cenaVideoKaseta",
    "cenaEDokument"
})
public class CTTroskovi {

    @XmlElement(name = "CenaA4", namespace = "obavestenje", required = true)
    protected BigDecimal cenaA4;
    @XmlElement(name = "CenaA3", namespace = "obavestenje", required = true)
    protected BigDecimal cenaA3;
    @XmlElement(name = "CenaCD", namespace = "obavestenje", required = true)
    protected BigDecimal cenaCD;
    @XmlElement(name = "CenaDisketa", namespace = "obavestenje", required = true)
    protected BigDecimal cenaDisketa;
    @XmlElement(name = "CenaDVD", namespace = "obavestenje", required = true)
    protected BigDecimal cenaDVD;
    @XmlElement(name = "CenaAudioKaseta", namespace = "obavestenje", required = true)
    protected BigDecimal cenaAudioKaseta;
    @XmlElement(name = "CenaVideoKaseta", namespace = "obavestenje", required = true)
    protected BigDecimal cenaVideoKaseta;
    @XmlElement(name = "CenaEDokument", namespace = "obavestenje", required = true)
    protected BigDecimal cenaEDokument;

    /**
     * Gets the value of the cenaA4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCenaA4() {
        return cenaA4;
    }

    /**
     * Sets the value of the cenaA4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCenaA4(BigDecimal value) {
        this.cenaA4 = value;
    }

    /**
     * Gets the value of the cenaA3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCenaA3() {
        return cenaA3;
    }

    /**
     * Sets the value of the cenaA3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCenaA3(BigDecimal value) {
        this.cenaA3 = value;
    }

    /**
     * Gets the value of the cenaCD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCenaCD() {
        return cenaCD;
    }

    /**
     * Sets the value of the cenaCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCenaCD(BigDecimal value) {
        this.cenaCD = value;
    }

    /**
     * Gets the value of the cenaDisketa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCenaDisketa() {
        return cenaDisketa;
    }

    /**
     * Sets the value of the cenaDisketa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCenaDisketa(BigDecimal value) {
        this.cenaDisketa = value;
    }

    /**
     * Gets the value of the cenaDVD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCenaDVD() {
        return cenaDVD;
    }

    /**
     * Sets the value of the cenaDVD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCenaDVD(BigDecimal value) {
        this.cenaDVD = value;
    }

    /**
     * Gets the value of the cenaAudioKaseta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCenaAudioKaseta() {
        return cenaAudioKaseta;
    }

    /**
     * Sets the value of the cenaAudioKaseta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCenaAudioKaseta(BigDecimal value) {
        this.cenaAudioKaseta = value;
    }

    /**
     * Gets the value of the cenaVideoKaseta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCenaVideoKaseta() {
        return cenaVideoKaseta;
    }

    /**
     * Sets the value of the cenaVideoKaseta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCenaVideoKaseta(BigDecimal value) {
        this.cenaVideoKaseta = value;
    }

    /**
     * Gets the value of the cenaEDokument property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCenaEDokument() {
        return cenaEDokument;
    }

    /**
     * Sets the value of the cenaEDokument property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCenaEDokument(BigDecimal value) {
        this.cenaEDokument = value;
    }

    @Override
    public String toString() {
        return "Podaci o troskovima:" +
                "\n\tCena A4: " + getCenaA4() +
                "\n\tCena A4: " + getCenaA3() +
                "\n\tCena A4: " + getCenaCD() +
                "\n\tCena A4: " + getCenaDisketa() +
                "\n\tCena A4: " + getCenaDVD() +
                "\n\tCena A4: " + getCenaAudioKaseta() +
                "\n\tCena A4: " + getCenaVideoKaseta() +
                "\n\tCena A4: " + getCenaEDokument() + "\n";
    }

}
