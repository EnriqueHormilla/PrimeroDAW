
package enrique.sources;
/**
Todos estos metodo trabajan con arrays por lo tanto con objetos.Por ello todas las modificaciones que se realizan en ellos es por 
* referencia asique no es necesario devolver nada ya que el propio cambio se realiza en el objeto.
 */
public class UtilidadesArray {
    public static void arrayInsertatAleatorio(float [] array,int min,int max){
         for (int i = 0; i < array.length; i++) {
            array[i]=PedirValores.pedirAleatorioInt(min,max); 
            System.out.println( array[i]);
        }
    }
    public static void arrayInsertatAleatorio(int[] array,int min,int max){

         for (int i = 0; i < array.length; i++) {
            array[i]=(int) PedirValores.pedirAleatorioInt(min, max);            
        }
    }
     public static boolean comprobarIgual(int [] array){
        boolean resultado=true;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {              
                if(array[i]==array[j]){
                    System.out.println("Algun valor de los introducidos no es valido,pruebe otra vez");
                    resultado=false;
                    break;
                }
            }
        }    

        return resultado;
    }
    public static int compararEntreArray(int [] array1,int[] array2){
        int count=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {              
                if(array1[i]==array2[j]){
                    count++;
                }
            }
        }    
        return count;
    }
    public static int calcularMax(int [] array){
        int min=Integer.MIN_VALUE;        
        for (int dato: array) {
            if(min<dato){
                min=(int) dato;
            }         
        }
       return min;
    }
    public static double calcularMax(float [] array){
        float min=Float.MIN_VALUE;        
        for (float dato: array) {
            if(min<dato){
                min=(int) dato;
            }         
        }
       return min;
    }
     public static double calcularMin(int [] array){
        float max=Integer.MAX_VALUE;
        for (float dato:array) {
            if(max>dato){
                max=dato;
            }         
        }
       return max;
    }
    public static double calcularMin(float [] array){
        float max=Float.MAX_VALUE;
        for (float dato:array) {
            if(max>dato){
                max=dato;
            }         
        }
       return max;
    }
   
    public static int calcularIndiceMin(int [] array){
       int max=Integer.MAX_VALUE;
       int j=0,i=0;
        for (int dato:array) {
            if(max>dato){                
                max=dato;
                j=i;
            }         
           i++; 
        }
       return j;
    }
    public static int[] ordenarArrayMayorMenor(int n[]){
        int fin[] = new int [n.length];
        int cont, id;
        cont = id = 0;
        boolean salir = true;

        do{
            for(int i=0;i<n.length;i++){
                if(n[i]==calcularMax(n)){
                    fin[id] = n[i];
                    n[i] = Integer.MIN_VALUE;
                    id++;
                    cont++;
                }
            }
            if(cont == n.length-1){
                break;
            }
        }while(salir != false);
        
        return fin;
    }
     public static int[] ordenarArrayMenorMayor(int n[]){
        int fin[] = new int [n.length];
        int cont, id;
        cont = id = 0;
        boolean salir = true;

        do{
            for(int i=0;i<n.length;i++){
                if(n[i]==calcularMin(n)){
                    fin[id] = n[i];
                    n[i] = Integer.MAX_VALUE;
                    id++;
                    cont++;
                }
            }
            if(cont == n.length){
                break;
            }
        }while(salir != false);
        
        return fin;
    }
     public static void ordenarArray(int lista[]){
 
        //Usamos un bucle anidado
        for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;
                }
            }
        }
    }
     public static void main(String[] args) {
         int[ ] array = new int[100]; 
         UtilidadesArray.arrayInsertatAleatorio(array, 0, 90);
         ordenarArray(array);
         for (int b : array) {
            System.out.println(b);
         }
      
    }
    

}
