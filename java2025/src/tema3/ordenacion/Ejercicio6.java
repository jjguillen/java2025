package tema3.ordenacion;

import java.util.Arrays;

public class Ejercicio6 {
    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void pintar(int nums[]) {
        for(int i=0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }

    public static void ordenarBurbuja(int nums[]) {
        int aux;
        boolean bandera;

        for(int i=nums.length; i>0; i--) {
            bandera=false;
            for(int j=0; j<i-1; j++) {
                if (nums[j] > nums[j+1]) {
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
            pintar(nums);
        }
    }

    public static void main(String[] args) {

        int numeros[] = new int[100];

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = generarNumeroAleatorio(100, 1);
        }

        pintar(numeros);

        //ordenarBurbuja(numeros);
        //Arrays.sort(numeros);

        pintar(numeros);

        boolean encontrado = false;
        int posicion = 1000;
        //Ver si los números del 1 al 100 están en el array "numeros"
        for(int i=1; i <= 100; i++) {

            /*
            posicion = Arrays.binarySearch(numeros, i);
            if (posicion < 0) {
                System.out.println(i);
            }
            */

            encontrado = false;
            for(int j=0; j < numeros.length; j++) {
                if (i == numeros[j]) {
                    encontrado = true;
                    break;
                }
                //Como está ordenado no tengo que seguir buscando el número
                if (numeros[j] > i)
                    break;
            }
            if (!encontrado) {
                System.out.println(i);
            }



        }


    }
}
