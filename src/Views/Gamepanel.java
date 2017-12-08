package Views;

import Models.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Gamepanel extends JFrame {
    private Model model;
    private final int WIDTH=1600, HEIGHT=900;

    private JMenuItem jmiNewGame, jmiOptions, jmiHelp, jmiLoadGame;

    public Gamepanel(Model model) {
        this.model = model;

        initComponents();
        createMenuGP();
        createViewGP();

        Utils.adjust(this);
        Utils.setSize(this, WIDTH, HEIGHT);

        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        jmiNewGame = new JMenuItem("Nouvelle partie");
        jmiLoadGame = new JMenuItem("Charger une partie");
        jmiOptions = new JMenuItem("Options");
        jmiHelp = new JMenuItem("Aide");
    }

    private void createMenuGP() {
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

    private void createViewGP() {
        JPanel panTerrain = new JPanel(), panPioche = new JPanel(), panDefausse = new JPanel();
        JPanel panMain = new JPanel(), panReserve = new JPanel(), panCommandes = new JPanel();

        panTerrain.setMinimumSize(new Dimension(1000, 700));
        panTerrain.setPreferredSize(new Dimension(1000, 700));
        panTerrain.setBackground(new Color(20, 20, 20));
        panPioche.setMinimumSize(new Dimension(300, 700));
        panPioche.setPreferredSize(new Dimension(300, 700));
        panPioche.setBackground(new Color(50, 80, 100));
        panDefausse.setMinimumSize(new Dimension(300, 700));
        panDefausse.setPreferredSize(new Dimension(300, 700));
        panDefausse.setBackground(new Color(10, 255, 20));
        panMain.setMinimumSize(new Dimension(1000, 200));
        panMain.setPreferredSize(new Dimension(1000, 200));
        panMain.setBackground(new Color(200, 0, 20));
        panReserve.setMinimumSize(new Dimension(300, 200));
        panReserve.setPreferredSize(new Dimension(300, 200));
        panReserve.setBackground(new Color(20, 20, 200));
        panCommandes.setMinimumSize(new Dimension(300, 200));
        panCommandes.setPreferredSize(new Dimension(300, 200));
        panCommandes.setBackground(new Color(20, 200, 200));

        JPanel panContainer = new JPanel(new GridBagLayout());
        GridBagConstraints c = getGBC(1000, 700);

        panContainer.add(panTerrain, c);
        panContainer.add(panPioche);
        panContainer.add(panDefausse);
        panContainer.add(panMain);
        panContainer.add(panReserve);
        panContainer.add(panCommandes);

        this.setContentPane(panContainer);

    }

    private GridBagConstraints getGBC(int gridx, int gridy) {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridx;
        c.gridy = gridy;
        return c;
    }

    public void setControlButtons(ActionListener al) {
        // Ici : composant.addActionListener(al)
    }

    public void setControlMenu(ActionListener al) {
        // Ici : composant.addActionListener(al)
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
}
