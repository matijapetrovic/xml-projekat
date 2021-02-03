package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim11/user}Account"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "firstName",
        "lastName",
        "account"
})
@XmlRootElement(name = "User", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user")
public class User {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected String firstName;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected String lastName;
    @XmlElement(name = "Account", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected Account account;

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

    public static User of(
            String firstName,
            String lastName,
            Account account) {
        return new User(firstName, lastName, account);
    }
}

