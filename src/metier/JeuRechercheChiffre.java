package metier;


import java.util.Random;
import java.util.Scanner;

import exceptions.ChiffreSaisiException;
import exceptions.NbreJoueursException;

public class JeuRechercheChiffre  {

	private static int chiffre;
	private static byte nbreJoueurs;
	private static boolean gain = false;
	
	public JeuRechercheChiffre() throws RuntimeException{
		while(true){
			while(true){
				try {
					nbreJoueurs = setNbreJoueurs();
					break;
				} catch (NbreJoueursException ex) {
					System.out.println("Erreur nbre de joueurs");
				} catch (RuntimeException ex) {
					System.out.println("autre erreur : " + ex.getMessage());
					RuntimeException runtimeEx = new RuntimeException();
					throw runtimeEx;
				}
			}
			chiffre = setChiffreRandom();
//			System.out.println("nbreJoueurs : " + nbreJoueurs + ", chiffre : " + chiffre);
			startGame(nbreJoueurs, chiffre);
			System.out.println("Souhaitez-vous rejouer ? o / n");
			Scanner reader = new Scanner(System.in);
			String strRejouer = reader.nextLine().toUpperCase();
			if(strRejouer.equals("N")){
				System.out.println("Au-revoir !");
				System.exit(0);
			}
		}
	}
	
	private static byte setNbreJoueurs() throws NbreJoueursException{

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("\tSaisissez le nombre de joueurs (inf à 4 joueurs) : ");
				nbreJoueurs = Byte.parseByte(reader.nextLine());
				if (!(nbreJoueurs > 0) || !(nbreJoueurs <= 4)) {
					NbreJoueursException ex = new NbreJoueursException();
					throw ex;
			}
			return nbreJoueurs;
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	private static int setChiffreRandom() {
		System.out.println("\nLe chiffre à trouver (0 à 1000) est en train d'être généré, "
				+ "\nmerci de patienter");
		Random rdm = new Random();
		chiffre = rdm.nextInt(1000);
		return chiffre;
	}
	
	private static void startGame(byte nbreJoueurs, int chiffre) throws RuntimeException{
		int chiffreSaisi = 0;
		String reponse = "erreur réponse";
		while(true){
			for (int joueur = 1; joueur <= nbreJoueurs; joueur++) {
				while(true) {
					try {
						System.out.println("\n-----------JOUEUR " + joueur + "-----------\n"
								+ "Le joueur " + joueur + " doit saisir un chiffre entre 0 et 1000 :");
						chiffreSaisi = saisieChiffre();
						break;
					} catch (ChiffreSaisiException ex) {
						System.out.println();
					} catch (NumberFormatException ex) {
						System.out.println("ereur dans saisie chiffre par joueur " + joueur + " : " + ex.getMessage());
						NumberFormatException numEx = new NumberFormatException();
						throw numEx;
					}
				}
				
				reponse = getReponse(chiffreSaisi);
				
				if (reponse.equals("gain")){
					System.out.println("\n*******************************************************\n"
							+ "Bravo ! le joueur " + joueur + " gagne la partie !"
									+ "\n*******************************************************"
									+ "\n\tFIN DE LA PARTIE");
					gain = true;
					break;
				} else {
					System.out.println("votre proposition est " + reponse + " au chiffre à trouver !");
				}
			}
			if(gain) {
				gain = false;
				break;
			}
		}
	}
	
	private static String getReponse(int chiffreSaisi) {
		String reponse = "erreur éponse";
		
		if(chiffreSaisi > chiffre){
			reponse = "supérieure";
		} else if (chiffreSaisi  < chiffre) {
			reponse = "inférieure";
		} else if (chiffreSaisi == chiffre) {
			reponse = "gain";
		}
		return reponse;
	}
	
	private static int saisieChiffre() throws ChiffreSaisiException{
		int chiffreSaisi = 0;
		Scanner reader = new Scanner(System.in);
		chiffreSaisi = Integer.parseInt(reader.nextLine());
		if(chiffreSaisi < 0 || chiffreSaisi > 1000) {
			ChiffreSaisiException chEx = new ChiffreSaisiException();
			throw chEx;
		}
		return chiffreSaisi;
	}
}
