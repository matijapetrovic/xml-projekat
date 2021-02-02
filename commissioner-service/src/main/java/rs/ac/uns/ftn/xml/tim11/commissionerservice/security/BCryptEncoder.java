package rs.ac.uns.ftn.xml.tim11.commissionerservice.security;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.PasswordEncoder;


@RequiredArgsConstructor
@Component
public class BCryptEncoder implements PasswordEncoder {
    private final org.springframework.security.crypto.password.PasswordEncoder encoder;

    @Override
    public String encode(String password) {
        return encoder.encode(password);
    }
}
