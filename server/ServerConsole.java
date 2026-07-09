import java.io.*;
import java.util.*;

public class ServerConsole extends Thread {

    @Override
    public void run() {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {

            while(true) {

                String command = console.readLine();

                if (command == null)
                    continue;

                if (command.equalsIgnoreCase("/users")) {

                    System.out.println("\n====== ONLINE USERS =======");

                        /*for (ClientHandler client : Server.clients) {

                            if (client.getUsername() != null) {

                                System.out.println("- " + client.getUsername());
                            }
                        }*/

                       for (String username : Server.users.keySet()) {

                            System.out.println("-   " + username);
                       }
                    

                    System.out.println("================================\n");
                }

                else if (command.startsWith("/broadcast ")) {

                    String message = command.substring(11).trim();

                

                        for (ClientHandler client: Server.clients) {

                            client.sendMessage(
                                "[SERVER]   " + message
                            );
                        }
                    

                    System.out.println("Broadcast sent.");
                }

                else if (command.startsWith("/kick ")) {

                    String username = command.substring(6).trim();

                    boolean found = false;

                

                        for (ClientHandler client : Server.clients) {

                            if (username.equals(client.getUsername())) {

                                client.sendMessage(
                                    "[SERVER] You have been kicked."
                                );

                                client.disconnect();

                                found = true;

                                break;
                            }
                        }
                    

                    if (found) {

                        System.out.println(
                            username + "    disconnected.   "
                        );
                    }
                    else {

                        System.out.println("User not found.");
                    }
                }
                else if (command.equalsIgnoreCase("/shutdown")) {

                    System.out.println("Shutting down server...");

                    //List<ClientHandler> clientsToDisconnect = new ArrayList<>(Server.clients);

                    for(ClientHandler client : Server.clients) {

                        // client.sendMessage("[SERVER] Server shutting down.");

                        client.disconnect();
                    }

                    try {

                        Thread.sleep(1000);

                    } 
                    catch (InterruptedException e) {

                        Thread.currentThread().interrupt();

                    }

                    System.out.println("Server stopped");

                    System.exit(0);
                }
                else if (command.equalsIgnoreCase("/count")) {

                    //System.out.println("Connected Users : " + Server.clients.size());
                    System.out.println("Logged In Users:    " + Server.users.size());
                }

                else {

                    System.out.println("Unknown server command.");
                }
            }
        }
        catch(IOException e){

            e.printStackTrace();
        }
    }
}