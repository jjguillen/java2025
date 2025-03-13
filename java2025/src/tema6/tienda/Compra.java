package tema6.tienda;

import java.time.LocalDate;

public class Compra {
    private LocalDate fecha;
    private Producto producto;
    private Integer cantidad;
    private Double precioTotal;

    public Compra(Producto producto, Integer cantidad) {
        this.fecha = LocalDate.now();
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = this.producto.getPrecio() * this.cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("fecha=").append(fecha);
        sb.append(", producto=").append(producto.getInfo());
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }
}
