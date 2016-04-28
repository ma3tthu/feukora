package ch.hslu.inm21.gruppeA.persister;

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
}
