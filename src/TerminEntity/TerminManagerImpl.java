package TerminEntity;

import java.rmi.RemoteException;

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
