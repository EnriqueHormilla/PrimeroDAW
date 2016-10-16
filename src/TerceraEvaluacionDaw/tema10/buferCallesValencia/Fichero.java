/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.buferCallesValencia;

import java.io.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Fichero {

    public Fichero() throws FileNotFoundException {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        File f;
        URL url;
        String linea,abecedario="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        //Sacar el abecedario 
//        for (char char1='A'; char1 <='Z'; char1++) {
//            abecedario=abecedario+char1;                       
//        }
//        System.out.println(abecedario);

        try {
            //Crear 27 ficheros txt
            BufferedWriter[] arrayFl = new BufferedWriter[26];
            BufferedWriter arrayFla[] = new BufferedWriter[26];
          
            int a = 0;
            for (char aux = 'A'; aux <= 'Z'; aux++) {
                fw = new FileWriter("e:\\programa\\" + aux + ".txt");
                arrayFl[a] = new BufferedWriter(fw);
                a++;
            }
            // Abrir un archivo
            url = getClass().getResource("/tema10/buferCallesValencia/CallejeroValencia.TXT");
            f = new File(url.getFile());
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            // Leer una linea
            linea = br.readLine();
            while (linea != null) {
                //Obtengo la inicial y dependiendo de ella escribo en la posicion del arry corespondiente

                char char2 = linea.charAt(10);
               CharSequence obj = char2+"";
               
                if(abecedario.contains(obj)){
                 System.out.println(char2+"---"+linea);
                 arrayFl[abecedario.indexOf(char2+ "")].write(linea + "\n");
                 arrayFl[abecedario.indexOf(char2+ "")].newLine();   
                }else{
                    System.out.println("Esta linea no la puedo meter");
                    System.out.println(linea);
                }
                
          
                linea = br.readLine();
            }
            //Cierro todos los archivos dentro del arra
            for (int i = 0; i < arrayFl.length; i++) {
                arrayFl[i].close();                
            }
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        try {
            Fichero f = new Fichero();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
