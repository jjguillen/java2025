package tema1.ejercicios;

import java.util.Scanner;

public class Ejercicio1OW {

    // Pedimos por teclado el coste de fabricación de un producto
    // Queremos pintar por pantalla el precio que le vamos a poner al producto para el cliente
    // Al coste de fabricación hay que sumarle la ganancia para el vendedor (30%)
    // Al precio resultante le que tengo que sumar el IVA (21)
    // Por último imprimo por pantalla el precio para el cliente final

    public static void main(String[] args) {

        double costeFabricacion;
        double precioFinal;

        //Leer de teclado el coste de fabricacion
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el coste de fabricación del producto");
        costeFabricacion = sc.nextDouble();

        //Sumarle el margen que yo me quiero quedar es de un 30% (coste * 30 / 100)
        costeFabricacion = costeFabricacion + (costeFabricacion * 30 / 100);
        System.out.println("El coste de fabricación más el margen es: " + costeFabricacion + "€");

        //Sumarle un 21% de IVA que le tengo que dar a Hacienda
        precioFinal = costeFabricacion + (costeFabricacion * 21 / 100);

        //Imprimo el precio para el cliente
        System.out.println("El precio final para el cliente es: " + precioFinal + "€");




    }

}
