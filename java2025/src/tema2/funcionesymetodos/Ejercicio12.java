package tema2.funcionesymetodos;

public class Ejercicio12 {

    public static void main(String[] args) {

        for(int i = 1; i <= 4; i++) {

            // For para poner espacios
            for(int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // For para poner *
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // For para poner *
            for(int j = 1; j <= i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
