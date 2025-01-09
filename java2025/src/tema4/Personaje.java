package tema4;

public class Personaje {

    private String nombre;
    private String clase;
    private String sexo;
    private Integer vida;


    public Personaje(String nombre, Integer vida, String sexo, String clase) {
        this.nombre = nombre;
        this.vida = vida;
        this.sexo = sexo;
        this.clase = clase;
    }

    public Personaje() {
        this.nombre = "SinNombre";
        this.clase = "Humano";
        this.vida = 10;
        this.sexo = "NoDefinido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append('}');
        return sb.toString();
    }
}
