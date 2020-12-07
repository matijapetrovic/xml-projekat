package rs.uns.ftn.xml.tim11.poc.resenje;

import org.xml.sax.SAXException;
import rs.uns.ftn.xml.tim11.poc.JAXBMarshaller;
import rs.uns.ftn.xml.tim11.poc.resenje.model.Resenje;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;

public class ResenjeTest {
    private final String schemaFile = "./../documents/schemas/resenje.xsd";
    private final String xmlFile = "./../documents/instances/resenje.xml";
    private final String outputFile = "./../documents/marshalled/resenje-marshalled.xml";

    public static void main(String[] args) {
        new ResenjeTest().test();
    }

    public void test() {
        try {
            tryTest();
        } catch (JAXBException | FileNotFoundException | SAXException e) {
            e.printStackTrace();
        }
    }

    private void tryTest() throws JAXBException, SAXException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance("rs.uns.ftn.xml.tim11.poc.resenje.model");
        JAXBMarshaller<Resenje> marshaller = new JAXBMarshaller<>(context);
        System.out.printf("READING...\nSCHEMA: %s\nXML FILE: %s\n", schemaFile, xmlFile);
        Resenje resenje = marshaller.unmarshall(new File(schemaFile), new File(xmlFile));
        System.out.println("PRINTING...");
        System.out.println(resenje);

        System.out.printf("WRITING... \nOUTPUT FILE: %s", outputFile);
        marshaller.marshall(resenje, new File(outputFile));
    }
}
