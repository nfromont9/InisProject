package Models;

/**
 * Created by fabie_000 on 10/11/2017.
 */
public enum AdvantageCardName {
    Anse ("Anse", AdvantageCardName.TRISKEL),
    Coline ("Collines", AdvantageCardName.TRISKEL),
    Cromlech("Cromlech", AdvantageCardName.TRISKEL),
    Forêt("Forêt", AdvantageCardName.TRISKEL),
    Lande("Lande", AdvantageCardName.TRISKEL),
    Marais("Marais", AdvantageCardName.SEASON),
    MineDeFer("Mine de fer", AdvantageCardName.TRISKEL),
    MineDeSel("Mine de sel", AdvantageCardName.TRISKEL),
    Montagne("Montagne", AdvantageCardName.TRISKEL),
    Plaine("Plaine", AdvantageCardName.TRISKEL),
    Plateau("Plateau", AdvantageCardName.SEASON),
    PortesDeTirNaNog("Portes de Tir Na Nog", AdvantageCardName.TRISKEL),
    Prairie("Prairie", AdvantageCardName.TRISKEL),
    TerreDesBrumes("Terre des brumes", AdvantageCardName.SEASON),
    ValPerdu("Val perdu", AdvantageCardName.TRISKEL),
    Vallée("Vallée", AdvantageCardName.TRISKEL);

    public static final int TRISKEL = 0;
    public static final int SEASON = 1;
    public static final int DOUBLE = 2;

    private final String name;
    private final int code;

    AdvantageCardName(String name, int code) {
        this.name=name; this.code=code;
    }

    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }
}
