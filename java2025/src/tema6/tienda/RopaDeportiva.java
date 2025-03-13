package tema6.tienda;

public class RopaDeportiva extends ProductoBase {

    private String talla;
    private TipoRopa tipoRopa;

    public RopaDeportiva(String codigo, String nombre, Double precio, Integer stock,
                         String talla, TipoRopa tipoRopa) {
        super(codigo, nombre, precio, stock);
        this.talla = talla;
        this.tipoRopa = tipoRopa;
    }

    public RopaDeportiva(String nombre, Double precio, Integer stock, String talla, TipoRopa tipoRopa) {
        super(nombre, precio, stock);
        this.talla = talla;
        this.tipoRopa = tipoRopa;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public TipoRopa getTipoRopa() {
        return tipoRopa;
    }

    public void setTipoRopa(TipoRopa tipoRopa) {
        this.tipoRopa = tipoRopa;
    }

    @Override
    public String getInfo() {
        final StringBuffer sb = new StringBuffer("RopaDeportiva [");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append(", talla='").append(talla).append('\'');
        sb.append(", tipoRopa=").append(tipoRopa);
        sb.append(']');
        return sb.toString();
    }

}
