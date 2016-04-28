package ch.hslu.inm21.gruppeA.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ch.hslu.inm21.gruppeA.model.Termin;

public class TerminROImpl extends UnicastRemoteObject implements TerminRO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5467205243737785134L;

	protected TerminROImpl() throws RemoteException {
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
}
