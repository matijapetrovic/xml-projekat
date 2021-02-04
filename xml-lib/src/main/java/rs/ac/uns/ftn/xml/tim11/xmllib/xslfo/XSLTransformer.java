package rs.ac.uns.ftn.xml.tim11.xmllib.xslfo;

import org.apache.fop.apps.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class XSLTransformer {
    private final XmlResourceProperties properties;

    private final FopFactory fopFactory;
    private final TransformerFactory transformerFactory;
    private final DocumentBuilderFactory documentFactory;

    public XSLTransformer(XmlResourceProperties properties) throws SAXException, IOException {
        this.properties = properties;
        fopFactory = FopFactory.newInstance(new File("data/fop.xconf"));
        transformerFactory = TransformerFactory.newInstance();
        documentFactory = DocumentBuilderFactory.newInstance();
        documentFactory.setNamespaceAware(true);
        documentFactory.setIgnoringComments(true);
        documentFactory.setIgnoringElementContentWhitespace(true);
    }

    public byte[] generateXHtml(InputStream in) throws TransformerException, IOException, SAXException, ParserConfigurationException {
        System.out.println(properties.xslPath());
        StreamSource transformSource = new StreamSource(properties.xslPath());
        Transformer transformer = transformerFactory.newTransformer(transformSource);
        transformer.setOutputProperty("{http://xml.apache.org/xalan}indent-amount", "2");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        // Generate XHTML
        transformer.setOutputProperty(OutputKeys.METHOD, "xhtml");

        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        // Transform DOM to HTML
        DOMSource source = new DOMSource(buildDocument(in));
        StreamResult result = new StreamResult(outStream);

        transformer.transform(source, result);

        return outStream.toByteArray();
    }

    public org.w3c.dom.Document buildDocument(InputStream in) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = documentFactory.newDocumentBuilder();
        org.w3c.dom.Document document = builder.parse(new InputSource(in));

        if (document == null) {
            System.out.println("[WARN] Document is null.");
            return null;
        }
        System.out.println("[INFO] File parsed with no errors.");
        return document;
    }

    public byte[] generatePdf(InputStream in) throws TransformerException, FOPException {

        // Point to the XSL-FO file
        File xslFile = new File(properties.xslFoPath());

        // Create transformation source
        StreamSource transformSource = new StreamSource(xslFile);

        // Initialize the transformation subject
        StreamSource source = new StreamSource(in);

        // Initialize user agent needed for the transformation
        FOUserAgent userAgent = fopFactory.newFOUserAgent();

        // Create the output stream to store the results
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();

        // Initialize the XSL-FO transformer object
        Transformer xslFoTransformer = transformerFactory.newTransformer(transformSource);

        // Construct FOP instance with desired output format
        Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, userAgent, outStream);

        // Resulting SAX events
        Result res = new SAXResult(fop.getDefaultHandler());

        // Start XSLT transformation and FOP processing
        xslFoTransformer.transform(source, res);

        return outStream.toByteArray();
    }
}
