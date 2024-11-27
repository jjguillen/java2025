package tema3.strings.practica2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        String texto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un texto");
        texto = sc.nextLine();

        //Opción String
        String cadenaReves="";
        for(int i=texto.length()-2; i >= 0; i--) {
            cadenaReves += texto.charAt(i);
        }
        System.out.println(texto + cadenaReves);

        //Opción StringBuffer
        StringBuffer sb = new StringBuffer(texto);
        sb.deleteCharAt(sb.length()-1);
        sb.reverse();

        System.out.println(texto + sb);


    }
}
