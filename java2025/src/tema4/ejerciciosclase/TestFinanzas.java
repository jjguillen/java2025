package tema4.ejerciciosclase;

import java.util.Scanner;

public class TestFinanzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Finanzas fina = new Finanzas();

        System.out.println( "Dime una cantidad en dólares");
        Double cantidad =  Double.valueOf(sc.nextLine());

        System.out.println(cantidad + " dólares son " + fina.dolaresToEuros(cantidad)
                + " euros con una cambio dólar/euro de " + fina.getCambioDolarEuro() );

        fina.setCambioDolarEuro(0.97);

        System.out.println(cantidad + " dólares son " + fina.dolaresToEuros(cantidad)
                + " euros con una cambio dólar/euro de " + fina.getCambioDolarEuro() );

    }
}
