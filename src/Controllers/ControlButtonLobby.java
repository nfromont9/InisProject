package Controllers;

import Models.Joueur;
import Models.Model;
import Views.Gamepanel;
import Views.Lobby;
import Views.Utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButtonLobby implements ActionListener {
    private Model model;
    private Lobby lobby;

    public ControlButtonLobby(Model model, Lobby lobby) {
        this.model=model;
        this.lobby=lobby;
        lobby.setControlButtons(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==lobby.getButPartieDecouverte()) actionButPartieDecouverte();
        if (e.getSource()==lobby.getButPartieNormale()) actionButPartieNormale();
        if (e.getSource()==lobby.getJcbNbJoueurs()) actionJcbNbJoueurs();
        if (e.getSource()==lobby.getButStartGame()) actionStartGame();
    }

    private void createGP() {
        Gamepanel gp = new Gamepanel(model);
        new ControlMenuGP(model, gp);
        new ControlButtonGP(model, gp);
        new ListenerGP(model, gp);
        Utils.display(gp, true);
    }

    private void actionStartGame() {
        System.out.println("démarrage de la partie");
        model.setNbJoueurs(lobby.getJcbNbJoueurs().getSelectedIndex()+2);
        for (int i=0; i<model.getNbJoueurs(); i++) {
            String str = lobby.getTabTF()[i].getText();
            model.getJoueurs()[i] = new Joueur(str);
        }
        Utils.display(lobby, false);
        createGP();
    }

    private void actionJcbNbJoueurs() {
        int i = lobby.getJcbNbJoueurs().getSelectedIndex()+2;
        model.setNbJoueurs(i);
        lobby.reloadPanPlayerNames();
    }

    private void actionButPartieDecouverte() {
        model.setTypePartie(Model.TYPE_PARTIE.DECOUVERTE);
        System.out.println("Nouvelle partie découverte");
        lobby.switchViews();
    }

    private void actionButPartieNormale() {
        model.setTypePartie(Model.TYPE_PARTIE.NORMALE);
        System.out.println("Nouvelle partie Normale");
        lobby.switchViews();
    }

}
