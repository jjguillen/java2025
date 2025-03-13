package tema6.pruebaEscrita2EV;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Enviable{

    private static long serialVersionUID = 0L;

    private Long id;
    private Cliente cliente;
    private Coche coche;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioTotal;

    public Alquiler(Cliente cliente, Coche coche, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = Alquiler.serialVersionUID++;
        this.cliente = cliente;
        this.coche = coche;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

        //Calculamos el precio total del alquiler
        long dias = ChronoUnit.DAYS.between(fechaInicio,fechaFin);
        this.precioTotal = this.coche.calcularPrecioAlquiler((int) dias);
    }


    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alquiler{");
        sb.append("id=").append(id);
        sb.append(", cliente=").append(cliente.getDni());
        sb.append(", coche=").append(coche.getMatricula());
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }

    public void cancelarAlquiler() {
        this.coche.setDisponible(true);
        this.coche = null;
    }


    @Override
    public String crearEmail() {
        StringBuffer sb = new StringBuffer();
        sb.append("Estimado/a ").append(this.cliente.getNombre())
                .append(" ").append(this.cliente.getApellidos()).append(",\n");
        sb.append("Le informamos que su alquiler del coche con matrícula ")
                .append(this.coche.getMatricula()).append(" y modelo")
                .append(this.coche.getMarca()).append(" ").append(this.coche.getModelo())
                .append("\n ha sido reservado para las fechas: ");
        sb.append(this.getFechaInicio()).append(" hasta ").append(this.getFechaFin()).append(".\n");
        sb.append("El precio total del alquiler es de ").append(this.getPrecioTotal()).append("€.\n");
        sb.append('\n');
        sb.append("Gracias por confiar en nosotros.");

        return sb.toString();
    }
}
