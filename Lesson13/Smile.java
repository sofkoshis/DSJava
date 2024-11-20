/*Sofia Koshy
 * AT CompSci with Mr.Eng
 * 11/19/2024
 */
// (imports pasted from TB)
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class Smile { 
    public static void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(0, 0, 399, 399); //face
        g.setColor(Color.BLACK);
        g.drawOval(-1,-1,399,399); //outline

        g.setColor(Color.black);
        g.fillOval(100, 90, 50, 50); //left
        g.fillOval(250, 90, 50, 50);//right

        g.drawLine( 20, 260, 380, 260); //mouth
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 400;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent component = new JComponent()
 {
    public void paintComponent(Graphics graph)
{
draw(graph);
 }
 };

frame.add(component);
frame.setVisible(true);

    }
}

