package tema2.hojaEjercicios;

public class Ejercicio19 {

    public static boolean esPrimo(int numero) {
        boolean primo = true;

        for(int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0)
                primo = false;
        }

        return primo;
    }

    public static void main(String[] args) {

        boolean esPrimo = false;

        esPrimo = esPrimo(197);
        System.out.println(esPrimo);
    }
}
