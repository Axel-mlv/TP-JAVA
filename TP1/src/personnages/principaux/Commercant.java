package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		parler("Le monde est vraiment trop injuste.");
		return argent;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		parler("Je te remercie généreux donateur !");
	}
}
