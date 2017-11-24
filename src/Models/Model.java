package Models;

public class Model {
    public enum TYPE_PARTIE {DECOUVERTE, NORMALE;};
    private TYPE_PARTIE typePartie;
    private int nbJoueurs;

    public Model() {

    }


    public TYPE_PARTIE getTypePartie() {
        return typePartie;
    }
    public void setTypePartie(TYPE_PARTIE typePartie) {
        this.typePartie = typePartie;
    }

    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }

    public int getNbJoueurs() {
        return nbJoueurs;
    }
}
