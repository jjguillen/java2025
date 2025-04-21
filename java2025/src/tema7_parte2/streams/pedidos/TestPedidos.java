package tema7_parte2.streams.pedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class TestPedidos {
    public static void main(String[] args) {


        Cliente c1 = new Cliente(1L, "Manuel García", 2);
        Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
        Cliente c3 = new Cliente(3L, "Goyo Jiménez", 2);

        Producto prod1 = new Producto(1L, "Libro1", CategoriaProducto.LIBROS, 19.95);
        Producto prod2 = new Producto(2L, "Libro2", CategoriaProducto.LIBROS, 27.95);
        Producto prod3 = new Producto(3L, "Libro3", CategoriaProducto.LIBROS, 22.95);
        Producto prod4 = new Producto(4L, "Libro4", CategoriaProducto.LIBROS, 15.95);
        Producto prod5 = new Producto(5L, "Libro5", CategoriaProducto.LIBROS, 19.95);
        Producto prod6 = new Producto(6L, "Juego1", CategoriaProducto.JUEGOS, 59.95);
        Producto prod7 = new Producto(7L, "Juego2", CategoriaProducto.JUEGOS, 67.95);
        Producto prod8 = new Producto(8L, "Juego3", CategoriaProducto.JUEGOS, 52.95);
        Producto prod9 = new Producto(9L, "Juego4", CategoriaProducto.JUEGOS, 55.95);
        Producto prod10 = new Producto(10L, "Juego5", CategoriaProducto.JUEGOS, 69.95);
        Producto prod11 = new Producto(11L, "Periferico1", CategoriaProducto.PERIFERICOS, 19.95);
        Producto prod12 = new Producto(12L, "Periferico2", CategoriaProducto.PERIFERICOS, 27.95);
        Producto prod13 = new Producto(13L, "Periferico3", CategoriaProducto.PERIFERICOS, 32.95);
        Producto prod14 = new Producto(14L, "Periferico4", CategoriaProducto.PERIFERICOS, 45.95);
        Producto prod15 = new Producto(15L, "Periferico5", CategoriaProducto.PERIFERICOS, 59.95);

        Pedido ped1 = new Pedido(1L, c1, EstadoPedido.RECIBIDO, LocalDate.now().minusDays(5),null);
        Pedido ped2 = new Pedido(2L, c2, EstadoPedido.RECIBIDO, LocalDate.now().minusDays(20), null);
        Pedido ped3 = new Pedido(3L, c3, EstadoPedido.RECIBIDO, LocalDate.now().minusDays(7), null);
        Pedido ped4 = new Pedido(4L, c1, EstadoPedido.RECIBIDO, LocalDate.now().minusDays(2), null);

        ped1.setProductos(new HashSet<>( List.of(prod1, prod3, prod5, prod10)));
        ped2.setProductos(new HashSet<>( List.of(prod2, prod4, prod8, prod12)));
        ped3.setProductos(new HashSet<>( Set.of(prod11, prod13, prod14, prod15)));
        ped4.setProductos(new HashSet<>( List.of(prod6, prod7, prod9, prod1, prod2, prod10)));

        ArrayList<Pedido> pedidos = new ArrayList<>(List.of(ped1,ped2,ped3,ped4));

        //STREAMS ----------------------------------------------------------------------

        //1. Muestra los libros cuyo precio sea mayor de 20€
        Stream.of(prod1,prod2,prod3,prod4,prod5)
                .filter(pr -> pr.getPrecio() > 20)
                .forEach(System.out::println);






    }
}
