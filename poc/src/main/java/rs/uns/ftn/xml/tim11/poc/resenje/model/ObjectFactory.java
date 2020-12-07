
package rs.uns.ftn.xml.tim11.poc.resenje.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
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

    private final static QName _CTUvodDatumZalbe_QNAME = new QName("resenje", "DatumZalbe");
    private final static QName _CTUvodOrganVlasti_QNAME = new QName("resenje", "OrganVlasti");
    private final static QName _CTUvodPozivNaZakon_QNAME = new QName("resenje", "PozivNaZakon");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CTPozivNaZakon }
     * 
     */
    public CTPozivNaZakon createCTPozivNaZakon() {
        return new CTPozivNaZakon();
    }

    /**
     * Create an instance of {@link Resenje }
     * 
     */
    public Resenje createResenje() {
        return new Resenje();
    }

    /**
     * Create an instance of {@link CTUvod }
     * 
     */
    public CTUvod createCTUvod() {
        return new CTUvod();
    }

    /**
     * Create an instance of {@link CTResenje }
     * 
     */
    public CTResenje createCTResenje() {
        return new CTResenje();
    }

    /**
     * Create an instance of {@link CTObrazlozenje }
     * 
     */
    public CTObrazlozenje createCTObrazlozenje() {
        return new CTObrazlozenje();
    }

    /**
     * Create an instance of {@link CTPoverenik }
     * 
     */
    public CTPoverenik createCTPoverenik() {
        return new CTPoverenik();
    }

    /**
     * Create an instance of {@link CTUstanova }
     * 
     */
    public CTUstanova createCTUstanova() {
        return new CTUstanova();
    }

    /**
     * Create an instance of {@link CTZakon }
     * 
     */
    public CTZakon createCTZakon() {
        return new CTZakon();
    }

    /**
     * Create an instance of {@link CTPredmetZalbe }
     * 
     */
    public CTPredmetZalbe createCTPredmetZalbe() {
        return new CTPredmetZalbe();
    }

    /**
     * Create an instance of {@link CTPostupak }
     * 
     */
    public CTPostupak createCTPostupak() {
        return new CTPostupak();
    }

    /**
     * Create an instance of {@link CTOdluka }
     * 
     */
    public CTOdluka createCTOdluka() {
        return new CTOdluka();
    }

    /**
     * Create an instance of {@link CTPozivNaZakon.BrojeviSluzbenogGlasnika }
     * 
     */
    public CTPozivNaZakon.BrojeviSluzbenogGlasnika createCTPozivNaZakonBrojeviSluzbenogGlasnika() {
        return new CTPozivNaZakon.BrojeviSluzbenogGlasnika();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "resenje", name = "DatumZalbe", scope = CTUvod.class)
    public JAXBElement<XMLGregorianCalendar> createCTUvodDatumZalbe(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CTUvodDatumZalbe_QNAME, XMLGregorianCalendar.class, CTUvod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "resenje", name = "OrganVlasti", scope = CTUvod.class)
    public JAXBElement<String> createCTUvodOrganVlasti(String value) {
        return new JAXBElement<String>(_CTUvodOrganVlasti_QNAME, String.class, CTUvod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTPozivNaZakon }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CTPozivNaZakon }{@code >}
     */
    @XmlElementDecl(namespace = "resenje", name = "PozivNaZakon", scope = CTUvod.class)
    public JAXBElement<CTPozivNaZakon> createCTUvodPozivNaZakon(CTPozivNaZakon value) {
        return new JAXBElement<CTPozivNaZakon>(_CTUvodPozivNaZakon_QNAME, CTPozivNaZakon.class, CTUvod.class, value);
    }

}