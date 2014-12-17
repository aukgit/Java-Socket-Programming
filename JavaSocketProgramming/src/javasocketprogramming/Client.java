/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasocketprogramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Alim
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(Client App) Server Ip(blank for localhost):");
        String serverip = scanner.nextLine();
        if (serverip == null || "".equals(serverip)) {
            serverip = "localhost";
        }

        System.out.print("Server Port(>9000):");
        int port = scanner.nextInt();

        try (Socket socket = new Socket(serverip, port)) {
            System.out.print("Input to process in the server (" + serverip + ":" + port + "):\n");
            // we have client input
            BufferedReader inputTakerFromClient = new BufferedReader(new InputStreamReader(System.in));
            String inputFromClient = inputTakerFromClient.readLine();
            OutputStream outStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outStream);
            dataOutputStream.writeBytes(inputFromClient +"\n");
            
            
            BufferedReader processedDataFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String processedData = processedDataFromServer.readLine();
            System.out.println("Processed Data from Server : " + processedData);
            
            
        }

    }
}
