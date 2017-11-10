package Models;

public class Cards {
    public static final int SEASON  =0;
    public static final int TRISKEL =1;

    private int jouabilitySymbol;
    private Effet effect;
    private boolean visible;
    private String name;

    public Cards(String name, int jouabilitySymbol, Effet effect, boolean visible) {
        this.jouabilitySymbol = jouabilitySymbol;
        this.effect = effect;
        this.visible = visible;
        this.name = name;
    }


}
