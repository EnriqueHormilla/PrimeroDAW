
package Tema05.AlquilerDeAmarres;

public class Run {
    public static void main(String[] args) {
        //Declarar variables
        Cliente c1, c2, c3, c4; //Numero de cliente
        Alquiler a; //Alquiler
        int numeroDiferencia;  //Numero de diferencia de los dias entre el inicio y fin del amarre
        
        //Se crea el primer cliente
        c1 = new Cliente(16644788, "Alberto ", "Perez Martinez");
        Veleros veleros = new Veleros(1452, 6, 2005, 2); //Se inicializa la clase Velero
        a = new Alquiler(c1, veleros);  //Se inicializa la clase Alquiler
        System.out.println(c1); //Muestra los datos del cliente
        System.out.println(veleros);//Muestra los datos del velero
        numeroDiferencia = (int) a.difDiasEntre2fechas(2015, 11, 24, 2015, 12, 10); //Calcula la diferencia de dias
        System.out.println("Número de dias de amarre: "+numeroDiferencia);  //Muestra los número de dias
        //Muestra el precio del alquiler del amarre
        System.out.println("Precio total: "+veleros.calcularAlquiler(numeroDiferencia)+"€"); 
        
        System.out.println("--------------");
        
        //Se crea el segundo cliente
        c2 = new Cliente(16740788, "Javier", "Tomas Trapero");
        Deportivos deportivos = new Deportivos(35, 9571, 5, 2010); //Se inicializa la clase Deportivo
        a = new Alquiler(c2, deportivos);   //Se inicializa la clase deportivo
        System.out.println(c2); //Muestra los datos del primer cliente
        System.out.println(deportivos); //Muestra los datos de deportivo
        numeroDiferencia = (int) a.difDiasEntre2fechas(2015, 11, 24, 2015, 12, 10); //Calcula la diferencia de dias
        System.out.println("Número de dias de amarre: "+numeroDiferencia); //Muestra el número de dias de alquiler
        //Muestra el precio total del alquiler del amarre
        System.out.println("Precio total: "+deportivos.calcularAlquiler(numeroDiferencia)+"€");
        
        System.out.println("--------------");
        
        //Se crea el tercer cliente
        c3 = new Cliente(34578120, "María", "Saenz Martinez");
        Yates yates = new Yates(12, 3, 1793, 3, 2014); //Inicializa la clase yate
        a = new Alquiler(c3, yates); //Inicializa la clase yate
        System.out.println(c3); //Muestra los datos del tercer cliente
        System.out.println(yates);  //Muestra los datos de yate
        numeroDiferencia = (int) a.difDiasEntre2fechas(2015, 11, 24, 2015, 12, 10); //Calcula la diferencia de dias
        System.out.println("Número de dias de amarre: "+numeroDiferencia); //Muestra el número de dias de alquiler
        //Se muestra el precio total del alquiler
        System.out.println("Precio total: "+yates.calcularAlquiler(numeroDiferencia)+"€");
        
        System.out.println("--------------");
        
        //Se crea el último cliente
        c4 = new Cliente(99985741, "Jose Luis", "Sanchez Perez");
        Barco barco = new Barco(1473, 10, 1999); //Inicializa la clase barco
        a = new Alquiler(c4, barco); //Inicializa alquiler
        System.out.println(c4); //Muestra los datos del último cliente
        System.out.println(barco);  //Muestra los datos de Barco
        numeroDiferencia = (int) a.difDiasEntre2fechas(2015, 11, 24, 2015, 12, 10); //Calcula el número de dias de diferencia
        System.out.println("Número de dias de amarre: "+numeroDiferencia);  //Muestra el número de dias 
        //Calcula y muestra por pantalla el precio total del alquiler del amarre
        System.out.println("Precio total: "+barco.calcularAlquiler(numeroDiferencia)+"€");
    }
}
