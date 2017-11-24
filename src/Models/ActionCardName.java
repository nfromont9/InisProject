package Models;

public enum ActionCardName {
    ArtisansEtPaysans("Artisans et paysans", ActionCardName.SEASON),
    Barde("Barde", ActionCardName.DOUBLE),
    ChefDeGuerre("Chef de Guerre", ActionCardName.DOUBLE),
    Citadelle("Citadelle", ActionCardName.SEASON),
    Conquete("Conquête", ActionCardName.SEASON),
    Druide("Druide", ActionCardName.SEASON),
    Exploration("Exploration", ActionCardName.SEASON),
    Festivites("Festivités", ActionCardName.SEASON),
    Geis("Geis", ActionCardName.TRISKEL),
    Migration("Migration", ActionCardName.SEASON),
    NouveauxClancs("Nouveaux Clans", ActionCardName.SEASON),
    NouvelleAlliance("Nouvelle Alliance", ActionCardName.SEASON),
    Sanctuaire("Sanctuaire", ActionCardName.SEASON),
    Emmissaires("Emissaires", ActionCardName.SEASON),
    EspionsEtEclaireurs("Espions et Eclaireurs", ActionCardName.SEASON),
    MaitreArtisan("Maître artisan", ActionCardName.DOUBLE),
    Razzia("Razzia", ActionCardName.TRISKEL);

    public static final int TRISKEL = 0;
    public static final int SEASON = 1;
    public static final int DOUBLE = 2;

    private final String name;
    private final int code;

    ActionCardName(String name, int code) {
        this.name=name; this.code=code;
    }

    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }
}
