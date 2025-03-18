package gr.aueb.cf.ch26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer extends  Thread {


    public void run(){
        ServerSocket servFd;
        int serverPort = 13;


        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", serverPort), 100);

            while (true) {
                Socket connectedFd = servFd.accept(); //Ερχεται του server μια συνδεση την κανει accept και δημιουργειται ενα δευτερο socket το οποιο υλοποιει τη συνδεση
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
                bw.write(new Date().toString());
                bw.flush();
                connectedFd.close();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
