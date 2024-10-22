package tema2.bucles;

public class NumerosPrimos {
    public static void main(String[] args) {

        //Introduce un número y di si es un número o no
        //Primo: solo divisible entre él mismo y el 1
        //Indicador
        //7 -> 7/6 resto !=0, 7/5 resto != 0, 7/4 resto != 0, ... , 7/2 != 0
        //Si algún resto da == 0, significa que NO es primo

        boolean esPrimo = true; //Indicador se pone a true, si encuentro un divisor a false
        int numero = 217;

        for( int i = numero - 1; i >= 2; i--) {
            if (numero % i == 0) { //Si hay algún divisor, no es primo
                esPrimo = false;
                System.out.println(i);
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }



    }
}
