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
            if (nom.equals("Emissaires") || nom.equals("Espion et Eclaireurs") || nom.equals("Maitre Artisan") || nom.equals("Razzia")){
                fourPlayer=true;
            }
            cards.add(new Card(actionCards[i].getName(), Card.ACTION_CARD ,actionCards[i].getCode(), 0, false, fourPlayer));
        }
        for (int i = 0; i < epicStoryCardNames.length; i++) {

        }
        for (int i = 0; i < advantageCardNames.length; i++) {

        }
    }

    public void printTas(){
        for (Card c :
                cards) {
            System.out.println(c);
        }
    }
}
