package ch.hslu.inm21.gruppeA.business;

import java.rmi.RemoteException;

import ch.hslu.inm21.gruppeA.model.Termin;

public interface TerminManager {
	
	void addTermin(Termin entity) throws RemoteException;
	
	Termin updateTermin(Termin entity) throws RemoteException;

	void deleteTermin(Termin entity) throws RemoteException;

}
