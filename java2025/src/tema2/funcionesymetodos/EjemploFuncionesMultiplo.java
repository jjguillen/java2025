package tema2.funcionesymetodos;

public class EjemploFuncionesMultiplo {

    /**
     * Método que dice si el segundo número es múltiplo del primero
     * @param a
     * @param b
     * @return true o false
     */
    public static boolean multiplo(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {

        //Crea un función que te diga si un número es múltiplo de otro
        //Pruébala con dos números cualquiera

        int num1 = 25;
        int num2 = 5;

        System.out.println(multiplo(125,3));
        System.out.println(multiplo(num1, num2));


    }
}
