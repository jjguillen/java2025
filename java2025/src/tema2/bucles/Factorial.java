package tema2.bucles;

public class Factorial {
    public static void main(String[] args) {
        //Calcular el factorial de un número. Que es el producto de todos los números
        //anteriores a él hasta el 1
        //Factorial:
        // 5! = 5 * 4 * 3 * 2 * 1
        // 8! = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1

        int factorial = 170; //Por encima, saldría infinito
        double total = 1;

        for(int i = factorial; i >= 2; i--) {
            total = total * i;
            System.out.println("Factorial: " + i + " " + (total));
        }
        System.out.println("El factorial es: " + total);

    }
}
