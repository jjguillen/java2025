package tema2.bucles;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*
        int numero = 1;
        while (numero <= 50) {
            //System.out.println(numero);
            numero = numero + 1;
        }

        //Pinta los números pares del 1 al 20
        numero = 2;
        while (numero <= 20) {
            System.out.println(numero);
            numero+=2; //numero = numero + 2
        }

        //Cuenta atrás del 10 al 1
        int numero = 10;
        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }


        //Muestra los números que son decenas del 1 al 100
        int numero = 10;
        while (numero <= 100) {
            System.out.println(numero);
            numero+=10;
        }
        */

        //Muestra los números que son decenas del 1 al 100
        int numero = 1;
        while (numero <= 100) {
            if (numero % 10 == 0) { //Comprobar si el número es o no múltiplo de 10
                System.out.println(numero);
            }
            numero++;
        }



    }
}
