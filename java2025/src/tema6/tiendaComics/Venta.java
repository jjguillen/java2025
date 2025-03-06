package tema6.tiendaComics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {

    private Cliente cliente;
    private LocalDate fechaCompra;

    private ArrayList<LineaCompra> lineas;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.fechaCompra = LocalDate.now();
        this.lineas = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public ArrayList<LineaCompra> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaCompra> lineas) {
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Venta{");
        sb.append("cliente=").append(cliente);
        sb.append(", fechaCompra=").append(fechaCompra);
        sb.append(", lineas=").append(lineas);
        sb.append('}');
        return sb.toString();
    }

    public void addLinea(LineaCompra lc) {
        int posicion = this.lineas.indexOf(lc);
        if (posicion >= 0) { //Encontrado
            LineaCompra linea = this.lineas.get(posicion);
            linea.setCantidad(linea.getCantidad() + lc.getCantidad()); //Actualizar cantidad
        } else {
            this.lineas.add(lc);
        }
    }


}
