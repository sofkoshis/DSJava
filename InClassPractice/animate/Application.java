package animate;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Application extends JFrame {
    public static int FRAME_WIDTH = 1080;
    public static int FRAME_HEIGHT = 720;
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
        @Override
        
      protected void paintComponent(Graphics g) {
        
            super.paintComponent(g);
            setBackground(Color.CYAN);
            Graphics2D g2D = (Graphics2D) g;
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            int rectWidth = 150;
            int rectHeight = 150;
            int rectX = centerX = rectWidth / 2;
            int rectY = centerY - rectHeight / 2;

            AffineTransform transform = new AffineTransform();
            transform.translate(centerX - rectWidth / 2, centerY - rectHeight / 2);
            double angle = Math.toRadians(22.5); 
            transform.rotate(angle, centerX, centerY);
            g2d.setTransform(transform);
            g2d.setColor(Color.PINK); 
            g2d.fillRect(0, 0, rectWidth, rectHeight);
           
        }


    }
public static void main(String[] args) {
    Application a = new Application("Winter 2025 demo");
    a.setVisible(true);
}
}