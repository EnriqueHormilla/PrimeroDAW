/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema06.InterfacesAnimalesYMascotas;

/**
 *
 * @author Enrique
 */
public class Test {
    public static void main(String[] args) {
        //Creamos dos Perros
        Perro p1 = new Perro("Perro1", "Pienso", "Logroño", "123 cm");
        Perro p2 = new Perro("Perro2", "Paja", "Alberite", "92 cm");
        
        //Mostramos los datos del primer perro
        System.out.println(p1);
        
        System.out.println("-----");
        
        //Mostramos los datos del segundo perro
        System.out.println(p2);
        
        System.out.println("-----");
        
        //Comparamos los perros 1 y 2 haber si son iguales
        if(p1.equals(p2)==true){
            System.out.println("Los dos perros son iguales");
        }else{
            System.out.println("Los dos perros no son iguales");
        }
    }
}
