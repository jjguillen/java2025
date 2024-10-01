package tema1;

public class EjemploOperadoresLogicos {
    public static void main(String[] args) {
        //TIENDA: vender un producto. Si la cantidad es mayor que 5 se ofrece un 10% descuento
        // Si el tipo es comida 'c' y la cantidad mayor que 10 se ofrece un descuento del 5% adicional

        double precio = 100;
        int cantidad = 17;
        char tipo = 'c'; //ropa
        double descuento = 0;

        if (cantidad > 5) {
            descuento += 0.1;
        }
        if ((cantidad > 10) && (tipo == 'c')) {
            descuento += 0.05;
        }

        System.out.println(precio * (1-descuento));





    }
}
