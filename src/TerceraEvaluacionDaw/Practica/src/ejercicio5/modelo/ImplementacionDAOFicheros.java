/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class ImplementacionDAOFicheros implements InterfazDAO {

    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public ImplementacionDAOFicheros()  {
       
       
    }

    @Override
    public boolean crear() {
        return false;
    }

    @Override
    public boolean eliminar() {
        return false;
    }

    @Override
    public boolean modificar() {
        return false;
    }

    @Override
    public boolean consultar() {
        return false;
    }

    @Override
    public int consultarConCaracter(char caracter, int numerLineas) {
         try {
            fileReader = new FileReader("quijote.txt");
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImplementacionDAOFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        int cantidadDeCaracteres = 0;
        int vueltasbucle = 0;

        try {
            String cadena = bufferedReader.readLine();

            while ((cadena!=null)&&(numerLineas>0)) { 
                numerLineas--;
                int tamanioLinea=cadena.length();
                for (int i = 0; i < tamanioLinea ; i++) {
                    char char1=cadena.charAt(i);
                    if (char1== caracter) {
                        cantidadDeCaracteres++;
                    }
                }
                cadena = bufferedReader.readLine();
            }
            return 0;
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionDAOFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return cantidadDeCaracteres;
        }
    }

    @Override
    public int consultarCantidadPalabras(int lineasAnalizar) {
         try {
            fileReader = new FileReader("quijote.txt");
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImplementacionDAOFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        int numeroDePalabras = 0;
        try {
            String cadena = bufferedReader.readLine();
            int posicioCadena=0;
            while ((cadena!=null)&&(lineasAnalizar>=0)) { 
               String[] tamnio;
                cadena.trim();
                tamnio=cadena.split(" ");
                numeroDePalabras=numeroDePalabras+tamnio.length;
                
              cadena = bufferedReader.readLine();  
               lineasAnalizar--;
            }
  
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionDAOFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numeroDePalabras;
    }
    public static void main(String[] args) {
        ImplementacionDAOFicheros a=new ImplementacionDAOFicheros();
      //int b= a.consultarConCaracter('I',1 );
      int c=a.consultarCantidadPalabras(100);
        System.out.println(c);
    }
}
