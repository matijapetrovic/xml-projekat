package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Authority;

@RequiredArgsConstructor
public class CustomGrantedAuthority implements GrantedAuthority {
    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
