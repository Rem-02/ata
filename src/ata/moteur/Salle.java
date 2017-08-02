package ata.moteur;

public class Salle {

	private boolean nord, sud, est, ouest, haut, bas;

	public Salle(boolean nord, boolean sud, boolean est, boolean ouest, boolean haut, boolean bas) {
		this.nord = nord;
		this.sud = sud;
		this.est = est;
		this.ouest = ouest;
		this.haut = haut;
		this.bas = bas;
	}

	public boolean isNord() {
		return nord;
	}

	public boolean isSud() {
		return sud;
	}

	public boolean isEst() {
		return est;
	}

	public boolean isOuest() {
		return ouest;
	}

	public boolean isHaut() {
		return haut;
	}

	public boolean isBas() {
		return bas;
	}
	
	
	
	
}
