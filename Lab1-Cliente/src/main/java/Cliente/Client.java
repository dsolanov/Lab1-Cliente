/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Console;

/**
 *
 * @author Dasv-9
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //final String HOST = "3.237.51.39";
        final String HOST = "172.31.3.63";
        final int PORT = 5050;
        DataInputStream in;
        DataOutputStream out;

        try {
            Socket sc = new Socket(HOST, PORT);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF("Hola, soy el Cliente!");

            String msg = in.readUTF();
            System.out.println(msg);

            sc.close();

        } catch (Exception e) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
