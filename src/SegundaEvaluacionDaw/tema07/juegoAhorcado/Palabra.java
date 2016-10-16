/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07.juegoAhorcado;

import enrique.sources.PedirValores;

public class Palabra {
    private String palabra,palabraEscondida;
    private StringBuilder cadenaAux;
    private int countAciertosPorTurno=0,countAciertosTotales=0;

    public Palabra(String palabra) {
        this.palabra = palabra;
        StringBuilder cadenaAux=new StringBuilder(palabra);
       // System.out.println("la cadena aux es-->"+cadenaAux);
        for (int i = 0; i < cadenaAux.length(); i++) {
            cadenaAux.setCharAt(i,'*');           
        }
        
        palabraEscondida=cadenaAux.toString();
        meterPalabraEnAux(palabraEscondida);
    }
    //POR QUE MI CADENA AUXILIAR UNA VEZ SALE DEL METODO SE VUELVE A NULO SI NO HAGO LA ULTIMA LINEA
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabraEscondida() {
        return palabraEscondida;
    }

    public void setPalabraEscondida(String palabraEscondida) {
        this.palabraEscondida = palabraEscondida;
    }
    public StringBuilder getCadenaAux() {
        return cadenaAux;
    }

    public void setCadenaAux(StringBuilder cadenaAux) {
        this.cadenaAux = cadenaAux;
    }

    public int getCountAciertosPorTurno() {
        return countAciertosPorTurno;
    }

    public void setCountAciertosPorTurno(int countAciertosPorTurno) {
        this.countAciertosPorTurno = countAciertosPorTurno;
    }
    public void meterPalabraEnAux(String s1){
        cadenaAux=new StringBuilder(s1);
    }
    public boolean comprobarLetra(char s1){
        for (int i = 0; i < palabra.length(); i++) {
             if(this.palabra.charAt(i)==s1){               
               cadenaAux.setCharAt(i, s1);
               countAciertosPorTurno++;
               countAciertosTotales++;
            }                      
        }                    
        palabraEscondida=cadenaAux.toString();
        meterPalabraEnAux(palabraEscondida);
        return true;
    }
    public boolean comprobarGanar(){
        boolean resultado=false;
        if(countAciertosTotales==palabra.length()){
            resultado=true;//Has acertado todas
        }
        return resultado;
    }
   
    public static void main(String[] args) {
        Palabra palabra=new Palabra("patata");
          System.out.println("la cadena aux es-->"+palabra.getCadenaAux());
          System.out.println("la cadena  es-->"+palabra.getPalabra());
          System.out.println("la cadena escondida es-->"+palabra.getPalabraEscondida());

        palabra.comprobarLetra(PedirValores.pedirChar());
       System.out.println(palabra.getPalabraEscondida());
            
        
    }
    
    
}
