package Controllers;

import Models.Model;
import Views.View;

public class ControlGroup {
    public ControlGroup(Model model) {
        View view = new View(model);
        new ControlButton(model, view);
        new ControlMenu(model, view);
        view.display(true);
    }
}
