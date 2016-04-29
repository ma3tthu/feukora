package ch.hslu.inm21.gruppeA.business;


import java.util.List;

import ch.hslu.inm21.gruppeA.model.Termin;
import ch.hslu.inm21.gruppeA.persister.TerminDAO;

public interface TerminManager {
	
	void addTermin(Termin entity) throws Exception;
	
	Termin updateTermin(Termin entity) throws Exception;

	void deleteTermin(Termin entity) throws Exception;
	
	List<Termin> findAllTermin() throws Exception;
	
	List<Termin> findTerminByMitarbeiter() throws Exception;
	
	List<Termin> findTerminByDatum() throws Exception;
	
	List<Termin> findTerminByZeit() throws Exception;
	
	TerminDAO getTerminDAO();
	
	void setTerminDAO(TerminDAO terminDAO);

}
