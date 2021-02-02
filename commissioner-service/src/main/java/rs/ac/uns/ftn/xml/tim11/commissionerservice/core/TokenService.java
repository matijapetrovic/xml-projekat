package rs.ac.uns.ftn.xml.tim11.commissionerservice.core;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;

public interface TokenService {
    String getToken(Account account);
    long getExpiresIn();
}
