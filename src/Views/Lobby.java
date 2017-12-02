package Views;

import Models.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Lobby extends JFrame {
    private Model model;
    private final int WIDTH=720, HEIGHT=540;

    private JButton butPartieNormale, butPartieDecouverte, butStartGame;
    private JMenuItem jmiNewGame, jmiOptions, jmiHelp, jmiLoadGame;
    private JFormattedTextField[] tabTF = new JFormattedTextField[4];
    private JComboBox jcbNbJoueurs;

    private JPanel panPlayerNames;
    private ImagePanel background;

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

        butStartGame = new JButton("");
        butStartGame.setPreferredSize(new Dimension(BUT_WIDTH/2, BUT_HEIGHT/2));
        butStartGame.setIcon(new ImageIcon(new ImageIcon("images/app/start-game.png")
                .getImage().getScaledInstance(BUT_WIDTH/2, BUT_HEIGHT/2, Image.SCALE_SMOOTH)));

        butPartieDecouverte.setBorder(BorderFactory.createEmptyBorder());
        butPartieNormale.setBorder(BorderFactory.createEmptyBorder());
        butStartGame.setBorder(BorderFactory.createEmptyBorder());

        jmiNewGame = new JMenuItem("Nouvelle partie");
        jmiLoadGame = new JMenuItem("Charger une partie");
        jmiOptions = new JMenuItem("Options");
        jmiHelp = new JMenuItem("Aide");
        panPlayerNames = createPanPlayerNames(2);
        jcbNbJoueurs = new JComboBox(model.jcbNbJoueursStrings);
        background = new ImagePanel("images/app/lobby-background.png");
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
        /*panButtons.add(Box.createHorizontalStrut(20));
        panButtons.add(butPartieNormale);*/
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
        createLobbyBG();
        panContainer.add(background);
        this.setContentPane(panContainer);
    }

    private void createLobbyBG() {
        background.resizeImage(WIDTH, HEIGHT);
        background.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        background.setLayout(new BoxLayout(background, BoxLayout.Y_AXIS));
        JPanel panChoixNbJoueurs = new JPanel();
        JLabel labNbJoueurs = new JLabel("<html><font color='red'>Nombre de joueurs : </font></html>");
        panChoixNbJoueurs.add(labNbJoueurs);
        panChoixNbJoueurs.add(jcbNbJoueurs);
        panChoixNbJoueurs.setMaximumSize(new Dimension(300, 35));
        panChoixNbJoueurs.setOpaque(false);
        background.add(Box.createVerticalStrut(40));
        background.add(butStartGame);
        background.add(Box.createVerticalStrut(40));
        background.add(panChoixNbJoueurs);
        background.add(Box.createVerticalStrut(20));
        background.add(panPlayerNames);

        background.updateUI();
    }

    private JPanel createPanPlayerNames(int nbPlayers) {
        JPanel panGeneral = new JPanel();
        panGeneral.setLayout(new BoxLayout(panGeneral, BoxLayout.Y_AXIS));
        JPanel tabPanels[] = new JPanel[nbPlayers];

        for (int i=0; i<nbPlayers; i++) {
            JLabel lab = new JLabel("<html><font color='red'>Joueur "+(i+1)+" :</font></html>");
            tabPanels[i] = new JPanel();
            tabPanels[i].setOpaque(false);
            tabPanels[i].add(lab);
            tabPanels[i].setMaximumSize(new Dimension(300, 50));
            tabTF[i] = new JFormattedTextField();
            tabTF[i].setMaximumSize(new Dimension(150, 20));
            tabTF[i].setPreferredSize(new Dimension(150, 20));
            tabPanels[i].add(tabTF[i]);

            panGeneral.add(tabPanels[i]);
        }

        panGeneral.setOpaque(false);
        return panGeneral;
    }

    public void reloadPanPlayerNames() {
        panPlayerNames = createPanPlayerNames(model.getNbJoueurs());
        background.removeAll();
        createLobbyBG();
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
        jcbNbJoueurs.addActionListener(al);
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

    public JComboBox getJcbNbJoueurs() {
        return jcbNbJoueurs;
    }
}
