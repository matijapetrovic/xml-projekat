package rs.ac.uns.ftn.xml.tim11.commissionerservice.core;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;

public interface AuthenticationService {
    Account authenticate(String email, String password);
    boolean reauthenticate(String email, String password);
    Account getAuthenticated();
}
