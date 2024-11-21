package tema3.matrices;

import java.util.Arrays;

public class Ejercicio3 {

    public static double generarNumeroAleatorio(int mayor, int menor) {
        return (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        /*
            En una plantación tenemos seis zonas diferentes.
            En cada zona tenemos tres sensores, uno de temperatura (-5, 55), otro de
            humedad (0, 100), y otro de pH (0, 10) del suelo.
            Cada sensor nos da la temperatura media del día.

            Vamos a almacenar esa información donde cada fila es una zona y cada
            columna la media de cada tipo de sensor.

            Escribe un programa Java que:
            1. Genere aleatoriamente los datos de los sensores.
            2. Pinte toda la información
            3. Calcule el promedio de cada tipo de sensor en toda la plantación
            4. Identifique la zona con la temperatura más alta
            5. Diga si alguna zona tiene una humedad inferior al 30%

         */

        double sensores[][] = new double[6][3];

        //1
        for(int i=0; i < sensores.length; i++) {
            sensores[i][0] = generarNumeroAleatorio(55, -5);
            sensores[i][1] = generarNumeroAleatorio(100, 0);;
            sensores[i][2] = generarNumeroAleatorio(10, 0);;
        }

        //2
        for(int i=0; i < sensores.length; i++) {
            System.out.println("Zona " + i);
            System.out.println("Temp: "+ sensores[i][0] +
                    " Humedad: " + sensores[i][1] + " Ph: " + sensores[i][2]);
        }

        //3
        double mediaT=0, mediaH=0, mediaPH=0;
        for(int i=0; i < sensores.length; i++) {
            mediaT += sensores[i][0];
            mediaH += sensores[i][1];
            mediaPH += sensores[i][2];
        }

        System.out.println();
        System.out.println("Media Temperatura zonas " + mediaT / sensores.length);
        System.out.println("Media Humedad zonas " + mediaH / sensores.length);
        System.out.println("Media PH zonas " + mediaPH / sensores.length);

        //4
        double maxTemperatura = -5;
        int numZona=-1;
        for(int i=0; i < sensores.length; i++) {
            if (sensores[i][0] > maxTemperatura) {
                maxTemperatura = sensores[i][0];
                numZona = i;
            }
        }
        System.out.println("Máximo de Temperatura en zonas es " + maxTemperatura);
        System.out.println("Está en la zona " + numZona);

        //5
        boolean indicador=false;
        for(int i=0; i < sensores.length; i++) {
            if (sensores[i][1] < 30) {
                indicador = true;
                break;
            }
        }
        if (indicador == true) {
            System.out.println("Hay alguna zona con humedad inferior al 30%");
        } else {
            System.out.println("No hay ninguna zona con humedad inferior al 30%");
        }

    }
}
