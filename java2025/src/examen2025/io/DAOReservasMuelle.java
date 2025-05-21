package examen2025.io;

import examen2024.models.Tecnico;
import examen2025.models.*;
import examen2025.services.DockService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class DAOReservasMuelle {

    public static DockService cargarCSV() {
        DockService ds = new DockService();

        //1. Cargar los muelles
        try {
            Files.lines(Paths.get("resources/examen2025/muelles.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Muelle mu = new Muelle(Integer.valueOf(tokens.get(0)), tokens.get(1));
                        ds.addMuelle(mu);
                    }) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //2. Cargar las reservas (incluyendo camiones asociados)
        try {
            Files.lines(Paths.get("resources/examen2025/reservas.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        // Obtenemos el muelle que viene en la reserva por id
                        Muelle muelle = ds.getMuelles().stream()
                                .filter(m -> m.getId().equals(Integer.valueOf(tokens.get(7))))
                                .findFirst()
                                .orElse(null);

                        // Según el tipo de camión creamon un CamionFrigorifico o un CamionPeligroso
                        String tipoCamion = tokens.get(8);
                        if (tipoCamion.equals("CAMIONFRIGORIFICO")) {
                            // Crear el camion frigorifico
                            CamionFrigorifico cf = new CamionFrigorifico(
                                tokens.get(1), tokens.get(2), tokens.get(3),
                                Double.valueOf(tokens.get(4)), Double.valueOf(tokens.get(9)) );

                            // Creamos la reserva con el camion y el muelle
                            ReservaMuelle rm = new ReservaMuelle(
                                    Integer.valueOf(tokens.get(0)), cf, muelle, LocalDateTime.parse(tokens.get(5))
                            );

                            // Asignamos el camión al muelle -- Marcamos el muelle como ocupado si no hay fecha de salida
                            if (tokens.get(6).isEmpty()) {
                                muelle.asignarCamion(cf);
                            } else {
                                rm.registrarSalida(LocalDateTime.parse(tokens.get(6)));
                            }

                            // Añadimos la reserva al servicio
                            ds.getReservas().add(rm);

                        } else if (tipoCamion.equals("CAMIONPELIGROSO")) {
                            // Crear el camion peligroso
                            CamionPeligroso cp = new CamionPeligroso(
                                    tokens.get(1), tokens.get(2), tokens.get(3),
                                    Double.valueOf(tokens.get(4)), tokens.get(9) );

                            // Creamos la reserva con el camion y el muelle
                            ReservaMuelle rm = new ReservaMuelle(
                                    Integer.valueOf(tokens.get(0)), cp, muelle, LocalDateTime.parse(tokens.get(5))
                            );

                            // Asignamos el camión al muelle -- Marcamos el muelle como ocupado si no hay fecha de salida
                            if (tokens.get(6).isEmpty()) {
                                muelle.asignarCamion(cp);
                            } else {
                                rm.registrarSalida(LocalDateTime.parse(tokens.get(6)));
                            }

                            // Añadimos la reserva al servicio
                            ds.getReservas().add(rm);
                        }
                    }) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ds;
    }


    public static void guardarCSV(DockService ds) {
        //Muelles
        try {
            Files.write(Paths.get("resources/examen2025/muelles.csv"),
                    ds.getMuelles().stream()
                            .map(muelle -> { //objeto Usuario -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(muelle.getId()).append(",");
                                sb.append(muelle.getUbicacion());
                                return sb.toString();
                            })
                            .toList(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            //Reservas
            Files.write(Paths.get("resources/examen2025/reservas.csv"),
                    ds.getReservas().stream()
                            .map(res -> { //objeto Usuario -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(res.getId()).append(",");
                                sb.append(res.getCamion().getMatricula()).append(",");
                                sb.append(res.getCamion().getEmpresaTransportista()).append(",");
                                sb.append(res.getCamion().getTipoMercancia()).append(",");
                                sb.append(res.getCamion().getPesoEstimado()).append(",");
                                sb.append(res.getLlegada()).append(",");
                                sb.append(res.getSalida() == null ? "" : res.getSalida()).append(",");
                                sb.append(res.getMuelle().getId()).append(",");
                                sb.append(res.getCamion().getClass().getSimpleName().toUpperCase()).append(",");
                                if (res.getCamion() instanceof CamionFrigorifico) {
                                    sb.append(((CamionFrigorifico) res.getCamion()).getTemperaturaObjetivo());
                                } else if (res.getCamion() instanceof CamionPeligroso) {
                                    sb.append(((CamionPeligroso) res.getCamion()).getClasePeligrosidad());
                                }
                                return sb.toString();
                            })
                            .toList(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
