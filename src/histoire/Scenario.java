package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import village.Village;

import static personnages.Druide.forcePotion;


public class Scenario {
	
	public static void main(String[] args) {

		Village village;

		village=new Village("Village des fous", 12);

		village.getNom();
		village.getNbHab();


		Gaulois obelix;
		obelix=new Gaulois("Obélix",10);

		Gaulois asterix ;
		asterix=new Gaulois("Astérix",6);

		Druide panoramix;
		panoramix=new Druide("Panoramix",5,10);

		Romain minus ;
		minus=new Romain("Minus",6);

		panoramix.parler("Je vais aller préparer une petite potion...");
		Druide.preparerPotion();
		if(forcePotion>=7){
			panoramix.parler("J'ai préparé une super potion de force");
		}else{
			panoramix.parler("Je n'ai pas trouvé tous les indgrédients, ma potion est seulement de force "
					+forcePotion);
		}
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");

		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("Un GAU...UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);


	}
}
