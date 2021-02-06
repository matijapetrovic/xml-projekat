package rs.ac.uns.ftn.xml.tim11.emailservice.usecase;

import rs.ac.uns.ftn.xml.tim11.emailservice.controller.EmailRequest;

import javax.mail.MessagingException;

public interface EmailSender {
    void sendEmail(EmailRequest request) throws MessagingException;
}
