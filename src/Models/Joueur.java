package Models;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private String name;

    private List<Card> cards;
    private int nbClan;
    private boolean brenn;

    public Joueur(String name) {
        this.name = name;
        cards = new ArrayList<>();
        brenn=false;
        nbClan=12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCard(Card c){
        cards.add(c);
    }

    public void removeCard(Card c){
        cards.remove(c);
    }

    public boolean isBrenn() {
        return brenn;
    }

    public void setBrenn(boolean brenn) {
        this.brenn = brenn;
    }

    public int getNbClan() {
        return nbClan;
    }

    public void setNbClan(int nbClan) {
        this.nbClan = nbClan;
    }
}
