package exceptions;

public class NbreJoueursException extends RuntimeException {

	private static byte nbreJoueurs;

	public byte getNbreJoueurs() {
		return nbreJoueurs;
	}
	
	public NbreJoueursException() {
		super ("le nombre de Joueurs est incorrect : " + nbreJoueurs);
		this.nbreJoueurs = nbreJoueurs;
	}
}
