/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class EjemploRandomAccessFile {

    private RandomAccessFile accessFileA,accessFileB,accessFileC;
    private File fileUno, fileDos, fileTres;
    private byte contenedorTemporal[];

    public EjemploRandomAccessFile() {        
        try {
            contenedorTemporal=new byte[400];
            fileUno = new File("a.txt");
            fileDos = new File("b.txt");           
            fileTres = new File("c.txt");
            accessFileA=new RandomAccessFile("a.txt","r");
            accessFileB=new RandomAccessFile(fileDos,"r");
            accessFileC=new RandomAccessFile(fileTres,"rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploRandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploRandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void meterEnElArchivo(){
        try {
            //Pongo el puntero en la posicion 1
            accessFileA.seek(0);
            //Cojo 400 bytes
            accessFileA.read(contenedorTemporal);
            //Los escribo.
            accessFileC.write(contenedorTemporal);
            
            //Pongo el puntero el ultimo byte del archivo
            System.out.println(fileDos.length());
            accessFileB.seek(fileDos.length()-400);
            //Le digo que retroceda 400 posiciones
     
            //Cojo 400 bytes
            accessFileB.read(contenedorTemporal);
            //Los escribo.
            accessFileC.seek(fileTres.length());
            accessFileC.write(contenedorTemporal);
            
            accessFileA.close();
            accessFileB.close();
            accessFileC.close();            
            
        } catch (IOException ex) {
            Logger.getLogger(EjemploRandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public static void main(String[] args) {
        EjemploRandomAccessFile a=new EjemploRandomAccessFile();
        a.meterEnElArchivo();
    }

}
