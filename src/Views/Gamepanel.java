package Views;

import Models.Model;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Gamepanel extends JFrame {
    private Model model;
    private final int WIDTH=1280, HEIGHT=720;

    public Gamepanel(Model model) {
        this.model = model;

        initComponents();
        createMenuAccueil();
        createViewAccueil();
        Utils.adjust(this);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
    }

    private void createMenuAccueil() {
    }

    private void createViewAccueil() {
    }

    public void setControlButtons(ActionListener al) {

    }

    public void setControlMenu(ActionListener al) {

    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
}
