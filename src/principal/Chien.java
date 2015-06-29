package principal;

import interfaces.Animal;

public class Chien implements Animal {

	private static int nbrChiens = 0;
	 
	public Chien(){
		 super();
		 nbrChiens++;
	}
	
	@Override
	public String toString() {
		return "Nombre de chiens : " + nbrChiens;
	}

	@Override
	public void seNourrir(String nourriture) {
		String mange = (nourriture.equalsIgnoreCase("croquettes") == true)? "mange" : "ne mange pas";
		System.out.println("le chien " + mange);
	}

	@Override
	public void seDeplacer() {
		System.out.println("je cours");
	}

	@Override
	public void communiquer() {
		System.out.println("ouaf !");
	}

	@Override
	public void seReproduire() {
		System.out.println("le chien se reproduit en faisant ouaf ouaf");
	}

	@Override
	public String combat() {
		return "grrrrrr";
	}

	@Override
	public int compareTo(Animal animal) {
		if (this.combat().equalsIgnoreCase(animal.combat()))
			return 1;
		return 0;
	}

}
