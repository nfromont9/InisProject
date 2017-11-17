package Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabie_000 on 10/11/2017.
 */
public class Cards {
    List<Card> cards;

    public Cards() {
        cards = new ArrayList<>();
        this.createCards();
    }

    private void createCards() {
        ActionCardName[] actionCards = ActionCardName.values();
        EpicStoryCardName[] epicStoryCardNames = EpicStoryCardName.values();
        AdvantageCardName[] advantageCardNames = AdvantageCardName.values();

        for (int i = 0; i < actionCards.length; i++) {
            String nom = actionCards[i].getName();
            boolean fourPlayer = false;
            if (nom.equals("Emissaires") || nom.equals("Espions et Eclaireurs") || nom.equals("Maître artisan") || nom.equals("Razzia")){
                fourPlayer=true;
            }
            cards.add(new Card(nom, Card.ACTION_CARD ,actionCards[i].getCode(), 0, false, fourPlayer));
        }
        for (int i = 0; i < epicStoryCardNames.length; i++) {
            cards.add(new Card(epicStoryCardNames[i].getName(), Card.EPIC_STORY_CARD ,epicStoryCardNames[i].getCode(), 0, false, false));
        }
        for (int i = 0; i < advantageCardNames.length; i++) {
            cards.add(new Card(advantageCardNames[i].getName(), Card.ADVANTAGE_CARD ,advantageCardNames[i].getCode(), 0, false, false));
        }
    }

    public void printTas(){
        for (Card c :
                cards) {
            System.out.println(c);
        }
    }
}
