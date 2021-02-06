package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.RegisterRequest;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.PasswordEncoder;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.RegisterUseCase;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.AccountXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.UserXmlRepository;

import javax.xml.bind.JAXBException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RegistrationService implements RegisterUseCase {
    private final UserXmlRepository userXmlRepository;
    private final PasswordEncoder passwordEncoder;
    private final AccountXmlRepository accountXmlRepository;

    @Override
    public void register(RegisterRequest request) throws XMLDBException, JAXBException {
        Account account = Account.of(request.getUsername(),
                passwordEncoder.encode(request.getPassword()),
                List.of(Authority.of("ROLE_USER")));
        User user = User.of(
                request.getFirstName(),
                request.getLastName(),
                account
                );

        accountXmlRepository.create(account);
        userXmlRepository.create(user);
    }
}
