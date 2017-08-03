package ata.moteur;

public class Item {
	
	private String nom;
	private String description;
	private Item verrou;
	
	
	/**
	 * Creation d'un Item classique
	 * @param nom
	 * @param description
	 */
	public Item(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
		this.verrou = null;
	}

	/**
	 * Creation d'un Item possédant un verrou
	 * @param nom
	 * @param description
	 * @param verrou
	 */
	public Item(String nom, String description, Item verrou) {
		super();
		this.nom = nom;
		this.description = description;
		this.verrou = verrou;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	/**
	 *  Verifie si l'Item possède un verrou
	 * @return
	 */
	public boolean isVerrou() {
		return this.verrou != null;
	}
	
	public Item getVerrou() {
		return verrou;
	}
	
	
}
