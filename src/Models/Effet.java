package Models;

import jdk.nashorn.internal.runtime.Context;

import java.util.ArrayList;
import java.util.Random;
import static java.lang.Boolean.*;
public enum Effet {

    //===== Effets Territoires ======//
    tAnse {
        @Override
        public void effect() {
            System.out.println("Ansetest");
        }
    },
    tColline {
        @Override
        public void effect() {
            System.out.println("Collinetest");
        }
    },
    tCromlech {
        @Override
        public void effect(Territoire t) {
            t.placer(new Sanctuaire());
        }
    },
    tForêt {
        @Override
        public void effect() {
        }
    },
    tLandes {
        @Override
        public void effect() {
        }
    },
    tMarais {
        @Override
        public void effect(Territoire t) {
            t.setConstructibilite(FALSE);
        }
    },
    tMineDeFer {
        @Override
        public void effect() {
        }
    },
    tMineDeSel {
        @Override
        public void effect() {
        }
    },
    tMontagne {
        @Override
        public void effect(Territoire t, Joueur j) {
            if (j.deplaceClan(t)) {
                Random rand = new Random();
                int n = rand.nexInt(j.getCartesAction().size());
                j.defausse(j.getCartesAction().get(n));
            }
        }
    },
    tPlaine {
        public void effect() {
        }
    },
    tPlateau {
        public void effect() {
        }
    },
    tPortesDeTirNaNog {
        @Override
        public void effect(Territoire t) {
            t.placer(new Sanctuaire());
        }
    },
    //    PortesDeTirNaNog
//    public void PortesTirNaNogChangementVol(ArrayList<Joueur> tabJoueur, Territoire t) {
//        for (int i = 0; i < tabJoueur.size(); i++) {
//            if (tabJoueur.get(i).getClan(t) != null) {
//                tabJoueur.get(i).getClan(t).removeClan();
//                tabJoueur.get(i).piocheRecitEpique();
//            }
//        }
//    }
    tPrairie {
        @Override
        public void effect() {
        }
    },
    tTerreDesBrumes {
        @Override
        public void effect() {
        }
    },
    tValPerdu {
        @Override
        public void effect() {
        }
    },
    tVallee {
        @Override
        public void effect() {
        }
    },

    //===== Effet Cartes Avantages =====//

    Anse {
        @Override
        public void effect(Joueur j) {
            //Après avoir joué une carte saison :
            Random rand = new Random();
            int n = rand.nextInt(cartesEcartees.size());
            j.addMain(cartesEcartees.get(n));
            cartesEcartees.remove(n);
        }
    },
    Colline {
        @Override
        public void effect(Joueur j) {
            //Lors d'une attaque
            j.attaque().isAnnulee();
        }
    },
    Cromlech {
        @Override
        public void effect(Joueur j, Territoire t, Carte c, Boolean recup) {
            //Après avoir joué un récit épique
            int nb_clans = 0;
            if (j.getClan(t) > 1) {
                if (recup == TRUE) {
                    j.removeClan(t);
                    j.addMain(c);
                }
            }
        }
    },
    Forêt {
        @Override
        public void effect(Joueur j) {
            //Après avoir joué un récit épique
            j.addMain(cartesRecitEpique.pioche());
        }
    },
    Landes {
        @Override
        public void effect(Joueur j1, Joueur j2) {
            //A tout moment
            j1.show(j2.getRecitsEpique());
        }
    },
    Marais {
        @Override
        public void effect(Joueur j) {
            j.EndTour();
        }
    },
    MineDeFer {
        @Override
        public void effect(Territoire t, Joueur j) {
            //Au moment d'attaquer
            j.removeClan(t);
            Random rand = new Random();
            int n = rand.nextInt(j.getAction().size());
            j.defausse(j.getAction().get(n));
        }
    },
    MineDeSel {
        @Override
        public void effect(Joueur j1, Joueur j2) {
            //Après avoir joué une carte saison
            Random rand = new Random();
            int m = rand.nextInt(j1.getCartesAction().size());
            int n = rand.nextInt(j2.getCartesAction().size());

            j1.addCarte(j2.getCartesAction().get(n));
            j2.removeCarte(n);
            j2.addCarte(j1.getCartesAction().get(m));
            j1.removeCarte(m);
        }
    },
    Montagne {
        @Override
        public void effect() {
            //Quand des clans se déplacent sur une montagne
            //On annule
        }
    },
    Plaine {
        @Override
        public void effect(Joueur j, Territoire t1, Territoire t2, int n) {
            if (n < j.getClan(t1)) {
                for (int i = 0; i < n; i++) {
                    j.getClan(t1).get(0).deplaceClan(t2);
                }
            }
        }
    },
    Plateau {
        @Override
        public void effect(Joueur j) {
            //Début de résolution de conflit sur un plateau
            j.setActif();
        }
    },
    PortesDeTirNaNog {
        @Override
        public void effect(Joueur j) {
            //Au moment de résoudre l'effet du territoire
            j.piocheRecitEpique();
        }
    },
    Prairie {
        @Override
        public void effect(Joueur j) {
            //Au moment de piocher un récit épique
            j.piocheRecitEpique();
        }
    },
    TerreDesBrumes {
        @Override
        public void effect(Joueur j, int nb) {
            for (int i = 0; i < nb; i++) {
                j.defausseAction();
                j.piocheRecitEpique();
            }
        }
    },
    ValPerdu {
        @Override
        public void effect(Territoire t) {
            //Après avoir joué une carte saison
            boolean stop = false;
            for (int i = 0; i < t.getTerritoireAdjacent(); i++) {
                if (t.getTerritoire.getClan() != null) {
                    t.getTerritoire.getClan().get(0).deplaceClan(t);
                    stop = true;
                }
                if (stop == true) {
                    break;
                }
            }
        }
    },
    Vallee {
        @Override
        public void effect(Territoire t, Joueur j) {
            //après avoir joué une carte saison
            j.placeClan(t);
        }
    };

    public void effect() {}
    public void effect(Territoire t){}
    public void effect(Joueur j){}
    public void effect(Joueur j, int nb){}
    public void effect(Territoire t, Joueur j){}
    public void effect(Territoire t, Territoire t2){}
    public void effect(Joueur j, Joueur j2){}
    public void effect(Joueur j, Territoire t, Carte c, Boolean recup) {}
    public void effect(Joueur j, Territoire t1, Territoire t2, int n) {}
}
