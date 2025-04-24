package animate;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Cannon {
    private double x;
    private double y;
    private double angle = -45;


    private double pivot_x = 0;
    private double pivot_y = 0;

    private BufferedImage imgCannon;
    private SoundClip sndWheel;
    private SoundClip sndCannon;

    public Cannon() {
        try {
            File imageFile = new File("media/sm_cannon.png");
            imgCannon = ImageIO.read(imageFile);

            pivot_x = 15;
            pivot_y = imgCannon.getHeight()/2;
        } catch (Exception e) {
            System.err.println("Couldn't load cannon image.");
        }
        
        sndWheel = new SoundClip("media/wheel.wav");
        sndWheel.open();
        sndCannon = new SoundClip("media/cannon.wav");
        sndCannon.open();
     
    }

    public Cannon(double x, double y, double angle) {
        this();
        this.x = x;
        this.y = y;
        this.angle = angle;
    }
    public void draw(Graphics2D g2d) {
           AffineTransform affineTransform = new AffineTransform();
           affineTransform.translate(x - pivot_x, y - pivot_y); 
           affineTransform.rotate(Math.toRadians(angle), pivot_x, pivot_y);

           g2d.drawImage(imgCannon, affineTransform, null);
    }

    public void fire() {
        sndCannon.play();;
    }

    public void rotateCCW() {
        angle = angle - 5;
        if (angle < -90) {
            angle = -90;

        } else {
            sndWheel.play();
        }


    }
    
    public void rotateCW() {
        angle = angle + 5;
        if (angle > 0) {
            angle = 0;

        } else {
            sndWheel.play();
        }

    }

    
}
