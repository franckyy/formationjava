package principal;

import interfaces.Animal;

public class Pigeon implements Animal{

	private static int nbrPigeons = 0;
	 
	public Pigeon(){
		 super();
		 nbrPigeons++;
	}
	
	@Override
	public String toString() {
		return "Nombre de pigeons : " + nbrPigeons;
	}

	@Override
	public void seNourrir(String nourriture) {
		String mange = (nourriture.equalsIgnoreCase("graines") == true)? "mange" : "ne mange pas";
		System.out.println("le pigeon " + mange);
	}

	@Override
	public void seDeplacer() {
		System.out.println("je vole");
		
	}

	@Override
	public void communiquer() {
		System.out.println("cui cui");
	}

	@Override
	public void seReproduire() {
		System.out.println("le pigeon se reproduit en faisant cui cui");
	}

	@Override
	public String combat() {
		return "cui cui cui, je combat";
	}

	@Override
	public int compareTo(Animal animal) {
		if (this.combat().equalsIgnoreCase(animal.combat()))
			return 1;
		return 0;
	}

}
