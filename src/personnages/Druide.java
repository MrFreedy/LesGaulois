package personnages;

import java.util.Objects;
import java.util.Random;
import personnages.Gaulois;

public class Druide {
	private String nom;
	
	private int effetPotionMin;
	
	private int effetPotionMax;

	private int forcePotion=1;

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

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparePotion();
		if (panoramix.forcePotion > 7) {
			System.out.println("J'ai préparé une super potion de force "
					+ panoramix.forcePotion);
		} else {
			System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "
					+ panoramix.forcePotion);
		}
	}
}
