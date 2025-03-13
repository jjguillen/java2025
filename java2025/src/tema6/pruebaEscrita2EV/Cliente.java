package tema6.pruebaEscrita2EV;

import java.time.LocalDate;
import java.util.UUID;

public class Cliente extends Persona {

    private String licenciaConducir;
    private LocalDate fechaObtencionLicencia;

    public Cliente(String nombre, String apellidos, String dni, String email, String direccion, String telefono, String licenciaConducir, LocalDate fechaObtencionLicencia) {
        super(nombre, apellidos, dni, email, direccion, telefono);
        this.licenciaConducir = licenciaConducir;
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    public Cliente(Cliente otroCliente) {
        this.id = otroCliente.id;
        this.nombre = otroCliente.nombre;
        this.apellidos = otroCliente.apellidos;
        this.dni = otroCliente.dni;
        this.email = otroCliente.email;
        this.direccion = otroCliente.direccion;
        this.telefono = otroCliente.telefono;
        this.licenciaConducir = otroCliente.licenciaConducir;
        this.fechaObtencionLicencia = otroCliente.fechaObtencionLicencia;
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public LocalDate getFechaObtencionLicencia() {
        return fechaObtencionLicencia;
    }

    public void setFechaObtencionLicencia(LocalDate fechaObtencionLicencia) {
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("licenciaConducir='").append(licenciaConducir).append('\'');
        sb.append(", fechaObtencionLicencia=").append(fechaObtencionLicencia);
        sb.append(", id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
