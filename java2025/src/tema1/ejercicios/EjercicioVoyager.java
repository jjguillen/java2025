package tema1.ejercicios;

public class EjercicioVoyager {

    public static void main(String[] args) {
        //Velocidad = 58000km/h   -- v = e / t
        //Año 1977

        //Distancia ?
        double velocity = 58000;
        double years = 2024 - 1977;
        double hours = years * 365 * 24;
        double distance = velocity * hours;

        System.out.println("La Voyager está a " + distance + " kilómetros");

    }
}
