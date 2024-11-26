package tema3.practica1;

import java.util.Scanner;

public class Ejercicio8 {

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

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }


    public static void main(String[] args) {

        int numeros[] = new int[10];
        int posicion;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = generarNumeroAleatorio(100, 1);
        }

        pintar(numeros);

        System.out.println("Dime una posición para borrar");
        posicion = Integer.parseInt(sc.nextLine());

        //Desplazar a la izquierda, desde el final hasta posición
        // 3 - 5 - 6 - 7 - 8 - 9 - 1 - 3 - 9 - 11
        //                     x
        // 3 - 5 - 6 - 7 - 8 - 1 - 3 - 9 - 11 - -1

        for(int i=posicion; i < numeros.length-1; i++) {
            numeros[i] = numeros[i+1];
        }
        numeros[numeros.length-1] = -1;

        pintar(numeros);


    }
}
