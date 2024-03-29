package rs.ac.uns.ftn.xml.tim11.emailservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.uns.ftn.xml.tim11.emailservice.usecase.EmailSender;

import javax.mail.MessagingException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/email", produces = MediaType.APPLICATION_XML_VALUE)
public class MailController {
    private final EmailSender emailSender;

    @PostMapping("")
    public ResponseEntity<Void> sendEmail(@RequestBody EmailRequest request) throws MessagingException {
        emailSender.sendEmail(request);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
