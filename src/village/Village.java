package village;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private String[] villageois;
	private int nbVillageois=0;
	private int nbVillageoisMax;
	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageoisMax=nbVillageoisMax;
		villageois=new String[nbVillageoisMax];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois){

		villageois[nbVillageois]= new String(gaulois.getNom());
		nbVillageois++;

	}

	public void trouverHabitant(int nbVillageois){
		System.out.println(villageois[nbVillageois]);
	}

	public void afficherVillageois(){
		System.out.println("Dans le village du Chef "
				+chef.getNom()+" vivent les légendaires gaulois :\n- "
				+villageois[0]+"\n- "
				+villageois[1]);
	}

	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		/*Gaulois gaulois= village.trouverHabitant(30);*/

		Chef abraracourcix= new Chef("Abraracourcix",6,0,village);
		village.setChef(abraracourcix);
		Gaulois asterix=new Gaulois("Astérix",8);
		Gaulois obelix=new Gaulois("Obélix",25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		/*Gaulois gaulois=village.trouverHabitant(0);
		System.out.println(gaulois);*/


	}
}

