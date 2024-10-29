package tema2.hojaEjercicios;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Fila 1 = *
        // Fila 2 = **
        // Fila 3 = ***
        // Fila 4 = ****
        // i -> filas
        // j -> columnas


        for(int i = 1; i <= 4; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("De otra forma, al revés");

        // Fila 1 = ****
        // Fila 2 = ***
        // Fila 3 = **
        // Fila 4 = *

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
