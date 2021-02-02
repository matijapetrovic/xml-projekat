package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.exceptions;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String email) {
        super(String.format("Account with %s not found!", email));
    }
}
