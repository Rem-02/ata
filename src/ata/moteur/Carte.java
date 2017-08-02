package ata.moteur;

public class Carte {

	/**
	 * Le tableau contenant la carte 0,0,0 est au nord ouest à la couche niv_sol
	 */
	private Salle [][][] carte;
	/**
	 * Le niveau dans le tableau qui est à 0
	 */
	private int niv_sol;
	/**
	 * Position sur la carte
	 */
	private int x,y,z;

	/**
	 * Présence du spawn
	 */
	private boolean spawn;
	
	/**
	 * Construit une carte
	 * @param longueur
	 * @param largeur
	 * @param hauteur
	 * @param niv_sol
	 */
	public Carte(int longueur, int largeur, int hauteur, int niv_sol) {
		/* Verifications de carte raisonable */
		if(longueur < 1 || longueur > 20) {
			throw new MoteurException("Longueur de la Carte incorrecte : "+longueur);
		}
		
		if(largeur < 1 || largeur > 20) {
			throw new MoteurException("Largeur de la Carte incorrecte : "+largeur);
		}
		
		if(hauteur < 0 || hauteur > 20) {
			throw new MoteurException("Hauteur de la Carte incorrecte : "+hauteur);
		}
		
		if(niv_sol < 0 || niv_sol > hauteur) {
			throw new MoteurException("Niveau du sol de la Carte incorrect : "+niv_sol);
		}
		/* Fin de verifications */
		
		this.carte = new Salle[longueur][largeur][hauteur+1];
		this.niv_sol = niv_sol;
	}
	
	/**
	 *  Vérifie si un spawn est présent
	 * @return
	 */
	public boolean isSpawn() {
		return spawn;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getNiv_sol() {
		return niv_sol;
	}
	
	/**
	 * Créé une salle de spawn avec des coordonnées
	 * @param s
	 * @param x
	 * @param y
	 * @param z
	 */
	public void setSpawn(Salle s, int x, int y, int z) {
		this.carte[x][y][z+niv_sol] = s;
		this.spawn = true;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void setSalle(Salle s, int x, int y, int z) {
		this.carte[x][y][z+niv_sol] = s;
	}
	
	public boolean goNord() {
		boolean deplacement = carte[x][y][z+niv_sol].isNord();
		if(deplacement) {
			y = y - 1;
		}
		return deplacement;
	}
	
	public boolean goSud() {
		boolean deplacement = carte[x][y][z+niv_sol].isSud();
		if(deplacement) {
			y = y + 1;
		}
		return deplacement;
	}
	
	public boolean goEst() {
		boolean deplacement = carte[x][y][z+niv_sol].isEst();
		if(deplacement) {
			x = x + 1;
		}
		return deplacement;
	}
	
	public boolean goOuest() {
		boolean deplacement = carte[x][y][z+niv_sol].isOuest();
		if(deplacement) {
			x = x - 1;
		}
		return deplacement;
	}
	
	public boolean goHaut() {
		boolean deplacement = carte[x][y][z+niv_sol].isHaut();
		if(deplacement) {
			z = z + 1;
		}
		return deplacement;
	}
	
	public boolean goBas() {
		boolean deplacement = carte[x][y][z+niv_sol].isBas();
		if(deplacement) {
			z = z - 1;
		}
		return deplacement;
	}
	
}
