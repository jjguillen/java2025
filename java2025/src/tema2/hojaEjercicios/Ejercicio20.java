package tema2.hojaEjercicios;

public class Ejercicio20 {
    public static void main(String[] args) {

        int numero = 197000;

        for(int i=2; i < numero; i++) {
            if (Ejercicio19.esPrimo(i)) {
                System.out.println(i);
            }
        }

    }
}
