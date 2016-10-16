
package Tema04.garaje;

public class Motor {
    //Declarar variables
    private int litrosAceite, CV;
    
    //Constructor
    public Motor(int c){
        CV=c;
        litrosAceite=0;
    }
    
    //Setters de litrosAceite y CV
    public void setLitrosAceite(int litro){
        litrosAceite=litro;
    }
    public int getCV(){
        return CV;
    }
    
    //Getters de CV
    public void setCV(int c){
        c=CV;
    }
}
