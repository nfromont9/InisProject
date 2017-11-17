package Models;

/**
 * Created by fabie_000 on 10/11/2017.
 */
public enum AdvantageCardNames {
    Anse ("Anse"),
    Colline ("Collines"),
    Cromlech("Cromlech"),
    Forêt("Forêt"),
    Lande("Lande"),
    Marais("Marais"),
    MineDeFer("Mine de fer"),
    MineDeSel("Mine de sel"),
    Montagne("Montagne"),
    Plaine("Plaine"),
    Plateau("Plateau"),
    PortesDeTirNaNog("Portes de Tir Na Nog"),
    Prairie("Prairie"),
    TerreDesBrumes("Terre des brumes"),
    ValPerdu("Val perdu"),
    Vallée("Vallée");

    private final String name;

    AdvantageCardNames(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
