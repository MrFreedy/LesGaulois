package village;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;

	private String[] villageois;

	private int nbVillageois=0;

	private int nbVillageoisMax;

	private int indexVillageois;



	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageoisMax = nbVillageoisMax;
		this.villageois = new String[nbVillageoisMax];
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMax) {
			villageois[nbVillageois] = gaulois.getNom();
			nbVillageois++;
		}
	}

	public void trouverHabitant(int indexVillageois){
		if (indexVillageois < nbVillageoisMax) {
			System.out.println("Le villageois numéro " + indexVillageois + " est " + villageois[indexVillageois]);
		}
	}

	public void afficherVillageois(){
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i]);
		}
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
}

