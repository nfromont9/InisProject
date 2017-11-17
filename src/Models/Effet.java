package Models;

import java.util.ArrayList;
import java.util.Random;
import static java.lang.Boolean.*;

public class Effet {

    public Random rand = new Random();

    //===== Effets Territoires ======//

    public void Anse(){}
    public void Colline(){}
    public void Cromlech(Territoire t){
        t.placer(new Sanctuaire());
    }
    public void Foret(){}
    public void Landes(){}
    public void Marais(Territoire t){
        t.setConstructibilite(FALSE);
    }
    public void MineFer(){}
    public void MineSel(){}
    public void Montagne(Territoire t, Joueur j){
        if (j.deplaceClan(t)) {
            int n = rand.nexInt(j.getCartesAction().size());
            j.defausse(j.getCartesAction().get(n));
        }
    }
    public void Plaine(){}
    public void Plateau(){}
    public void PortesTirNaNog(Territoire t){
        t.placer(new Sanctuaire());
    }
    public void PortesTirNaNogChangementVol(ArrayList<Joueur> tabJoueur, Territoire t){
        for (int i = 0; i < tabJoueur.size(); i++) {
            if (tabJoueur.get(i).getClan(t)!=null){
                tabJoueur.get(i).getClan(t).removeClan();
                tabJoueur.get(i).piocheRecitEpique();
            }
        }
    }
    public void Prairie(){}
    public void TerreBrumes(){}
    public void ValPerdu(){}
    public void Vallee(){}

    //===== Effet Cartes Avantages =====//

    public void effetAvantageAnse(Joueur j){
        //Après avoir joué une carte saison :
        int n = rand.nextInt(cartesEcartees.size());
        j.addMain(cartesEcartees.get(n));
        cartesEcartees.remove(n);
    }

    public void effetAvantageColline(Joueur j){
        //Lors d'une attaque
        j.attaque().isAnnulee();
    }

    public void effetAvantageCromlech(Joueur j, Territoire t, Carte c,Boolean recup){
        //Après avoir joué un récit épique
        int nb_clans=0;
        if (j.getClan(t)>1){
            if (recup==TRUE){
                j.removeClan(t);
                j.addMain(c);
            }
        }
    }

    public void effetAvantageForet(Joueur j){
        //Après avoir joué un récit épique
        j.addMain(cartesRecitEpique.pioche());
    }

    public void effetAvantageLandes(Joueur j1, Joueur j2){
        //A tout moment
        j1.show(j2.getRecitsEpique());
    }

    public void effetAvantageMarais(Joueur j){
        j.EndTour();
    }

    public void effetAvantageMineFer(Joueur j, Territoire t){
        //Au moment d'attaquer
        j.removeClan(t);
        int n = rand.nextInt(j.getAction().size());
        j.defausse(j.getAction().get(n));
    }

    public void effetAvantageMineSel(Joueur j1, Joueur j2){
        //Après avoir joué une carte saison
        int m = rand.nextInt(j1.getCartesAction().size());
        int n = rand.nextInt(j2.getCartesAction().size());

        j1.addCarte(j2.getCartesAction().get(n));
        j2.removeCarte(n);
        j2.addCarte(j1.getCartesAction().get(m));
        j1.removeCarte(m);
    }

    public void effetAvantageMontagne(){
        //Quand des clans se déplacent sur une montagne
        //On annule
    }

    public void effetAvantagePlaine(Joueur j, Territoire t1, Territoire t2, int n){
        if (n<j.getClan(t1)) {
            for (int i = 0; i < n; i++) {
                j.getClan(t1).get(0).deplaceClan(t2);
            }
        }
    }

    public void effetAvantagePlateau(Joueur j){
        //Début de résolution de conflit sur un plateau
        j.setActif();
    }

    public void effetAvantagePortesTirNaNog(Joueur j){
        //Au moment de résoudre l'effet du territoire
        j.piocheRecitEpique();
    }

    public void effetAvantagePraire(Joueur j){
        //Au moment de piocher un récit épique
        j.piocheRecitEpique();
    }

    public void effetAvantageTerreBrumes(Joueur j, int nb){
        for (int i = 0; i < nb; i++) {
            j.defausseAction();
            j.piocheRecitEpique();
        }
    }

    public int effetAvantageValPerdu(Territoire t){
        //Après avoir joué une carte saison
        for (int i = 0; i < t.getTerritoireAdjacent(); i++) {
            if (t.getTerritoire.getClan()!=null){
                t.getTerritoire.getClan().get(0).deplaceClan(t);
                return 1;
            }
        }
        return 0;
    }

    public void effetAvantageVallee(Joueur j, Territoire t){
        //après avoir joué une carte saison
        j.placeClan(t);
    }
}
