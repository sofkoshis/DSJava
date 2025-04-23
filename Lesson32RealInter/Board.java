import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.File;

public class Board extends JPanel implements MouseListener, KeyListener {
    private int dotX = 250;
    private int dotY = 250;

    public Board() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.CYAN);

        addMouseListener(this);
        setFocusable(true); 
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(dotX - 10, dotY - 10, 20, 20);
    }

    private void playSound(String filename) {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(filename));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error playing sound: " + e.getMessage());
        }
    }

    // MouseListener methods
    @Override
    public void mousePressed(MouseEvent e) {
        dotX = e.getX();
        dotY = e.getY();
        repaint();
        playSound("blip.wav");
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    // KeyListener methods
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            dotX = getWidth() / 2;
            dotY = getHeight() / 2;
            repaint();
            playSound("blop.wav");
        }
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Board Example");
        Board board = new Board();
        frame.add(board);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
