package tema3.practica1;

public class Ejercicio18 {

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void pintar(int matriz[][]) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Hemos hecho la matriz una fila más grande y una columna más grande
        //Para almacenar las sumas por filas y columnas
        int matriz[][] = new int[5][6];

        for(int i = 0; i < matriz.length-1; i++) {
            for(int j = 0; j < matriz[i].length-1; j++) {
                matriz[i][j] = generarNumeroAleatorio(9,1);
            }
        }

        pintar(matriz);

        int suma=0;
        for(int i = 0; i < matriz.length-1; i++) {
            for(int j = 0; j < matriz[i].length-1; j++) {
                suma += matriz[i][j];
            }

            //Lo metemos en la última posición (número columnas - 1) de la fila
            matriz[i][matriz[i].length-1] = suma;
            suma = 0;
        }

        for(int j = 0; j < matriz[0].length-1; j++) {
            for(int i = 0; i < matriz.length-1; i++) {
                suma += matriz[i][j];
            }

            //Lo metemos en la última fila (número filas - 1) de la columna correspondiente
            matriz[matriz.length-1][j] = suma;
            suma = 0;
        }

        pintar(matriz);
    }
}
