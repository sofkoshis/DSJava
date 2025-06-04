import java.io.BufferedReader;

public class MessageReceiver implements Runnable {
    private BufferedReader inFromServer;

    public MessageReceiver(BufferedReader inFromServer) {
        this.inFromServer = inFromServer;
    }

    public void run() {
        String message;
        try {
            while ((message = inFromServer.readLine()) != null) {
                System.out.println(message);
            }
        } catch (Exception e) {
            System.out.println("Error receiving message: " + e.getMessage());
        }
    }
}