package tema3.strings.practica2;

public class Ejercicio3 {
    public static void main(String[] args) {

        String texto = "En un lugar de la Mancha de cuyo nombre de lo de que sea";
        String palabra = "de";

        //Forma 1
        int contador = 0;
        int posicion = 0;
        while (posicion >= 0) {
            posicion = texto.indexOf(palabra,posicion);
            if (posicion == -1)
                break;
            //posicion++;
            contador++;
        }
        System.out.println("Palabra aparece " + (contador) + " veces");

        //Forma 2
        posicion = -1;
        contador = 0;
        while ( (posicion = texto.indexOf(palabra,posicion+1)) >= 0) {
            contador++;
        }
        System.out.println("Palabra aparece " + (contador) + " veces");

    }
}
