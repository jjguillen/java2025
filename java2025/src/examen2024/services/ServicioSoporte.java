package examen2024.services;

import examen2024.models.EstadoTicket;
import examen2024.models.Tecnico;
import examen2024.models.TicketSoporte;
import examen2024.models.Usuario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class ServicioSoporte {

    private ArrayList<TicketSoporte> tickets;
    private HashSet<Tecnico> tecnicos;
    private HashSet<Usuario> usuarios;

    public ServicioSoporte() {
        tickets = new ArrayList<>();
        tecnicos = new HashSet<>();
        usuarios = new HashSet<>();
    }

    public ArrayList<TicketSoporte> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<TicketSoporte> tickets) {
        this.tickets = tickets;
    }

    public HashSet<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(HashSet<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * MÉTODOS DE AÑADIR Y ELIMINAR OBJETOS EN COLECCIONES -----------------------------
     */

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void addTecnico(Tecnico tecnico) {
        this.tecnicos.add(tecnico);
    }

    public void removeUsuario(Long id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
        tickets.removeIf(ticket -> ticket.getUsuario().getId().equals(id));
    }

    public void removeTecnico(Long id) {
        tecnicos.removeIf(tecnico -> Objects.equals(tecnico.getId(), id));
        tickets.removeIf(ticket -> ticket.getTecnico().getId().equals(id));
    }

    public void addTicketSoporte(TicketSoporte tiso) {
        tickets.add(tiso);
    }

    public void addTicketSoporte(LocalDate fechaCreacion, LocalDate fechaFinalizacion,
                   Integer prioridad, String comentarios, Usuario usuario, Tecnico tecnico) {

        //Sacamos el mayor id de todos los tickets
        Long idMaximo = tickets.stream().mapToLong(TicketSoporte::getId).max().orElse(0L);
        //Creamos el TicketSoporte
        TicketSoporte ts = new TicketSoporte(idMaximo+1, fechaCreacion, fechaFinalizacion,
                EstadoTicket.ABIERTO, prioridad, usuario, tecnico, comentarios);
        //Lo añadimos a los Tickets
        tickets.add(ts);
    }

    public void removeTicketSoporte(Long id) {
        tickets.removeIf(ticket -> ticket.getId().equals(id));
    }

    /**
     * MÉTODOS DE CONSULTA SOBRE LAS COLECCIONES ---------------------------------
     */

    public Tecnico findTecnicoById(Long id) {
        return tecnicos.stream()
                .filter(tecnico -> tecnico.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Usuario findUsuarioById(Long id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Tecnico> getTecnicosByEspecialidad(Tecnico.Especialidad esp) {
        return tecnicos.stream()
                .filter(tecnico -> tecnico.getEspecialidad().equals(esp))
                .toList();
    }

    public Map<Tecnico.Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad() {
        //Obtener técnicos agrupados por especialidad
        Map<Tecnico.Especialidad, List<Tecnico>> tecs = tecnicos.stream()
                .collect(Collectors.groupingBy(Tecnico::getEspecialidad));
        //Ordenar cada lista de técnicos por valoración
        tecs.forEach((k,v) -> {
           v.sort(Comparator.comparing(Tecnico::getValoracion));
        });
        //Devolvemos el mapa con las listas ordenadas
        return tecs;
    }

    public TicketSoporte findTicketSoporteById(Long id) {
        return tickets.stream()
                .filter(ticket -> ticket.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<TicketSoporte> getTicketsAbiertos() {
        return tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(EstadoTicket.ABIERTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion).reversed())
                .toList();
    }

    public List<TicketSoporte> getTicketsCerrados() {
        return tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(EstadoTicket.RESUELTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion).reversed())
                .toList();
    }

    public List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico() {
        return tickets.stream()
                .filter(ticket ->
                        ticket.getTecnico().getEspecialidad().equals(Tecnico.Especialidad.INFORMATICA))
                .filter(ticket -> ticket.getEstado().equals(EstadoTicket.ENPROCESO))
                .toList();
    }

    public Long getTotalTicketsResueltos(Integer prioridad) {
        return tickets.stream()
                .filter(t -> t.getPrioridad().equals(prioridad))
                .filter(t -> t.getEstado().equals(EstadoTicket.RESUELTO))
                .count();
    }

    public Set<TicketSoporte> findTicketsByEstadoAndPrioridad(EstadoTicket estado, Integer prioridad) {
        return tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(estado))
                .filter(ticket -> ticket.getPrioridad().equals(prioridad))
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public Map<Tecnico.Especialidad, List<Tecnico>> findTecnicosInTickets() {
        return tickets.stream()
                .map(TicketSoporte::getTecnico)
                .collect(Collectors.groupingBy(Tecnico::getEspecialidad));
    }

    public Set<Tecnico> findTecnicosRapidos() {
        return tickets.stream()
                .filter(t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) <= 5
                )
                .map(TicketSoporte::getTecnico)
                .collect(Collectors.toSet());
    }

    public Long getTotalTicketsRetardados() {
        return tickets.stream()
                .filter(t -> t.getEstado().equals(EstadoTicket.RESUELTO))
                .filter(t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) > 7
                )
                .count();
    }

    public Double getMediaResolucionTickets(Integer prioridad) {
        return tickets.stream()
                .filter(t -> t.getPrioridad().equals(prioridad))
                .filter(t -> t.getEstado().equals(EstadoTicket.RESUELTO))
                .mapToLong( t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion())
                )
                .average()
                .orElse(0.0);
    }

    public Map<Tecnico, Double> getMediaResolucionTicketsGroupByTecnico() {
        return tickets.stream()
                .filter(t -> t.getEstado().equals(EstadoTicket.RESUELTO))
                .collect(Collectors.groupingBy(TicketSoporte::getTecnico,
                        Collectors.averagingLong(t ->
                                ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion())
                        )
                ));
    }

    public Boolean areAllTicketsFinishedLessThanTenDays() {
        return tickets.stream()
                .allMatch(t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) < 10
                );
    }

    public Optional<TicketSoporte> getFirstTicketSolvedOneDay() {
        return tickets.stream()
                .filter(t -> t.getEstado().equals(EstadoTicket.RESUELTO))
                .filter(t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) == 1
                )
                .findFirst();
    }





}
