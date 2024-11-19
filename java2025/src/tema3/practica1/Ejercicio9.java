package tema3.practica1;

import java.util.Arrays;

public class Ejercicio9 {
    public static void pintar(int numeros[]) {
        for(int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println();
    }

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        //Crea un array de 10 enteros
        //Rellénalo con valores aleatorios entre 10 - 200
        //Devolver el corredor que ha quedado 1, 2 y último
        //Devolver el tiempo medio = sumar todos / 10

        //Ordeno el array
        //Arrays.sort(vector)

        int vector[] = new int[10];
        for(int i=0; i < vector.length; i++) {
            vector[i] = generarNumeroAleatorio(200,10);
        }

        pintar(vector);

        //Ordena el array
        Arrays.sort(vector);

        pintar(vector);

        System.out.println("El primero es " + vector[0]);
        System.out.println("El segundo es " + vector[1]);
        System.out.println("El último es " + vector[vector.length-1]);



    }
}
