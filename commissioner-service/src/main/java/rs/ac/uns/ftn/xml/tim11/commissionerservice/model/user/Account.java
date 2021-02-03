package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorities"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim11/user}Authority" maxOccurs="unbounded" minOccurs="0"/&gt;
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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "email",
        "password",
        "authorities"
})
@XmlRootElement(name = "Account", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user")
public class Account {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected String email;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected String password;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user", required = true)
    protected Account.Authorities authorities;

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the authorities property.
     *
     * @return
     *     possible object is
     *     {@link Account.Authorities }
     *
     */
    public Account.Authorities getAuthorities() {
        return authorities;
    }

    /**
     * Sets the value of the authorities property.
     *
     * @param value
     *     allowed object is
     *     {@link Account.Authorities }
     *
     */
    public void setAuthorities(Account.Authorities value) {
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
     *         &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim11/user}Authority" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "authority"
    })
    public static class Authorities {

        @XmlElement(name = "Authority", namespace = "http://www.ftn.uns.ac.rs/xml/tim11/user")
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
    public boolean hasRole(String role) {
        return authorities.
                getAuthority()
                .stream()
                .anyMatch(authority -> role.equals(authority.getName()));
    }

    //    public static Account withId(
//            Long id,
//            String email,
//            String password,
//            Set<Authority> authorities
//    ) {
//        return new Account(
//                id,
//                email,
//                password,
//                authorities
//        );
//    }
//
//    public static Account of(
//            String email,
//            String password,
//            Set<Authority> authorities
//    ) {
//        return withId(null, email, password, authorities);
//    }

    public static Account of(
            String email,
            String password,
            List<Authority> authorities
    ) {
        return new Account(email, password, new Authorities(authorities));
    }

}



