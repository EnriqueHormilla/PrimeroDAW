
package Tema05.Hospital;

public class Principal {
    public static void main(String[] args) {
        Cirujano c=new Cirujano();
        MedicoDeCabecera mc=new MedicoDeCabecera();
        Medico m=new Medico();
        
        
        
        
        c.trabajaEnHospital=true;   //Un atributo
        
        mc.trabajaEnHospital=true;
        mc.visitaLasCasas=true;     //Tiene dos atributo
        
        m.tratarPacientes();         //Tiene un metodos
        
        c.hacerIncision();
        c.tratarPacientes();        //Tiene dos metodos
        
        mc.aconsejaPacientes();     //Aconseja pacientes
        
        
        
        mc.tratarPacientes();       //No puede tratar pacientes
                
        //mc.hacerIncisiones();       //No puede hacer incisiones    
    }
}
