
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTTrazilacInformacija complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTTrazilacInformacija"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/xml/tim11/common}CTPodnosilac"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DrugiKontaktPodaci" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rel" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="pred:podneo" /&gt;
 *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTTrazilacInformacija", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", propOrder = {
    "drugiKontaktPodaci"
})
public class CTTrazilacInformacija
    extends CTPodnosilac
{

    @XmlElement(name = "DrugiKontaktPodaci", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/zahtev", required = true)
    protected String drugiKontaktPodaci;
    @XmlAttribute(name = "rel", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rel;
    @XmlAttribute(name = "href", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String href;

    /**
     * Gets the value of the drugiKontaktPodaci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugiKontaktPodaci() {
        return drugiKontaktPodaci;
    }

    /**
     * Sets the value of the drugiKontaktPodaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugiKontaktPodaci(String value) {
        this.drugiKontaktPodaci = value;
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
            return "pred:podneo";
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
