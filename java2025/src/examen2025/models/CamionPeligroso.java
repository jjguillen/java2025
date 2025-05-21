package examen2025.models;

public class CamionPeligroso extends Camion {

    private String clasePeligrosidad;


    public CamionPeligroso(String matricula, String empresaTransportista, String tipoMercancia, Double pesoEstimado,
                           String clasePeligrosidad) {
        super(matricula, empresaTransportista, tipoMercancia, pesoEstimado);
        this.clasePeligrosidad = clasePeligrosidad;
    }

    public String getClasePeligrosidad() {
        return clasePeligrosidad;
    }

    public void setClasePeligrosidad(String clasePeligrosidad) {
        this.clasePeligrosidad = clasePeligrosidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CamionPeligroso{");
        sb.append("matricula='").append(matricula).append('\'');
        sb.append(", empresaTransportista='").append(empresaTransportista).append('\'');
        sb.append(", tipoMercancia='").append(tipoMercancia).append('\'');
        sb.append(", pesoEstimado=").append(pesoEstimado);
        sb.append(", clasePeligrosidad='").append(clasePeligrosidad).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
