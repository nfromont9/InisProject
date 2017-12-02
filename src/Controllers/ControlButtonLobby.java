package Controllers;

import Models.Model;
import Views.Lobby;

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

    private void actionStartGame() {
        System.out.println("démarage de la partie");
        String[] playerNames = new String[4];

    }

    private void actionJcbNbJoueurs() {
        int i = lobby.getJcbNbJoueurs().getSelectedIndex()+2;
        System.out.println(i);
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
