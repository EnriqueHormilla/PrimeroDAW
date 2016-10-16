/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06.dateFormat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio02 {
    public static void main(String[] args) {
       		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(76543210.1234));
        // Resultado: 76.543.210
                NumberFormat nf1 = NumberFormat.getInstance(Locale.ENGLISH);
		System.out.println(nf.format(76543210.1234));
    }
    
}
