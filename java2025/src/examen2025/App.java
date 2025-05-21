package examen2025;

import examen2025.io.DAOReservasMuelle;
import examen2025.models.CamionFrigorifico;
import examen2025.models.CamionPeligroso;
import examen2025.models.Muelle;
import examen2025.services.DockService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        DockService ds = DAOReservasMuelle.cargarCSV();

        Scanner sc = new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("1. Mostrar muelles\n" +
                    "2. Listar reservas activas \n" +
                    "3. Registrar llegada camión\n" +
                    "4. Registrar salida camión\n" +
                    "5. Mostrar historial de reservas\n" +
                    "6. Mostrar ocupación por muelle\n" +
                    "7. Salir");

            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    ds.getMuelles().forEach(System.out::println);
                    break;
                case 2:
                    ds.getReservasActivas().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Introduce la matrícula del camión:");
                    String matricula = sc.nextLine();
                    System.out.println("Introduce empresa transportista:");
                    String empresa = sc.nextLine();
                    System.out.println("Introduce tipo de mercancía:");
                    String tipoMercancia = sc.nextLine();
                    System.out.println("Introduce peso estimado:");
                    Double pesoEstimado = Double.parseDouble(sc.nextLine());
                    System.out.println("Tipo de camión (FRIGORIFICO/PELIGROSO):");
                    String tipoCamion = sc.nextLine();
                    switch (tipoCamion) {
                        case "FRIGORIFICO":
                            System.out.println("Introduce temperatura:");
                            Double temperatura = Double.parseDouble(sc.nextLine());
                            CamionFrigorifico cf = new CamionFrigorifico(matricula, empresa, tipoMercancia, pesoEstimado, temperatura);
                            ds.crearReserva(cf, LocalDateTime.now());
                            break;
                        case "PELIGROSO":
                            System.out.println("Introduce tipo de mercancía peligrosa:");
                            String tipoMercanciaPeligrosa = sc.nextLine();
                            CamionPeligroso cp = new CamionPeligroso(matricula, empresa, tipoMercancia, pesoEstimado, tipoMercanciaPeligrosa);
                            ds.crearReserva(cp, LocalDateTime.now());
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Introduce id de reserva");
                    Integer idReserva = Integer.parseInt(sc.nextLine());
                    ds.getReservas().stream()
                            .filter( r -> r.getSalida() == null)
                            .filter(r -> r.getId().equals(idReserva))
                            .findFirst()
                            .ifPresent(reserva -> {
                                reserva.registrarSalida(LocalDateTime.now());
                            });
                    break;
                case 5:
                    ds.getHistorial().forEach(System.out::println);
                    break;
                case 6:
                    ds.getNumeroReservasPorMuelle().forEach((k,v) -> {
                        System.out.println(k.getUbicacion() + " tiene " + v + " reservas");
                    });
                    break;
                case 7:
                    DAOReservasMuelle.guardarCSV(ds);
                    break;

            }

        } while (opcion != 7);



    }
}
