package rs.ac.uns.ftn.xml.tim11.commissionerservice.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.AuthenticationService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;

@RequiredArgsConstructor
@Component
public class JWTAuthenticationService implements AuthenticationService {
    private final AuthenticationManager authenticationManager;

    @Override
    public Account authenticate(String email, String password) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(email, password));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return getPrincipal(authentication);
    }

    @Override
    public boolean reauthenticate(String email, String password) {
        if (authenticationManager == null)
            return false;
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email ,password));
        return true;
    }

    @Override
    public Account getAuthenticated() {
        Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
        return getPrincipal(currentUser);
    }

    private Account getPrincipal(Authentication authentication) {
        CustomUserDetails principal = (CustomUserDetails) authentication.getPrincipal();
        return principal.getAccount();
    }
}
