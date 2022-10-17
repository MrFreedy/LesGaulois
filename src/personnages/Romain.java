package personnages;



public class Romain {

	private String nom;
	private int force;

	private Equipement[] equipements=new Equipement[2];

	private int nbEquipements=0;

	private static final String SOLDAT="Le soldat ";

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

	private Equipement[] ejecterEquipement() {
		System.out.println("L'équipement de " + nom+ " s'envole sous la force du coup.");
		Equipement[] equipementEjecte = new Equipement[nbEquipements];


		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipements; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] =
						equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de "
				+ forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipements != 0) {
			for (int i = 0; i < nbEquipements;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}

			}
			texte = resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	public Equipement[] recevoirCoup(int forceCoup){
		Equipement [] equipementEjecte=null;
		//précondition
		assert force>0;
		int oldForce=force;
		forceCoup=calculResistanceEquipement(forceCoup);
		force-=forceCoup;
		if (force > 0) {
			parler("Aïe");

		}else{
			equipementEjecte=ejecterEquipement();
			parler("J'abandonne...");
		}
		if (force == 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		assert force<oldForce;
		return equipementEjecte;
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
				System.out.println(SOLDAT+romainName +" s'équipe d'un casque et d'un bouclier");
				break;
			case 1:
				if(equipements[0].equals(Equipement.CASQUE)){
					equipements[nbEquipements]=equipement;
					nbEquipements++;
					System.out.println(SOLDAT+romainName+" s'équipe d'un "+Equipement.BOUCLIER.toString());

					break;
				}else{
					equipements[nbEquipements]=equipement;
					nbEquipements++;
					System.out.println(SOLDAT+romainName+" s'équipe d'un"+Equipement.CASQUE.toString());
					break;
				}
			default:
				System.out.println(SOLDAT+ romainName+" est déjà bien protégé");
				break;

		}
	}
}
