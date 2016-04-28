package TerminEntity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * Diese Klasse dient zur Erstellung von Termin-Objekten
 * 
 * @version 1.0
 * @author Michael Duenki
 *
 */

@Entity
public class TerminModel implements Serializable  {

	private static final long serialVersionUID = -7204969919621773748L;
	
	@Id
	@GeneratedValue
	private int id_termin;
	private Date datum; 
	private String bemerkung;
	private Time zeit;
	
	/**
	 * Standardkonstruktor
	 * 
	 */
	public TerminModel(){
		
	}
	
	/**
	 * Getter und Setter Methoden
	 * 
	 */
	public int getId_termin(){
		return id_termin;
	}
	public void setId_termin(){
		
	}
	
	public String getBemerkung() {
		return bemerkung;
	}
	public void setBemerkung(String bemerkung) {
		this.bemerkung = bemerkung;
	}
	
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	public Date getZeit() {
		return zeit;
	}
	public void setZeit(Time zeit) {
		this.zeit = zeit;
	}
	
}
