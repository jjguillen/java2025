package examen2025.models;

public class Camion {

    protected String matricula;
    protected String empresaTransportista;
    protected String tipoMercancia;
    protected Double pesoEstimado;

    public Camion(String matricula, String empresaTransportista, String tipoMercancia, Double pesoEstimado) {
        this.matricula = matricula;
        this.empresaTransportista = empresaTransportista;
        this.tipoMercancia = tipoMercancia;
        this.pesoEstimado = pesoEstimado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmpresaTransportista() {
        return empresaTransportista;
    }

    public void setEmpresaTransportista(String empresaTransportista) {
        this.empresaTransportista = empresaTransportista;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    public Double getPesoEstimado() {
        return pesoEstimado;
    }

    public void setPesoEstimado(Double pesoEstimado) {
        this.pesoEstimado = pesoEstimado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Camion{");
        sb.append("matricula='").append(matricula).append('\'');
        sb.append(", empresaTransportista='").append(empresaTransportista).append('\'');
        sb.append(", tipoMercancia='").append(tipoMercancia).append('\'');
        sb.append(", pesoEstimado=").append(pesoEstimado);
        sb.append('}');
        return sb.toString();
    }
}
