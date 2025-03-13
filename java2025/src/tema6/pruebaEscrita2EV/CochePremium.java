package tema6.pruebaEscrita2EV;

public class CochePremium extends Coche {

    private boolean gps;
    private boolean seguroExtra;

    public CochePremium(Long id, String marca, String modelo, String matricula, int anio,
                        TipoCombustible combustible, Double precioBase, boolean gps, boolean seguroExtra) {
        super(id, marca, modelo, matricula, anio, combustible, TipoCoche.DEPORTIVO, precioBase);
        this.gps = gps;
        this.seguroExtra = seguroExtra;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isSeguroExtra() {
        return seguroExtra;
    }

    public void setSeguroExtra(boolean seguroExtra) {
        this.seguroExtra = seguroExtra;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CochePremium{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append(", gps=").append(gps);
        sb.append(", seguroExtra=").append(seguroExtra);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularPrecioAlquiler(int dias) {
        double total=0;

        if (this.gps)
            total += 10 * dias;
        if (this.seguroExtra)
            total += 15 * dias;

        return (dias * this.precioBase * 1.20) + total;
    }


}
