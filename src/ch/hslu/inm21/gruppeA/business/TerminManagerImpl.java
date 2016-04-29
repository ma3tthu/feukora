package ch.hslu.inm21.gruppeA.business;

import java.util.List;

import ch.hslu.inm21.gruppeA.model.Termin;
import ch.hslu.inm21.gruppeA.persister.TerminDAO;
import ch.hslu.inm21.gruppeA.persister.TerminDAOImpl;

public class TerminManagerImpl implements TerminManager{

	private TerminDAO terminDAO = new TerminDAOImpl();
	
	
	@Override
	public void addTermin(Termin entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Termin updateTermin(Termin entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTermin(Termin entity) throws Exception {
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
	

	public TerminDAO getTerminDAO() {
		return terminDAO;
	}

	public void setTerminDAO(TerminDAO terminDAO) {
		this.terminDAO = terminDAO;
	}

}
