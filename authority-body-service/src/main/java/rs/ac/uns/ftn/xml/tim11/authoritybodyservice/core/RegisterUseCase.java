package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core;

import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.RegisterRequest;

import javax.xml.bind.JAXBException;

public interface RegisterUseCase {
    public void register(RegisterRequest request) throws XMLDBException, JAXBException;
}
