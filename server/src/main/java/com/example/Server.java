package com.example;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Gary on 16/5/28.
 */
public class Server implements Runnable{
    private Main main;
    private Thread thread;
    private ServerSocket servSock;

    public Server(Main m){

        try {
            main = m;
            // Detect server ip
            InetAddress IP = InetAddress.getLocalHost();
            main.settext("IP of my system is := " + IP.getHostAddress() + "\n");
            main.settext("Waitting to connect......\n");

            // Create server socket
            servSock = new ServerSocket(2000);

            // Create socket thread
            thread = new Thread(this);
            thread.start();
        } catch (java.io.IOException e) {
            main.settext("Socket啟動有問題 !\n");
            main.settext("IOException :" + e.toString() + "\n");
        } finally{

        }
    }

    @Override
    public void run(){
        // Running for waitting multiple client
        try{
            Socket clntSock = servSock.accept();
            InputStream in = clntSock.getInputStream();

            main.settext("Connected!!\n");
            while(true) {

                // After client connected, create client socket connect with client


                // Transfer data
                byte[] b = new byte[1024];
                int length;

                length = in.read(b);
                String s = new String(b);
//                System.out.println("test + " + s);
                main.settext("[Server Said]" + s + "\n");
            }

            }
            catch(Exception e) {
                //System.out.println("Error: "+e.getMessage());


         }
    }
}
