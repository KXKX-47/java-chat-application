import java.io.*;
import java.net.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;


public class Server {

    //public static List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());

    //connected clients
    public static CopyOnWriteArrayList<ClientHandler> clients =  new CopyOnWriteArrayList<>();

    //logged in users
    public static ConcurrentHashMap<String, ClientHandler> users = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5000); //Accepts client

            //System.out.println("Server started...");
            System.out.println(
                ConsoleColors.BOLD_GREEN + "================================"
            );

            System.out.println("    CHAT SERVER STARTED ");
            System.out.println("    WAITING FOR CLIENTS ");
            System.out.println(" ");
            System.out.println("Commands:   /users  /count  /broadcast  /kick   /shutdown");

            System.out.println("=================================" + ConsoleColors.RESET);

            ServerConsole console = new ServerConsole();

            console.start();

            while(true){

                Socket socket = serverSocket.accept();

                System.out.println("New client connected: " + socket.getInetAddress() + ":" + socket.getPort());

                ClientHandler handler = new ClientHandler(socket);

                Server.clients.add(handler);

                System.out.println("Connected clients:  " + clients.size());

                handler.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}