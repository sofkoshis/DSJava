package animate;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CannonBall {
    public double x;
    public double y;
    public double vx;
    public double vy;
    public double ax;
    public double ay;

    public enum STATE {
        IDLE,
        FLYING,
        EXPLODING
    }

    public STATE currState = STATE.IDLE;

    private final double DIAMETER = 18;
    private SoundClip sndBoom;

    private BufferedImage flame;
    
    public double ground;

    public CannonBall(double ax, double ay, double ground) {
        this.ax = ax;
        this.ay = ay;
        this.ground = ground;

        sndBoom = new SoundClip("media/boom.wav");
        sndBoom.open();

        try{
            File imageFile = new File("media/flame01.png");
            flame = ImageIO.read(imageFile);
        } catch (Exception e) {
            System.err.println("Couldn't load flame image.");
        }

       
    }

    public void draw (Graphics2D g2d) {
        AffineTransform af = new AffineTransform();
        if (currState == STATE.EXPLODING) {
            af.translate( - 45.0 / 2, y - 35.0 / 2);
            g2d.drawImage(flame, af, null);
        } else {
            if (currState == STATE.FLYING) {
                af.translate(x - DIAMETER / 2, y - DIAMETER / 2);
                Ellipse2D ellipse = new Ellipse2D.Float(0,0, (int)DIAMETER, (int)DIAMETER);
                Shape shape = af.createTransformedShape(ellipse);
                g2d.setColor(Color.MAGENTA);
                g2d.draw(shape);
            }
        }      
    }

    public void updateBall() {
        if (currState == STATE.FLYING) {
            vx = vx + ax;
            vy = vy + ay;
            x = x + vx;
            y = y + vy;
            //Check if it is hitting ground.
            if (y >= (ground - DIAMETER / 2)) {
                currState = STATE.EXPLODING;
                sndBoom.play();
            }

        } 

    }

    public void launch(double x, double y, double vx, double vy) {
        if (currState != STATE.FLYING) {
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
            currState = STATE.FLYING;
        }
    }
}
