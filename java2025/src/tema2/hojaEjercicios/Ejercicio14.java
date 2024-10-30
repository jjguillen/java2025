package tema2.hojaEjercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        //Pedir dos números por teclado y mostrar los pares entre ellos y contarlos
        int n1=0,n2=0,temp;
        int contador=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Dime otro número");
        n2 = Integer.parseInt(sc.nextLine());

        //Si n1 > n2 intercambio los valores para que funcione el for
        if (n1 > n2) {
            temp = n2;
            n2 = n1;
            n1 = temp;
        }

        for(int i=n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                contador++;
            }
        }
        System.out.println();
        System.out.println("Hay " + contador + " numeros pares entre " + n1 + " y " + n2);

    }
}
