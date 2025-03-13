package tema6.tienda;

public interface Producto {
    String getCodigo();
    String getNombre();
    Double getPrecio();
    Integer getStock();
    void setPrecio(Double precio);
    void setStock(Integer stock);
    void descontarStock(Integer cantidad);
    String getInfo();

}
