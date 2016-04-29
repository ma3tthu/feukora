package ch.hslu.inm21.gruppeA.webservice;

import java.util.List;

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
	Termin addTermin(@WebParam (name = "Termin") Termin entity) throws Exception;
	
	@WebMethod
	Termin updateTermin(@WebParam (name = "Termin") Termin entity) throws Exception;

	@WebMethod
	void deleteTermin(@WebParam (name = "Termin") Termin entity) throws Exception;
	
	@WebMethod
	List<Termin> findAllTermin() throws Exception;
	
	@WebMethod
	List<Termin> findTerminByDatum() throws Exception;
	
	@WebMethod
	List<Termin> findTerminByZeit() throws Exception;

}
