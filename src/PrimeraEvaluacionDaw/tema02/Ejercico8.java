/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema02;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Enrique
 */
public class Ejercico8 extends Applet {
    int xCuadrado=20;
    int yCuadrado=150;
    int xTriangulo[]={20,145,82,5};
    int yTriangulo[]={150,150,60};
    int xTronco=275;
    int yTronco=150;   
    
    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g){
        g.drawRect(xCuadrado,yCuadrado,125,100);
        g.setColor(Color.CYAN);
        g.drawPolygon(xTriangulo,yTriangulo,3);
        Color c=new Color(167,82,25);
        g.setColor(c);
        g.fillRect(xTronco,yTronco,30,100);
        g.setColor(Color.GREEN);
        g.fillOval(255,82,70,70);
    }
}
