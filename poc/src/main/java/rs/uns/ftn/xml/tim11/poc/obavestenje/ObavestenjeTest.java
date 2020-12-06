package rs.uns.ftn.xml.tim11.poc.obavestenje;

import org.xml.sax.SAXException;
import rs.uns.ftn.xml.tim11.poc.JAXBMarshaller;
import rs.uns.ftn.xml.tim11.poc.obavestenje.model.Obavestenje;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;

public class ObavestenjeTest {
    private final String schemaFile = "./../documents/schemas/obavestenjecir.xsd";
    private final String xmlFile = "./../documents/instances/obavestenjecir.xml";
    private final String outputFile = "./../documents/marshalled/obavestenjecir-marshalled.xml";

    public static void main(String[] args) {
        new ObavestenjeTest().test();
    }

    public void test() {
        try {
            tryTest();
        } catch (JAXBException | FileNotFoundException | SAXException e) {
            e.printStackTrace();
        }
    }

    private void tryTest() throws JAXBException, SAXException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance("rs.uns.ftn.xml.tim11.poc.obavestenje.model");
        JAXBMarshaller<Obavestenje> marshaller = new JAXBMarshaller<>(context);
        System.out.printf("READING...\nSCHEMA: %s\nXML FILE: %s\n", schemaFile, xmlFile);
        Obavestenje obavestenje = marshaller.unmarshall(new File(schemaFile), new File(xmlFile));
        System.out.println("PRINTING...");
        System.out.println(obavestenje);

        System.out.printf("WRITING... \nOUTPUT FILE: %s", outputFile);
        marshaller.marshall(obavestenje, new File(outputFile));
    }
}
