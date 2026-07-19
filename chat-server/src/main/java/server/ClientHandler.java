import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.*;

//Every connected client gets its own execution thread
public class ClientHandler extends Thread {

    private Socket clientSocket;
    private PrintWriter writer;
    private BufferedReader reader;
    private String username;

    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    private String getCurrentTime() {

        return LocalTime.now().format(TIME_FORMAT);
    }

    public ClientHandler(Socket clientSocket) {

        this.clientSocket = clientSocket;
    }

    public void sendMessage(String message) {
        
        //if (writer != null) {

            writer.println(message);
        //}
    }

    private void broadcast(String message) {


            for (ClientHandler client : Server.clients) {
                
                if(client != this){
                    client.sendMessage(message);
                }
                
            }
        
    }

    // ===========================
    // Return Username
    // User by /users and /kick
    // ===========================

    public String getUsername() {

        return username;
    }

    // ===========================
    // Disconnect Client
    // User by /kick and /shutdown
    // ===========================

    public void disconnect() {

        try {

            if (writer != null) {

                writer.println("[SERVER] Server shutting down.");
                writer.println("[SERVER] Disconnecting...");
                writer.flush();
            }

            if (clientSocket != null && !clientSocket.isClosed()) {

                clientSocket.shutdownOutput();
                clientSocket.shutdownInput();
                clientSocket.close();
            }
        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }


    @Override
    public void run() {

        //BufferedReader reader = null;
        //PrintWriter writer = null;

        try {

            System.out.println("-----------------------------");
            System.out.println("Thread Started : " + Thread.currentThread().getName());

            System.out.println("Client Address : " + clientSocket.getInetAddress());

            System.out.println("Client Port    : " + clientSocket.getPort());

            reader = new BufferedReader(
                new InputStreamReader(
                    clientSocket.getInputStream()
                )
            );

            writer = new PrintWriter(
                clientSocket.getOutputStream(),true
            );

            while (true) {

                String message = reader.readLine();

                if (message == null) {

                    System.out.println("Client Disconnected.");

                    break;
                }

                //System.out.println("Received    :   " + message);
                System.out.println(

                    ConsoleColors.CYAN + "[RECEIVED] " + message + ConsoleColors.RESET
                );

                String[] parts = message.split(" ");

                String command = parts[0];

                // -----------------------------
                // LOGIN
                // -----------------------------

                if (command.equalsIgnoreCase("LOGIN")){

                    //Has this client already logged in?
                    if(username != null) {

                        writer.println("ERROR You are already loggin in as " + username);
                    

                    continue;
                    }


                    //Check that a username was supplied
                    if(parts.length < 2) {

                        writer.println("ERROR Username required");
                        continue;
                    }

                    username = parts[1].trim();

                    // ---------------------------
                    // Duplicate Username Check
                    // ---------------------------

                    if (Server.users.containsKey(username)) {

                        writer.println("ERROR Username " + username + "' is already in use.");

                        System.out.println(ConsoleColors.RED + "[LOGIN FAILED] Duplicate username: " + username + ConsoleColors.RESET);

                        continue;
                    }

                    Server.users.put(username, this);

                    // ============================
                    // DEBUG: Print User Map
                    // ============================

                    System.out.println();
                    System.out.println("=======USER MAP=======");

                    for (String user: Server.users.keySet()) {

                        System.out.println(user);
                    }

                    System.out.println("========================");
                    System.out.println();

                    // ============================

                    //Send welcome message only to this client
                    writer.println("WELCOME " + username);

                    System.out.println(ConsoleColors.GREEN + "[LOGIN] " + username + " connected from " + clientSocket.getInetAddress() 
                    + ConsoleColors.RESET);

                    //Notify every connected client
                    //broadcast(username + " joined the chat");
                    broadcast("[" + getCurrentTime() + "]" + "***   " + username + "    joined the chat ****");

                    System.out.println(ConsoleColors.BOLD_WHITE + "Users Online :   " + Server.clients.size() + ConsoleColors.RESET);
                    
                    continue;
                }

                // -------------------------------------
                // MESSAGE
                // -------------------------------------

                else if (command.equalsIgnoreCase("MSG")) {

                    if (username == null) {

                        writer.println("ERROR Please login first");

                        System.out.println(ConsoleColors.RED + "[ERROR] User attempted to send a message before logging in." + ConsoleColors.RESET);

                        continue;
                    }

                    if (message.length() <= 4) {

                        writer.println("ERROR Message cannot be empty");

                        System.out.println(ConsoleColors.RED + "[ERROR] Empty message from " + username + ConsoleColors.RESET);

                        continue;
                    }

                    String chatMessage = message.substring(4).trim();

                    String formattedMessage = "[" + getCurrentTime() + "] " + username + ": " + chatMessage;

                    System.out.println(ConsoleColors.BLUE + "[CHAT]" + formattedMessage + ConsoleColors.RESET);

                    broadcast(formattedMessage);

                    //writer.println("MESSAGE RECEIVED");

                }
                else if (command.equalsIgnoreCase("PM")) {

                    //User must be logged in
                    if (username == null) {

                        writer.println("ERROR Please login first");

                        continue;
                    }

                    // Validate syntax
                    if (parts.length < 3) {

                        writer.println("ERROR Usage: PM <username> <message>");

                        continue;
                    }

                    //Recipient username
                    String recipientName = parts[1];

                    //Cannot message yourself
                    if (recipientName.equalsIgnoreCase(username)) {

                        writer.println("ERROR You cannot send a private message to yourself.");

                        continue;
                    }

                    //Extract the full message
                    String privateMessage = message.substring(command.length() + recipientName.length() + 2).trim();

                    //Empty message check
                    if (privateMessage.isEmpty()) {

                        writer.println("ERROR Message cannot be empty");

                        continue;
                    }

                    //Find Recipient
                    ClientHandler recipient = Server.users.get(recipientName);

                    if (recipient == null) {

                        writer.println("ERROR User '" + recipientName + "' not found.");

                        continue;
                    }

                    //Format timestamp
                    String time = getCurrentTime();

                    //Send to recipient
                    recipient.sendMessage("[" + time + "] [PM]" + username + ": " + privateMessage);

                    //Confirmation to sender
                    writer.println("[" + time + "] [PM to " + recipientName + "] " + privateMessage);

                    //Log on to server
                    System.out.println(ConsoleColors.PURPLE + "[PRIVATE] " + username + " -> " + recipientName + " : " 
                    + privateMessage + ConsoleColors.RESET);
                }

                // ------------------------------
                // QUIT
                // ------------------------------

                else if (command.equalsIgnoreCase("QUIT")) {
                    
                    writer.println("GOODBYE");

                    break;
                }
                else {

                    System.out.println(ConsoleColors.RED + "[ERROR] Unknown command" + ConsoleColors.RESET);

                    //writer.println("ERROR Unknown command");
                }

            }
            
        } catch(IOException e) {

            System.out.println("Connection lost.");
        }
        finally{

            //Only broadcast if the user successfully logged in
            if (username != null) {

                Server.clients.remove(this);

                Server.users.remove(username);

                //broadcast(username + " left the chat.");
                broadcast("[" + getCurrentTime() + "]" + "***   " + username + "    left the chat  ***");
            }

            System.out.println("--------------------------------");
            System.out.println("Client removed from server.");

            if (username != null){

                System.out.println(username + " disconnected.");
            }

            System.out.println("Connected Clients:  " + Server.clients.size());

            try{

                if(reader != null)
                    reader.close();

                if(writer != null)
                    writer.close();

                if(clientSocket != null && !clientSocket.isClosed()){
                    clientSocket.close();
                }

                System.out.println("Client disconnected. ");
                    

            }catch(IOException e){

                e.printStackTrace();
            }
        }
    }
}