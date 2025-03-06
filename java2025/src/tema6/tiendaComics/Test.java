package tema6.tiendaComics;

import java.time.LocalDate;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Autor d1 = new Autor("Autor1", "Apellidos1", "aut1@gmail.com",
                LocalDate.of(2000,2,8), Rol.DIBUJANTE);
        Autor d2 = new Autor("Autor2", "Apellidos2", "aut2@gmail.com",
                LocalDate.of(1990,4,18), Rol.DIBUJANTE);
        Autor g1 = new Autor("Autor3", "Apellidos3", "aut3@gmail.com",
                LocalDate.of(1995,8,28), Rol.GUIONISTA);
        Autor g2 = new Autor("Autor4", "Apellidos4", "aut4@gmail.com",
                LocalDate.of(2001,1,7), Rol.GUIONISTA);

        Anime c1 = new Anime("Anime1", LocalDate.of(2010,2,4),
                15.85, 125, 10, 2, "Loren Ipsum" );
        Anime c2 = new Anime("Anime2", LocalDate.of(2005,2,4),
                18.85, 95, 8, 42, "Loren Ipsum" );
        NovelaGrafica c3 = new NovelaGrafica("NG1", LocalDate.of(2001,5,5),
                35.99, 269, 5,"Loren Ipsum ...");
        NovelaGrafica c4 = new NovelaGrafica("NG2", LocalDate.of(2008,3,5),
                41.95, 323, 10, "Loren Ipsum ...");

        //Añadir autor a los comics
        c1.addAutor(d2);
        c1.addAutor(g1);
        c2.addAutor(d1);
        c3.addAutor(g2);
        c3.addAutor(d1);
        c4.addAutor(g2);
        c4.addAutor(d1);
        c4.addAutor(d2);

        //Añadir comics a la tienda
        TiendaComics tc = new TiendaComics();
        tc.addComics(List.of(c1,c2,c3,c4));

        tc.listarComics();

        System.out.println("------------------------");
        System.out.println(c1);
        System.out.println(c3);

        //COMPRA 1 -----------------------------------------------
        Cliente cl1 = new Cliente("645654564", "cl1@gmail.com",
                "Manolo López", "Su casa, Vera", "64564564564");

        LineaCompra lc1 = new LineaCompra(c1, 2);
        LineaCompra lc2 = new LineaCompra(c2, 5);
        LineaCompra lc3 = new LineaCompra(c2, 2);
        Venta v1 = new Venta(cl1);
        v1.addLinea(lc1);
        v1.addLinea(lc2);
        v1.addLinea(lc3);

        try {
            tc.addVenta(v1);
        } catch (SinStockException e) {
            System.out.println(e.getMessage());
        }

        //COMPRA 2 ------------------------------------------------
        Cliente cl2 = new Cliente("464654564", "cl2@gmail.com",
                "Isa Pérez", "Su casa, Cuevas", "999999");

        LineaCompra lc4 = new LineaCompra(c1, 2);
        LineaCompra lc5 = new LineaCompra(c2, 1);
        Venta v2 = new Venta(cl2);
        v2.addLinea(lc4);
        v2.addLinea(lc5);

        try {
            tc.addVenta(v2);
        } catch (SinStockException e) {
            System.out.println(e.getMessage());
        }

        tc.listarVentas();

        System.out.println("-------------------");
        System.out.println(tc.buscar(LocalDate.of(2002,1,1),
                LocalDate.of(2007,1,1)));


    }
}
