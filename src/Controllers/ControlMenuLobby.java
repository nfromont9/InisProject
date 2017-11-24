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
        if (e.getSource()==lobby.getJmiHelp()) actionJmiHelp();
        if (e.getSource()==lobby.getJmiLoadGame()) actionJmiLoadGame();
        if (e.getSource()==lobby.getJmiNewGame()) actionJmiNewGame();
        if (e.getSource()==lobby.getJmiOptions()) actionJmiOptions();
    }

    private void actionJmiOptions() {
        System.out.println("Options");
    }

    private void actionJmiHelp() {
        System.out.println("Aide");
    }

    private void actionJmiLoadGame() {
        System.out.println("Charger une partie");
    }

    private void actionJmiNewGame() {
        System.out.println("Nouvelle partie");
    }
}
