package tema1;

import java.util.Scanner;

public class PrecioCantidadScanner {

    public static void main(String[] args) {

        //Datos de entrada: precio de un producto y la cantidad
        //Datos de salida: precio final, aplicando el iva (21%)

        //Declaración de variables
        double precio = 0;
        int cantidad = 0;
        int iva = 0;
        double precioFinal = 0;
        double precioIva = 0;

        //Leer datos de entrada de teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el precio del producto");
        precio = sc.nextDouble();
        System.out.println("Dime la cantidad que vas a comprar");
        cantidad = sc.nextInt();
        System.out.println("Dime el iva");
        iva = sc.nextInt();

        //Calculo del precio
        precioIva = precio + (precio * iva / 100);

        precioFinal = precioIva * cantidad;

        System.out.println("El precioFinal es " + precioFinal);


    }
}
