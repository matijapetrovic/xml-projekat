package rs.uns.ftn.xml.tim11.poc.zalbanaodlukucir;

import org.xml.sax.SAXException;
import rs.uns.ftn.xml.tim11.poc.JAXBMarshaller;
import rs.uns.ftn.xml.tim11.poc.zalbanaodlukucir.model.ZalbaO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;

public class ZalbaNaOdlukuTest {
	private final String schemaFile = "./../documents/schemas/zalbanaodlukucir.xsd";
    private final String xmlFile = "./../documents/instances/zalbanaodlukucir.xml";
    private final String outputFile = "./../documents/marshalled/zalbanaodlukucir-marshalled.xml";

    public static void main(String[] args) {
        new ZalbaNaOdlukuTest().test();
    }
    
    public void test() {
        try {
            tryTest();
        } catch (JAXBException | FileNotFoundException | SAXException e) {
            e.printStackTrace();
        }
    }
    
    private void tryTest() throws JAXBException, SAXException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance("rs.uns.ftn.xml.tim11.poc.zalbanaodlukucir.model");
        JAXBMarshaller<ZalbaO> marshaller = new JAXBMarshaller<>(context);
        System.out.printf("READING...\nSCHEMA: %s\nXML FILE: %s\n", schemaFile, xmlFile);
        ZalbaO zalba = marshaller.unmarshall(new File(schemaFile), new File(xmlFile));
        System.out.println("PRINTING...");
        System.out.println(zalba);

        System.out.printf("WRITING... \nOUTPUT FILE: %s", outputFile);
        marshaller.marshall(zalba, new File(outputFile));
    }
}