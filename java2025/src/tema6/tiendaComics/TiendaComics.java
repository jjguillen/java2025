package tema6.tiendaComics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TiendaComics {

    private ArrayList<Comic> comics;
    private ArrayList<Venta> ventas;

    public TiendaComics() {
        this.ventas = new ArrayList<>();
        this.comics = new ArrayList<>();
    }

    public boolean addComic(Comic comic) {
        if (!this.comics.contains(comic)) {
            this.comics.add(comic);
            return true;
        } else {
            return false; //repetido
        }
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void addComics(List<Comic> comics) {
        this.comics.addAll(comics);
    }

    public boolean removeComic(Comic comic) {
        return this.comics.remove(comic);
    }

    public void listarComics() {
        for(Comic comic: this.comics) {
            System.out.print(comic.getTitulo() + ": ");
            for(Autor autor: comic.getAutores()) {
                System.out.print(autor.getNombre() + " "
                        + autor.getApellidos()
                        + " " + autor.getRol()
                        + ", ");
            }
            System.out.println();
        }
    }


    /**
     * Añadir una nueva venta, hay que comprobar que haya stock de cada comic
     */
    public boolean addVenta(Venta venta) throws SinStockException {
        //Comprobar num de ejemplares de cada lineacompra
        for(LineaCompra linea: venta.getLineas()) {
            if (linea.getComic().getNumEjemplares() < linea.getCantidad()) {
                return false; //No hay ejemplares de alguno de los comics del pedido
            }
        }

        //Hay stock de todos
        this.ventas.add(venta);

        //Decrementar el número de ejemplares
        //Si de algún comic se queda a cero de ejemplares lanzamos excepción
        int numEjemplares;
        for(LineaCompra linea: venta.getLineas()) {
            numEjemplares = linea.getComic().getNumEjemplares();
            //Decrementar numEjemplares con la cantidad pedida
            linea.getComic().setNumEjemplares(numEjemplares - linea.getCantidad());

            if (linea.getComic().getNumEjemplares() == 0) {
                throw new SinStockException("Nos hemos quedado sin stock del comic "
                        + linea.getComic().getTitulo());
            }
        }



        return true;
    }

    public void listarVentas() {
        System.out.println("VENTAS---------------------------");
        for(Venta venta: this.ventas) {
            System.out.println(venta.getCliente().getEmail());
            System.out.println(venta.getFechaCompra());
            for(LineaCompra linea: venta.getLineas()) {
                System.out.println(linea.getComic().getTitulo() + " - "
                        + linea.getCantidad());
            }
        }

    }

    /**
     * Buscar cómics por fecha de edición, entre un rango
     */
    public ArrayList<Comic> buscar(LocalDate desde, LocalDate hasta) {
        ArrayList<Comic> encontrados = new ArrayList<>();

        for(Comic comic: this.comics) {
            if (comic.getFecha().isAfter(desde) &&
                comic.getFecha().isBefore(hasta)) {
                encontrados.add(comic);
            }
        }

        return encontrados;
    }



}
