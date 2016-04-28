package TerminEntity;

import java.rmi.RemoteException;

public interface TerminManager {
	
	void addTermin(Termin entity) throws RemoteException;
	
	Termin updateTermin(Termin entity) throws RemoteException;

	void deleteTermin(Termin entity) throws RemoteException;

}
