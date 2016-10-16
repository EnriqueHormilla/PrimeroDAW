/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class EjemploData {

    public static void main(String[] args) {

        DataOutputStream escribir = null;
        try {
            escribir = new DataOutputStream(new FileOutputStream(new File("data.bin")));
            escribir.writeInt(8);
            escribir.writeUTF("hola");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploData.class.getName()).log(Level.SEVERE, null, ex);
        }

        DataInputStream leer = null;
        try {
            leer = new DataInputStream(new FileInputStream(new File("data.bin")));
            int a = leer.readInt();
            String b = leer.readUTF();
            System.out.println(a);
            System.out.println(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploData.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            escribir.close();
            leer.close();
        } catch (IOException ex) {
            Logger.getLogger(EjemploData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

