package examen2024;

import examen2024.io.DAOTicketSoporte;
import examen2024.services.ServicioSoporte;

public class App {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2024");

        ServicioSoporte ss = DAOTicketSoporte.loadCSV();
        ss.getTickets().forEach(System.out::println);

        ss.removeTecnico(2L);

        DAOTicketSoporte.saveCSV(ss);
    }
}
