package tema1;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        //INCREMENTO DECREMENTO
        int numero = 0;
        numero++; // numero = numero + 1

        System.out.println(numero);

        numero--;
        System.out.println(numero);

        ++numero; // numero = numero + 1
        System.out.println(numero);

        //SUMA Y ASIGNACION
        int cantidad = 10;
        cantidad += 5; //cantidad = cantidad + 5
        System.out.println(cantidad);

        //RESTA Y ASIGNACION
        cantidad -= 10; //cantidad = cantidad - 10
        System.out.println(cantidad);

        //MULTIPLICACION Y ASIGNACION
        cantidad *= 5; //cantidad = cantidad * 5;
        System.out.println(cantidad);

        //DIVISION Y ASIGNACION
        cantidad /= 5; //cantidad = cantidad / 5;
        System.out.println(cantidad);


    }
}
