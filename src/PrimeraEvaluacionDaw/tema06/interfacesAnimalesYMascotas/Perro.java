
package Tema06.InterfacesAnimalesYMascotas;
//Clase Perro que hereda de Canino y es interfaz de Mascota
public class Perro extends Canino implements Mascota{
    
    //Constructor completo
    public Perro(String foto, String tipoComida, String localizacion, String tamanio) {
        super(foto, tipoComida, localizacion, tamanio);
    }

    @Override
    public String comer() {
        return "El perro esta comiendo";
    }

    @Override
    public String rugir() {
        return "El perro esta ladrando";
    }
    
    public boolean hacerRuido(){
        return true;
    }
    //Sobrescripcion del metodo "jugar()"
    
    public void jugar() {
        System.out.println("El perro esta jugando con la pelota");
    }
    //Sobrescripción del metodo "vacunar()"
    public void vacunar() {
        System.out.println("El perro esta siendo vacunado");
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
   //Sobrescritura del metodo "equals()" de Animal
    public boolean equals(Object o){
        Perro p = (Perro) o;
        if(super.equals(o) && this.rugir()==p.rugir()){
            return true;
        }else{
            return false;
        }
    }

   
    
    
    
}
