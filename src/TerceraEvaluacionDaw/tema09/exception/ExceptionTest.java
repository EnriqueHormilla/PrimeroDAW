/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09.exception;

/**
 *
 * @author VESPERTINO
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExceptionTest{

    public static void main(String[] args){

    File f = new File("c:\\test.txt)");

    FileInputStream fis = null;
        try{
        fis = new FileInputStream(f);
        }catch(FileNotFoundException ex){
            System.out.println("Fichero no encontrado.");
        }finally{
            try{
                fis.close();
            }catch(IOException ex){
                System.out.println("Error al cerrar el fichero.");
            }
        }
    }

}
