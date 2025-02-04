package tema5.introObjetos;

public class Rectangulo extends Figura {

    private Double ladoMayor;
    private Double ladoMenor;

    public Rectangulo(String color, Double ladoMayor, Double ladoMenor) {
        super(color);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    public Double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(Double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public Double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(Double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append("color='").append(color).append('\'');
        sb.append(", ladoMayor=").append(ladoMayor);
        sb.append(", ladoMenor=").append(ladoMenor);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double area() {
        System.out.println("Yo un rectangulo");
        return this.ladoMayor * this.ladoMenor;
    }
}
