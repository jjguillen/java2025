package tema3.strings.practica2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto;
        char vocales[] = { 'a', 'e', 'i', 'o', 'u' };
        char consona[] = {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s'
                ,'t','v','w','x','y','z'};

        Arrays.sort(vocales); //Para poder hacer binarySearch
        Arrays.sort(consona);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cadena");
        texto = sc.nextLine();

        //Pasar el texto a minúsculas
        texto = texto.toLowerCase();

        int contVocales = 0;
        int contConsona = 0;
        int contEspacio = 0;

        //Recorrer el texto para comprobar si es vocal, consonante o espacio
        char caracter;
        for(int i=0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            /*
            if (caracter == ' ')
                contEspacio++;
            else if (Arrays.binarySearch(vocales, caracter) >= 0) {
                contVocales++;
            } else if (Arrays.binarySearch(consona, caracter) >= 0) {
                contConsona++;
            }
            */

            switch (caracter) {
                case 'a','e','i','o','u': contVocales++; break;
                case ' ': contEspacio++; break;
                case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s'
                    ,'t','v','w','x','y','z':
                    contConsona++; break;
            }

        }

        System.out.println("Espacios " + contEspacio);
        System.out.println("Vocales " + contVocales );
        System.out.println("Consonantes " + contConsona);
    }
}
