
import java.io.*;
import java.net.*;
import java.util.*;

public class Chat {
    public static final List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        int portNumber = 12345;
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Multi-client chat server listening on port " + portNumber);

            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("New client connected: " + clientSocket.getInetAddress());
                    ClientHandler clientHandler = new ClientHandler(clientSocket);
                    clients.add(clientHandler);
                    new Thread(clientHandler).start();
                } catch (IOException e) {
                    System.out.println("Error accepting client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error starting server: " + e.getMessage());
        }

    }

    public static void broadcastMessage(String message, ClientHandler sender) {
        synchronized (clients) {
            for (ClientHandler client : clients) {
                if (client != sender) {
                    client.sendMessage(message);
                }
            }
        }
    }

    public static void removeClient(ClientHandler clientHandler) {
        synchronized (clients) {
            clients.remove(clientHandler);
        }
    }
}