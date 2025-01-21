package tema4.practicaTema4.magic;

public class Hechizo {

    enum Tipo {AIRE, FUEGO, ELECTRICIDAD}

    private String nombre;
    private Integer potencia;
    private Integer reqEnergia;
    private Tipo tipo;

    public Hechizo(String nombre, Integer potencia, Integer reqEnergia, Tipo tipo) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.reqEnergia = reqEnergia;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPotencia() {
        if (this.tipo == Tipo.FUEGO) {
            return potencia * 3;
        }
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getReqEnergia() {
        return reqEnergia;
    }

    public void setReqEnergia(Integer reqEnergia) {
        this.reqEnergia = reqEnergia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hechizo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", potencia=").append(potencia);
        sb.append(", reqEnergia=").append(reqEnergia);
        sb.append('}');
        return sb.toString();
    }
}


