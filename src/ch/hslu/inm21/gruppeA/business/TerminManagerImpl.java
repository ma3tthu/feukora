package ch.hslu.inm21.gruppeA.business;

import java.rmi.RemoteException;

import ch.hslu.inm21.gruppeA.model.Termin;
import ch.hslu.inm21.gruppeA.persister.TerminDAO;
import ch.hslu.inm21.gruppeA.persister.TerminDAOImpl;

public class TerminManagerImpl implements TerminManager{

	private TerminDAO terminDAO = new TerminDAOImpl();
	
	
	
	@Override
	public void addTermin(Termin entity) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Termin updateTermin(Termin entity) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTermin(Termin entity) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	public TerminDAO getTerminDAO() {
		return terminDAO;
	}

	public void setTerminDAO(TerminDAO terminDAO) {
		this.terminDAO = terminDAO;
	}


}
