
package Tema05.Hospital;

public class Cirujano extends  Medico   {
    // sobreescrito de Medico   
    
    @Override
    public void tratarPacientes(){
        System.out.println("Soy cirujano y voy a Tratar paciente");
    }
    public void hacerIncision(){
        System.out.println("Voy a cortate jejeje");
    }
}
