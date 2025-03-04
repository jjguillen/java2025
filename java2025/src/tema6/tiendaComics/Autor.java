package tema6.tiendaComics;

import java.time.LocalDate;

public class Autor {

    private String nombre;
    private String apellidos;
    private String email;
    private LocalDate fechaNacimiento;
    private Rol rol;

    public Autor(String nombre, String apellidos, String email, LocalDate fechaNacimiento, Rol rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autor{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", rol=").append(rol);
        sb.append('}');
        return sb.toString();
    }
}
