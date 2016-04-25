package PersonEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * Diese Klasse dient zur Erstellung von Perosonen-Objekten
 * 
 * @version 1.0
 * @author Matthias Röthlin
 *
 */
@Entity
public class PersonModel implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private String Vorname;
	private String nachname;
	private String Strasse;
	private String ort;
	private int fk_plz;
	private int telefonnummer;
	private String email;
	private String geschlecht;

	/**
	 * Standardkonstruktor
	 * 
	 */
	public PersonModel() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return Strasse;
	}

	public void setStrasse(String strasse) {
		Strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getFk_plz() {
		return fk_plz;
	}

	public void setFk_plz(int fk_plz) {
		this.fk_plz = fk_plz;
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

}
