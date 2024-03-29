
package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.resenje11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CTUvod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTUvod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatumZalbe" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="OrganVlasti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PozivNaZakon" type="{http://www.ftn.uns.ac.rs/xml/tim11/resenje}CTPozivNaZakon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTUvod", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", propOrder = {
    "content"
})
public class CTUvod {

    @XmlElementRefs({
        @XmlElementRef(name = "DatumZalbe", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", type = JAXBElement.class),
        @XmlElementRef(name = "OrganVlasti", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", type = JAXBElement.class),
        @XmlElementRef(name = "PozivNaZakon", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPozivNaZakon }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
