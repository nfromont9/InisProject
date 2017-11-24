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
        System.out.println("Action performed sur un bouton du lobby");
    }
}
