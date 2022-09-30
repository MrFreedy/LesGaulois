package village;

public class Village {
	private static String nom;
	private static int nbHab;

	public Village(String nom, int nbHab) {
		Village.nom =nom;
		Village.nbHab=nbHab;
		
	}
	public void getNom() {
		System.out.println(nom);
	}

	public void getNbHab(){
		System.out.println(nbHab);
	}

	public static void main(String[] args) {
		Village village;

		village=new Village("Village des fous",12);
		village.getNbHab();
		village.getNom();
	}
}
