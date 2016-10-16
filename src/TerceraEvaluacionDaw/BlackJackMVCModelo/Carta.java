/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJackMVCModelo;

/**
 *
 * @author VESPERTINO
 */
public class Carta {

    private int palo;
    private int simbolo;
    private int valor;


    public Carta(int card) {
        this.simbolo = card % 13;        
        this.palo = card / 13;
        calculaValor();

    }
    
    public void calculaValor() {
         valor=simbolo ;
        if (simbolo ==12 ) {
            valor= 1;
        }else if (simbolo >= 8) {
            valor= 10;
        }else{
           valor=simbolo +2; 
        }
       
    }
    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(int simbolo) {
        this.simbolo = simbolo;
    }

    public String toString() {
        String auxS;
        char aux;
        String valores = "23456789TJQKA";
        String palos = new String("\u2663"+"\u2666"+"\u2665"+"\u2660");
        aux=valores.charAt(simbolo);
        if(aux=='T'){
            auxS="10";
        }else{
            auxS=""+aux;
        }
        //return "Valor-->"+valor+"Simbolo-->"+auxS + "Palo-->" + palos.charAt(palo);
        return valores.charAt(simbolo) + "" + palos.charAt(palo);
    }
    
    public static void main(String[] args) {
        Carta a=new Carta(0);
        System.out.println(a);
        Carta b=new Carta(1);
        System.out.println(b);
         Carta c=new Carta(12);
        System.out.println(c);
    }
 
}
