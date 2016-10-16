
package Tema04.Mates;

public class Mates {
    //Declarar variables
    private int numero;

    //Constructor completo
    public Mates(int numero) {
        this.numero = numero;
    }

    //Setters y getters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Metodo "esPerfecto()", devuelve true o false si el número es perfecto o no
    public boolean esPerfecto(){
        int suma = 0; //Inicializamos la variable suma a 0
        int perfecto; //Inicializamos la variable perfecto
        for(int i=1;i<numero;i++){
            //Calculamos el resto de la division entre el número y cada uno de los valores que van de 1 hasta número
            perfecto = numero%i;
            //Si el resto es 0, calculamos que la suma de sus dígitos es igual al número
            if(perfecto == 0){
                suma+=i;
            }
        }
        //Si la suma es igual número, es que es un número perfecto y devuelve "true"
        //En caso contrario devolvera false
        return suma == numero; //En caso contrario devolvera false
    }
    
    //Metodo "esPrimo()", devuelve true o false dependiendo si el número sea o no primo
    public boolean esPrimo(){
        int primo; //Inicializamos variable entera primo 
        int cont=0; //Inicializamos variable entera contador a 0
        for(int i=1;i<=numero;i++){
            //Para saber si un número es primo, es solo divisible por el mismo numero y la unidad
            //Calculamos que primo es el resto de la division entre 0 e "i"
            primo = numero%i;
            //Si es asi, los vamos contando 
            if(primo == 0){
                cont++;
            }
        }
        //Si el resultado del contador es igual a 2, es que es primo y devuelve "true"
        //En caso contrario devolvera "false"
        return cont==2; 
    }
    
    //Metodo "listaPerfectos()" nos mostrará los números perfectos que hay antes del número que indiquemos
    public void listaPerfectos(){
        //Declaramos la variable entera suma
        int suma;
        System.out.print("Números perfectos menores de "+numero+": ");
        for(int i=1;i<=numero;i++){  
            //Inicializamos al comienzo del bucle la variable suma a 0
            suma=0;
            //Creamos un bucle anidado. Este bucle nos ayudara a comprobar que números menores de "i" si al realizar
            //la division, su resto es igual a 0
            for(int j=1;j<i;j++){  
                //En caso de ser asi, haremos la suma de sus cifras, para saber si es o no un número perfecto
                if(i%j==0){
                    suma+=j;     
                }
            }
            //Si "i" y la variable suma son iguales, es que es un número perfecto y lo mostraremos por pantalla
            if(i==suma){        
                System.out.print(i+" | ");
            }
        }
        System.out.println("");
    }
    
    //Muestra los números anteriores al número que hemos indicado
    public void listaNúmeros(){
        System.out.print("Lista números: ");
        //Creamos un bucle que ira desde el número 0 hasta el numero que hayamos indicado
        for(int i=0;i<=numero;i++){
            //A su vez los ira mostrando por pantalla
            System.out.print(i+" | ");
        }
        System.out.println("");
    }
    
    //Suma el número de cifras del valor del número
    public int sumaCifras(){
        //Declaramos e inicializamos la variable suma a 0
        int suma = 0;
        //Creamos un bucle que ira desde el 0 hasta el número indicado
        for(int i=0;i<=numero;i++){
            //A medida que vayan pasando los números, los vamos a ir sumando uno a uno
            suma+=i;
        }
        //Por último devolveremos la suma de todas las cifras del número
        return suma;
    }
    
    //Devueldo del número de divisores que tiene el número 
    public int numeroDivisores(){
        //Declaramos la variable "num" y la variable "cont" la inicializamos a 0
        int num;
        int cont=0;
        //Creamos un bucle que ira desde 0 hasta el número
        for(int i=1;i<=numero;i++){
            //La variable "num" ira calculando el resto de la división entre el número e "i"
            num = numero%i;
            //Si el resto es igual a 0, los vamos a ir contando
            if(num==0){
                cont++;
            }
        }
        //Devuelve la cantidad de números que son divisores del número
        return cont;
    }
    
    //Devuelde el número en base 2, es decir en binario
    public String base2(){
        //Declaramos e iniciamos la variable "binario" que sera igual al numero en binario
        String binario = Integer.toBinaryString(numero);
        //Devolvera la variable binario, ya convertida en el número en binario.
        return binario;
    }
}
