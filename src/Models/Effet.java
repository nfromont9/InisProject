package Models;

import java.util.Random;

public class Effet {

    //===== Effets Territoires ======//

    public void Anse(){}
    public void Colline(){}
    public void Cromlech(Territoire t){
        t.placer(new Sanctuaire());
    }
    public void Foret(){}
    public void Landes(){}
    public void Marais(Territoire t){
        t.setConstructibilite(False);
    }
    public void Mine_de_fer(){}
    public void Mine_de_sel(){}
    public void Montagne(){
        //Quand un joueur déplace des troupes vers ce territoire
            //Soit il perd une troupe
            //Soit il défausse une carte action
    }
    public void Plaine(){}
    public void Plateau(){}
    public void Portes_de_tir_na_nog(Territoire t){
        t.placer(new Sanctuaire);
    }
    public void Prairie(){}
    public void Terre_des_brumes(){}
    public void Val_perdu(){}
    public void Vallee(){}

    //===== Effet Cartes Avantages =====//

    public void effet_anse(Joueur j){
        //Après avoir joué une carte saison :
        Random rand = new Random();
        int n = rand.nextInt(cartes_ecartees.size());
        j.ajouter_main(cartes_ecartees.get(n));
        cartes_ecartees.remove(n);
    }

    public void effet_colline(Joueur j){
        //Lors d'une attaque
        j.attaque().is_annulee();
    }

    public void effet_cromlech(Joueur j, Territoire t, Carte c){
        //Après avoir joué un récit épique
        int nb_clans;
        for (int i = 0; i < j.getClan().size(); i++) {
            if (j.getClan().get(i).getPosition()==t) nb_clans++;
        }
        if (nb_clans>1){
            if (recup){
                j.removeClan(t);
                j.ajouter_main(c);
            }
        }
    }

    public void effet_foret(Joueur j){
        j.ajouter_main(cartes_recit_epique.pioche());
    }
}
