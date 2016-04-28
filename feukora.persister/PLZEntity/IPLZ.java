package PLZEntity;

import muster.MusterModel;

/**
 * 
 * Interface für Persistierung von Personen-Entities
 * 
 * @version 1.0
 * @author Matthias Röthlin
 *
 */
public interface IPLZ {
	
	
	
	/**
	 * Liefert die Student-Entity für den übergebenen Ort zurück.
	 * 
	 * @param ort
	 * @return
	 */
	MusterModel findPlzByOrt(Integer ort);
	
	

}
