package Controllers;

import Models.Model;
import Views.Gamepanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListenerGP implements MouseListener {
    private Model model;
    private Gamepanel gp;

    public ListenerGP(Model model, Gamepanel gp) {
        this.model = model;
        this.gp = gp;
        gp.setMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
