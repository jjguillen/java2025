package tema4;

import java.util.Arrays;

public class Concesionario {

    private String nombre;
    private String direccion;
    private Coche[] coches;
    private Integer numero;

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = 0;
        this.coches = new Coche[1000];
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

    public Coche[] getCoches() {
        return coches;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Concesionario{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", coches=").append(coches == null ? "null" : Arrays.asList(coches).toString());
        sb.append('}');
        return sb.toString();
    }

    public void nuevoCoche(Coche coche) {
        this.coches[numero] = coche;
        this.numero++;
    }

    public void venderCoche(Coche coche) {
        for(int i=0; i < this.coches.length; i++) {
            if (coches[i] != null) {
                if (coches[i].equals(coche)) {
                    coches[i] = null;
                }
            }
        }
    }
}
