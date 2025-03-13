package tema6.pruebaEscrita2EV;

public class CocheEstandar extends Coche {

    private boolean aireAcondicionado;

    public CocheEstandar(Long id, String marca, String modelo, String matricula, int anio,
                         TipoCombustible combustible, Double precioBase, boolean aireAcondicionado) {
        super(id, marca, modelo, matricula, anio, combustible, TipoCoche.SUV, precioBase);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CocheEstandar{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append(", aireAcondicionado=").append(aireAcondicionado);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularPrecioAlquiler(int dias) {
        if (this.aireAcondicionado) {
            return (dias * this.precioBase) + (5 * dias);
        } else
            return (dias * this.precioBase);
    }

}
