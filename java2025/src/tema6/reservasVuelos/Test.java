package tema6.reservasVuelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Atrapame atrap = new Atrapame();
        for(int i=0; i < 1000; i++) {
            Vuelo v = new Vuelo("Almería", "Dublín",
                    LocalDate.of(2025, 4, 26),
                    LocalTime.of(10, 0), 120.0,
                    100);
            atrap.addVuelo(v);
        }

        Vuelo vuelo = atrap.getVuelos().get(400);

        Pasajero ps1 = new Pasajero(1l,"ps1","aps1","11223344-A","ps1@gmail.com",
                "sucasa","Vera","España","234242424",
                "Vegano","Ninguna", null);

        Pasajero ps2 = new Pasajero(2l,"ps2","aps2","11223344-B","ps2@gmail.com",
                "sucasa","Vera","España","234242424",
                "Vegetariano","Ninguna", null);

        Pasajero ps3 = new Pasajero(3l,"ps3","aps3","11223344-C","ps3@gmail.com",
                "sucasa","Vera","España","234242424",
                "Ninguna","Ninguna", null);

        Pasajero ps4 = new Pasajero(4l,"ps4","aps4","11223344-D","ps4@gmail.com",
                "sucasa","Vera","España","234242424",
                "Ninguna","Ninguna", null);

        Pasajero ps5 = new Pasajero(5l,"ps5","aps5","11223344-E","ps5@gmail.com",
                "sucasa","Vera","España","234242424",
                "Ninguna","Ninguna", null);

        atrap.crearReserva(vuelo, new ArrayList<Pasajero>(List.of(ps1,ps2)),
                TipoTarifa.OPTIMA,TipoAsiento.BUSINESS);
        atrap.crearReserva(vuelo, new ArrayList<Pasajero>(List.of(ps3)),
                TipoTarifa.CONFORT,TipoAsiento.TURISTA);
        atrap.crearReserva(vuelo, new ArrayList<Pasajero>(List.of(ps4,ps5)),
                TipoTarifa.CONFORT,TipoAsiento.TURISTA);

        System.out.println(vuelo);
        System.out.println(atrap.getReservas());


    }
}
