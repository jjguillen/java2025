package tema4;

public class TestPersonaje {

    public static void main(String[] args) {

        Arma espada = new Arma("Espadón", Arma.TipoArma.ESPADA, 20);
        Arma martillo = new Arma("Martillaco", Arma.TipoArma.MARTILLO, 40);

        Personaje jugador1 = new Personaje("Gimli", 100, "hombre", "Barbaro", martillo);

        Personaje jugador2 = new Personaje(); //vida 10
        jugador2.setArma(espada);

        jugador1.setClase("Enano");
        jugador2.setVida(75);

        System.out.println(jugador1);
        System.out.println(jugador2);

        jugador1.golpear(jugador2);

        System.out.println(jugador2);

    }
}
