package tema3.practica1;

public class Ejercicio6 {

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

        int numeros[] = new int[10];
        for(int i=0; i < numeros.length; i++) {
            numeros[i] = generarNumeroAleatorio(1,100);
        }

        pintar(numeros);

        for(int i=0; i < numeros.length / 2; i++) {
            System.out.println(numeros[i] + " - " + numeros[numeros.length - 1 - i]);
        }

        /*
        //long = 10
        numeros[0], numeros[9] -> numeros[long - 1 - 0]
        numeros[1], numeros[8] -> numeros[long - 1 - 1]
        numeros[2], numeros[7] -> numeros[long - 1 - 2]

        LLego solo hasta la mitad

        numeros[9] , numeros[0]
        numeros[i] , numeros[long - 1 - i]
        */

    }
}
