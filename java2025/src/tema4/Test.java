package tema4;

public class Test {
    public static void main(String[] args) {

        PersonajeVideo per = new PersonajeVideo(100,100, "JJ2", "Bárabaro");

        System.out.println(per.nombre + " - " + per.vida);
        per.quitarVida(35);
        System.out.println(per.nombre + " - " + per.vida);

        Jugador j1 = new Jugador(40,0,false);
        Jugador j2 = new Jugador(40,0,false);

        j1.setTirada(3);
        //j1.vida;

    }
}
