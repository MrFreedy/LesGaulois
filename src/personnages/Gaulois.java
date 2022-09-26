package personnages;

public class Gaulois {
	private static String nom;
	private int force;
	private static int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		super();
		Gaulois.nom = nom;
		this.force = force;
	}

	public static String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	
	public static void boirePotion(int forcePotion) {
		effetPotion=forcePotion;

		System.out.println(prendreParole()+"Merci Druide, je sens que ma force est "+effetPotion+" fois décuplée.");
	}
	
	
	private static String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		romain.recevoirCoup(force / 3);
		}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

}
