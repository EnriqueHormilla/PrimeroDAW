/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class EjemploFileInput {

    private File fileUno, fileDos;
    private FileInputStream input;
    private FileOutputStream output;
    private byte arrayDatos[];
    private long numeroDeVeces;
    private int numeroLeidos;

    public EjemploFileInput() {
        try {
            int[] hola=new int[5];
            arrayDatos = new byte[1024];
            fileUno = new File("a.txt");
            fileDos = new File("b.txt");
            output = new FileOutputStream("a.txt");
            input = new FileInputStream(fileUno);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenar() {
        setNumeroDeVeces(fileUno.length() / 1024);
        for (int i = 0; i <= numeroDeVeces; i++) {
            try {
                numeroLeidos = input.read(arrayDatos);
                if (numeroLeidos == 1024) {
                    output.write(arrayDatos);
                } else {                  
                    output.write(arrayDatos, 0, numeroLeidos);
                }
            } catch (IOException ex) {
                Logger.getLogger(EjemploFileInput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            input.close();
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(EjemploFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int getNumeroLeidos() {
        return numeroLeidos;
    }

    public void setNumeroLeidos(int numeroLeidos) {
        this.numeroLeidos = numeroLeidos;
    }

    public long getNumeroDeVeces() {
        return numeroDeVeces;
    }

    public void setNumeroDeVeces(long numeroDeVeces) {
        this.numeroDeVeces = numeroDeVeces;
    }  

    public File getFileUno() {
        return fileUno;
    }

    public void setFileUno(File fileUno) {
        this.fileUno = fileUno;
    }

    public File getFileDos() {
        return fileDos;
    }

    public void setFileDos(File fileDos) {
        this.fileDos = fileDos;
    }

    public FileInputStream getInput() {
        return input;
    }

    public void setInput(FileInputStream input) {
        this.input = input;
    }

    public FileOutputStream getOutput() {
        return output;
    }

    public void setOutput(FileOutputStream output) {
        this.output = output;
    }

    public byte[] getArrayDatos() {
        return arrayDatos;
    }

    public void setArrayDatos(byte[] arrayDatos) {
        this.arrayDatos = arrayDatos;
    }

    public static void main(String[] args) {
        EjemploFileInput a = new EjemploFileInput();
        a.llenar();
        if (a.getFileUno().length() == a.getFileDos().length()) {
            System.out.println("Genail el copiado esta bien");
             System.out.println("El tamaño del archivo es -->" + a.getFileUno().length());
            System.out.println("Numero de vueltas a realizar -->" + a.getNumeroDeVeces());
            System.out.println("Bytes que me queda de transpasar -->" + a.getNumeroLeidos());
        } else {
            System.out.println("No son del mismo tamaño");
            System.out.println("El tamaño del archivo es -->" + a.getFileUno().length());
            System.out.println("Numero de vueltas a realizar -->" + a.getNumeroDeVeces());
            System.out.println("Bytes que me queda de transpasar -->" + a.getNumeroLeidos());

        }

    }
}
