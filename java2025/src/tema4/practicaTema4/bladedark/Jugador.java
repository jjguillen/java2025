package tema4.practicaTema4.bladedark;

import tema4.practicaTema4.magic.Hechizo;
import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private Integer vida;

    private Hechizo hechizo;

    public Jugador(String nombre, Integer vida, Hechizo hechizo) {
        this.nombre = nombre;
        this.vida = vida;
        this.hechizo = hechizo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Hechizo getHechizo() {
        return hechizo;
    }

    public void setHechizo(Hechizo hechizo) {
        this.hechizo = hechizo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", hechizo=").append(hechizo);
        sb.append('}');
        return sb.toString();
    }

    public boolean lanzarHechizo(Jugador jugador) {
        jugador.setVida(jugador.getVida() - this.getHechizo().getPotencia());
        if (jugador.getVida() < 0) {
            return true;
        } else return false;
    }
}
