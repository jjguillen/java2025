package examen2024.io;

import examen2024.models.EstadoTicket;
import examen2024.models.Tecnico;
import examen2024.models.TicketSoporte;
import examen2024.models.Usuario;
import examen2024.services.ServicioSoporte;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DAOTicketSoporte {


    public static ServicioSoporte loadCSV() {

        //OBJETO SERVICIO SOPORTE QUE DEVOLVERMOS CON TODA LA INFO CARGADA
        ServicioSoporte ss = new ServicioSoporte();

        //1. Cargar usuarios
        //List<Usuario> usuarios;
        try {
            Files.lines(Paths.get("java2025/resources/examen2024/usuarios.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Usuario user = new Usuario(
                                Long.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                LocalDate.parse(tokens.get(5))
                        );
                        return user;
                    }) //Stream<Usuario>
                    .forEach(ss::addUsuario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //ss.setUsuarios(new HashSet<>(usuarios));

        //2. Cargar técnicos
        try {
            Files.lines(Paths.get("java2025/resources/examen2024/tecnico.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Tecnico tec = new Tecnico(
                                Long.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                Tecnico.Especialidad.valueOf(tokens.get(5)),
                                Double.valueOf(tokens.get(6))
                        );
                        ss.addTecnico(tec);
                    }) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //3. Cargar Tickets Soporte
        try {
            Files.lines(Paths.get("java2025/resources/examen2024/tickets.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        EstadoTicket estado = EstadoTicket.valueOf(tokens.get(3));
                        //Distinguir si hay que poner fecha de finalización o no
                        LocalDate fechaFin = null;
                        if (estado.equals(EstadoTicket.RESUELTO)) {
                            fechaFin = LocalDate.parse(tokens.get(2));
                        }

                        TicketSoporte ts = new TicketSoporte(
                                Long.valueOf(tokens.get(0)),
                                LocalDate.parse(tokens.get(1)),
                                fechaFin,
                                estado,
                                Integer.valueOf(tokens.get(4)),
                                ss.findUsuarioById(Long.valueOf(tokens.get(5))),
                                ss.findTecnicoById(Long.valueOf(tokens.get(6))),
                                tokens.get(7)
                        );

                        ss.addTicketSoporte(ts);
                    }) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ss;

    }

    public static void saveCSV(ServicioSoporte ss) {
        try {
            //Usuarios
            Files.write(Paths.get("java2025/resources/examen2024/usuarios.csv"),
                    ss.getUsuarios().stream()
                            .map(g -> { //objeto Usuario -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getNombre()).append(",");
                                sb.append(g.getApellidos()).append(",");
                                sb.append(g.getEmail()).append(",");
                                sb.append(g.getMovil()).append(",");
                                sb.append(g.getFechaAlta());
                                return sb.toString();
                            })
                            .toList());

            //Técnicos
            Files.write(Paths.get("java2025/resources/examen2024/tecnico.csv"),
                    ss.getTecnicos().stream()
                            .map(g -> { //objeto Tecnico -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getNombre()).append(",");
                                sb.append(g.getApellidos()).append(",");
                                sb.append(g.getEmail()).append(",");
                                sb.append(g.getMovil()).append(",");
                                sb.append(g.getEspecialidad()).append(",");
                                sb.append(g.getValoracion());
                                return sb.toString();
                            })
                            .toList());

            //Tickets
            Files.write(Paths.get("java2025/resources/examen2024/tickets.csv"),
                    ss.getTickets().stream()
                            .map(g -> { //objeto Tecnico -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getFechaCreacion()).append(",");
                                if (g.getFechaFinalizacion() != null) {
                                    sb.append(g.getFechaFinalizacion()).append(",");
                                } else{
                                    sb.append(",");
                                }
                                sb.append(g.getEstado()).append(",");
                                sb.append(g.getPrioridad()).append(",");
                                sb.append(g.getUsuario().getId()).append(",");
                                sb.append(g.getTecnico().getId()).append(",");
                                if (g.getComentarios() != null) {
                                    sb.append(g.getComentarios());
                                }
                                return sb.toString();
                            })
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
