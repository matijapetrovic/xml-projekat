package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core;

import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;

public interface AuthenticationService {
    Account authenticate(String email, String password);
    boolean reauthenticate(String email, String password);
    Account getAuthenticated();
}
