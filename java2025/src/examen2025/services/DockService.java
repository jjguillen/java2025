package examen2025.services;

import examen2025.models.Camion;
import examen2025.models.CamionFrigorifico;
import examen2025.models.Muelle;
import examen2025.models.ReservaMuelle;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class DockService {

    private List<Muelle> muelles;
    private Set<ReservaMuelle> reservas;

    public DockService() {
        this.muelles = new ArrayList<>(10);
        this.reservas = new HashSet<>();
    }

    public List<Muelle> getMuelles() {
        return muelles;
    }

    public Set<ReservaMuelle> getReservas() {
        return reservas;
    }

    public void addMuelle(Muelle muelle) {
        if (muelle != null && !muelles.contains(muelle)) {
            muelles.add(muelle);
        }
    }

    public boolean removeMuelle(Integer id) {
        return muelles.removeIf(muelle -> Objects.equals(muelle.getId(), id));
    }

    public Optional<Muelle> findFreeMuelle() {
        return muelles.stream()
                .filter(muelle -> !muelle.isOcupado())
                .findFirst();
    }

    public ReservaMuelle crearReserva(Camion c, LocalDateTime llegada) {
        if (this.findFreeMuelle().isPresent()) {
            Muelle muelle = this.findFreeMuelle().get();
            muelle.asignarCamion(c);
            Integer id = reservas.stream()
                    .mapToInt(ReservaMuelle::getId)
                    .max()
                    .orElse(0) + 1;
            ReservaMuelle reserva = new ReservaMuelle(id, c, muelle, llegada);
            reservas.add(reserva);
            return reserva;
        } else {
            throw new IllegalStateException("No hay muelles disponibles");
        }
    }

    public boolean liberarMuelle(Integer idReserva, LocalDateTime salida) {
        Optional<ReservaMuelle> reservaOpt = reservas.stream()
                .filter(reserva -> Objects.equals(reserva.getId(), idReserva))
                .findFirst();

        if (reservaOpt.isPresent()) {
            ReservaMuelle reserva = reservaOpt.get();
            reserva.registrarSalida(salida);
            return true;
        } else {
            return false;
        }
    }

    public List<ReservaMuelle> getReservasActivas() {
        return reservas.stream()
                .filter(reserva -> reserva.getSalida() == null)
                .toList();
    }

    public List<ReservaMuelle> getHistorial() {
        return reservas.stream()
                .filter(reserva -> reserva.getSalida() != null)
                .sorted(Comparator.comparing(ReservaMuelle::getLlegada).reversed())
                .toList();
    }

    public Map<Muelle, Long> getNumeroReservasPorMuelle() {
        return reservas.stream()
                .collect(Collectors.groupingBy(ReservaMuelle::getMuelle, Collectors.counting()));
    }

    public Map<DayOfWeek, Long> getConteoReservasPorDia() {
        return reservas.stream()
                .collect(Collectors.groupingBy(reserva -> reserva.getLlegada().getDayOfWeek(),
                        Collectors.counting()));
    }

    public List<ReservaMuelle> getReservasFrigoríficasOrdenadasPorLlegada(boolean asc) {
        return this.reservas.stream()
                .filter(reserva -> reserva.getCamion() instanceof CamionFrigorifico)
                .sorted(Comparator.comparing(ReservaMuelle::getLlegada, asc ? Comparator.naturalOrder() : Comparator.reverseOrder()))
                .toList();
    }

    public List<Camion> getCamionesMasPesados(Integer n) {
        return this.reservas.stream()
                .map(ReservaMuelle::getCamion)
                .sorted(Comparator.comparing(Camion::getPesoEstimado).reversed())
                .limit(n)
                .toList();
    }




}

