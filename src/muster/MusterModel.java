package muster;

import javax.persistence.Entity;

/**
 * Klassenbeschrieb Diese Klasse bildet einen Muster ab, der ein oder mehrere
 * Muster besuchen kann.
 * 
 * @version 1.0
 * @author autor
 *
 */

@Entity
public class MusterModel {

	private String name;
	private String vorname;

	public MusterModel() {

	}

	/**
	 * @param name
	 * @param voraname
	 */
	public MusterModel(String name, String voranme) {
		this.name = name;
		this.vorname = vorname;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
