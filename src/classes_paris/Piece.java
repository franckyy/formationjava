package classes_paris;

public abstract class Piece {

	//ATTRIBUTS
	private boolean couleur;	// 0 = noir, 1 = blanc
	private int posX = 0;
	private int posY = 0;
	
	//CONSTANTES
	private static final boolean f_couleur = true;
	private static final int f_posX = 0;
	private static final int f_posY = 0;
	
	//CONSTRUCTEURS
	public Piece () {
		this(f_couleur);
	}
	
	public Piece (boolean couleur){
		this(couleur, f_posX, f_posY);
	}
	
	public Piece (int posX, int posY) {
		this(f_couleur, posX, posY);
	}
	
	public Piece (boolean couleur, int posX, int posY) {
		setCouleur(couleur);
		setPosX(posX);
		setPosY(posY);
	}

	//METHODES
	abstract public void getMoves(Piece piece);	//renvoie la liste des mouvements possibles.
	
	//GETTERS & SETTERS
	public boolean isCouleur() {
		return couleur;
	}

	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public boolean isF_couleur() {
		return f_couleur;
	}

	public int getF_posX() {
		return f_posX;
	}

	public int getF_posY() {
		return f_posY;
	}
}
