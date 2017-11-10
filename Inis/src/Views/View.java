import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class View extends JFrame {
    private Model model;

    View(Model model) {
        this.model = model;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Inis");
        this.setIconImage(new ImageIcon(new ImageIcon("img/game_icon.png")
                .getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)).getImage());
    }

    void display(Boolean b) {
        this.setVisible(b);
    }

    private void center() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth()/2-this.getWidth()/2;
        double height = screenSize.getHeight()/2-this.getHeight()/2;
        setLocation((int)width, (int)height);
    }

    void setControlButtons(ActionListener al) {

    }

    void setControlMenu(ActionListener al) {
    }

}
