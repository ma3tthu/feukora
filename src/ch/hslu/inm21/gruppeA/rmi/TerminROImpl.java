package ch.hslu.inm21.gruppeA.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import ch.hslu.inm21.gruppeA.model.Termin;

public class TerminROImpl extends UnicastRemoteObject implements TerminRO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5467205243737785134L;

	public TerminROImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addTermin(Termin entity) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	public Termin updateTermin(Termin entity) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteTermin(Termin entity) throws RemoteException {
		// TODO Auto-generated method stub
	}
	
	public List<Termin> findAllTermin() throws RemoteException{
		// TODO Auto-generated method stub
		return null;
		
	}
	
	public List<Termin> findTerminByDatum() throws RemoteException{
		// TODO Auto-generated method stub
		return null;
		
	}
	
	public List<Termin> findTerminByZeit() throws RemoteException{
		// TODO Auto-generated method stub
		return null;
		
	}

}
