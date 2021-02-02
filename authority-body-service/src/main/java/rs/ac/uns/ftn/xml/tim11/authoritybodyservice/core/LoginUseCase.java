package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core;

import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.dto.LoginDTO;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.LoginRequest;

public interface LoginUseCase {
    public LoginDTO login(LoginRequest request);
}
