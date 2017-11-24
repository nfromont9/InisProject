package Views;

import Models.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Lobby extends JFrame {
    private Model model;
    private final int WIDTH=720, HEIGHT=540;

    private JButton butPartieNormale, butPartieDecouverte;
    JMenuItem jmiNewGame, jmiOptions, jmiHelp, jmiLoadGame;

    public Lobby(Model model) {
        this.model = model;

        initComponents();
        createMenuAccueil();
        createViewAccueil();
        adjust();
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

        jmiNewGame = new JMenuItem("Nouvelle partie");
        jmiLoadGame = new JMenuItem("Charger une partie");
        jmiOptions = new JMenuItem("Options");
        jmiHelp = new JMenuItem("Aide");
    }

    private void createMenuAccueil() {
        JMenuBar menubar = new JMenuBar();

        JMenu menuGame = new JMenu("Partie");
        JMenu menuParameters = new JMenu("Paramètres");

        menuGame.add(jmiNewGame);
        menuGame.add(jmiLoadGame);

        menuParameters.add(jmiOptions);
        menuParameters.add(jmiHelp);

        menubar.add(menuGame);
        menubar.add(menuParameters);

        this.setJMenuBar(menubar);
    }

    private void createViewAccueil() {
        JPanel panContainer = new JPanel();

        ImagePanel background = new ImagePanel("images/app/accueil-background.png");
        background.resizeImage(WIDTH, HEIGHT);
        background.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        background.setLayout(new BoxLayout(background, BoxLayout.Y_AXIS));

        JPanel panTitle = new JPanel();
        ImagePanel title = new ImagePanel("images/app/inis-title.png");
        title.resizeImage(200, 100);
        title.setPreferredSize(new Dimension(200, 100));
        panTitle.add(title);
        panTitle.setOpaque(false);

        background.add(panTitle);
        background.add(Box.createVerticalStrut(120));
        JPanel panButtons = new JPanel();
        panButtons.add(butPartieDecouverte);
        panButtons.add(Box.createHorizontalStrut(20));

        panButtons.add(butPartieNormale);
        panButtons.setOpaque(false);

        background.add(panButtons);

        panContainer.add(background);

        this.setContentPane(panContainer);
    }

    public void switchViews() {
        display(false);

        createViewLobby();

        display(true);
    }

    private void createViewLobby() {
        JPanel panContainer = new JPanel();

        ImagePanel background = new ImagePanel("images/app/lobby-background.png");
        background.resizeImage(WIDTH, HEIGHT);
        background.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        background.setLayout(new BoxLayout(background, BoxLayout.Y_AXIS));

        panContainer.add(background);

        this.setContentPane(panContainer);
    }

    private JPanel createPanPlayerNames(int nbPlayers) {
        return new JPanel();
    }

    public void display(Boolean b) {
        this.setVisible(b);
    }

    private void adjust() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Inis");
        this.setIconImage(new ImageIcon(new ImageIcon("images/app/icone.png")
                .getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH)).getImage());

        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.pack();
        this.setResizable(false);
        center();
    }

    private void center() {
        this.setLocationRelativeTo(null);
        /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth()/2-this.getWidth()/2;
        double height = screenSize.getHeight()/2-this.getHeight()/2;
        setLocation((int)width, (int)height);*/
    }

    public void setControlButtons(ActionListener al) {
        butPartieNormale.addActionListener(al);
        butPartieDecouverte.addActionListener(al);
    }

    public void setControlMenu(ActionListener al) {
        jmiLoadGame.addActionListener(al);
        jmiOptions.addActionListener(al);
        jmiNewGame.addActionListener(al);
        jmiHelp.addActionListener(al);
    }

    public JButton getButPartieNormale() {
        return butPartieNormale;
    }

    public JButton getButPartieDecouverte() {
        return butPartieDecouverte;
    }

    public JMenuItem getJmiNewGame() {
        return jmiNewGame;
    }

    public JMenuItem getJmiOptions() {
        return jmiOptions;
    }

    public JMenuItem getJmiHelp() {
        return jmiHelp;
    }

    public JMenuItem getJmiLoadGame() {
        return jmiLoadGame;
    }
}
