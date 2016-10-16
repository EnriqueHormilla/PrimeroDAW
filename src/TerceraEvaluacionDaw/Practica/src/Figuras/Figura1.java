/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 * http://hitmontop-ejerciciosresueltos.blogspot.com.es/2011/05/deiteljava515.html
 *
 * @author Enrique Hormilla
 *
 *
 *             ********** ********** *
 ** ********* ********* **
 *** ******** ******** ***
 **** ******* ******* ****
 ***** ****** ****** *****
 ****** ***** ***** ******
 ******* **** **** *******
 ******** *** *** ********
 ********* ** ** *********
 ********** * * ********** *
 *
 */
public class Figura1 {

    public static void figura1() {
        String linea = "*";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                linea = linea + "*";
            }
            System.out.println(linea);
            linea = "*";
        }
    }

    public static void figura2() {
        String linea = "*";
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                linea = linea + "*";
            }
            System.out.println(linea);
            linea = "";
        }
    }

    public static void figura3() {
        String espacio = " ";
        String caracter = "*";
        String linea = "";
        int numeroEspacio = 0, numeroCaracter = 10;
        for (int i = 0; i < 10; i++) {
            numeroEspacio = i;
            for (int j = 0; j < 10; j++) {
                if (numeroEspacio > 0) {
                    linea = linea + " ";
                    numeroEspacio--;
                } else {
                    linea = linea + caracter;
                }
            }
            System.out.println(linea);
            linea = "";
        }
    }

    public static void figura4() {
        String espacio = " ";
        String caracter = "*";
        String linea = "";
        int numeroEspacio = 9, numeroCaracter = 0,numeroEspacioAux;
        numeroEspacioAux=numeroEspacio;
        for (int i = 0; i < 10; i++) {             
            numeroEspacioAux=numeroEspacio-i;
            for (int j = 0; j < 10; j++) {
                if (numeroEspacioAux > 0) {
                    linea = linea + " ";
                    numeroEspacioAux--;
                } else {
                    linea = linea + caracter;
                }
            }
            System.out.println(linea);
            linea = "";
        }
    }

    public static void figra3() {

    }

    public static void main(String[] args) {
        figura1();
        figura2();
        figura3();
        figura4();
    }

}
