package tema3.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Pide 5 números double por teclado
        //Guárdalos directamente en un array
        //Pinta el array entero

        //Variables, sc tipo Scanner, numeros de tipo array

        double numeros[] = new double[5];

        Scanner sc = new Scanner(System.in);

        //Leer por teclado y guardar en la posición
        for(int i=0; i < numeros.length; i++) {
            System.out.println("Dime un número");
            numeros[i] = Double.parseDouble(sc.nextLine());
        }

        //Pintar el array
        for(int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
