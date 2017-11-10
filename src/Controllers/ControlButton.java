package Controllers;

import Models.Model;
import Views.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButton implements ActionListener {
    private Model model;
    private View view;

    ControlButton(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setControlButtons(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
