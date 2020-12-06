
package rs.uns.ftn.xml.tim11.poc.obavestenje.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTInformacijeOUplati complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTInformacijeOUplati"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UkupniTroskovi" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ZiroRacun"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{3}-\d{13}-\d{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BrojModela"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{2}"/&gt;
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
@XmlType(name = "CTInformacijeOUplati", namespace = "obavestenje", propOrder = {
    "ukupniTroskovi",
    "ziroRacun",
    "brojModela"
})
public class CTInformacijeOUplati {

    @XmlElement(name = "UkupniTroskovi", namespace = "obavestenje", required = true)
    protected BigDecimal ukupniTroskovi;
    @XmlElement(name = "ZiroRacun", namespace = "obavestenje", required = true)
    protected String ziroRacun;
    @XmlElement(name = "BrojModela", namespace = "obavestenje", required = true)
    protected String brojModela;

    /**
     * Gets the value of the ukupniTroskovi property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupniTroskovi() {
        return ukupniTroskovi;
    }

    /**
     * Sets the value of the ukupniTroskovi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupniTroskovi(BigDecimal value) {
        this.ukupniTroskovi = value;
    }

    /**
     * Gets the value of the ziroRacun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZiroRacun() {
        return ziroRacun;
    }

    /**
     * Sets the value of the ziroRacun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZiroRacun(String value) {
        this.ziroRacun = value;
    }

    /**
     * Gets the value of the brojModela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojModela() {
        return brojModela;
    }

    /**
     * Sets the value of the brojModela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojModela(String value) {
        this.brojModela = value;
    }


    @Override
    public String toString() {
        return "Podaci o uplati: \n" +
                "\tUkupni troskovi: " + getUkupniTroskovi() +
                "\n\tZiro racun: " + getZiroRacun() +
                "\n\tBroj modela: " + getBrojModela() + "\n";
    }
}
