package Models;

/**
 * Created by fabie_000 on 10/11/2017.
 */
public enum ActionCardName {
    ArtisansEtPaysans("Artisans et paysans"),
    Barde("Barde"),
    ChefDeGuerre("Chef de Guerre"),
    Citadelle("Citadelle"),
    Conquete("Conquête"),
    Druide("Druide"),
    Exploration("Exploration"),
    Festivites("Festivités"),
    Geis("Geis"),
    Migration("Migration"),
    NouveauxClancs("Nouveaux Clans"),
    NouvelleAlliance("Nouvelle Alliance"),
    Sanctuaire("Sanctuaire"),
    Emmissaires("Emissaires"),
    EspionsEtEclaireurs("Espions et Eclaireurs"),
    MaitreArtisan("Maître artisan"),
    Razzia("Razzia");

    private final String name;

    ActionCardName(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
