package ata.moteur;

public class MoteurException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5004975071970831441L;

	public MoteurException() {
		super("Erreur inconnue");
	}
	
	public MoteurException(String msg) {
		super(msg);
	}
	
}
