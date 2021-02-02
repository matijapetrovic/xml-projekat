package rs.ac.uns.ftn.xml.tim11.commissionerservice.core;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto.LoginDTO;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.LoginRequest;

public interface LoginUseCase {
    public LoginDTO login(LoginRequest request);
}
