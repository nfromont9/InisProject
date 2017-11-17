package Models;

/**
 * Created by fabie_000 on 10/11/2017.
 */
public enum EpicStoryCardName {
    DiarmuidEtGrainne("Diarmuid et Grainne"),
    Eriu("Eriu"),
    FurieGuerriere("Furie Guerrière"),
    AutreMonde("L'Autre Monde"),
    OeilDeBalor("L'Oeil de Balor"),
    BatailleDeMoytura("La Bataille De Moytura"),
    BeauteDeDeirdre("La Beauté de Deirdre"),
    GesteDeCuchulain("Le Geste de Cuchulain"),
    HarpeDuDagda("La Harpe du Dagda"),
    LanceDeLug("La Lance de Lug"),
    MassueDuDagda("La Massue du Dagda"),
    MemoireDeTuan("La Mémoire de Tuan"),
    Morrigane("La Morrigane"),
    ParoleDeCathbad("La Parole de Cathbad"),
    PartDuChampion("La Part du Champion"),
    PierreDeFal("La Pierre de Fal"),
    RuseOengus("La Ruse d'Oengus"),
    TerreDeTailtu("La Terre de Tailtu"),
    TyrannieDeBreas("La Tyrannie de Breas"),
    VoixOgma("La Voix d'Ogma"),
    VolonteDeStreng("La Volonté de Streng"),
    ChaudronDuDagda("Le Chaudron du Dagda"),
    Dagda("Le Dagda"),
    ChevauxDeManannan("Les Chevaux de Manannan"),
    EnfantsDeDana("Les Enfants de Dana"),
    Fianna("Les Fianna"),
    RichessesDeMaeve("Les Richesses de Maeve"),
    LugSamildanach("Lug Samildanach"),
    NuadaMainArgent("Nuada Main d'Argent"),
    SanctuaireDeKernunos("Sanctuaire de Kernunos")
    ;

    private final String name;

    EpicStoryCardName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
