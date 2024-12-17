package tema3.prueba2024_2025;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void pintar(int lab[][]) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                System.out.print(lab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void pintarOpciones() {
        System.out.println("Elige opción: (1-6)");
        System.out.println("1. Intercambiar columna");
        System.out.println("2. Sumar toda una fila");
        System.out.println("3. Diagonales iguales");
        System.out.println("4. Menor elemento");
        System.out.println("5. Filas ordenadas");
        System.out.println("6. Salir");
    }

    public static void ordenarBurbuja(int nums[]) {
        int aux;
        boolean bandera;

        for(int i=nums.length; i>0; i--) {
            bandera=false;
            for(int j=0; j<i-1; j++) {
                if (nums[j] < nums[j+1]) {
                    bandera=true;
                    aux = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = aux;
                }
            }
            if (bandera==false) {
                System.out.println("Se ha quedado por la " + i);
                break; //Ya está ordenador
            }
        }
    }

    public static void intercambiarColumna(int mat[][]) {
        int num1=0, num2=0, aux=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Dime número de primera columna");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Dime número de segunda columna");
            num2 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Número de columna incorrecto");
        }
        if (num1 >= 0 && num1 < mat[0].length && num2 >= 0 && num2 < mat[1].length) {
            for(int i=0; i < mat.length; i++) {
                aux = mat[i][num1];
                mat[i][num1] = mat[i][num2];
                mat[i][num2] = aux;
            }
        } else {
            System.out.println("Número de columna incorrecto");
        }
    }

    public static void sumarFila(int mat[][]) {
        int num=0, total=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Dime número de fila");
            num = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Número de fila incorrecto");
        }

        if (num >= 0 && num < mat.length) {
            for(int i=0; i < mat[0].length; i++) {
                total += mat[num][i];
            }
        } else {
            System.out.println("Número de fila incorrecto");
        }

        System.out.println("El resultado es: " + total);
    }

    public static boolean diagonalesIguales(int mat[][]) {
        boolean iguales = true;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][i] != mat[i][mat.length - i - 1]) {
                    iguales = false;
                    break;
            }
        }

        return iguales;
    }

    public static int menorElemento(int mat[][]) {
        int menor=mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < menor) {
                    menor = mat[i][j];
                }
            }
        }

        return menor;
    }

    public static void main(String[] args) {

        int matriz[][] = new int[15][15];
        int opcion=0;
        int aux=0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumeroAleatorio(10,1);
            }
        }

        do {
            pintar(matriz);
            pintarOpciones();

            //Pedimos opción al usuario
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Opción iválida");
                opcion = -1;
            }

            switch(opcion) {
                case 1:
                    intercambiarColumna(matriz);
                    break;
                case 2:
                    sumarFila(matriz);
                    break;
                case 3:
                    boolean iguales = diagonalesIguales(matriz);
                    if (iguales) {
                        System.out.println("Son iguales");
                    } else {
                        System.out.println("No son iguales");
                    }
                    break;
                case 4:
                    System.out.println("El menor elemento es " + menorElemento(matriz));
                    break;
                case 5:
                    for(int i=0; i < matriz.length; i++) {
                        //Arrays.sort(matriz[i]);
                        ordenarBurbuja(matriz[i]);
                    }
                    break;
                case 6:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Por favor introduce opción correcta (1-6)");
            }

        } while (opcion != 6);

    }
}
