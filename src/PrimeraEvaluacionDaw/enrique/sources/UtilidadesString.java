/*  RECURSOS UTILIZADOS PARA EL TRABAJO CON STRING EN EL TEMA 6 ****** */
package enrique.sources;

public class UtilidadesString {
     //Externamizar las clausas en metodo

/* Comprobar que el tamaño del string es el deseado*/      
    public static boolean comprobarTamanio(String s1,int tamanio){       
        boolean resultado=false;
        if(s1.length()==tamanio){
           resultado=true;
       }
        return resultado;
    }
/* Comprobar que el string es una cadena con solo letras y sin espacios*/         
//    public static boolean comprobarSoloLetra(String s1){       
//        boolean resultado=false;
//        if(s1.length()==tamanio){
//           resultado=true;
//       }
//        return resultado;
//    }
/* Comprobar que el tamaño de las dos cadenas es el mismo */      
    public static boolean comprobarIgualadTamanioCadenas(java.lang.String s1,java.lang.String s2){       
        if (s1.length() != s2.length()) {
        System.out.println("El tamaño debe ser el mismo");
            return false;
        }else{
            return true;
        } 
    }
/*comprueba que todo los datos del string son numeros y que son positivos*/    
    public static boolean comprobarNumeroEntero(String s1){                  
        boolean comprobar = true;
        for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i)<'0' || s1.charAt(i)>'9') {
                    System.out.println("La cadena deben tener numeros enteros + o 0");
                    comprobar = false;
                }else{
                    comprobar = true;   
                }
        }
        return comprobar;
    }
    
/* Crea un String el cual va tener ordenador de < todo los numeros INCLUSIVE */        
     public static String cadenaNumerica(int min,int max){        
         StringBuffer texto=new StringBuffer(""); 
        for (int i = min; i <=max; i++) {
            texto=texto.append(i);
        }
        return texto.toString();  
    }

/*Ordena una secuencia de numeros de <*/     
    public  static String ordenarNumeros(String s){
        StringBuilder s1=new StringBuilder(s);
        StringBuilder s2=new StringBuilder("");              
        String resultado="";
        int n;
         for (int i = 0; i < 10; i++) {             
              for (int j = 0; j < s1.length(); j++) {                 
                 n= Integer.parseInt(String.valueOf(s1.charAt(j)) );
                 if(i==n){                     
                    s2.append(s1.charAt(j));
                 }
             }
         }      
         return resultado=s2.toString();
     }
/*Comprueba que en la primera cadena cuantas veces esta el segundo String*/    
    public static int comprobarCadenaEnOtra(String cadena,String cadenaComparar){
         //Transformo la cadena en minusculas
        cadena=cadena.toLowerCase();
        cadenaComparar=cadenaComparar.toLowerCase();
        StringBuffer sb1=new StringBuffer(cadena);
        StringBuffer sb2=new StringBuffer(cadenaComparar);       
        int contador=0;      
       //Comprobacion de vocales
        for (int i = 0; i <sb1.length(); i++) {  
                for (int j = 0; j < sb2.length(); j++) {                                                         
                    if(sb2.charAt(j)==sb1.charAt(i)){                       
                        contador++;                    
                    }                
                }            
        }       
        return contador;
    }
    
    public static int contarPalabras(String s) {       
        int contador = 1, pos;
        s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final
                    pos = s.indexOf(" "); //se busca el primer espacio en blanco
                    while (pos != -1) { //mientras que se encuentre un espacio en blanco
                               contador++; //se cuenta una palabra
                               pos = s.indexOf(" ", pos + 1); //se busca el siguiente espacio en blanco
                    }                                               //a continuación del actual
        return contador;
    }
    
    
     
}
