package personnages;

public enum Equipement {
    CASQUE,BOUCLIER;

    private String nom;

    public static void initNom(String nom){
        CASQUE.nom = nom;
    }

    public static void main(String[] args) {

    }
}
