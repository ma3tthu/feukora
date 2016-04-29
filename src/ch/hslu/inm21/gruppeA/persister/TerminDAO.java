package ch.hslu.inm21.gruppeA.persister;

import java.util.List;

import ch.hslu.inm21.gruppeA.model.Termin;

/**
 * 
 * Diese Klasse stellt die Implementierung von Methoden der Schnittstelle
 * ITermin zur Verfuegung
 * 
 * @version 1.0
 * @author Michael Duenki
 *
 */
public interface TerminDAO{
	
	void saveTermin(TerminDAO entity);
	
	Termin updateTermin(TerminDAO entity);

	void deleteTermin(TerminDAO entity);
	
	List<Termin> findAllTermin() throws Exception;
	
	List<Termin> findTerminByMitarbeiter() throws Exception;
	
	List<Termin> findTerminByDatum() throws Exception;
	
	List<Termin> findTerminByZeit() throws Exception;
}
