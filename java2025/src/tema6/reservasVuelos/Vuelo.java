package tema6.reservasVuelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Vuelo {

    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Double precioBase;
    private Integer asientosDisponibles;
    private ArrayList<Asiento> asientos;

    public Vuelo(String origen, String destino, LocalDate fecha,
                 LocalTime hora, Double precioBase, Integer asientosDisponibles) {
        this.codigo = UUID.randomUUID().toString();
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precioBase = precioBase;
        this.asientosDisponibles = asientosDisponibles;

        //Generar los asientos del vuelo
        int numBusiness=0;
        this.asientos = new ArrayList<>(this.asientosDisponibles);
        for(int i=0; i < (this.asientosDisponibles*0.3); i++) {
           char letra = (char) (65 + (i % 4));
           AsientoBusiness ab = new AsientoBusiness((long) i, 200.0, i / 4,
                   Character.toString(letra), true);
           this.asientos.add(ab);
           numBusiness++;
        }

        for(int i=numBusiness; i < (this.asientosDisponibles*0.7) + numBusiness; i++) {
            char letra = (char) (65 + (i % 4));
            AsientoTurista ab = new AsientoTurista((long) i,
                    120.0, i / 4,
                    Character.toString(letra), true);
            this.asientos.add(ab);
        }

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(Integer asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vuelo{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", origen='").append(origen).append('\'');
        sb.append(", destino='").append(destino).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", asientosDisponibles=").append(asientosDisponibles);
        sb.append(", asientos=\n");
        for(Asiento as: this.asientos) {
            sb.append(as.toString());
            sb.append("\n");
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codigo, vuelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    /**
     * MÉTODOS EXTRA
     */

    /**
     * Contamos el número de asientos del mismo tipo que no tienen pasajero asignado
     * @param tipo
     * @return
     */
    public int verificarDisponibilidad(TipoAsiento tipo) {
        int contador=0;

        for(Asiento asiento: this.asientos) {
            if (asiento.getTipo().equals(tipo) && asiento.getPasajero() == null) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Devuelve el primer asiento del mismo tipo que no tiene pasajero asignado
     * @param tipo
     * @return
     */
    public Asiento buscarAsientoDisponible(TipoAsiento tipo) {
        for(Asiento asiento: this.asientos) {
            if (asiento.getTipo().equals(tipo) && asiento.getPasajero() == null) {
                return asiento;
            }
        }
        return null;
    }

    public boolean ocuparAsiento(Pasajero pasajero, Asiento asiento) {
        if (asiento.getPasajero() == null) { //disponible
            pasajero.setAsiento(asiento);
            asiento.setPasajero(pasajero);
            return true;
        }
        return false;
    }

    public void liberarAsiento(Asiento asiento) {
        asiento.getPasajero().setAsiento(null); //Importante esto primero
        asiento.setPasajero(null);
    }

    public Long diasFaltanVuelo() {
        //Period.between --> num años, num meses, num dias
        return ChronoUnit.DAYS.between(LocalDate.now(), this.getFecha());
    }

    public ArrayList<Pasajero> getPasajeros() {
        ArrayList<Pasajero> pasajeros = new ArrayList<>();
        for(Asiento asiento: this.asientos) {
            if (asiento.getPasajero() != null) {
                pasajeros.add(asiento.getPasajero());
            }
        }
        return pasajeros;
    }

}
