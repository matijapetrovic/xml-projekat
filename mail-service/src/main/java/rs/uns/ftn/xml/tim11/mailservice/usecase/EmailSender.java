package rs.uns.ftn.xml.tim11.mailservice.usecase;

public interface EmailSender {
    void sendEmail(String to, String subject, String text);
}
