/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author Enrique Hormilla
 */
public class Cuadrado {
    public static void main(String[] args) {
        String[][] cuadrado;
        cuadrado=new String[5][5];
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                cuadrado[i][j]=" ";
            }           
        }
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[0][i]="*";
            cuadrado[i][0]="*";
            cuadrado[cuadrado.length-1][i]="*";
            cuadrado[i][cuadrado.length-1]="*";
        }
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print(cuadrado[i][j]);
            }
            System.out.println();
        }
    }
}
