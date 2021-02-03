package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.security;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.PasswordEncoder;


@RequiredArgsConstructor
@Component
public class BCryptEncoder implements PasswordEncoder {
    private final org.springframework.security.crypto.password.PasswordEncoder encoder;

    @Override
    public String encode(String password) {
        return encoder.encode(password);
    }
}
