package tema4.ejerciciosclase;

import java.util.UUID;

public class Incidencia {

    enum Estado { ABIERTA, ENPROCESO, RESUELTA }

    private UUID codigo;
    private Estado estado;
    private String problema;
    private String solucion;

    private static Integer pendientes = 0;

    public Incidencia(String problema) {
        this.estado = Estado.ABIERTA;
        this.problema = problema;
        this.solucion = "";

        Incidencia.pendientes++; //Al crear una incidencia se pone como pendiente
        this.codigo = UUID.randomUUID();
        //this.codigo = "INC-" + Incidencia.pendientes + "-" + Incidencia.generarNumeroAleatorio(100,1);
    }

    public UUID getCodigo() {
        return codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getProblema() {
        return problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public static Integer getPendientes() {
        return pendientes;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    private static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo=").append(codigo);
        sb.append(", estado=").append(estado);
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void resuelve(String solucion) {
        this.estado = Estado.RESUELTA; //La incidencia queda resuelta
        this.solucion = solucion;
        Incidencia.pendientes--; //Contador de incidencia pendientes se decrementa en uno
    }
}
