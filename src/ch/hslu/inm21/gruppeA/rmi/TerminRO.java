package ch.hslu.inm21.gruppeA.rmi;

import java.rmi.*;

import ch.hslu.inm21.gruppeA.model.Termin;


public interface TerminRO extends Remote{

	void addTermin(Termin entity) throws RemoteException;
	
	Termin updateTermin(Termin entity) throws RemoteException;

	void deleteTermin(Termin entity) throws RemoteException;
}
