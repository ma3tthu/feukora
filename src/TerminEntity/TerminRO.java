package TerminEntity;

import java.rmi.*;


public interface TerminRO extends Remote{

	void addTermin(Termin entity) throws RemoteException;
	
	Termin updateTermin(Termin entity) throws RemoteException;

	void deleteTermin(Termin entity) throws RemoteException;
}
