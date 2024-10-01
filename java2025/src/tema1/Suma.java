package tema1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        //Declaración variables
        int numero1, numero2;   //Datos de entrada
        int suma;               //Datos de salida

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer número");
        numero1 = sc.nextInt();
        System.out.println("Dime el segundo número");
        numero2 = sc.nextInt();

        suma = numero1 + numero2;

        System.out.println("El resultado de sumar " + numero1 + " y " + numero2 + " es " + suma);



    }
}
