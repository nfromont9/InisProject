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
        setSize(1920, 1080);
        this.setTitle("Inis");
        this.setIconImage(new ImageIcon(new ImageIcon("images/icons/game_icon.png")
                .getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)).getImage());
        create();
    }

    public void create() {
        JLayeredPane panel = new JLayeredPane();
        ImagePanel tasAC = new ImagePanel("images/cards/actionCardv1.png");
        ImagePanel tasESC = new ImagePanel("images/cards/EpicStoryCardv1.png");
        ImagePanel tasAdC = new ImagePanel("images/cards/advantageCardv1.png");
        tasAC.setImageSize(350, 480);
        tasAC.setBounds(10,10,350,480);
        tasESC.setImageSize(350, 480);
        tasESC.setBounds(370,10,350,480);
        tasAdC.setImageSize(350,480);
        tasAdC.setBounds(730,10,350,480);
        panel.add(tasAC);
        panel.add(tasESC);
        panel.add(tasAdC);
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
