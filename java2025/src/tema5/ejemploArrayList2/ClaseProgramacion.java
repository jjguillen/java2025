package tema5.ejemploArrayList2;

import java.util.ArrayList;

public class ClaseProgramacion {
    private String profesor;
    private ArrayList<Alumno> alumnos;

    public ClaseProgramacion(String profesor) {
        this.profesor = profesor;
        //Inicializar la lista de alumnos
        this.alumnos = new ArrayList<>();
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ClaseProgramacion{");
        sb.append("profesor='").append(profesor).append('\'');
        sb.append(", alumnos=\n");
        for(Alumno al: alumnos) {
            sb.append(al + "\n");
        }
        sb.append('}');
        return sb.toString();
    }

    public void addAlumno(Alumno al) {
        this.alumnos.add(al);
    }

    public void removeAlumno(Alumno al) {
        this.alumnos.remove(al); //Busca y si lo encuentra lo borra, sino nada
    }

    //MÉTODOS DE BÚSQUEDA

    /**
     * Devuelve el Alumno que está dentro del array de la clase
     * @param al
     * @return
     */
    public Alumno buscar(Alumno al) {
        int posicion = this.alumnos.indexOf(al); //Comparar con equals **
        if (posicion < 0)
            return null;
        else
            return this.alumnos.get(posicion);
    }

    /**
     * Devuelve el Alumno que está dentro del array de la clase, pero busca uno
     * que tenga el mismo dni que pasamos como parámetro
     * @param dni
     * @return
     */
    public Alumno buscarPorDNI(String dni) {
        for(Alumno al : this.alumnos) {
            if (al.getDni().equalsIgnoreCase(dni)) {
                return al;
            }
        }
        return null; //Not found
    }


}
