package tema6.tienda;

import java.util.UUID;

public abstract class ProductoBase implements Producto {

    protected String codigo;
    protected String nombre;
    protected Double precio;
    protected Integer stock;

    public ProductoBase(String codigo, String nombre, Double precio, Integer stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public ProductoBase(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigo = UUID.randomUUID().toString();
    }

    public ProductoBase(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }

    @Override
    public Integer getStock() {
        return this.stock;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public void descontarStock(Integer cantidad) {
        this.stock -= cantidad;
    }

    @Override
    abstract public String getInfo();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ProductoBase that = (ProductoBase) o;
        return codigo.equals(that.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
