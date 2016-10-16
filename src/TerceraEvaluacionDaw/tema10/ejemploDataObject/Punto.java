/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejemploDataObject;

import java.io.Serializable;

/**
 *
 * @author Enrique
 */
// Clase Punto
public class Punto implements Serializable {
    private int x;
    private int y;
    public Punto(int ax,int ay) {
        x = ax;
        y = ay;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
   

}
