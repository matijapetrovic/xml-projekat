package rs.ac.uns.ftn.xml.tim11.commissionerservice.xslt;

import javax.xml.XMLConstants;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XsltTransform {
    public static void transform(String[] args) throws TransformerException {
        Source xslt = new StreamSource(new File(args[0]));
        Source xml  = new StreamSource(new File(args[1]));
        Result out  = new StreamResult(new File(args[2]));

        TransformerFactory factory = TransformerFactory.newInstance();
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");

        Transformer transformer = factory.newTransformer(xslt);
        transformer.transform(xml, out);
    }
}
