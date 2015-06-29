package interfaces;

public interface Animal extends Comparable<Animal>{

	void seNourrir(String nourriture);
	void seDeplacer();
	void communiquer();
	void seReproduire();
	String combat();
}
