/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasocketprogramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alim
 */
public class Server {

    static ServerSocket serverSocket;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Server port to start server(>9000):");
        int port = scanner.nextInt();
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Your server is online. You connect from client with port : " + port);
        
        while (true) {
            try {
                socket = serverSocket.accept();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            InputStream inputStream = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            // we have our reader to get the input from client.
            BufferedReader inputFromClient = new BufferedReader(reader);

            OutputStream outputStream = socket.getOutputStream();
            // via this we are going to output to client.
            DataOutputStream outputToClient = new DataOutputStream(outputStream);

            String inputStringFromClient = inputFromClient.readLine();
            String processedData = doOperation(inputStringFromClient);
            outputToClient.writeBytes(processedData + "\n");
        }
    }

    private static String doOperation(String inputStringFromClient) {
        return inputStringFromClient + " processed from server.";
    }
}
