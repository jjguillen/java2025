package tema3.practica1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void pintar(int numeros[]) {
        for(int i=0; i < numeros.length; i++) {
            System.out.println(i + " - " + numeros[i]);
        }
    }

    //Si un vector se pasa como parámetro, si se modifica el vector en la función
    //quedará modificado fuera de ella.
    //Se debe a que en realidad no se pasa el vector entero, sino su "referencia"
    public static void intercambio(int vector[]) {
        int temporal = vector[vector.length-1];
        vector[vector.length-1] = vector[0];
        vector[0] = temporal;
    }

    public static void desplazar(int vector[], int posiciones) {

        int temporal;
        //Repetir tantas veces desplazar una posicion, como indique el parámetro
        //posiciones
        for(int conta =0; conta < posiciones; conta++) {

            //Todo esto desplaza una posición a la derecha
            temporal = vector[vector.length-1];
            for(int i=vector.length-1; i > 0; i--) {
                vector[i] = vector[i-1];
            }
            vector[0] = temporal;

        }
        //No return, el array se modifica dentro y queda modificado fuera de la función
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vector[] = new int[5];
        ;
        for(int i=0; i < vector.length; i++) {
            System.out.println("Dime número");
            vector[i] = Integer.parseInt(sc.nextLine());
        }

        pintar(vector);

        //Rotar a la derecha una posición el vector
        //Hay que hacerlo del final al principio, para no machacar los valores
        int temporal = vector[vector.length-1];
        //No llegamos a 0
        for(int i=vector.length-1; i > 0; i--) {
            vector[i] = vector[i-1];
        }
        vector[0] = temporal;

        pintar(vector);

        //intercambio(vector);

        desplazar(vector, 5);

        pintar(vector);

    }
}
