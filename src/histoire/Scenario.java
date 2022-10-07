package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {
	
	public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Asterix", 8);
        Gaulois obelix = new Gaulois("Obelix", 10);
        Romain minus= new Romain("Minus", 6);
        Druide panoramix = new Druide("Panoramix", 5, 10);

        panoramix.parler("Je vais aller préparer une petite potion...");
        panoramix.preparePotion();
        if (panoramix.forcePotion >7) {
            panoramix.parler("J'ai préparé une super potion de force " + panoramix.forcePotion);
        }else{
            panoramix.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + panoramix.forcePotion);
        }
        panoramix.booster(obelix);
        obelix.parler("Par Bélénos, ce n'est pas juste !");
        panoramix.booster(asterix);
        asterix.parler("Merci Druide, je sens que ma force est 6 fois décuplée !");
        asterix.parler("Bonjour");
        minus.parler("UN GAU...UN GAUGAU...");
        asterix.frapper(minus);
    }
}
