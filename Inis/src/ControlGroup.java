class ControlGroup {
    ControlGroup(Model model) {
        View view = new View(model);
        new ControlButton(model, view);
        new ControlMenu(model, view);
        view.display(true);
    }
}
