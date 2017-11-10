package Models;

public class Cartes {
    public static final int SAISON  =0;
    public static final int TRISKEL =1;

    private int symboleJouabilite;
    private Effet effet;
    private boolean visible;
    private String nom;

    public Cartes(String nom, int symboleJouabilite, Effet effet, boolean visible) {
        this.symboleJouabilite = symboleJouabilite;
        this.effet = effet;
        this.visible = visible;
        this.nom = nom;
    }


}
