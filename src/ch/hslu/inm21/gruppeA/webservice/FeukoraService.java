package ch.hslu.inm21.gruppeA.webservice;

import java.rmi.RemoteException;

import javax.jws.*;

import ch.hslu.inm21.gruppeA.model.Termin;

/**
 * Interface für Feukora als WebService.
 * 
 * @version 1.0
 * @author Michael Duenki
 * 
 */

@WebService
public interface FeukoraService {
	
	@WebMethod
	Termin addTermin(@WebParam (name = "Termin") Termin entity) throws RemoteException;
	
	@WebMethod
	Termin updateTermin(@WebParam (name = "Termin") Termin entity) throws RemoteException;

	@WebMethod
	void deleteTermin(@WebParam (name = "Termin") Termin entity) throws RemoteException;

}
