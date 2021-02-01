package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto.LoginDTO;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.LoginRequest;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.AuthenticationService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.LoginUseCase;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.TokenService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account.Account;

@RequiredArgsConstructor
@Service
public class LoginService implements LoginUseCase {
    private final AuthenticationService authenticationService;
    private final TokenService tokenService;

    public LoginDTO login(LoginRequest request)  {
        Account account = authenticationService.authenticate(request.getUsername(), request.getPassword());

        String token = tokenService.getToken(account);
        long expiresIn = tokenService.getExpiresIn();

        return LoginDTO.of(token, account.getAuthorities(), expiresIn);
    }
}
