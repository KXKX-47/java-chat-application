package client;

import java.io.*;

public class SenderThread extends Thread {

    private final PrintWriter writer;

    public SenderThread(PrintWriter writer) {

        this.writer = writer;
    }

    @Override
    public void run() {

        BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in)
            );

        System.out.println("Type commands.");

        try {



            while (ClientState.running) {

                String input = keyboard.readLine();

                if (input == null)
                    break;

                writer.println(input);

                if(input.equalsIgnoreCase("QUIT")){

                    ClientState.running = false;

                    break;
                }
            }

            System.out.println("Sender thread stopped.");


        } catch (IOException e) {

            if(ClientState.running) {

                System.out.println("Sender thread terminated.");
            }

            //e.printStackTrace();
        }
    }
}