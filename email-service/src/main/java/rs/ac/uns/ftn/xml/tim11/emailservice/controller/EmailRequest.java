package rs.ac.uns.ftn.xml.tim11.emailservice.controller;

import lombok.Getter;

@Getter
public class EmailRequest {
    private String to;
    private String subject;
    private String text;
}
