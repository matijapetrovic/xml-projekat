package rs.ac.uns.ftn.xml.tim11.commissionerservice.core;

import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.RegisterRequest;

import javax.xml.bind.JAXBException;

public interface RegisterUseCase {
    public void register(RegisterRequest request) throws XMLDBException, JAXBException;
}
