package tema3.practica1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void pintar(int numeros[]) {
        for(int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println();
    }

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        //Crear array de n tamaño
        //Generar aleatorios entre 1 y 300
        //Guardar en un array de tamaño m, los que acaben en un dígito.

        int size1 = 0, size2 = 0;
        int digito = 0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Dime el tamaño del array");
            size1 = Integer.parseInt(sc.nextLine());

            System.out.println("Dime el tamaño del segundo array");
            size2 = Integer.parseInt(sc.nextLine());

            System.out.println("Dime en qué dígito acaban los números " +
                    "para meter en el array (0-9)");
            digito = Integer.parseInt(sc.nextLine());

            //Comprobamos que dígito esté entre 0 y 9
            if (digito < 0 || digito > 9) {
                throw new Exception("Número debe estar entre 0 y 9");
            }

            //Crear array 1 -> numeros
            int numeros[] = new int[size1];
            //Crear array 2 -> los que acaban en digito
            int acaban[] = new int[size2];


            //Rellenamos con valores aleatorios
            for(int i=0; i < numeros.length; i++) {
                numeros[i] = generarNumeroAleatorio(1, 300);
            }

            pintar(numeros);

            //Rellenamos segundo array con los valores que terminen en dígito
            /*
            int j=0;
            for(int i=0; i < numeros.length; i++) {
                if (j >= acaban.length) {
                    //No caben más números en el array acaban
                    break;
                }

                if (numeros[i] % 10 == digito) {
                    acaban[j] = numeros[i];
                    j++;
                }
            }
            */
            int conta=0;
            for(int i=0; i < acaban.length; i++) {
                for(int j=conta; j < numeros.length; j++) {
                    if (numeros[j] % 10 == digito) {
                        acaban[i] = numeros[j];
                        conta = j+1;
                        break;
                    }
                }
            }

            pintar(acaban);

        } catch (Exception e) {
            System.out.println("Número incorrecto " + e.getMessage());
        }



    }
}
