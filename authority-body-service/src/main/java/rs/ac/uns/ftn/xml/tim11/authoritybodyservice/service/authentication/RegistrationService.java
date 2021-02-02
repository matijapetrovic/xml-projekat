package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.RegisterRequest;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.PasswordEncoder;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.RegisterUseCase;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.UserXmlRepository;

import javax.xml.bind.JAXBException;
import java.util.List;

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
                        request.getUsername(),
                        passwordEncoder.encode(request.getPassword()),
                        // TODO: pogledaj koje ce vrste usera da postoje
                        List.of(Authority.of("ROLE_USER"))));
        userXmlRepository.create(user);
    }
}
