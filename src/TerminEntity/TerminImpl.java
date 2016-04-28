package TerminEntity;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * Diese Klasse stellt die Implementierung von Methoden der Schnittstelle
 * ITermin zur Verfuegung
 * 
 * @version 1.0
 * @author Michael Duenki
 *
 */

@SuppressWarnings("serial")
public class TerminImpl extends UnicastRemoteObject implements ITermin {

	public TerminImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void saveTermin(ITermin entity) throws RemoteException{
		// TODO Auto-generated method stub
	}
	public TerminModel updateTermin(ITermin entity) throws RemoteException{
		return null;
		// TODO Auto-generated method stub
	}
	
	public void deleteTermin(ITermin entity) throws RemoteException{
		// TODO Auto-generated method stub
	}
	
}
