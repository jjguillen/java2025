package tema5.introObjetos;

public class Cuadrado extends Figura{

    private Double lado;

    public Cuadrado(String color, Double lado) {
        super(color); //LLamar al constructor de Figura -> this.color = color
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuadrado{");
        sb.append("color='").append(color).append('\'');
        sb.append(", lado=").append(lado);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double area() {
        System.out.println("Hey soy un cuadrado");
        return Math.pow(this.lado, 2);
    }
}
