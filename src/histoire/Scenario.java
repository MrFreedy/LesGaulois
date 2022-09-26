package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {
	
	public static void main(String[] args) {
		System.out.println("BEGGIN");
		
		Gaulois asterix ;
		asterix=new Gaulois("Astérix",8);
		
		
		Romain minus ;
		minus=new Romain("Minus",6);
		
		asterix.parler("Bonjour à tous");
		minus.parler("Un GAU... UN GAUGAU");
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
		booster(asterix);
		System.out.println("END");
	}
}
