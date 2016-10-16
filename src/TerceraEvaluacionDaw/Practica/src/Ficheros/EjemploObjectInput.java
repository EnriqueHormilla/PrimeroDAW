/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class EjemploObjectInput {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream meterDatos=new ObjectOutputStream(new FileOutputStream(new File("object.objeto")));
        meterDatos.writeObject("Meto este objeto1 que es un string");
        meterDatos.writeObject("Meto este objeto2 que es un string");
        meterDatos.writeObject("Meto este objeto3 que es un string");
        ObjectInputStream recibirDatos=new ObjectInputStream(new FileInputStream(new File("object.objeto")));        
        try {
            System.out.println(recibirDatos.readObject());
            System.out.println(recibirDatos.readObject());
            System.out.println(recibirDatos.readObject());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EjemploObjectInput.class.getName()).log(Level.SEVERE, null, ex);
        }
        recibirDatos.close();
        recibirDatos.close();                
    }
    
    
}
