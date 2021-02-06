package rs.ac.uns.ftn.xml.tim11.emailservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.emailservice.controller.EmailRequest;
import rs.ac.uns.ftn.xml.tim11.emailservice.usecase.EmailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.util.ByteArrayDataSource;
import java.util.Objects;


@Component
@RequiredArgsConstructor
public class EmailService implements EmailSender {
    private final JavaMailSender mailSender;
    private final Environment env;

    @Override
    @Async
    public void sendEmail(EmailRequest request) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mail = new MimeMessageHelper(mimeMessage, true, "utf-8");

        mail.setTo(request.getTo());
        mail.setFrom(Objects.requireNonNull(env.getProperty("spring.mail.username")));
        mail.setSubject(request.getSubject());
        mail.setText(request.getText());
        if (request.getPdfAttachment() != null) {
            mail.addAttachment("document.pdf", new ByteArrayDataSource(request.getPdfAttachment(), "application/pdf"));
        }
        if (request.getXhtmlAttachment() != null) {
            mail.addAttachment("document.xhtml", new ByteArrayDataSource(request.getPdfAttachment(), "application/xhtml+xml"));
        }
        mailSender.send(mimeMessage);
        System.out.println("Email sent to " + request.getTo());
    }
}
