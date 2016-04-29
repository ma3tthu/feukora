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

public class TerminDAOImpl implements TerminDAO {

	public TerminDAOImpl(){
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveTermin(TerminDAO entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Termin updateTermin(TerminDAO entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteTermin(TerminDAO entity) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Termin> findAllTermin() throws Exception{
		// TODO Auto-generated method stub
		return null;
		
	}
	
	public List<Termin> findTerminByMitarbeiter() throws Exception{
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Termin> findTerminByDatum() throws Exception{
		// TODO Auto-generated method stub
		return null;
		
	}
	
	public List<Termin> findTerminByZeit() throws Exception{
		// TODO Auto-generated method stub
		return null;
	}
}
