package tema2.hojaEjercicios;

public class Ejercicio12Bis {
    public static void main(String[] args) {

        // Fila1 *******   0e - 4*  3*
        // Fila2  *****    1e - 3*  2*
        // Fila3   ***     2e - 2*  1*
        // Fila4    *      3e - 1*  0*

        for(int i = 1; i <= 4; i++) {

            // j 1,2,3
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            //for (int j = 1; j <= 5 - i; j++) {
            // j 4 i 1 -> 4
            // j 4 i 2 -> 3
            // j 4 i 3 -> 2
            // j 4 i 4 -> 1
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }

            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
