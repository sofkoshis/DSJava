import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Andy extends JFrame {
    public static int FRAME_WIDTH = 720;
    public static int FRAME_HEIGHT = 720;

    public Andy(String title) {
        setTitle(title);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new Board());
    }

    class Board extends JPanel {
        private Image image;
        private int x = 0, y = 0;
        private int xSpeed = 1, ySpeed = 1;
        private double angle = 0;

        public Board() {
            try {
                image = ImageIO.read(
                        new File("C:\\Users\\sofko\\OneDrive\\Documents\\GitHub\\DSJava\\A02\\animate\\Andy.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        
            new Timer(25, e -> update()).start();
        }

        private void update() {
          
            x = (x + xSpeed) % FRAME_WIDTH;
            y = (y + ySpeed) % FRAME_HEIGHT;

       
            angle += 5;
            if (angle >= 360) {
                angle = 0;
            }

            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.CYAN);
            Graphics2D g2D = (Graphics2D) g;

            if (image != null) {
              
                AffineTransform transform = new AffineTransform();
                transform.translate(x, y);
                transform.rotate(Math.toRadians(angle), image.getWidth(null) / 2, image.getHeight(null) / 2);
                g2D.setTransform(transform);
                g2D.drawImage(image, 0, 0, this);
            }
        }
    }

    public static void main(String[] args) {
      
        Andy a = new Andy("Bouncing Image Demo");
        a.setVisible(true);
    }
}
