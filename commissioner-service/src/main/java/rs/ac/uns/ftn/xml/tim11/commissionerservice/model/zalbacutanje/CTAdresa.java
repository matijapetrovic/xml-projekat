
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTAdresa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTAdresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ulica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Broj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Grad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Drzava" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostanskiBroj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTAdresa", namespace = "zalbacutanje", propOrder = {
    "ulica",
    "broj",
    "grad",
    "drzava",
    "postanskiBroj"
})
public class CTAdresa {

    @XmlElement(name = "Ulica", namespace = "zalbacutanje", required = true)
    protected String ulica;
    @XmlElement(name = "Broj", namespace = "zalbacutanje", required = true)
    protected String broj;
    @XmlElement(name = "Grad", namespace = "zalbacutanje", required = true)
    protected String grad;
    @XmlElement(name = "Drzava", namespace = "zalbacutanje", required = true)
    protected String drzava;
    @XmlElement(name = "PostanskiBroj", namespace = "zalbacutanje", required = true)
    protected String postanskiBroj;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the broj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroj() {
        return broj;
    }

    /**
     * Sets the value of the broj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroj(String value) {
        this.broj = value;
    }

    /**
     * Gets the value of the grad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrad() {
        return grad;
    }

    /**
     * Sets the value of the grad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrad(String value) {
        this.grad = value;
    }

    /**
     * Gets the value of the drzava property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrzava() {
        return drzava;
    }

    /**
     * Sets the value of the drzava property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrzava(String value) {
        this.drzava = value;
    }

    /**
     * Gets the value of the postanskiBroj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostanskiBroj() {
        return postanskiBroj;
    }

    /**
     * Sets the value of the postanskiBroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostanskiBroj(String value) {
        this.postanskiBroj = value;
    }

    @Override
    public String toString() {
        return  "\t\tUlica: " + getUlica() + "\n" +
                "\t\tBroj: " + getBroj() + "\n" +
                "\t\tGrad: " + getGrad() + "\n" +
                "\t\tDrzava: " + getDrzava() + "\n" +
                "\t\tPostanski broj: " + getPostanskiBroj();
    }
}
