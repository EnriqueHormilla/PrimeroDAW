/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06.PracticaOtrosEjercicios;

/**
 *
 * @author VESPERTINO
 */
public class MisDatos3 {
    private int a,b,c;

    public MisDatos3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "MisDatos{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
    
}
