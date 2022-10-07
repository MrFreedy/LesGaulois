package personnages;



public class Romain {

	private String nom;
	private int force;

	private Equipement[] equipements;

	private int nbEquipements=0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte){
		System.out.println(prendreParole() + " << " + texte+" >>");
	}

	public String prendreParole(){
		return "Le romain " + nom+" :";
	}

	public void recevoirCoup(int forceCoup){
		force-=forceCoup;
		if(force>0){
			parler("Aie");
		}else {
			parler("J'abandonne...'");
		}
	}

	public void sEquiper(Equipement equipement){
		equipements[nbEquipements] = equipement;
		nbEquipements++;

	}

	public static void main(String[] args) {
		Romain romain = new Romain("Julius", 100);
		romain.parler("Je suis un romain");
		/*switch (romain.nbEquipements){
			case 0:
				romain.sEquiper(Equipement.CASQUE);
				romain.sEquiper(Equipement.BOUCLIER);
				break;
			case 1:
				if(romain.equipements[0] == Equipement.CASQUE){
					romain.sEquiper(Equipement.BOUCLIER);
					break;
				}else{
					romain.sEquiper(Equipement.CASQUE);
					break;
				}
			case 2:
				System.out.println("Le soldat "+romain+" est déjà bien protégé");
				break;
		}*/
	}
}
