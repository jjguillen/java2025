package tema7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Ejemplo {

    public static void main(String[] args) {

        Map<Integer, String> mapa;
        Examen examen = new Examen(LocalDate.of(2025,3,14),
                9.0, "Programación");

        Nota<String, Examen> nota1 = new Nota<>("Javier", examen);
        System.out.println(nota1);
        Nota<String, String> otra = new Nota<>("pepe","nota");
        System.out.println(otra);

        ArrayList<String> palabras;
    }
}
