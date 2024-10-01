package tema1;

public class Constantes {

    public static int sumar(int a, int b) {
        //System.out.println(PI);

        return a+b;
    }

    public static void main(String[] args) {

        final double PI = 3.141516; //Math.PI

        //PI = 3.14151618; //No se puede cambiar el valor de una variable 'final'

        System.out.println(PI);

        System.out.println(sumar(3,5));
    }
}
