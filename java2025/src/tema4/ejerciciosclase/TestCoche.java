package tema4.ejerciciosclase;

public class TestCoche {
    public static void main(String[] args) {
        Coche tucoche = new Coche(4);
        Coche micoche = new Coche();
        micoche.acelera(3);
        micoche.acelera(4);
        System.out.println(micoche.getVelocidad());
    }
}
