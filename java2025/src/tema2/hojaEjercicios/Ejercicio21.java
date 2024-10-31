package tema2.hojaEjercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        //Pide un número N, vamos a pedir N números, media, mayor y menor

        int cantidadNumeros = 0;
        int numero;
        int acumulador = 0; // media = acumulador / cantidadNumeros
        int contador = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        //Pedir N por teclado
        try {
            System.out.println("Dime la cantidad de números que vas a introducir");
            cantidadNumeros = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Error introduciendo dígito");
        }

        //Pedir N números
        for(int i=0; i < cantidadNumeros; i++) {
            System.out.println("Introduce número");
            try {
                numero = Integer.parseInt(sc.nextLine());
                acumulador = acumulador + numero;
                contador++;

                //Mayor
                if (numero > mayor)
                    mayor = numero;

                //Menor
                if (numero < menor)
                    menor = numero;

            } catch (Exception e) {
                System.out.println("Número introducido incorrecto, no va a contar");
            }

        }

        System.out.println("Media = " + acumulador + " / " + contador +
                " = " + ((double)acumulador / contador)) ;
        System.out.println("Mayor = " + mayor);
        System.out.println("Menor = " + menor);











    }
}
