package Models;

import java.util.Random;

public class Model {
    public String[] jcbNbJoueursStrings = new String[]{" 2 Joueurs", " 3 Joueurs", " 4 Joueurs"};
    public enum TYPE_PARTIE {DECOUVERTE, NORMALE;};

    private Joueur[] joueurs = new Joueur[4];
    private Cards cards;
    private TYPE_PARTIE typePartie;
    private int nbJoueurs;

    public Model() {
        cards = new Cards();
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

    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }

    public Cards getCards() {
        return cards;
    }

    public void setCards(Cards cards) {
        this.cards = cards;
    }

    // A appaler lorsqu'on a fixé le nombre de joueur
    public void initPartie(){
        int nbJoueur=0;
        for (int i = 0; i < joueurs.length; i++) {
            if (joueurs[i]!=null){
                nbJoueur++;
            }
        }
        Random rd = new Random();
        int alea = rd.nextInt(nbJoueur);
        joueurs[alea].setBrenn(true);
    }
}
