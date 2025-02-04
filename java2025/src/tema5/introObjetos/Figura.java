package tema5.introObjetos;

public class Figura {

    protected String color; //Privado para todos, publico para clases hijas

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Figura{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Como no tiene código este método será abstracto
    public Double area() {
        System.out.println("YO SOY TU PADRE");
        return 0.0;
    }
}
