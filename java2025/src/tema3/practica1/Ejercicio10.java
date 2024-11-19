package tema3.practica1;

import java.util.Arrays;

public class Ejercicio10 {

    public static void pintar(int numeros[]) {
        for(int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println();
    }

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static boolean buscar(int numero, int combinacion[]) {
        for(int j=0; j < combinacion.length; j++) {
            if (combinacion[j] == numero)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        //Generar combinación Lotería
        //Generar 6 números aleatorios entre 1 y 49 NO REPETIDOS
        //Cada vez que genero un número debo buscar si ya ha salido en la combinación
        // public static boolean buscar(int combinacion[], in numero)
        // Si no está (false), lo guardo en la combinación, y sigo generando
        // Si sí está (true), repito generar aleatorio

        int combinacion[] = new int[6];
        int num = 0;

        for(int i=0; i < combinacion.length; i++) {
            //Antes de guardar en la combinación, debo buscar si el número
            //está ya en la combinación

            do {
                num = generarNumeroAleatorio(49, 1);
            } while (buscar(num, combinacion));

            combinacion[i] = num;
        }

        Arrays.sort(combinacion);
        pintar(combinacion);







    }
}
