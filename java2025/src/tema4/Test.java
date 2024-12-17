package tema4;
import tema4.Personaje;

public class Test {
    public static void main(String[] args) {

        Personaje per = new Personaje(100,100, "JJ2", "Bárabaro");

        System.out.println(per.nombre + " - " + per.vida);
        per.quitarVida(35);
        System.out.println(per.nombre + " - " + per.vida);

        Jugador j1 = new Jugador(40,0,false);
        Jugador j2 = new Jugador(40,0,false);

        j1.setTirada(3);
        //j1.vida;

    }
}
