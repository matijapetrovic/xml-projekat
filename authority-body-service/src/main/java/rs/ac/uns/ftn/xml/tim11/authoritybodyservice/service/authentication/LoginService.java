package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.dto.LoginDTO;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.LoginRequest;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.AuthenticationService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.LoginUseCase;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.TokenService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;

@RequiredArgsConstructor
@Service
public class LoginService implements LoginUseCase {
    private final AuthenticationService authenticationService;
    private final TokenService tokenService;

    public LoginDTO login(LoginRequest request)  {
        Account account = authenticationService.authenticate(request.getUsername(), request.getPassword());

        String token = tokenService.getToken(account);
        long expiresIn = tokenService.getExpiresIn();

        return LoginDTO.of(token, account.getAuthorities().getAuthority(), expiresIn);
    }
}
