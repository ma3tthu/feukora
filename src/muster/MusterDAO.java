
package muster;

import java.util.List;

/**
 * Interface f�r Persistierung von Muster-Entities.
 * 
 * @version 1.0
 * @author autor
 * 
 */
public interface MusterDAO {

	/**
	 * Speichert die �bergebene Student-Entity.
	 * 
	 * @param entity
	 * @throws Exception
	 */
	void saveStudent(MusterModel entity) throws Exception;

	/**
	 * Updatet die �bergebene Student-Entity.
	 * 
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	MusterModel updateStudent(MusterModel entity) throws Exception;

	/**
	 * L�scht die �bergebene Student-Entity.
	 * 
	 * @param entity
	 * @throws Exception
	 */
	void deleteStudent(MusterModel entity) throws Exception;

	/**
	 * L�scht die Student-Entity f�r den �bergebenen Id-Wert.
	 * 
	 * @param id
	 * @throws Exception
	 */
	void deleteStudentById(Integer id) throws Exception;

	/**
	 * Liefert die Student-Entity f�r den �bergebenen Id-Wert zur�ck.
	 * 
	 * @param id
	 * @return
	 */
	MusterModel findStudentById(Integer id);

	/**
	 * Liefert alle Student-Objekte zur�ck.
	 * 
	 * @return
	 */
	List<MusterModel> findAllStudent();

	/**
	 * Liefert die Liste mit Studenten f�r den �bergebenen Namen zur�ck, falls
	 * welche gefunden, sonst eine leere Liste.
	 * 
	 * @param name
	 * @return
	 */
	public List<MusterModel> findStudentByName(String name);

	/**
	 * Liefert die Liste mit Studenten f�r den �bergebenen Vornamen zur�ck,
	 * falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param vorname
	 * @return
	 */
	public List<MusterModel> findStudentByVorname(String vorname);

	/**
	 * Liefert die Liste mit Studenten f�r die �bergebenen Namen und Vornamen
	 * zur�ck, falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param name
	 * @param vorname
	 * @return
	 */
	public List<MusterModel> findStudentByNameUndVorname(String name, String vorname);

	/**
	 * Liefert die Liste mit Studenten f�r die �bergebene Postleitzahl zur�ck,
	 * falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param postleitzahl
	 * @return
	 */
	List<MusterModel> findStudentByPostleitzahl(int postleitzahl);

	/**
	 * Liefert die Liste mit Studenten f�r den �bergebenen Ort zur�ck, falls
	 * welche gefunden, sonst eine leere Liste.
	 * 
	 * @param ort
	 * @return
	 */
	List<MusterModel> findStudentByOrt(String ort);

	/**
	 * Liefert die Liste mit Studierenden f�r die �bergebenen Postleitzahl und
	 * Ort zur�ck, falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param postleitzahl
	 * @param ort
	 * @return
	 */
	public List<MusterModel> findStudentByPostleitzahlUndOrt(int postleitzahl,
			String ort);

	/**
	 * Liefert die Liste mit Studierenden f�r das �bergebene Semester zur�ck,
	 * falls welche gefunden, sonst eine leere Liste.
	 * 
	 * @param semester
	 * @return
	 */
	public List<MusterModel> findStudentBySemester(int semester);
}
