package ch.hslu.inm21.gruppeA.model;

import java.util.GregorianCalendar;
import javax.persistence.*;

/**
 * Diese Klasse bildet einen Rapport ab.
 * 
 * ---> No ni ganz fertig ;)
 * 
 * @version 1.0
 * @author Bettina Willi
 *
 */


@Entity
public class Rapport extends AbstractEntity {

	private static final long serialVersionUID = -43835284888369676L;
	
	// fields
	private boolean status;
	private String bemerkung;
	private boolean grenzwertEingehalten;
	private double ueberschreitung;
	private double russzahlUeberschreitung;
	private double oelanteilUeberschreitung;
	private double abgasverluste;
	@Temporal(TemporalType.TIMESTAMP)
	private GregorianCalendar datum;
	//Beziehung @...
	private Waermeerzeuger fkWaermeerzeuger;
	//Beziehung @...
	private Aenderung fkAenderung;
	//Beziehung @...
	private Liegenschaft fkLiegenschaft;

	/**
	 * 
	 */
	public Rapport() {
		super();
	}

	// getter und setter
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getBemerkung() {
		return bemerkung;
	}

	public void setBemerkung(String bemerkung) {
		this.bemerkung = bemerkung;
	}

	public boolean isGrenzwertEingehalten() {
		return grenzwertEingehalten;
	}

	public void setGrenzwertEingehalten(boolean grenzwertEingehalten) {
		this.grenzwertEingehalten = grenzwertEingehalten;
	}

	public double getUeberschreitung() {
		return ueberschreitung;
	}

	public void setUeberschreitung(double ueberschreitung) {
		this.ueberschreitung = ueberschreitung;
	}

	public double getRusszahlUeberschreitung() {
		return russzahlUeberschreitung;
	}

	public void setRusszahlUeberschreitung(double russzahlUeberschreitung) {
		this.russzahlUeberschreitung = russzahlUeberschreitung;
	}

	public double getOelanteilUeberschreitung() {
		return oelanteilUeberschreitung;
	}

	public void setOelanteilUeberschreitung(double oelanteilUeberschreitung) {
		this.oelanteilUeberschreitung = oelanteilUeberschreitung;
	}

	public double getAbgasverluste() {
		return abgasverluste;
	}

	public void setAbgasverluste(double abgasverluste) {
		this.abgasverluste = abgasverluste;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public Waermeerzeuger getFkWaermeerzeuger() {
		return fkWaermeerzeuger;
	}

	public void setFkWaermeerzeuger(Waermeerzeuger fkWaermeerzeuger) {
		this.fkWaermeerzeuger = fkWaermeerzeuger;
	}

	public Aenderung getFkAenderung() {
		return fkAenderung;
	}

	public void setFkAenderung(Aenderung fkAenderung) {
		this.fkAenderung = fkAenderung;
	}

	public Liegenschaft getFkLiegenschaft() {
		return fkLiegenschaft;
	}

	public void setFkLiegenschaft(Liegenschaft fkLiegenschaft) {
		this.fkLiegenschaft = fkLiegenschaft;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
