package tema3.matrices;

public class Ejercicio2 {

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

    public static int sumarColumna(int columna, int matriz[][]) {
        int sumaColum = 0;
        for(int i=0; i < matriz.length; i++) {
            sumaColum += matriz[i][columna];
        }
        return sumaColum;
    }

    public static void main(String[] args) {

        //Ej2 - Crea una matriz 7x3 de double. Rellénala de valores aleatorios y
        //      dime la suma de cada una de las columnas

        // 1 2 3
        // 2 1 2
        // 4 1 5
        // 1 2 3
        // 3 2 1
        // 1 1 1
        // 0 0 0

        // 0,0 + 1,0 + 2,0 + 3,0 + 4,0 + 5,0 + 6,0 -> 12
        // 0,1 + 1,1 + 2,1 + 3,1 + 4,1 + 5,1 + 6,1 -> 9
        // 0,2 + 1,2 + 2,2 + 3,2 + 4,2 + 5,2 + 6,2 -> 15

        int numeros[][] = new int[7][3];

        for(int fila=0; fila < numeros.length; fila++) {
            for(int colu=0; colu < numeros[0].length; colu++) {
                numeros[fila][colu] = numero_aleatorio(1,9);
            }
        }

        pintar(numeros);

        double sumaFila=0;
        //Sumar filas
        for(int i=0; i < numeros.length; i++) {
            for(int j=0; j < numeros[0].length; j++) {
                sumaFila += numeros[i][j];
            }
            System.out.println("Fila " + i + " = " + sumaFila);
            sumaFila = 0;
        }

        //Sumar columnas
        double sumCol=0;
        for(int colu=0; colu < numeros[0].length; colu++) {
            for(int fila=0; fila < numeros.length; fila++) {
                sumCol += numeros[fila][colu];
            }
            System.out.println("Columna " + colu + " = " + sumCol);
            sumCol = 0;
        }

        //Sumar columnas v2
        int sumaCols[] = new int[numeros[0].length];
        for(int i=0; i < numeros.length; i++) {
            for(int j=0; j < numeros[0].length; j++) {
                sumaCols[j] += numeros[i][j];
            }
        }

        for(int j=0; j < numeros[0].length; j++) {
            System.out.println("Columna " + j + " = " + sumaCols[j]);
        }

        //Sumar columnas v3
        for(int j=0; j < numeros[0].length; j++) {
            sumCol = sumarColumna(j, numeros);
            System.out.println(sumCol);
        }





    }
}
