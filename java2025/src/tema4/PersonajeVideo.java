package tema4;

public class PersonajeVideo {

    public int vida;
    public int mana;
    public String nombre;
    public String clase;

    public PersonajeVideo(int vida, int mana, String nombre, String clase) {
        this.vida = vida;
        this.mana = mana;
        this.nombre = nombre;
        this.clase = clase;
    }

    public void quitarVida(int vida) {
        this.vida -= vida;
    }

}
