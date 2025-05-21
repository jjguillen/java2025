package examen2025.models;

public class CamionFrigorifico extends Camion {

    private Double temperaturaObjetivo;


    public CamionFrigorifico(String matricula, String empresaTransportista, String tipoMercancia, Double pesoEstimado,
                             Double temperaturaObjetivo) {
        super(matricula, empresaTransportista, tipoMercancia, pesoEstimado);
        this.temperaturaObjetivo = temperaturaObjetivo;
    }

    public Double getTemperaturaObjetivo() {
        return temperaturaObjetivo;
    }

    public void setTemperaturaObjetivo(Double temperaturaObjetivo) {
        this.temperaturaObjetivo = temperaturaObjetivo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CamionFrigorifico{");
        sb.append("matricula='").append(matricula).append('\'');
        sb.append(", empresaTransportista='").append(empresaTransportista).append('\'');
        sb.append(", tipoMercancia='").append(tipoMercancia).append('\'');
        sb.append(", pesoEstimado=").append(pesoEstimado);
        sb.append(", temperaturaObjetivo=").append(temperaturaObjetivo);
        sb.append('}');
        return sb.toString();
    }
}
