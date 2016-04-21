
package muster;

import java.util.List;

/**
 * Interface für Persistierung von Muster-Entities.
 * 
 * @version 1.0
 * @author autor
 * 
 */
public interface MusterDAO {

	/**
	 * Speichert die übergebene Student-Entity.
	 * 
	 * @param entity
	 * @throws Exception
	 */
	void saveStudent(MusterModel entity) throws Exception;

	/**
	 * Updatet die übergebene Student-Entity.
	 * 
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	MusterModel updateStudent(MusterModel entity) throws Exception;

	/**
	 * Löscht die übergebene Student-Entity.
	 * 
	 * @param entity
	 * @throws Exception
	 */
	void deleteStudent(MusterModel entity) throws Exception;

	/**
	 * Löscht die Student-Entity für den übergebenen Id-Wert.
	 * 
	 * @param id
	 * @throws Exception
	 */
	void deleteStudentById(Integer id) throws Exception;

	/**
	 * Liefert die Student-Entity für den übergebenen Id-Wert zurück.
	 * 
	 * @param id
	 * @return
	 */
	MusterModel findStudentById(Integer id);

	/**
	 * Liefert alle Student-Objekte zurück.
	 * 
	 * @return
	 */
	List<MusterModel> findAllStudent();

	/**
	 * Liefert die Liste mit Studenten für den übergebenen Namen zurück, falls
	 * welche gefunden, sonst eine leere Liste.
	 * 
	 * @param name
	 * @return
	 */
	public List<MusterModel> findStudentByName(String name);

	/**
	 * Liefert die Liste mit Studenten für den übergebenen Vornamen zurück,
	 * falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param vorname
	 * @return
	 */
	public List<MusterModel> findStudentByVorname(String vorname);

	/**
	 * Liefert die Liste mit Studenten für die übergebenen Namen und Vornamen
	 * zurück, falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param name
	 * @param vorname
	 * @return
	 */
	public List<MusterModel> findStudentByNameUndVorname(String name, String vorname);

	/**
	 * Liefert die Liste mit Studenten für die übergebene Postleitzahl zurück,
	 * falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param postleitzahl
	 * @return
	 */
	List<MusterModel> findStudentByPostleitzahl(int postleitzahl);

	/**
	 * Liefert die Liste mit Studenten für den übergebenen Ort zurück, falls
	 * welche gefunden, sonst eine leere Liste.
	 * 
	 * @param ort
	 * @return
	 */
	List<MusterModel> findStudentByOrt(String ort);

	/**
	 * Liefert die Liste mit Studierenden für die übergebenen Postleitzahl und
	 * Ort zurück, falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param postleitzahl
	 * @param ort
	 * @return
	 */
	public List<MusterModel> findStudentByPostleitzahlUndOrt(int postleitzahl,
			String ort);

	/**
	 * Liefert die Liste mit Studierenden für das übergebene Semester zurück,
	 * falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param semester
	 * @return
	 */
	public List<MusterModel> findStudentBySemester(int semester);
}
