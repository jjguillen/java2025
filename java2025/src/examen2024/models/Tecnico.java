package examen2024.models;

public class Tecnico extends Persona {

    public enum Especialidad {
        INFORMATICA, ALBAÑILERIA, FONTANERIA, CARPINTERIA, PINTURA
    }

    private Especialidad especialidad;
    private Double valoracion;

    public Tecnico(Long id, String nombre, String apellidos, String email,
                   String movil, Especialidad especialidad, Double valoracion) {
        super(id, nombre, apellidos, email, movil);
        this.especialidad = especialidad;
        this.valoracion = valoracion;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tecnico{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", movil='").append(movil).append('\'');
        sb.append(", especialidad=").append(especialidad);
        sb.append(", valoracion=").append(valoracion);
        sb.append('}');
        return sb.toString();
    }
}
