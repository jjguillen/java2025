package tema3.strings.practica2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String texto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un texto");
        texto = sc.nextLine();

        //Opción StringBuffer
        StringBuffer sb = new StringBuffer(texto);
        System.out.println(sb.reverse());

        //Opción String
        for(int i=texto.length()-1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }

    }
}
