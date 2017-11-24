package Controllers;

import Models.Model;
import Views.Lobby;
import Views.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButton implements ActionListener {
    private Model model;
    private View view;
    private Lobby lobby;

    ControlButton(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setControlButtons(this);
    }

    ControlButton(Model model, Lobby lobby) {
        this.model = model;
        this.lobby = lobby;
        lobby.setControlButtons(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
