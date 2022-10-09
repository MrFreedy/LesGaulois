package personnages;



public class Romain {

	private String nom;
	private int force;

	private Equipement[] equipements=new Equipement[2];

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
		String romainName=nom;
		switch (nbEquipements){
			case 0:
				equipements[nbEquipements]=equipement;
				nbEquipements++;
				if(equipement==Equipement.CASQUE) {
					equipements[nbEquipements] = Equipement.BOUCLIER;
					nbEquipements++;
				}else {
					equipements[nbEquipements] = Equipement.CASQUE;
					nbEquipements++;
				}
				System.out.println("Le soldat "+romainName +" s'équipe d'un casque et d'un bouclier");
				break;
			case 1:
				if(equipements[0].equals(Equipement.CASQUE)){
					equipements[nbEquipements]=equipement;
					nbEquipements++;
					System.out.println("Le soldat "+romainName+" s'équipe d'un "+Equipement.BOUCLIER.toString());

					break;
				}else{
					equipements[nbEquipements]=equipement;
					nbEquipements++;
					System.out.println("Le soldat "+romainName+" s'équipe d'un"+Equipement.CASQUE.toString());
					break;
				}
			default:
				System.out.println(nbEquipements);
				System.out.println("Le soldat "+ romainName+" est déjà bien protégé");
				break;

		}
	}
}
