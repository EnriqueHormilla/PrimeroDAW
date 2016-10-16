/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.MVCpatronModelo;

/**
 *
 * @author VESPERTINO
 */
public class Modelo {

    public int calcular(String operando1, String operador, String operando2) {

        int a = Integer.parseInt(operando1);
        int b = Integer.parseInt(operando2);
        if (operador.equals("+")) {
            return a + b;
        } else if (operador.equals("-")) {
            return a - b;
        } else if(operador.equals("*")) {
            return a * b;
        }else{
            System.out.println("No puedo comparar bien.");
            return -1;
        }
    }

}
