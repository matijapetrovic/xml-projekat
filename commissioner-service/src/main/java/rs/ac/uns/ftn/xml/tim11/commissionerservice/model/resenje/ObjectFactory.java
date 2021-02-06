
package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje package. 
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

    private final static QName _CTOdlukaIznos_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "Iznos");
    private final static QName _CTPostupakDatumPostupka_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "DatumPostupka");
    private final static QName _CTPostupakUstanova_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "Ustanova");
    private final static QName _CTPredmetZalbeDatumIzjave_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "DatumIzjave");
    private final static QName _CTPredmetZalbeOrganVlasti_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "OrganVlasti");
    private final static QName _CTPredmetZalbeDatumPotrazivanjaInformacija_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "DatumPotrazivanjaInformacija");
    private final static QName _CTObrazlozenjePredmetZalbe_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "PredmetZalbe");
    private final static QName _CTObrazlozenjePostupak_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "Postupak");
    private final static QName _CTObrazlozenjeOdluka_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "Odluka");
    private final static QName _CTResenjeIshod_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "Ishod");
    private final static QName _CTUvodDatumZalbe_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "DatumZalbe");
    private final static QName _CTUvodPozivNaZakon_QNAME = new QName("http://www.ftn.uns.ac.rs/xml/tim11/resenje", "PozivNaZakon");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CTOstaliPodaci }
     * 
     */
    public CTOstaliPodaci createCTOstaliPodaci() {
        return new CTOstaliPodaci();
    }

    /**
     * Create an instance of {@link CTOrganVlasti }
     * 
     */
    public CTOrganVlasti createCTOrganVlasti() {
        return new CTOrganVlasti();
    }

    /**
     * Create an instance of {@link CTPodnosilac }
     * 
     */
    public CTPodnosilac createCTPodnosilac() {
        return new CTPodnosilac();
    }

    /**
     * Create an instance of {@link CTUstanova }
     * 
     */
    public CTUstanova createCTUstanova() {
        return new CTUstanova();
    }

    /**
     * Create an instance of {@link CTPredmetZalbe }
     * 
     */
    public CTPredmetZalbe createCTPredmetZalbe() {
        return new CTPredmetZalbe();
    }

    /**
     * Create an instance of {@link CTPozivNaZakon }
     * 
     */
    public CTPozivNaZakon createCTPozivNaZakon() {
        return new CTPozivNaZakon();
    }

    /**
     * Create an instance of {@link CTPoverenik }
     * 
     */
    public CTPoverenik createCTPoverenik() {
        return new CTPoverenik();
    }

    /**
     * Create an instance of {@link Resenje }
     * 
     */
    public Resenje createResenje() {
        return new Resenje();
    }

    /**
     * Create an instance of {@link CTPodnosilacZahteva }
     * 
     */
    public CTPodnosilacZahteva createCTPodnosilacZahteva() {
        return new CTPodnosilacZahteva();
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
     * Create an instance of {@link CTAdresa }
     * 
     */
    public CTAdresa createCTAdresa() {
        return new CTAdresa();
    }

    /**
     * Create an instance of {@link CTPodaciOZahtevu }
     * 
     */
    public CTPodaciOZahtevu createCTPodaciOZahtevu() {
        return new CTPodaciOZahtevu();
    }

    /**
     * Create an instance of {@link CTOstaliPodaci.Mesto }
     * 
     */
    public CTOstaliPodaci.Mesto createCTOstaliPodaciMesto() {
        return new CTOstaliPodaci.Mesto();
    }

    /**
     * Create an instance of {@link CTOstaliPodaci.Datum }
     * 
     */
    public CTOstaliPodaci.Datum createCTOstaliPodaciDatum() {
        return new CTOstaliPodaci.Datum();
    }

    /**
     * Create an instance of {@link CTOrganVlasti.Naziv }
     * 
     */
    public CTOrganVlasti.Naziv createCTOrganVlastiNaziv() {
        return new CTOrganVlasti.Naziv();
    }

    /**
     * Create an instance of {@link CTPodnosilac.Ime }
     * 
     */
    public CTPodnosilac.Ime createCTPodnosilacIme() {
        return new CTPodnosilac.Ime();
    }

    /**
     * Create an instance of {@link CTPodnosilac.Prezime }
     * 
     */
    public CTPodnosilac.Prezime createCTPodnosilacPrezime() {
        return new CTPodnosilac.Prezime();
    }

    /**
     * Create an instance of {@link CTUstanova.Naziv }
     * 
     */
    public CTUstanova.Naziv createCTUstanovaNaziv() {
        return new CTUstanova.Naziv();
    }

    /**
     * Create an instance of {@link CTPredmetZalbe.DatumPotrazivanjaInformacija }
     * 
     */
    public CTPredmetZalbe.DatumPotrazivanjaInformacija createCTPredmetZalbeDatumPotrazivanjaInformacija() {
        return new CTPredmetZalbe.DatumPotrazivanjaInformacija();
    }

    /**
     * Create an instance of {@link CTPozivNaZakon.BrojeviSluzbenogGlasnika }
     * 
     */
    public CTPozivNaZakon.BrojeviSluzbenogGlasnika createCTPozivNaZakonBrojeviSluzbenogGlasnika() {
        return new CTPozivNaZakon.BrojeviSluzbenogGlasnika();
    }

    /**
     * Create an instance of {@link CTPoverenik.Ime }
     * 
     */
    public CTPoverenik.Ime createCTPoverenikIme() {
        return new CTPoverenik.Ime();
    }

    /**
     * Create an instance of {@link CTPoverenik.Prezime }
     * 
     */
    public CTPoverenik.Prezime createCTPoverenikPrezime() {
        return new CTPoverenik.Prezime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "Iznos", scope = CTOdluka.class)
    public JAXBElement<BigInteger> createCTOdlukaIznos(BigInteger value) {
        return new JAXBElement<BigInteger>(_CTOdlukaIznos_QNAME, BigInteger.class, CTOdluka.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "DatumPostupka", scope = CTPostupak.class)
    public JAXBElement<XMLGregorianCalendar> createCTPostupakDatumPostupka(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CTPostupakDatumPostupka_QNAME, XMLGregorianCalendar.class, CTPostupak.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTUstanova }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CTUstanova }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "Ustanova", scope = CTPostupak.class)
    public JAXBElement<CTUstanova> createCTPostupakUstanova(CTUstanova value) {
        return new JAXBElement<CTUstanova>(_CTPostupakUstanova_QNAME, CTUstanova.class, CTPostupak.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "DatumIzjave", scope = CTPredmetZalbe.class)
    public JAXBElement<XMLGregorianCalendar> createCTPredmetZalbeDatumIzjave(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CTPredmetZalbeDatumIzjave_QNAME, XMLGregorianCalendar.class, CTPredmetZalbe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "OrganVlasti", scope = CTPredmetZalbe.class)
    public JAXBElement<String> createCTPredmetZalbeOrganVlasti(String value) {
        return new JAXBElement<String>(_CTPredmetZalbeOrganVlasti_QNAME, String.class, CTPredmetZalbe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTPredmetZalbe.DatumPotrazivanjaInformacija }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CTPredmetZalbe.DatumPotrazivanjaInformacija }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "DatumPotrazivanjaInformacija", scope = CTPredmetZalbe.class)
    public JAXBElement<CTPredmetZalbe.DatumPotrazivanjaInformacija> createCTPredmetZalbeDatumPotrazivanjaInformacija(CTPredmetZalbe.DatumPotrazivanjaInformacija value) {
        return new JAXBElement<CTPredmetZalbe.DatumPotrazivanjaInformacija>(_CTPredmetZalbeDatumPotrazivanjaInformacija_QNAME, CTPredmetZalbe.DatumPotrazivanjaInformacija.class, CTPredmetZalbe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTPredmetZalbe }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CTPredmetZalbe }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "PredmetZalbe", scope = CTObrazlozenje.class)
    public JAXBElement<CTPredmetZalbe> createCTObrazlozenjePredmetZalbe(CTPredmetZalbe value) {
        return new JAXBElement<CTPredmetZalbe>(_CTObrazlozenjePredmetZalbe_QNAME, CTPredmetZalbe.class, CTObrazlozenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTPostupak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CTPostupak }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "Postupak", scope = CTObrazlozenje.class)
    public JAXBElement<CTPostupak> createCTObrazlozenjePostupak(CTPostupak value) {
        return new JAXBElement<CTPostupak>(_CTObrazlozenjePostupak_QNAME, CTPostupak.class, CTObrazlozenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTOdluka }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CTOdluka }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "Odluka", scope = CTObrazlozenje.class)
    public JAXBElement<CTOdluka> createCTObrazlozenjeOdluka(CTOdluka value) {
        return new JAXBElement<CTOdluka>(_CTObrazlozenjeOdluka_QNAME, CTOdluka.class, CTObrazlozenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTUstanova }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CTUstanova }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "Ustanova", scope = CTResenje.class)
    public JAXBElement<CTUstanova> createCTResenjeUstanova(CTUstanova value) {
        return new JAXBElement<CTUstanova>(_CTPostupakUstanova_QNAME, CTUstanova.class, CTResenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "Ishod", scope = CTResenje.class)
    public JAXBElement<String> createCTResenjeIshod(String value) {
        return new JAXBElement<String>(_CTResenjeIshod_QNAME, String.class, CTResenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "OrganVlasti", scope = CTUvod.class)
    public JAXBElement<String> createCTUvodOrganVlasti(String value) {
        return new JAXBElement<String>(_CTPredmetZalbeOrganVlasti_QNAME, String.class, CTUvod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "DatumZalbe", scope = CTUvod.class)
    public JAXBElement<XMLGregorianCalendar> createCTUvodDatumZalbe(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CTUvodDatumZalbe_QNAME, XMLGregorianCalendar.class, CTUvod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTPozivNaZakon }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CTPozivNaZakon }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xml/tim11/resenje", name = "PozivNaZakon", scope = CTUvod.class)
    public JAXBElement<CTPozivNaZakon> createCTUvodPozivNaZakon(CTPozivNaZakon value) {
        return new JAXBElement<CTPozivNaZakon>(_CTUvodPozivNaZakon_QNAME, CTPozivNaZakon.class, CTUvod.class, value);
    }

}
