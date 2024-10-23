package tema2.bucles;

public class EjercicioClase1 {
    public static void main(String[] args) {

        //Dados dos números numero1 y numero2, dime cuántos múltiplos de 5 hay entre ellos
        int numero1 = 327;
        int numero2 = 420;
        int contador = 0;
        int temp;

        //Qué pasa si numero1 es mayor que numero2
        if (numero1 > numero2) {
            //intercambiar los números
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        for (int i = numero1; i <= numero2; i++) {
            if (i % 5 == 0) {
                contador++;
            }
        }

        System.out.println("Múltiplos de 5 hay: " + contador);


    }
}
