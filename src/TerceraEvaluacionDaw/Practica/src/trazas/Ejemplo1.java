/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trazas;

/**
 *
 * @author Enrique Hormilla
 */
public class Ejemplo1 {
    public static boolean ejemplo(){
            int a=7;
            if(a==7){
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
        //System.out.println(ejemplo());
        int a = 5;
        int b=1;
        try {
            a = a / 0;
        } catch (ArithmeticException e) {
            System.out.println(a);
            System.out.println(a++);
            System.out.println(b=++a);
            System.out.println(a++);
            System.out.println(a);
            System.out.println("---- ");
            System.out.println(b);
            System.out.println("pen");
        } catch (Exception aa) {
            System.out.println("Pan");
        }
    
    }
}
