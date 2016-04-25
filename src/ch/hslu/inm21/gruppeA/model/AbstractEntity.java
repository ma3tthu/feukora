package ch.hslu.inm21.gruppeA.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

/**
 * Oberklasse für alle Entitäten.
 * 
 * @author Bettina Willi
 * @version 1.0
 */
@Entity
public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = -9089120374700963994L;

	// fields
	@Id
	@GeneratedValue
	protected Integer id;

	// methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Entity: \n" + "id = " + id;
	}

	@Override
	public boolean equals(Object obj) {

		// 1. Test auf Identität
		if (this == obj) {
			return true;
		}
		// 2. Test auf null
		if (obj == null) {
			return false;
		}
		// 3. Test auf Vergleichbarkeit
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		// 4. Effektiver Vergleich der Attribute
		return Objects.equals(this.id, ((AbstractEntity) obj).id);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;

	}

}
