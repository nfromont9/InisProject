package Controllers;

import Models.Model;
import Views.Lobby;
import Views.Utils;

public class ControlGroup {
    Model model;

    public ControlGroup(Model amodel) {
        model = amodel;
        createLobby();
    }

    private void createLobby() {
        Lobby lobby = new Lobby(model);

        new ControlButtonLobby(model, lobby);
        new ControlMenuLobby(model, lobby);

        Utils.display(lobby, true);
    }
}
