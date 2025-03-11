package animate;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application extends JFrame {
    public static int FRAME_WIDTH = 350;
    public static int FRAME_HEIGHT = 350;

    public Application(String title) {
        setTitle(title);
        // Use the inherited setTitle() method
        // to set the title for our frame.
        this.setTitle(title);

        // Use the inherited setSize() method
        // to set the size of our frame.
        this.setSize(350, 350);

        // tell Java what you want our window to do
        // when the window is closed by the user.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // specify where to place our window
        // (is it relative to another window?).
        this.setLocationRelativeTo(null);
        this.add(new Board());

    }

    class Board extends JPanel {
          private BufferedImage image;

        public Board() {
            try {
               
                image = ImageIO.read(new File("C:\\Users\\sofko\\OneDrive\\Documents\\GitHub\\DSJava\\A02\\animate\\landscape.jpeg")); 
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        @Override

       protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.CYAN);

    Graphics2D g2D = (Graphics2D) g;

    if (image != null) {
        int panelWidth = getWidth();
        int panelHeight = getHeight();

      
        int newWidth = panelWidth / 4;
        int newHeight = panelHeight / 4;


  int x = panelWidth - newWidth;
     int y = panelHeight - newHeight;

        g2D.drawImage(image, x, y, newWidth, newHeight, this);
    } else {
        System.out.println("Image not loaded!");
    }
}

   
}

public static void main(String[] args) {
    Application a = new Application("Winter 2025 demo");
    a.setVisible(true);
}
}