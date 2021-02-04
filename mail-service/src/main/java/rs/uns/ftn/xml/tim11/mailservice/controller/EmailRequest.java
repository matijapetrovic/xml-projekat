package rs.uns.ftn.xml.tim11.mailservice.controller;

import lombok.Getter;

@Getter
public class EmailRequest {
    private String to;
    private String subject;
    private String text;
}
