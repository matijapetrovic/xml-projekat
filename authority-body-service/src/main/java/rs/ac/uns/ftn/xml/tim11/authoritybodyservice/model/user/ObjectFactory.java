package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user;


import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aa package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aa
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     *
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link Authority }
     *
     */
    public Authority createAuthority() {
        return new Authority();
    }

    /**
     * Create an instance of {@link Account.Authorities }
     *
     */
    public Account.Authorities createAccountAuthorities() {
        return new Account.Authorities();
    }

    /**
     * Create an instance of {@link User }
     *
     */
    public User createUser() {
        return new User();
    }
}

