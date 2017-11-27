package Views;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class ImagePanel extends JPanel {
    private Image image;

    ImagePanel(LayoutManager lm, String imagepath) {
        super(lm);
        selectImage(imagepath);
    }

    ImagePanel(String imagepath) {
        super();
        selectImage(imagepath);
    }

    public void resizeImage(int width, int height) {
        this.image = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public void setImageSize(int width, int height){
        resizeImage(width/2, height/2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    private void selectImage(String filepath) {
        try {
            FileInputStream input = new FileInputStream(new File(filepath));
            this.image = ImageIO.read(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}