package rs.ac.uns.ftn.xml.tim11.commissionerservice.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account.Authority;

@RequiredArgsConstructor
public class CustomGrantedAuthority implements GrantedAuthority {
    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
