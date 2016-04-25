package PersonEntity;

/**
 * 
 * Interface für Persistierung von Personen-Entities
 * 
 * @version 1.0
 * @author Matthias Röthlin
 *
 */
public interface IPerson {
	
	void savePerson(IPerson entity) throws Exception;

}
