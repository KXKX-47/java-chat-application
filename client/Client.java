import java.io.*;
import java.net.*; // this imports networking classes


public class Client {

     public static void main(String[] args) { //JVM execution begins here

        Socket socket = null;
        BufferedReader reader = null;
        PrintWriter writer = null;

        try {

            socket = new Socket("localhost",5000);

            System.out.println("Connected to server.");

            //Creating output Stream for Socket
             writer = new PrintWriter(
                socket.getOutputStream(),true
            );

            //Creating input stream for Socket
             reader = new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream()
                )
            );

            SenderThread sender = new SenderThread(writer);

            ReceiverThread receiver = new ReceiverThread(reader);

            sender.start();
            receiver.start();

            //Wait until the user types QUIT
            //sender.join();


            /*
            Wait until the receiver exits.
            If the server disconnects,
            ReceiverThread calls System.exit(0).
            */

            //socket.close();

            receiver.join();

        } catch (IOException e) {

            System.out.println("Unable to connect to server.");

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
        }

        finally {

            try {

                if (reader != null)
                    reader.close();

                if (writer != null)
                    writer.close();

                if (socket != null && !socket.isClosed())
                    socket.close();

            } catch (IOException e) {

                // Ignore during shutdown

            }

            System.out.println("Client Terminated.");

        } 
    }
}