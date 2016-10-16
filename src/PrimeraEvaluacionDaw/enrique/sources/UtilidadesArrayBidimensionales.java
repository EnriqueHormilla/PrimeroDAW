/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.sources;

public class UtilidadesArrayBidimensionales {

    public static void mostrarArray2DChar(char [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarArray2DInt(int [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static char[][] introducirCaracteresArray2D(char [][] array, char caracter){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = caracter;
            }
        }
        return array;
    }
    
//    public static char[][] introducirOtrosCaracteresYNoRepetirlosDeFormaAleatoria2D(char [][] array, char caracter, int cantidad){
//        int ale1, ale2, cont = 0;
//        UtilidadesArrays ua = new UtilidadesArrays();
//        do{
//            ale1 = crearMatrizAleatorio(8,8);
//            ale2 = ua.crearAleatorioHasta(8);
//            
//            if(array[ale1][ale2] != caracter){
//                array[ale1][ale2] = caracter;
//                cont++;
//            }
//        }while(cantidad != cont);
//        
//        return array;
//    }
    
//    public static void hundirBarcos(char numeros[][], int numeroDeBarcos){
//        char x, y;
//        Scanner s = new Scanner(System.in);
//        System.out.println("Bienvenido al juego del barco. Si desea salir x = 0 e y = 0");
//        
//        do{
//            System.out.println("Coordenadas 8x8");
//            System.out.print("X: ");
//            x = s.nextLine().charAt(0);
//            System.out.print("Y: ");
//            y = s.nextLine().charAt(0);
//            
//            if(x<'0' || x>'9' || y<'0'|| y>'9'){
//                System.out.println("Has introducido un valor no numérico");
//            }else{
//                int numX = Integer.parseInt(x+"");
//                int numY = Integer.parseInt(y+"");
//                
//                if(numX == 0 && numY == 0){
//                    break;
//                }else{
//                    if(numX<1 || numX>8 || numY<1 || numY>8){
//                        System.out.println("Números fuera de rango");
//                    }else{
//                        if(numeros[numY-1][numX-1] == '*'){
//                            System.out.println("Tocado");
//                            numeroDeBarcos--;
//                        }else{
//                            System.out.println("Agua");
//                        }
//                    }
//                }
//            }
//            
//        }while(numeroDeBarcos != 0);
//        
//        if(numeroDeBarcos == 0){
//            System.out.println("Enhorabuena!! Has hundido todos los barcos");
//        }else{
//            System.out.println("Has salido con "+numeroDeBarcos+" barcos sin hundir");
//        }
//    }
//    
//    public static int [][] crearMatrizAleatorio(int matriz[][], int n){
//        matriz = new int [n][n];
//        UtilidadesArrays ua = new UtilidadesArrays();
//        int aleatorio;
//        
//        for(int i=0;i<matriz.length;i++){
//            for(int j=0;j<matriz[i].length;j++){
//                aleatorio = ua.crearAleatorioHasta(10);
//                matriz[i][j] = aleatorio;
//            }
//        }
//        
//        return matriz;
//    }
//    
//    public static int[][] sumaDosMatrices(int matrizA[][], int matrizB[][]){
//        int suma[][] = new int[matrizA.length][matrizA.length];
//        
//        if(matrizA.length != matrizB.length){
//            System.out.println("Deben de ser de la misma distancia las matrices");
//        }else{
//            for(int i=0;i<suma.length;i++){
//                for(int j=0;j<suma[i].length;j++){
//                    suma[i][j] = matrizA[i][j] + matrizB[i][j];
//                }
//            }
//        }
//        
//        return suma;
//    }
    
    public static int[][] restaDosMatrices(int matrizA[][], int matrizB[][]){
        int resta[][] = new int[matrizA.length][matrizA.length];
        
        if(matrizA.length != matrizB.length){
            System.out.println("Deben de ser de la misma distancia las matrices");
        }else{
            for(int i=0;i<resta.length;i++){
                for(int j=0;j<resta[i].length;j++){
                    resta[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }
        }
        
        return resta;
    }
    
    public static int[][] multiplicarMatrices(int matrizA[][], int matrizB[][]){
        int multiplicacion;
        int multi [][] = new int [matrizA.length][matrizA.length];
        int aux = 0;
        
        for(int i=0;i<matrizA.length;i++){
            for(int j=0;j<matrizA.length;j++){
                for(int k=0;k<matrizA.length;k++){
                    multiplicacion = matrizA[i][k]*matrizB[k][j];
                    aux += multiplicacion;
                }
                multi[i][j] = aux;
                aux = 0;
            }
        }
        
        return multi;
    }

}
