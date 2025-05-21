package examen2025.models;

public class Muelle {

    private Integer id;
    private String ubicacion;
    private boolean ocupado;
    private Camion camionAsignado;

    public Muelle(Integer id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.ocupado = false;
        this.camionAsignado = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Camion getCamionAsignado() {
        return camionAsignado;
    }

    public void setCamionAsignado(Camion camionAsignado) {
        this.camionAsignado = camionAsignado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Muelle{");
        sb.append("id=").append(id);
        sb.append(", ubicacion='").append(ubicacion).append('\'');
        sb.append(", ocupado=").append(ocupado);
        if (camionAsignado != null)
            sb.append(", camionAsignado=").append(camionAsignado.getMatricula());
        else
            sb.append(", camionAsignado=null");
        sb.append('}');
        return sb.toString();
    }

    public void asignarCamion(Camion camion) {
        this.camionAsignado = camion;
        this.ocupado = true;
    }

    public void liberarMuelle() {
        this.camionAsignado = null;
        this.ocupado = false;
    }


}
