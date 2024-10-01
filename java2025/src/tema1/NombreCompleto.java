package tema1;

import java.util.Scanner;

public class NombreCompleto {

    public static void main(String[] args) {

        //Crea un programa que pida por teclado tu nombre y tus apellidos por separado
        //Tienes que mostrar por pantalla, primero los apellidos, luego una coma y luego tu nombre

        //Datos de entrada: nombre, apellido1, apellido2
        //Datos de salida: nombreCompleto (apellido1 apellido2, nombre)

        //1.Declaración de variables
        String nombre, apellido1, apellido2;

        //2.Leer de teclado el nombre, el primer apellido y el segundo apellido
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();
        System.out.println("Dime tu primer apellido");
        apellido1 = sc.nextLine();
        System.out.println("Dime tu segundo apellido");
        apellido2 = sc.nextLine();

        //3.Mostrar pantalla las variables en el orden correspondiente usando
        //System.out.println( variable1 + " " + variable2)
        System.out.println("Tu nombre completo es: " + apellido1 + " " + apellido2 + ", " + nombre );

        sc.close(); //Opcional: cerrar el Scanner

    }
}
