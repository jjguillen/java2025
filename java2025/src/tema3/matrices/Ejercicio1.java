package tema3.matrices;

public class Ejercicio1 {

    public static void pintar(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) + min);
    }


    public static void main(String[] args) {

        //Ej1 - Crea un matriz 6x6 de enteros. Rellénala de valores aleatorios y
        //      dime la suma de la diagonal principal y de la diagonal secundaria





    }
}
