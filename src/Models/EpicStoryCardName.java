package Models;

/**
 * Created by fabie_000 on 10/11/2017.
 */
public enum EpicStoryCardName {
    DiarmuidEtGrainne("Diarmuid et Grainne", EpicStoryCardName.TRISKEL),
    Eriu("Eriu", EpicStoryCardName.SEASON),
    FurieGuerriere("Furie Guerrière", EpicStoryCardName.TRISKEL),
    AutreMonde("L'Autre Monde", EpicStoryCardName.SEASON),
    OeilDeBalor("L'Oeil de Balor", EpicStoryCardName.SEASON),
    BatailleDeMoytura("La Bataille De Moytura", EpicStoryCardName.TRISKEL),
    BeauteDeDeirdre("La Beauté de Deirdre", EpicStoryCardName.SEASON),
    GesteDeCuchulain("Le Geste de Cuchulain", EpicStoryCardName.TRISKEL),
    HarpeDuDagda("La Harpe du Dagda", EpicStoryCardName.SEASON),
    LanceDeLug("La Lance de Lug", EpicStoryCardName.TRISKEL),
    MassueDuDagda("La Massue du Dagda", EpicStoryCardName.DOUBLE),
    MemoireDeTuan("La Mémoire de Tuan", EpicStoryCardName.SEASON),
    Morrigane("La Morrigane", EpicStoryCardName.SEASON),
    ParoleDeCathbad("La Parole de Cathbad", EpicStoryCardName.TRISKEL),
    PartDuChampion("La Part du Champion", EpicStoryCardName.SEASON),
    PierreDeFal("La Pierre de Fal", EpicStoryCardName.SEASON),
    RuseOengus("La Ruse d'Oengus", EpicStoryCardName.TRISKEL),
    TerreDeTailtu("La Terre de Tailtu", EpicStoryCardName.SEASON),
    TyrannieDeBreas("La Tyrannie de Breas", EpicStoryCardName.SEASON),
    VoixOgma("La Voix d'Ogma", EpicStoryCardName.TRISKEL),
    VolonteDeStreng("La Volonté de Streng", EpicStoryCardName.TRISKEL),
    ChaudronDuDagda("Le Chaudron du Dagda", EpicStoryCardName.TRISKEL),
    Dagda("Le Dagda", EpicStoryCardName.TRISKEL),
    ChevauxDeManannan("Les Chevaux de Manannan", EpicStoryCardName.SEASON),
    EnfantsDeDana("Les Enfants de Dana", EpicStoryCardName.SEASON),
    Fianna("Les Fianna", EpicStoryCardName.TRISKEL),
    RichessesDeMaeve("Les Richesses de Maeve", EpicStoryCardName.SEASON),
    LugSamildanach("Lug Samildanach", EpicStoryCardName.TRISKEL),
    NuadaMainArgent("Nuada Main d'Argent", EpicStoryCardName.SEASON),
    SanctuaireDeKernunos("Sanctuaire de Kernunos", EpicStoryCardName.SEASON)
    ;

    public static final int TRISKEL = 0;
    public static final int SEASON = 1;
    public static final int DOUBLE = 2;

    private final String name;
    private final int code;

    EpicStoryCardName(String name, int code) {
        this.name=name; this.code=code;
    }

    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }
}
