package tema2.funcionesymetodos;

public class Ejercicio9 {
    public static void main(String[] args) {

        int numero = 54326;
        int division=1;
        int contador = 0;

        do {
            division = numero / 10;
            numero = division; //5432, 543, 54, 5, 0
            contador++;
        } while (division > 0);


        /*
        for(int i=0; division > 0; i++) {
            division = numero / 10;
            numero = division;
            contador++;
        }
        */

        System.out.println(contador);
    }
}
