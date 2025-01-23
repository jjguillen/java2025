package tema4;

import java.util.ArrayList;

public class ConcesionarioBueno {

    private String nombre;
    private String direccion;
    private ArrayList<Coche> coches;

    public ConcesionarioBueno(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.coches = new ArrayList<Coche>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConcesionarioBueno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", coches=").append(coches);
        sb.append('}');
        return sb.toString();
    }

    public void nuevoCoche(Coche coche) {
        this.coches.add(coche);
    }

    public void venderCoche(Coche coche) {
        this.coches.remove(coche);
    }
}
