
package user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="account" type="{http://www.ftn.uns.ac.rs/xml/tim11/user}Account"/&gt;
 *         &lt;element name="authorities"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="authority" type="{http://www.ftn.uns.ac.rs/xml/tim11/user}Authority" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "firstName",
    "lastName",
    "account",
    "authorities"
})
@XmlRootElement(name = "User", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user")
public class User {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected String firstName;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected String lastName;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected Account account;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected User.Authorities authorities;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the authorities property.
     * 
     * @return
     *     possible object is
     *     {@link User.Authorities }
     *     
     */
    public User.Authorities getAuthorities() {
        return authorities;
    }

    /**
     * Sets the value of the authorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link User.Authorities }
     *     
     */
    public void setAuthorities(User.Authorities value) {
        this.authorities = value;
    }


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
     *         &lt;element name="authority" type="{http://www.ftn.uns.ac.rs/xml/tim11/user}Authority" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "authority"
    })
    public static class Authorities {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user")
        protected List<Authority> authority;

        /**
         * Gets the value of the authority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthority().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Authority }
         * 
         * 
         */
        public List<Authority> getAuthority() {
            if (authority == null) {
                authority = new ArrayList<Authority>();
            }
            return this.authority;
        }

    }

}
