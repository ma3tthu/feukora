package TerminEntity;

import java.rmi.*;

/**
 * 
 * Diese Klasse stellt die Implementierung von Methoden der Schnittstelle
 * ITermin zur Verfuegung
 * 
 * @version 1.0
 * @author Michael Duenki
 *
 */
public interface ITermin extends Remote{
	
	void saveTermin(ITermin entity) throws RemoteException;
	
	TerminModel updateTermin(ITermin entity) throws RemoteException;

	void deleteTermin(ITermin entity) throws RemoteException;
}
