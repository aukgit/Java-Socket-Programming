/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasocketprogramming;

import java.util.Scanner;

/**
 *
 * @author Alim
 */
public class Server {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Server Ip(blank for localhost):");
        String serverip = scanner.nextLine();
    }
}
