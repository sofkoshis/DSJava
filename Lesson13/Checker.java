/*Sofia Koshy
 * AT CompSci with Mr.Eng
 * 11/19/2024
 */
// (imports pasted from TB)
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class Checker {
    public static void draw(Graphics g) {
        final int TILE_SIZE = 100;
    //declare 2 variables to loop through row,
    //then col. by col.
    int row = 0;
    int col = 0;

      //inner loop.
        col = 0;
        Color color = Color.BLUE;
        g.setColor(color);
        while (col < 4) {
            //draw a square.
            g.fillRect(col * 100, 0, 100, 100);
        
            //flip color
            if (color == Color.BLUE) {

                color = color.RED;

            } else {
                color = color.RED;
            }
            //increment col.
            col = col + 1;
        }
    //outer loop
     while (row < 4) {



        //increment row.
        row = row +1;
     }
    }
}
