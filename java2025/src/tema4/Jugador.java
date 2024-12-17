package tema4;

public class Jugador {

    private int vida;
    private int tirada;
    private boolean escudo;

    public Jugador(int vida, int tirada, boolean escudo) {
        this.vida = vida;
        this.tirada = tirada;
        this.escudo = escudo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getTirada() {
        return tirada;
    }

    public void setTirada(int tirada) {
        this.tirada = tirada;
    }

    public boolean isEscudo() {
        return escudo;
    }

    public void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }
}
