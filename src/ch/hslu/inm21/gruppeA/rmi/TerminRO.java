package ch.hslu.inm21.gruppeA.rmi;

import java.rmi.*;
import java.util.List;

import ch.hslu.inm21.gruppeA.model.Termin;


public interface TerminRO extends Remote{

	void addTermin(Termin entity) throws RemoteException;
	
	Termin updateTermin(Termin entity) throws RemoteException;

	void deleteTermin(Termin entity) throws RemoteException;
	
	List<Termin> findAllTermin() throws RemoteException;
	
	List<Termin> findTerminByDatum() throws RemoteException;
	
	List<Termin> findTerminByZeit() throws RemoteException;
}
