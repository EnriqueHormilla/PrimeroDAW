package tema10.ejemploDataObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Enrique
 */
public class Acciones {

    private ObjectInputStream leer;
    private ObjectOutputStream escribir;

    public Acciones() {

    }

    public ArrayList leerRegistro() {
        ArrayList arrayList = new ArrayList();

        try {
            leer = new ObjectInputStream(new FileInputStream("D:\\a.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al abrir el archivo");
        } catch (IOException ex) {
            System.out.println("Fallo al abrir el archivo");
        }
        try {
            do {
                arrayList.add(leer.readObject());
            } while (true);
        } catch (Exception exa) {
            System.out.println("Fallo al leer el objeto");
            try {
                leer.close();
            } catch (IOException ex) {
                System.out.println("Fallo al cerrar el archivo");
            }
        }

        return arrayList;
    }

    public void escribirRegistro(ArrayList a) {
        try {
            escribir = new ObjectOutputStream(new FileOutputStream("D:\\a.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
        }
//        for (Iterator iterator = a.iterator(); iterator.hasNext();) {
//            Object next = iterator.next();
            try {
                escribir.writeObject(a);
            } catch (IOException ex) {
                Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ae) {
            }
            try {
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
            }
//        }

    }
}
