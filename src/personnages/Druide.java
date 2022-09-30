package personnages;

import java.util.Objects;
import java.util.Random;
import personnages.Gaulois;

public class Druide {
	private static String nom;
	
	private static int effetPotionMin;
	
	private static int effetPotionMax;

	public static int forcePotion;

	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private static String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public static void preparerPotion(){
		Random random= new Random();
		forcePotion = random.nextInt(effetPotionMin,effetPotionMax);
	}

	public static void booster(Gaulois gaulois){
		if(Gaulois.getNom()=="Obélix"){
			System.out.println(prendreParole() + "Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}else{
			Gaulois.boirePotion(forcePotion);
		}
	}
}
