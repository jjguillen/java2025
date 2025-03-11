package tema6.reservasVuelos;

public class AsientoBusiness extends Asiento {

    private boolean comida;

    public AsientoBusiness(Long id, Double precioBase, Integer fila, String letra,
                           boolean comida) {
        super(id, precioBase, fila, letra);
        this.tipo = TipoAsiento.BUSINESS;
        this.comida = comida;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoBusiness{");
        sb.append("codigo=").append(this.getCodigo());
        sb.append(" pasajero=").append(this.getPasajero() == null ? "X" : this.getPasajero().getDniPass());
        sb.append(", precio=").append(this.calcularPrecio());
        sb.append(", tipo=").append(tipo);
        sb.append(", tiene comida=").append(comida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularPrecio() {
        return this.comida
                ? (this.precioBase * 1.25 + 30)
                : (this.precioBase * 1.25);
    }
}
