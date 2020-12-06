package rs.uns.ftn.xml.tim11.poc.zalbacutanje;

import org.xml.sax.SAXException;
import rs.uns.ftn.xml.tim11.poc.JAXBMarshaller;
import rs.uns.ftn.xml.tim11.poc.zalbacutanje.model.Zalba;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;

public class ZalbaCutanjeTest {
    private final String schemaFile = "./../documents/schemas/zalbacutanjecir.xsd";
    private final String xmlFile = "./../documents/instances/zalbacutanjecir.xml";
    private final String outputFile = "./../documents/marshalled/zalbacutanjecir-marshalled.xml";

    public static void main(String[] args) {
        new ZalbaCutanjeTest().test();
    }

    public void test() {
        try {
            tryTest();
        } catch (JAXBException | FileNotFoundException | SAXException e) {
            e.printStackTrace();
        }
    }

    private void tryTest() throws JAXBException, SAXException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance("rs.uns.ftn.xml.tim11.poc.zalbacutanje.model");
        JAXBMarshaller<Zalba> marshaller = new JAXBMarshaller<>(context);
        System.out.printf("READING...\nSCHEMA: %s\nXML FILE: %s\n", schemaFile, xmlFile);
        Zalba zalba = marshaller.unmarshall(new File(schemaFile), new File(xmlFile));
        System.out.println("PRINTING...");
        System.out.println(zalba);

        System.out.printf("WRITING... \nOUTPUT FILE: %s", outputFile);
        marshaller.marshall(zalba, new File(outputFile));
    }
}
