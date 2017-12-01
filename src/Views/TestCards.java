package Views;

import Models.Card;
import Models.Cards;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by fabie_000 on 24/11/2017.
 */
public class TestCards extends JFrame {
    Cards cards;

    public TestCards(Cards test) {
        this.cards = test;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        this.setTitle("Inis");
        this.setIconImage(new ImageIcon(new ImageIcon("images/icons/game_icon.png")
                .getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)).getImage());
        create();
    }

    public void create() {
        JLayeredPane panel = new JLayeredPane();
        ImagePanel carte = new ImagePanel("images/cards/backgroundActionCardv1.png");
        ImagePanel symbole = new ImagePanel("images/cards/symbolSeason.png");
        ImagePanel image = new ImagePanel("images/cards/background_castle.png");

        carte.setImageSize(350*2, 522*2);
        carte.setBounds(10,10,350*2,522*2);
        symbole.setImageSize(127,127);
        symbole.setBounds(18,15,127,127);
        image.setImageSize(350*2,522*2);
        image.setBounds(10,10,350*2,522*2);

        panel.add(new JLabel("Château"));
        panel.add(symbole);
        panel.add(carte);
        panel.add(image);
        setContentPane(panel);
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
