package week12.lab;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public void start(int port) {
        try {
            ServerSocket socket = new ServerSocket(port);
            System.out.println("Server is running...");
            while (!socket.isClosed()) {
                Socket connection = socket.accept();
                System.out.println("Client connected: " + connection.getInetAddress());
                ClientHandler clientHandler = new ClientHandler(connection);
                // classes which implement Runnable can run in threads
                Thread thread = new Thread(clientHandler);

                thread.start();

            }
        } catch (IOException e) {

        }
    }


    public static void main(String[] args) throws IOException {
        ChatServer server = new ChatServer();

        server.start(1234);
    }

}
