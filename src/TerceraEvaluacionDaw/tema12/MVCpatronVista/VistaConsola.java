/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.MVCpatronVista;

import java.awt.event.ActionEvent;
import java.util.Scanner;
import tema12.MVCpatronControlador.CalculadoraControlador;

/**
 *
 * @author VESPERTINO
 */
public class VistaConsola implements InterfazVistas {

    private Scanner s;

    public VistaConsola() {
        s=new Scanner(System.in);
    }


    @Override
    public String getOperando1() {
        System.out.println("Primer datos");
        return s.nextLine();
    }

    @Override
    public String getOperando2() {
        System.out.println("Segundo dato");
        return s.nextLine();
    }

    @Override
    public String getOperador() {
        System.out.println("Dime simbolo");
        return s.nextLine();
    }

    @Override
    public void setResultado(String dato) {
        System.out.println("Sy resultado es -->"+dato);
    }
    public int eleccion(){
        System.out.println("Que quieres : empezar o salir");
        return s.nextInt();        
    }

    @Override
    public void setControlador(CalculadoraControlador aThis) {
        int a=eleccion();
        if(a==0){
            aThis.actionPerformed(new ActionEvent("", 2, "Salir"));
        }else{
            aThis.actionPerformed(new ActionEvent("", 1, "Calculo")); 
        }
       // aThis.actionPerformed(new ActionEvent("", 1, "Calculo"));
//        aThis.actionPerformed(new ActionEvent(getOperando1(), 1, "operador1"));
//        aThis.actionPerformed(new ActionEvent(getOperador(), 1, "operador"));
//        aThis.actionPerformed(new ActionEvent(getOperando2(), 1, "operador2"));
    }

    @Override
    public void salir() {
        System.exit(0);
    }


}
