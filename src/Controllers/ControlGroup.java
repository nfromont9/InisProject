package Controllers;

import Models.Model;
import Views.Lobby;
import Views.View;

public class ControlGroup {
    public ControlGroup(Model model) {
        View view = new View(model);
        Lobby lobby = new Lobby(model);

        new ControlButton(model, view);
        new ControlMenu(model, view);

        new ControlButtonLobby(model, lobby);
        new ControlMenuLobby(model, lobby);

        lobby.display(true);
    }
}
