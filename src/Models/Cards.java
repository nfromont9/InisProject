package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by fabie_000 on 10/11/2017.
 */
public class Cards {
    List<Card> actionCardStack;
    List<Card> epicStoryCardStack;
    List<Card> advantageCardStack;

    public Cards() {
        actionCardStack = new ArrayList<>();
        epicStoryCardStack = new ArrayList<>();
        advantageCardStack = new ArrayList<>();
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
           actionCardStack.add(new Card(nom, Card.ACTION_CARD ,actionCards[i].getCode(), 0, false, fourPlayer));
        }
        for (int i = 0; i < epicStoryCardNames.length; i++) {
            epicStoryCardStack.add(new Card(epicStoryCardNames[i].getName(), Card.EPIC_STORY_CARD ,epicStoryCardNames[i].getCode(), 0, false, false));
        }
        for (int i = 0; i < advantageCardNames.length; i++) {
            advantageCardStack.add(new Card(advantageCardNames[i].getName(), Card.ADVANTAGE_CARD ,advantageCardNames[i].getCode(), 0, false, false));
        }
        Collections.shuffle(actionCardStack);
        Collections.shuffle(epicStoryCardStack);
    }
}
