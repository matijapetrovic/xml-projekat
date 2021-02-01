package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.RegisterRequest;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.PasswordEncoder;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.RegisterUseCase;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account.Account;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account.Authority;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account.User;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.UserXmlRepository;

import javax.xml.bind.JAXBException;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class RegistrationService implements RegisterUseCase {
    private final UserXmlRepository userXmlRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void register(RegisterRequest request) throws XMLDBException, JAXBException {
        User user = User.of(
                request.getFirstName(),
                request.getLastName(),
                Account.of(
                        request.getEmail(),
                        passwordEncoder.encode(request.getPassword()),
                        // TODO: pogledaj koje ce vrste usera da postoje
                        Set.of(Authority.withId(1L, "ROLE_USER"))));
        userXmlRepository.create(user);
    }
}
