/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.modelo;

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique Hormilla
 */
public class Modelo {

    private String ruta, nombreFichero2, nombreFichero1;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private TreeSet collecion;

    public Modelo() {

    }

    public void inicializarModelo(String ruta, String nombreFichero1, String nombreFichero2Pasado) {
        this.ruta = ruta;
        this.nombreFichero1 = nombreFichero1;
        this.nombreFichero2 = ruta + "\\" + nombreFichero2Pasado;
        try {
            fileReader = new FileReader(nombreFichero1);
            File file11 = new File(nombreFichero2);
            String otroMas = file11.getAbsolutePath();
            fileWriter = new FileWriter(file11);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        collecion = new TreeSet();
    }

    public boolean filtradoNumeros() {
        bufferedReader = new BufferedReader(fileReader);
        try {
            String aux = bufferedReader.readLine();
            while (aux != null) {
                char primero = aux.charAt(0);
                char ultimo = aux.charAt(aux.length() - 1);
                if (primero == ultimo) {
                    collecion.add(aux);
                }
                aux = bufferedReader.readLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return true;
    }

    public boolean filtraColecion() {
        TreeSet aux = new TreeSet();
        for (Iterator iterator = collecion.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            int tamanio = next.length();
            if ((tamanio > 1) && (tamanio < 7)) {
                if (collecion.contains(next)) {
                    aux.add(next);
                }
            }
        }
        collecion = aux;
        return true;
    }

    public boolean rellenaDestino() {
        try {
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Iterator iterator = collecion.iterator(); iterator.hasNext();) {
                String next = (String) iterator.next();
                String cadena = "";
                int suma = 0;
                for (int i = 0; i < next.length(); i++) {
                    cadena = cadena + next.charAt(i);
                    suma = suma + Integer.parseInt("" + next.charAt(i));
                    cadena = cadena + "+";
                }
                cadena = cadena + "=" + suma;
                try {
                    bufferedWriter.write(cadena);
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
                }
                cadena = "";
                suma = 0;
            }
        } catch (Exception e) {
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        Modelo a=new Modelo("C:\\Users\\Enrique Hormilla", "C:\\Users\\Enrique Hormilla\\a.txt", "b.txt");
//        a.filtradoNumeros();
//        a.filtraColecion();
//        a.rellenaDestino();
//    }
}
