/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class EjemploFile {

    public EjemploFile() {
        File fileUno=new File("C:\\Users\\qiqe_\\Documents\\NetBeansProjects\\EnriqueTerceraEvaluacionDawPractica\\a.txt");
       
       System.out.println( fileUno.exists());
        try {
            fileUno.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(EjemploFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(fileUno.exists());
        System.out.println(fileUno.compareTo(fileUno));
        try {
            System.out.println( fileUno.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(EjemploFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    public static void main(String[] args) {
        EjemploFile a=new EjemploFile();
    }
}

