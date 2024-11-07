package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;


public Humain(String nom, int argent, String boisson) {
	this.nom = nom;
	this.argent = argent;
	this.boisson = boisson;
}

public void parler(String texte) {
	System.out.println(texte);
}

public void direBonjour() {
	this.parler("Bonjour ! Je m'appelle "+ this.nom + "et j'aime boire du " + this.boisson);
}

public void boire() {
	this.parler("Mmmmm, un bon verre de "+ this.boisson + " ! GLOUPS !");
}

public String getNom() {
	return this.nom;
}

public int getArgent() {
	return this.argent;
}

public String getBoisson() {
	return this.boisson;
}

public void gagnerArgent(int argent) {
	this.argent += argent;
}

public void perdreArgent(int argent) {
	this.argent -= argent;
}
}