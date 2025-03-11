package tema6.reservasVuelos;

import java.util.ArrayList;
import java.util.UUID;

public class ReservaVuelo {

    private String id;
    private Vuelo vuelo;
    private ArrayList<Pasajero> pasajeros;
    private TipoTarifa tipoTarifa;
    private TipoAsiento tipoAsiento;

    public ReservaVuelo(Vuelo vuelo, TipoTarifa tipoTarifa, TipoAsiento tipoAsiento) {
        this.id = UUID.randomUUID().toString();
        this.vuelo = vuelo;
        this.tipoTarifa = tipoTarifa;
        this.tipoAsiento = tipoAsiento;
        this.pasajeros = new ArrayList<>();
    }

    public ReservaVuelo(Vuelo vuelo, ArrayList<Pasajero> pasajeros, TipoTarifa tipoTarifa, TipoAsiento tipoAsiento) {
        this.id = UUID.randomUUID().toString();
        this.vuelo = vuelo;
        this.pasajeros = pasajeros;
        this.tipoTarifa = tipoTarifa;
        this.tipoAsiento = tipoAsiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(TipoAsiento tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReservaVuelo{");
        sb.append("id='").append(id).append('\'');
        sb.append(", vuelo=").append(vuelo.getCodigo());
        sb.append(", dias para el vuelo=").append(vuelo.diasFaltanVuelo());
        sb.append(", billetes=").append(this.imprimirBilletes());
        sb.append('}');
        return sb.toString();
    }

    private void addPasajero(Pasajero pasajero) {
        if (!this.pasajeros.contains(pasajero)) {
            this.pasajeros.add(pasajero);
        }
    }

    public void removePasajero(Pasajero pasajero) {
        this.pasajeros.remove(pasajero);
    }

    /**
     * Devuelve todos los asientos de la reserva que han sido asignados a cada pasajero
     * @return
     */
    public ArrayList<Asiento> getAsientos() {
        ArrayList<Asiento> asientos = new ArrayList<>();
        for(Pasajero pasajero: this.pasajeros) {
            asientos.add(pasajero.getAsiento());
        }
        return asientos;
    }

    /**
     * Si hay disponibilidad de asientos, ocupa el asiento en el vuelo, y añade
     * el pasajero a la lista de pasajeros de la reserva
     * @param pasajero
     * @return
     */
    public boolean reservarAsiento(Pasajero pasajero) {
        if (this.vuelo.verificarDisponibilidad(this.tipoAsiento) <= 0) {
            return false;
        } else {
            Asiento asiento = this.vuelo.buscarAsientoDisponible(this.tipoAsiento);
            Pasajero nuevo = new Pasajero(pasajero); //Clonamos el pasajero
            this.getVuelo().ocuparAsiento(nuevo,asiento);
            this.addPasajero(nuevo); //Solo añadir pasajeros si podemos reservar asiento
            return true;
        }
    }

    public Double calcularPrecioTotal() {
        Double total = 0d;
        for(Asiento asiento: this.getAsientos()) {
            if (this.tipoTarifa.equals(TipoTarifa.CONFORT)) {
                total += 1.15 * asiento.calcularPrecio();
            }
            if (this.tipoTarifa.equals(TipoTarifa.OPTIMA)) {
                total += 1.1 * asiento.calcularPrecio();
            }
            if (this.tipoTarifa.equals(TipoTarifa.FLEXIBLE)) {
                total += 1.30 * asiento.calcularPrecio();
            }
        }
        return total;
    }

    public String imprimirBilletes() {
        StringBuffer sb = new StringBuffer();
        for(Pasajero pasajero: this.getPasajeros()) {
            sb.append(pasajero.getDniPass());
            sb.append(" -> ");
            sb.append(pasajero.getAsiento().getCodigo());
            sb.append("\n");
        }
        sb.append("Precio total = ");
        sb.append(this.calcularPrecioTotal());

        return sb.toString();
    }
}
