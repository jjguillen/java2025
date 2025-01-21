package tema4.ejerciciosclase;

public class TestIncidencia {
    public static void main(String[] args) {

        Incidencia inc1 = new Incidencia("Goteras en el salón del 5ºE");
        Incidencia inc2 = new Incidencia("Humedades en el 2ºB");
        Incidencia inc3 = new Incidencia("Gente bañándose en la piscina a horas intempestivas");

        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(Incidencia.getPendientes());
        inc2.resuelve("El pintor limpia la pared y luego pinta, hay que airear");
        System.out.println(inc2);
        System.out.println(Incidencia.getPendientes());



    }
}
