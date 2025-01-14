package tema4;

public class TestArma {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada de fuego", Arma.TipoArma.ESPADA, 25);
        Arma martillo = new Arma("Martillo maldito", Arma.TipoArma.MARTILLO, 40);

        Personaje soldado = new Personaje("Ariel", 120, "Hombre", "Soldado", martillo);

        System.out.println(soldado);

        espada.golpear(soldado);

        System.out.println(espada);
        System.out.println(martillo);
        System.out.println(soldado);

    }


}
