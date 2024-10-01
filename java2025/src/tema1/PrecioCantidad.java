package tema1;

public class PrecioCantidad {

    public static void main(String[] args) {

        //Datos de entrada: precio de un producto y la cantidad
        //Datos de salida: precio final, aplicando el iva (21%)

        //Declaración de variables
        double precio = 59.95;
        int cantidad = 4;
        int iva = 18; //18%
        double precioFinal = 0;
        double precioIva = 0;

        precioIva = precio + (precio * iva / 100);

        precioFinal = precioIva * cantidad;

        System.out.println("El precioFinal es " + precioFinal);





    }
}
