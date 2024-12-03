package tema3.strings.practica2;

public class Ejercicio13 {
    public static void main(String[] args) {

        String texto = "No se me ocurre ninguna frase larga";
        String cadenas[] = texto.split(" ");
        int maximo=0;
        int posicion=-1;
        for(int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
            if (cadenas[i].length() > maximo) {
                maximo = cadenas[i].length();
                posicion = i;
            }
        }

        System.out.println("La cadena más larga es " + cadenas[posicion]);
    }
}
