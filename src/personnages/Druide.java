package personnages;

import java.util.Objects;
import java.util.Random;
import personnages.Gaulois;

public class Druide {
	private String nom;
	
	private int effetPotionMin;
	
	private int effetPotionMax;

	public int forcePotion=1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force "
				+ effetPotionMin + " à " + effetPotionMax);
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte){
		System.out.println(prendreParole() + " << " + texte+" >>");
	}

	private String prendreParole(){
		return "Le druide " + nom+" :";
	}

	public void preparePotion(){
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax);
	}

	public void booster(Gaulois gaulois){
		if(gaulois.getNom().equals("Obélix")){
			parler("Non, Obélix!... Tu n'auras pas de potion magique!");
		}else{
		gaulois.boirePotion(forcePotion);
	}
	}
}
