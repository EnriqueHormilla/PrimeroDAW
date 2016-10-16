/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
         
package tema08.practicaGestion;

/**
 *
 * @author Enrique
 */
public class Run {
    public static void main(String[] args) {
        Menu menu=new Menu();

        do {                        
            menu.ejecutarOpcionCarpeta();
        } while ((menu.getOpcion()>0)&&(menu.getOpcion()<7));
    }
  
}
