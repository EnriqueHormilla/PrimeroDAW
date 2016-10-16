/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09.exception;

import enrique.sources.PedirValores;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class ControlDeErrores {
    public static int[] metodo1(int a,int b){
       int array [] = new int [2];  
       if(b!=0){       
        array[0]=a/b;
        array[1]=a%b;       
       }else{
        array=null;
       }
       return array;
    }
    public static int[] metodo2(int a,int b){
        int array [] = new int [2];  
        try {           
            array[0]=a/b;
            array[1]=a%b;   
        } catch (Exception e) {
            array=null;
            System.out.println("hay fallos");
        }finally{
            return array;
        }
    }
    public static Object metodo3(int a){
        LinkedList list=new LinkedList();
        Object obj=null;
        for (int i = 0; i < 101; i++) {
           Integer numero=PedirValores.pedirAleatorioInt(0, 100);
           list.add(numero);            
        }
        try {           
            obj=list.get(a); 
        } catch (Exception e) {
            System.out.println("No se a podido realizar la operacion");
        }finally{
          return obj;
        }
    }

//    public FileInputStream(File aFile) throws ExceptionTest{
//        if(...){
//            throw new ExceptionTest("No existe el fichero.");
//        }
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero de 0-100");
        metodo3(sc.nextInt());
    }
    
}
