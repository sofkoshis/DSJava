import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
    Socket socket;
    PrintWriter out;
    BufferedReader in;
    String name;
    String inputLine;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            out = new PrintWriter(socket.getOutputStream(),true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("Server is connected to " + socket.getInetAddress().getHostName());

            out.println("What is your name: ");
            name = in.readLine();

            //broadcast the name to all the clients
            Server.broadcastMessage(name + " joined");

            while ((inputLine = in.readLine()) != null) {
                String message = name + ": " + inputLine;
                Server.broadcastMessage(message);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
            Server.removeClient(this);
        }
    }

    public void sendMessage(String msg) {
        if(out != null) {
            out.println(msg);
        }
    }

    
    
}
