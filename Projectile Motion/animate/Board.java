package animate;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class Board extends JPanel implements KeyListener {
    private final int B_WIDTH = 1440;
    private final int B_HEIGHT = 810;
    private int FLOOR = B_HEIGHT - 25;

    private Cannon cannon;
    private final double INIT_ANGLE = -45;
    private CannonBall ball;

    private Timer timer;
    private final int INITAL_DELAY = 100;
    private final int TIMER_INTERVAL = 20;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        this.setFocusable(true);
        this.addKeyListener(this);
        
        

        cannon = new Cannon(60, B_HEIGHT - 60, INIT_ANGLE);

        ball = new CannonBall(0, 1, FLOOR);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(), INITAL_DELAY, TIMER_INTERVAL);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left arrow was pressed.");
            cannon.rotateCCW();
            repaint();

        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key was pressed.");
            cannon.rotateCW();
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            System.out.println("Space key was pressed.");
            cannon.fire(ball);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //floor
        g2d.setColor(Color.GREEN);
        g2d.fillRect(0, FLOOR, B_WIDTH, B_HEIGHT - FLOOR);

        //draw cannon
        cannon.draw(g2d);

        //draw ball
        ball.draw(g2d);


    }
    private class ScheduledUpdate extends TimerTask {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            //throw new UnsupportedOperationException("Unimplemented method 'run'");
            ball.updateBall();

            repaint();
        }
    
    }
    
}
