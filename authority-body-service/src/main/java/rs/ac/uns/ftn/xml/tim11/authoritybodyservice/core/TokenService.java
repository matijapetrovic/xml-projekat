package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core;

import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;

public interface TokenService {
    String getToken(Account account);
    long getExpiresIn();
}
