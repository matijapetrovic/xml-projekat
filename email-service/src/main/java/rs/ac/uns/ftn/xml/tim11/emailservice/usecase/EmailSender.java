package rs.ac.uns.ftn.xml.tim11.emailservice.usecase;

public interface EmailSender {
    void sendEmail(String to, String subject, String text);
}
