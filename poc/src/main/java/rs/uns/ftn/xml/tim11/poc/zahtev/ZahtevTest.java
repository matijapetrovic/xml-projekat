package rs.uns.ftn.xml.tim11.poc.zahtev;
import org.xml.sax.SAXException;
import rs.uns.ftn.xml.tim11.poc.JAXBMarshaller;
import rs.uns.ftn.xml.tim11.poc.zahtev.model.Zahtevcir;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;

public class ZahtevTest {
    private final String schemaFile = "./../documents/schemas/zahtevcir.xsd";
    private final String xmlFile = "./../documents/instances/zahtevcir.xml";
    private final String outputFile = "./../documents/marshalled/zahtevcir-marshalled.xml";

    public static void main(String[] args) {
        new ZahtevTest().test();
    }

    public void test() {
        try {
            tryTest();
        } catch (JAXBException | FileNotFoundException | SAXException e) {
            e.printStackTrace();
        }
    }
    public void tryTest() throws JAXBException, SAXException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance("rs.uns.ftn.xml.tim11.poc.zahtev.model");
        JAXBMarshaller<Zahtevcir> marshaller = new JAXBMarshaller<>(context);
        Zahtevcir zahtev = marshaller.unmarshall(new File(schemaFile),new File(xmlFile));
        System.out.println(zahtev);
        marshaller.marshall(zahtev, new File(outputFile));
    }
}
