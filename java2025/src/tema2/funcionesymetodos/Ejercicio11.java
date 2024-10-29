package tema2.funcionesymetodos;

public class Ejercicio11 {
    public static void main(String[] args) {

        // Fila1    *   3e - 1*
        // Fila2   **   2e - 2*
        // Fila3  ***   1e - 3*
        // Fila4 ****   0e - 4*


        for(int i = 1; i <= 4; i++) {

            // For para poner espacios
            for(int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // For para poner *
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
