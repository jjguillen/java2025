package tema6.tienda;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        int opcion = 0;
        String codigo;
        Scanner sc = new Scanner(System.in);

        Tienda tienda = new Tienda();

        do {
            System.out.println("MENU -------------");
            System.out.println("1. Mostrar inventario.\n" +
                    "2. Agregar producto.\n" +
                    "3. Eliminar producto.\n" +
                    "4. Actualizar producto.\n" +
                    "5. Realizar compra.\n" +
                    "6. Mostrar historial de compras.\n" +
                    "7. Salir.");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    tienda.mostrarInventario();
                    break;
                case 2:
                    System.out.println("Quieres crear ropa deportiva(1) o equipación(2)");
                    int tipo = Integer.parseInt(sc.nextLine());
                    String nombre;
                    Double precio;
                    switch (tipo) {
                        case 1:
                            System.out.println("Dime nombre de producto");
                            nombre = sc.nextLine();
                            System.out.println("Dime precio");
                            precio = Double.parseDouble(sc.nextLine());
                            System.out.println("Dime talla");
                            String talla = sc.nextLine();
                            System.out.println("Dime tipo de ropa");
                            TipoRopa tr = TipoRopa.valueOf(sc.nextLine()); //OJO
                            RopaDeportiva rd = new RopaDeportiva(nombre, precio,
                                    50, talla, tr);
                            tienda.addProducto(rd);
                            break;
                        case 2:
                            System.out.println("Dime nombre de producto");
                            nombre = sc.nextLine();
                            System.out.println("Dime precio");
                            precio = Double.parseDouble(sc.nextLine());
                            System.out.println("Dime deporte");
                            String deporte = sc.nextLine();
                            System.out.println("Dime marca");
                            String marca = sc.nextLine();
                            Equipamiento eq = new Equipamiento(nombre, precio,
                                    50, deporte, marca);
                            tienda.addProducto(eq);
                            break;
                        default:
                            System.out.println("Tipo incorrecto de producto");
                    }

                    break;
                case 3:
                    System.out.println("Dime código de producto");
                    codigo = sc.nextLine();
                    tienda.delProducto(codigo);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Dime código de producto");
                    codigo = sc.nextLine();
                    System.out.println("Dime cantidad a comprar");
                    int cantidad = Integer.parseInt(sc.nextLine());
                    try {
                        tienda.makeShopping(codigo, cantidad);
                    } catch (StockInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    tienda.mostrarHistorialCompras();
                    break;
                case 7:
                    System.out.println("Hasta pronto, gracias por usar esta app");

            }


        } while (opcion != 7);


    }
}
