package Views;

import javax.swing.*;
import java.awt.*;

public class Utils {
    public static void display(JFrame frame, boolean b) {
        frame.setVisible(b);
    }

    public static void adjust(JFrame frame) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Inis");
        frame.setIconImage(new ImageIcon(new ImageIcon("images/app/icone.png")
                .getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH)).getImage());
        frame.setResizable(false);
        // center(frame);
    }

    public static void center(JFrame frame) {
        frame.setLocationRelativeTo(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth()/2-frame.getWidth()/2;
        double height = screenSize.getHeight()/2-frame.getHeight()/2;
        frame.setLocation((int)width, (int)height);
    }

    public static void setSize(JFrame frame, int WIDTH, int HEIGHT) {
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
    }
}
