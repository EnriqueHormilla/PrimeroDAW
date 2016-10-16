
package Tema06.InterfacesAnimalesYMascotas;
//Clase abstracta Canino extensión de Animal
public abstract class Canino extends Animal{
    //Constructor completo
    public Canino(String foto, String tipoComida, String localizacion, String tamanio) {
        super(foto, tipoComida, localizacion, tamanio);
    }
    //Metodo "hacerRuido()" que retorna un booleano
    public abstract boolean hacerRuido();
    
}
