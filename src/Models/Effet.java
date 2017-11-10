package Models;

import java.util.Random;

public class Effet {

    //===== Effets Territoires ======//

    public void Anse(){}
    public void Colline(){}
    public void Cromlech(){
        //Placer 1 sanctuaire de la réserve sur le jeu
    }
    public void Foret(){}
    public void Landes(){}
    public void Marais(){
        //Aucune citadelle/Capitale constructible sur ce territoire
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
    public void Portes_de_tir_na_nog(){
        //Placer 1 sanctuaire de la réserve sur le jeu
        //Chaque fois que
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

    }

}
