package animate;


import javax.swing.JFrame;

public class Application extends JFrame {

    public Application() {
        initUI();
    }

    private void initUI() {
       Board board = new Board();
       this.add(board);
       // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        // int application_width = FRAME_WIDTH + 2 * border_width;
        // int application_height = FRAME_HEIGHT + bar_height + border_width;

        int application_height = (int) board.getPreferredSize().getHeight() + bar_height + border_width;
        int application_width = (int) board.getPreferredSize().getWidth() + 2 * border_width;

        // set the size based on the board size
        // and also account for the border width and the bar height.
        this.setSize(application_width, application_height);

        // tell Java what you want our window to do
        // when the window is closed by the user.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cannonball Simulation");
        setLocationRelativeTo(null); 

    }
    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }

    public static void main(String[] args) {
            Application app = new Application();
            app.setVisible(true);
        
    }
}
