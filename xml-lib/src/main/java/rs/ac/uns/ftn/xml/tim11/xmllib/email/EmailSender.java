package rs.ac.uns.ftn.xml.tim11.xmllib.email;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class EmailSender {
    public void sendEmail(String destination, EmailMessage email) throws IOException, JAXBException {
        URL url = new URL(destination);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/xml");

        con.setDoOutput(true);
        byte[] request = marshalEmail(email);
        con.setFixedLengthStreamingMode(request.length);
        con.connect();
        con.getOutputStream().write(request);
    }

    private byte[] marshalEmail(EmailMessage email) throws JAXBException {
        String pack = EmailMessage.class.getPackage().getName();
        System.out.println("Ovo jee" + pack);
        JAXBContext context = JAXBContext.newInstance(EmailMessage.class.getPackage().getName());
        Marshaller marshaller = context.createMarshaller();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        marshaller.marshal(email, out);
        return out.toByteArray();
    }
}
