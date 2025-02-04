package tema5.ejerciciosClase;

public class TestPassword {
    public static void main(String[] args) {

        Password generador = new Password(7);
        System.out.println(generador.toString());
        System.out.println(generador.esFuerte());
    }
}
