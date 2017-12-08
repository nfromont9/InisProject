package Views;

import Models.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public class Gamepanel extends JFrame {
    private Model model;
    private final int WIDTH=1600, HEIGHT=900;

    JPanel panTerrain;
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
        panTerrain = new JPanel();
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
        createPanTerrain();

        JPanel panPioche = new JPanel();
        JPanel panDefausse = new JPanel();
        JPanel panMain = new JPanel();
        JPanel panReserve = new JPanel();
        JPanel panCommandes = new JPanel();

        final int W1=1000, W2=300, H1=600, H2=300;

        panTerrain.setMinimumSize(new Dimension(W1, H1));
        panTerrain.setPreferredSize(new Dimension(W1, H1));
        panPioche.setMinimumSize(new Dimension(W2, H1));
        panPioche.setPreferredSize(new Dimension(W2, H1));
        panDefausse.setMinimumSize(new Dimension(W2, H1));
        panDefausse.setPreferredSize(new Dimension(W2, H1));
        panMain.setMinimumSize(new Dimension(W1, H2));
        panMain.setPreferredSize(new Dimension(W1, H2));
        panReserve.setMinimumSize(new Dimension(W2, H2));
        panReserve.setPreferredSize(new Dimension(W2, H2));
        panCommandes.setMinimumSize(new Dimension(W2, H2));
        panCommandes.setPreferredSize(new Dimension(W2, H2));

        panTerrain.setBackground(new Color(20, 20, 20));
        panPioche.setBackground(new Color(50, 80, 100));
        panDefausse.setBackground(new Color(10, 255, 20));
        panMain.setBackground(new Color(200, 0, 20));
        panReserve.setBackground(new Color(20, 20, 200));
        panCommandes.setBackground(new Color(20, 200, 200));

        JPanel panContainer = new JPanel(new GridBagLayout());

        panContainer.add(panTerrain, getGBC(0, 0));
        panContainer.add(panPioche, getGBC(1, 0));
        panContainer.add(panDefausse, getGBC(2, 0));
        panContainer.add(panMain, getGBC(0, 1));
        panContainer.add(panReserve, getGBC(1, 1));
        panContainer.add(panCommandes, getGBC(2, 1));

        this.setContentPane(panContainer);
    }

    private GridBagConstraints getGBC(int gridx, int gridy) {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridx;
        c.gridy = gridy;
        return c;
    }

    private void createPanTerrain() {

    }

    public void setControlButtons(ActionListener al) {
        // Ici : composant.addActionListener(al)
    }

    public void setControlMenu(ActionListener al) {
        // Ici : composant.addActionListener(al)
    }

    public void setMouseListener(MouseListener ml) {
        panTerrain.addMouseListener(ml);
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
}
