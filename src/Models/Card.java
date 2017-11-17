package Models;

public class Card {
    public static final int ACTION_CARD = 0;
    public static final int ADVANTAGE_CARD = 1;
    public static final int EPIC_STORY_CARD = 2;

    private String name;
    private int kind;
    private int timmingSymbol;
    private int effectCode;
    private boolean visible;
    private boolean fourPlayer;

    public Card(String name, int kind, int timmingSymbol, int effect, boolean visible, boolean fourPlayer) {
        this.name = name;
        this.kind = kind;
        this.timmingSymbol = timmingSymbol;
        effectCode = effect;
        this.visible = visible;
        this.fourPlayer = fourPlayer;
    }

    public String getName() {
        return name;
    }

    public int getKind() {
        return kind;
    }

    public int getTimmingSymbol() {
        return timmingSymbol;
    }

    public int getEffectCode() {
        return effectCode;
    }

    public boolean isVisible() {
        return visible;
    }

    public boolean isFourPlayer() {
        return fourPlayer;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void playCard(){
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", kind=" + kind +
                ", timmingSymbol=" + timmingSymbol +
                ", visible=" + visible +
                ", fourPlayer=" + fourPlayer +
                '}';
    }
}
