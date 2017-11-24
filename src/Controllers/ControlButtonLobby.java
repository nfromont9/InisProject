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
        System.out.println("Nouvelle partie découverte");
    }

    private void actionButPartieNormale() {
        System.out.println("Nouvelle partie Normale");
    }

}
