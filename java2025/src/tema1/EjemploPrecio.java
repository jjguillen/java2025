package tema1;

public class EjemploPrecio {

    public static void main(String[] args) {

        //Datos de entrada: precioProducto
        //Datos de salida: precioFinal
        //DECLARACIÓN DE VARIABLES ---------------
        double precioProducto = 69.95;
        double precioConIVA = 0;
        double precioFinal = 0;

        precioConIVA = 21 * precioProducto / 100;

        precioFinal = precioProducto + precioConIVA;

        System.out.println("El precio con IVA es " + precioFinal);

        //En un solo paso
        //System.out.println("El precio con IVA es " + precioProducto * 1.21);



    }

}
