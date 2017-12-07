package Controllers;

import Models.Model;
import Views.Lobby;
import Views.Utils;

public class ControlGroup {
    public ControlGroup(Model model) {
        Lobby lobby = new Lobby(model);

        new ControlButtonLobby(model, lobby);
        new ControlMenuLobby(model, lobby);

        Utils.display(lobby, true);
    }
}
