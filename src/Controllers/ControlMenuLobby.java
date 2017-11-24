package Controllers;

import Models.Model;
import Views.Lobby;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlMenuLobby implements ActionListener {

    private Model model;
    private Lobby lobby;

    public ControlMenuLobby(Model model, Lobby lobby) {
        this.model = model;
        this.lobby = lobby;
        lobby.setControlMenu(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action performed sur le menu");
    }
}
