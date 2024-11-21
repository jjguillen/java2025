package tema3.practica1;

import java.util.Arrays;

public class Ejercicio17 {
    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void pintar(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ordenarFilas(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }
    }

    public static void ordenarColumnas(int matriz[][]) {
        int temp=0;
        for(int k=0; k<matriz.length; k++) {

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 1; j < matriz[0].length; j++) {
                    //Intercambiar matriz[j][i] con el anterior
                    if (matriz[j][i] < matriz[j - 1][i]) {
                        temp = matriz[j - 1][i];
                        matriz[j - 1][i] = matriz[j][i];
                        matriz[j][i] = temp;
                    }
                }
            }

        }

        //matriz[0][0], matriz[1][0], matriz[2][0] ...
    }

    public static void main(String[] args) {

        int matriz[][] = new int[5][5];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumeroAleatorio(500, 1);
            }
        }

        pintar(matriz);

        System.out.println();
        //ordenarFilas(matriz);
        ordenarColumnas(matriz);

        pintar(matriz);


    }
}
