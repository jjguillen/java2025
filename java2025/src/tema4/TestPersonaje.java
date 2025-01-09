package tema4;

public class TestPersonaje {

    public static void main(String[] args) {

        Arma espada = new Arma("Espadón", Arma.TipoArma.ESPADA, 20);
        Personaje jugador1 = new Personaje("Gimli", 100, "hombre", "Barbaro");
        Personaje jugador2 = new Personaje();

        jugador1.setClase("Enano");
        jugador2.setVida(75);

        System.out.println(jugador1);
        System.out.println(jugador2.toString());

    }
}
