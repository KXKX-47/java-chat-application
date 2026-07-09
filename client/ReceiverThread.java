import java.io.*;
import java.net.SocketException;

public class ReceiverThread extends Thread {

    private BufferedReader reader;

    public ReceiverThread(BufferedReader reader) {

        this.reader = reader;

    }

    @Override 
    public void run() {

        try {

            String message;

            while ((message = reader.readLine()) != null) {

                System.out.println(message);
            }

            System.out.println();
            System.out.println("=============================");
            System.out.println("Server disconnected.");
            System.out.println("Closing client...");
            System.out.println("=============================");

            ClientState.running = false;

            System.exit(0);

        } catch (SocketException e) {

            System.out.println();
            System.out.println("=============================");
            System.out.println("Connection closed by server.");
            System.out.println("=============================");

            ClientState.running = false;

            System.exit(0);
        } catch (IOException e) {

            System.out.println();
            System.out.println("===============================");
            System.out.println("Connection lost.");
            System.out.println("===============================");

            ClientState.running = false;

            System.exit(0);
        }
    }
}