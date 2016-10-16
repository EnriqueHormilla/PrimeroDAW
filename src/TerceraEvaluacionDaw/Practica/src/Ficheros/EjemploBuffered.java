/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class EjemploBuffered {

    private FileReader fileReader;
    private FileWriter fileWiter;
    private BufferedReader reader;
    private BufferedWriter writer;
    private char[] traspadoCaracteres;

    public EjemploBuffered() {
        try {
            fileReader = new FileReader("quijote.txt");
            reader = new BufferedReader(new FileReader("quijote.txt"));
            fileWiter = new FileWriter(new File("quijoteRecortado.txt"));
            writer = new BufferedWriter(fileWiter);
            //System.out.println(reader.read());
            String linea=reader.readLine();
            while (linea!=null) {                
                writer.write(linea);
                writer.newLine();
                linea=reader.readLine();
            }


        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploBuffered.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploBuffered.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(EjemploBuffered.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    public static void main(String[] args) {
        EjemploBuffered a=new EjemploBuffered();
    }
}
