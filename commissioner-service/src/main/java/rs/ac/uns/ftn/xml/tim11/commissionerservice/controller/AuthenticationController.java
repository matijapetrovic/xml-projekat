package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto.LoginDTO;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.LoginRequest;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.RegisterRequest;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.LoginUseCase;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.RegisterUseCase;

import javax.xml.bind.JAXBException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="api/auth", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
public class AuthenticationController {
    private final LoginUseCase loginUseCase;
    private final RegisterUseCase registerUseCase;

    @PostMapping("/login")
    public ResponseEntity<LoginDTO> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(loginUseCase.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterRequest request) throws XMLDBException, JAXBException {
        registerUseCase.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
