package PersonEntity;

import javax.persistence.Entity;

@Entity
public class PersonModel {
	
	private String Vorname;
	private String nachname;
	private String Strasse;
	private String ort;
	private int fk_plz;
	private int telefonnummer;
	private String email;
	private String geschlecht;
	
	public PersonModel(){
		
	}

}
