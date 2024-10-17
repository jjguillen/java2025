package tema2.bucles;

import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args) {

        /*
        //Pintar números del 1 al 10
        int numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }

        for (int num = 1; num <= 10; num++) {
            System.out.println(num);
        }

        //Números pares del 2 al 40
        for( int num=2; num <= 40; num+=2) {
            System.out.println(num);
        }

        //Recorrer la cadena caracter a caracter
        String cadena = "Programación";
        for( int i=0; i < cadena.length(); i++) {  // 0 - 11
            System.out.println(cadena.charAt(i)); // Pinta la posición i de la cadena
        }

        //Con un for pinta la una cuenta atrás del 10 al 1
        for(int i=10; i>0; i--) {
            System.out.println(i);
        }

        //Genera 10 tiradas de un dado de seis caras usando for
        int tirada;
        for (int i = 1; i <= 10; i++) { //Repetir algo 10 veces
            tirada = (int) (Math.random() * (6)) + 1;
            System.out.println(tirada);
        }

        //Pregunta por teclado 5 nombres de persona
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < 5; i++) {
            System.out.println("Dime un nombre");
            sc.nextLine();
        }
        */

        //Pregunta por teclado 5 nombres, y pintalos seguidos
        //Tenemos que ir guardando los nombres en una variable
        //nombres = nombres + nuevo;
        String nombre;
        String cadenaNombres = ""; //Cadena vacía
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < 5; i++) {
            System.out.println("Dime un nombre");
            nombre = sc.nextLine();
            cadenaNombres = nombre + " " + cadenaNombres;
        }

        System.out.println(cadenaNombres);



    }
}
