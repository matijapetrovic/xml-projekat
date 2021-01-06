
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTZakon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTZakon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Clan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Stav" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Tacka" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="NazivZakona" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTZakon", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", propOrder = {
    "clan",
    "stav",
    "tacka",
    "nazivZakona"
})
public class CTZakon {

    @XmlElement(name = "Clan", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> clan;
    @XmlElement(name = "Stav", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stav;
    @XmlElement(name = "Tacka", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tacka;
    @XmlElement(name = "NazivZakona", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", required = true)
    protected String nazivZakona;

    /**
     * Gets the value of the clan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getClan() {
        if (clan == null) {
            clan = new ArrayList<BigInteger>();
        }
        return this.clan;
    }

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStav(BigInteger value) {
        this.stav = value;
    }

    /**
     * Gets the value of the tacka property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTacka() {
        return tacka;
    }

    /**
     * Sets the value of the tacka property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTacka(BigInteger value) {
        this.tacka = value;
    }

    /**
     * Gets the value of the nazivZakona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivZakona() {
        return nazivZakona;
    }

    /**
     * Sets the value of the nazivZakona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivZakona(String value) {
        this.nazivZakona = value;
    }

}
