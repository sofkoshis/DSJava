import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    static ArrayList<ClientHandler> clients;

public static void main(String[] args) {
    int port = 8675;

    clients = new ArrayList<>();
    try(ServerSocket serverSocket = new ServerSocket(port);) {
        System.out.println("Server listening on port " + port);

        while(true) {
            try {
                Socket socket = serverSocket.accept();

             
                ClientHandler handler = new ClientHandler(socket);
        
                Thread thread = new Thread(handler);
                thread.start();
                clients.add(handler);

            } catch (IOException e) {
                System.err.println(e.getMessage());
            break;
            }
           
    

        }
       

    } catch (IOException e) {
        System.err.println(e.getMessage());
    }

    System.out.println("Good bye");
}

public static void broadcastMessage(String msg) {
    for(ClientHandler handler: clients) {
       handler.sendMessage(msg);
    }
}

public static void removeClient (ClientHandler handler) {
    int index = clients.indexOf(handler);
    if(index >= 0) {
        clients.remove(index);
    }
}
}