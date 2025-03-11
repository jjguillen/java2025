package tema6.reservasVuelos;

public class Pasajero extends Persona {

    private String preferenciasComida;
    private String restriccionesMedicas;
    private Asiento asiento;

    public Pasajero() {
    }

    public Pasajero(Long id, String nombre, String apellidos, String dniPass, String email,
                    String direccion, String ciudad, String pais, String telefono,
                    String preferenciasComida, String restriccionesMedicas, Asiento asiento) {
        super(id, nombre, apellidos, dniPass, email, direccion, ciudad, pais, telefono);
        this.preferenciasComida = preferenciasComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = asiento;
    }

    public Pasajero(Pasajero pasajero) {
        this.id = pasajero.id;
        this.nombre = pasajero.nombre;
        this.apellidos = pasajero.apellidos;
        this.dniPass = pasajero.dniPass;
        this.email = pasajero.email;
        this.direccion = pasajero.direccion;
        this.ciudad = pasajero.ciudad;
        this.pais = pasajero.pais;
        this.telefono = pasajero.telefono;
        this.preferenciasComida = pasajero.preferenciasComida;
        this.restriccionesMedicas = pasajero.restriccionesMedicas;
        this.asiento = pasajero.asiento;
    }

    public String getPreferenciasComida() {
        return preferenciasComida;
    }

    public void setPreferenciasComida(String preferenciasComida) {
        this.preferenciasComida = preferenciasComida;
    }

    public String getRestriccionesMedicas() {
        return restriccionesMedicas;
    }

    public void setRestriccionesMedicas(String restriccionesMedicas) {
        this.restriccionesMedicas = restriccionesMedicas;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pasajero{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dniPass='").append(dniPass).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", preferenciasComida='").append(preferenciasComida).append('\'');
        sb.append(", restriccionesMedicas='").append(restriccionesMedicas).append('\'');
        sb.append(", asiento=").append(asiento);
        sb.append('}');
        return sb.toString();
    }
}
