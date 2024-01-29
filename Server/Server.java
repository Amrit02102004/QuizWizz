package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2323);
            System.out.println("Server started and listening on port 2323");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress().getHostAddress());

                // Handle client request here

                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}