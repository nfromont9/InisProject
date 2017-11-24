package Views;

import Models.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Lobby extends JFrame {
    private Model model;
    private final int WIDTH=720, HEIGHT=540;

    private JButton butPartieNormale, butPartieDecouverte;

    public Lobby(Model model) {
        this.model = model;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Inis");
        this.setIconImage(new ImageIcon(new ImageIcon("images/icons/game_icon.png")
                .getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)).getImage());
        initComponents();
        create();
        adjust();
        center();
    }

    private void initComponents() {
        final int BUT_WIDTH=300, BUT_HEIGHT=150;

        butPartieNormale = new JButton("");
        butPartieNormale.setPreferredSize(new Dimension(BUT_WIDTH, BUT_HEIGHT));
        butPartieNormale.setIcon(new ImageIcon(new ImageIcon("images/app/partie-normale.png")
                .getImage().getScaledInstance(BUT_WIDTH, BUT_HEIGHT, Image.SCALE_SMOOTH)));

        butPartieDecouverte = new JButton("");
        butPartieDecouverte.setPreferredSize(new Dimension(BUT_WIDTH, BUT_HEIGHT));
        butPartieDecouverte.setIcon(new ImageIcon(new ImageIcon("images/app/partie-decouverte.png")
                .getImage().getScaledInstance(BUT_WIDTH, BUT_HEIGHT, Image.SCALE_SMOOTH)));
    }

    private void create() {
        JPanel panContainer = new JPanel(), panMain = new JPanel();

        ImagePanel background = new ImagePanel("images/app/lobby-background.png");
        background.resizeImage(WIDTH, HEIGHT);
        background.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        background.setLayout(new BoxLayout(background, BoxLayout.Y_AXIS));

        JPanel panButtons = new JPanel();
        panButtons.add(butPartieDecouverte);
        panButtons.add(butPartieNormale);
        panButtons.setOpaque(false);

        background.add(panButtons);

        panContainer.add(background);

        panMain.add(panContainer);

        this.setContentPane(panMain);
    }

    public void display(Boolean b) {
        this.setVisible(b);
    }

    private void center() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth()/2-this.getWidth()/2;
        double height = screenSize.getHeight()/2-this.getHeight()/2;
        setLocation((int)width, (int)height);
    }

    private void adjust() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.pack();
        this.setResizable(false);
    }

    public void setControlButtons(ActionListener al) {
        butPartieNormale.addActionListener(al);
        butPartieDecouverte.addActionListener(al);
    }

    public void setControlMenu(ActionListener al) {

    }
}
