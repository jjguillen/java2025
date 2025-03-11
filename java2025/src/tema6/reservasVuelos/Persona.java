package tema6.reservasVuelos;

import java.util.Objects;

abstract public class Persona {

    protected Long id;
    protected String nombre;
    protected String apellidos;
    protected String dniPass;
    protected String email;
    protected String direccion;
    protected String ciudad;
    protected String pais;
    protected String telefono;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellidos, String dniPass, String email,
                   String direccion, String ciudad, String pais, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dniPass = dniPass;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDniPass() {
        return dniPass;
    }

    public void setDniPass(String dniPass) {
        this.dniPass = dniPass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dniPass='").append(dniPass).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;
        return Objects.equals(dniPass, persona.dniPass);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dniPass);
    }
}
