
package Tema04.nif;

import java.util.Scanner;

public class NIF {
    private int nif;
    private String letrita;
    
    public NIF(){
    }
    public NIF(int numeroNIF){
        nif=numeroNIF;    
    }
    
    public void setNIF(int numeroNIF){
        nif=numeroNIF;
    }
    public long getNIF(){
        return nif;
    }
    
    private String calcularLetra(int numeroNIF){
        numeroNIF=nif%23;
        letrita=null;
        switch(numeroNIF){
            case 0:
                return "T";
            case 1:
                return "R";
            case 2:
                return "W";
            case 3:
                return "A";
            case 4:
                return "G";
            case 5:
                return "M";
            case 6:
                return "Y";
            case 7:
                return "F";
            case 8:
                return "P";
            case 9:
                return "D";
            case 10:
                return "X";
            case 11:
                return "B";
            case 12:
                return "N";
            case 13:
                return "J";
            case 14:
                return "Z";
            case 15:
                return "S";
            case 16:
                return "Q";
            case 17:
                return "V";
            case 18:
                return "H";
            case 19:
                return "L";
            case 20:
                return "C";
            case 21:
                return "K";
            case 22:
                return "E"; 
        }
        return letrita;
    }
    
    public void leer(){
        Scanner s=new Scanner(System.in);
        System.out.println("DNI: "+nif+"-"+calcularLetra(nif));
        System.out.println("---------------");
        System.out.print("DNI: ");
        nif=s.nextInt();
        System.out.println("DNI: "+nif+"-"+calcularLetra(nif));
    }
}