/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema06.Strings;

/**
 *
 * @author VESPERTINO
 */
public class Strings {
    public static void main(String[] args) {
      String s1 = new String("HolaEnrique");

        String s2 = new String(" ababABAB "); // Tiene espacios en blanco.
        String s3 = "Ejemplo";
        System.out.println(s1.compareTo(" ")); // “ “ es un espacio en blanco.
        System.out.println(s2.concat((s3)));
        System.out.println(s1.indexOf('h'));
        System.out.println(s2.trim());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s2.indexOf('b'));
        System.out.println(s2.lastIndexOf('b'));
        System.out.println(s3.length());
        System.out.println(s3.charAt(1));
        System.out.println(s2.replace('A','x'));
    }
    
}
