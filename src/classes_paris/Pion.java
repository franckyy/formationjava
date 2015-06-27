package classes_paris;

public class Pion extends Piece {

	//CONSTANTES
	private static final int f_posX = 0;
	private static final int f_posY = 1;
	
	
	//METHODES
	@Override
	public void getMoves(Piece piece) {
		System.out.println("mouvement en X : " + f_posX + ", mouvement en Y : " + f_posY);
	}

}
