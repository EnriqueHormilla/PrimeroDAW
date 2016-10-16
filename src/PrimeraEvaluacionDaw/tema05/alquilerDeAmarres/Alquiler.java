
package Tema05.AlquilerDeAmarres;

public class Alquiler {
    //Declarar variables 
    private Cliente cliente;
    private Barco barco;

    //Constructor completo
    public Alquiler(Cliente cliente, Barco barco) {
        this.cliente = cliente;
        this.barco = barco;
    }
    
    //Metodo calcular dias, introduciendo el dia, mes y año de la fecha de entrada de la embarcación y de 
    //la salida y devuelde el número de dias que hay de diferencia
    public long difDiasEntre2fechas(int Y1,int M1,int D1,int Y2,int M2,int D2){
        java.util.GregorianCalendar date1=new java.util.GregorianCalendar(Y1,M1,D1);
        java.util.GregorianCalendar date2=new java.util.GregorianCalendar(Y2,M2,D2);
        long difms=date2.getTimeInMillis() - date1.getTimeInMillis();
        long difd=difms / (1000 * 60 * 60 * 24);
        return difd;
    }   
    
}
