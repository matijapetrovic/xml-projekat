package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.security;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.TokenService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;

@RequiredArgsConstructor
@Component
public class JWTTokenService implements TokenService {
    private final TokenUtils tokenUtils;

    @Override
    public String getToken(Account account) {
        return tokenUtils.generateToken(account.getEmail());
    }

    @Override
    public long getExpiresIn() {
        return tokenUtils.getExpiredIn();
    }
}
