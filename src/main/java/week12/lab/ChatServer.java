package week12.lab;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
    ArrayList<ClientHandler> clientHandlers;

    public ChatServer() {
        this.clientHandlers = new ArrayList<ClientHandler>();
    }

    public void start(int port) throws IOException {
        ServerSocket socket = new ServerSocket(port);
        while (true) {
            Socket connection = socket.accept();
            InputStream inputStream = connection.getInputStream();

            System.out.println("Client connected: " + connection.getInetAddress());

            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String message = new String(buffer, 0, bytesRead);
            System.out.println("Received message from client: " + message);
        }
    }

}
