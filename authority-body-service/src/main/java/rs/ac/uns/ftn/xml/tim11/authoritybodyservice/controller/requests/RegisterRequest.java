package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests;

import lombok.Getter;

@Getter
public class RegisterRequest {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
