package PLZEntity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class PLZModel implements Serializable {
	
	/**
	 * auto generated serialVersion
	 */
	private static final long serialVersionUID = -6071114423532173251L;
	
	private int PLZ;
	private String ortschaft;
	
	public PLZModel(){
		
	}

	public int getPLZ() {
		return PLZ;
	}

	public void setPLZ(int pLZ) {
		PLZ = pLZ;
	}

	public String getOrtschaft() {
		return ortschaft;
	}

	public void setOrtschaft(String ortschaft) {
		this.ortschaft = ortschaft;
	}
	
	

}
