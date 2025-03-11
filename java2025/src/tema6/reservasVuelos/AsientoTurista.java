package tema6.reservasVuelos;

public class AsientoTurista extends Asiento {

    private boolean isVentana;

    public AsientoTurista(Long id, Double precioBase, Integer fila, String letra,
                          boolean isVentana) {
        super(id, precioBase, fila, letra);
        this.tipo = TipoAsiento.TURISTA;
        this.isVentana = isVentana;
    }

    public boolean isVentana() {
        return isVentana;
    }

    public void setVentana(boolean ventana) {
        isVentana = ventana;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoTurista{");
        sb.append("codigo=").append(this.getCodigo());
        sb.append(" pasajero=").append(this.getPasajero() == null ? "X" : this.getPasajero().getDniPass());
        sb.append(", precio=").append(this.calcularPrecio());
        sb.append(", tipo=").append(tipo);
        sb.append(", isVentana=").append(isVentana);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularPrecio() {
        return this.isVentana ? (this.precioBase + 10) : this.precioBase;
    }
}
