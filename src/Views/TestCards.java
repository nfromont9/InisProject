package Views;

import Models.Cards;

import javax.swing.*;
import java.awt.*;

/**
 * Created by fabie_000 on 24/11/2017.
 */
public class TestCards extends JFrame {
    Cards cards;

    public TestCards(Cards test) {
        this.cards = test;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Inis");
        this.setIconImage(new ImageIcon(new ImageIcon("images/icons/game_icon.png")
                .getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)).getImage());
        create();
    }

    public void create() {
        JPanel panel = new JPanel();
    }

    public void display(Boolean b) {
        this.setVisible(b);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Cards test = new Cards();
                TestCards testCards = new TestCards(test);
                testCards.display(true);
            }
        });
    }
}
