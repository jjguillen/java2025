package tema6.reservasVuelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atrapame {

    private ArrayList<Vuelo> vuelos;
    private ArrayList<ReservaVuelo> reservas;

    public Atrapame() {
        this.reservas = new ArrayList<>();
        this.vuelos = new ArrayList<>();
    }

    public void addVuelo(Vuelo v) {
        this.vuelos.add(v);
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public ArrayList<ReservaVuelo> getReservas() {
        return reservas;
    }

    public boolean crearReserva(Vuelo vuelo, ArrayList<Pasajero> pasajeros,
                                TipoTarifa tTarifa, TipoAsiento tAsiento) {

        if (vuelo.verificarDisponibilidad(tAsiento) >= pasajeros.size()) {
            ReservaVuelo reserva = new ReservaVuelo(vuelo, tTarifa, tAsiento);
            for(Pasajero pasajero: pasajeros) {
                reserva.reservarAsiento(pasajero);
            }
            this.reservas.add(reserva);
            return true;

        } else {
            return false;
        }
    }

    public void cancelarReserva(String id) {
        for(ReservaVuelo reserva: this.reservas) {
            if (reserva.getId().equals(id)) {
                //Liberar asientos del vuelo
                for(Asiento asiento: reserva.getAsientos()) {
                    reserva.getVuelo().liberarAsiento(asiento);
                }

                this.reservas.remove(reserva); //A partir de la versión 21 de Java
                break;
            }
        }
    }

    public ArrayList<Vuelo> buscarVuelos(String destino) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getDestino().equalsIgnoreCase(destino)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getFecha().equals(fecha)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha, String destino) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getFecha().equals(fecha) &&
                    vuelo.getDestino().equalsIgnoreCase(destino)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    public ArrayList<ReservaVuelo> buscarReservas(String dni) {
        ArrayList<ReservaVuelo> reservasFound = new ArrayList<>();
        for(ReservaVuelo reserva: this.reservas) {
            Pasajero ps = new Pasajero();
            ps.setDniPass(dni);
            if (reserva.getPasajeros().contains(ps)) {
                reservasFound.add(reserva);
            }
        }

        return reservasFound;
    }






}
