package tema4;

public class Personaje {

    private String nombre;
    private String clase;
    private String sexo;
    private Integer vida;
    private Arma arma;


    public Personaje(String nombre, Integer vida, String sexo, String clase, Arma arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.sexo = sexo;
        this.clase = clase;
        this.arma = arma;
    }

    public Personaje() {
        this.nombre = "SinNombre";
        this.clase = "Humano";
        this.vida = 10;
        this.sexo = "NoDefinido";
        this.arma = null;
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

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", arma=").append(arma);
        sb.append('}');
        return sb.toString();
    }

    public void golpear(Personaje personaje) {
        this.arma.golpear(personaje);
    }


}
