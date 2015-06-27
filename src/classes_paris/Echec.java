package classes_paris;
/*
 * - exercice 1
 * - créer une classe abstraite représentant une pièce de jeux d'échec (avec sa
 * couleur et position). Cette classe offrira une méthode abstraite renvoyant la
 * liste des mouvement possibles de cette pièce (sans tenir compte d'autres pièces)
 * - créer les classes concrètes pion, fou, tour héritant de la classe pièce
	https://github.com/vincent-courtalon/formationjava.git
 */
public class Echec {
	public static void main(String[] args) {
		Fou p1 = new Fou();
		p1.getMoves(p1);
	}
}
