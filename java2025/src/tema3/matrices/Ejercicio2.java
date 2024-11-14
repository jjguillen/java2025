package tema3.matrices;

public class Ejercicio2 {

    public static void pintar(double matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double numero_aleatorio(double min , double max){
        return (Math.random()*(max-min+1) + min);
    }


    public static void main(String[] args) {

        //Ej2 - Crea una matriz 7x3 de double. Rellénala de valores aleatorios y
        //      dime la suma de cada una de las columnas



    }
}
