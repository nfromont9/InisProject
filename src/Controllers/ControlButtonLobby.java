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
