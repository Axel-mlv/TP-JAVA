package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 0;
	}
	
	public void donner(int n, Commercant c) {
		this.perdreArgent(n);
		c.gagnerArgent(n);
	}
	
	public void provoquer(Yakusa y) {
		int argent = y.getArgent();
		if (2 * this.honneur > y.getReputation()) {
			this.gagnerArgent(argent);
			this.honneur += 1;
			parler("J'ai gagné.");
		}
		else {
			this.honneur -= 1;
			parler("Oh non j'ai perdu !");
		}
	}
}
