package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boisson, String clan, int argent) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant c) {
		int argent = c.seFaireExtorquer();
		this.gagnerArgent(argent);
		this.reputation += 1;
		parler("Je t'ai voler tout ton argent.");
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		parler("J'ai gagné !");
	}
	
	public int perdreDuel() {
		int argent = getArgent();
		this.reputation -= 1;
		this.perdreArgent(argent);
		parler("J'ai perdu !");
		return argent;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
}
