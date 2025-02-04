package tema5.introObjetos;

import java.util.ArrayList;

public class Dibujo {

    private ArrayList<Figura> figuras;

    public Dibujo() {
        this.figuras = new ArrayList<>();
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dibujo{");
        sb.append("figuras=").append(figuras);
        sb.append('}');
        return sb.toString();
    }

    public void addFigura(Figura figura) {
        this.figuras.add(figura);
    }

    public Double calcularAreaTotal() {
        Double total=0.0;
        for(Figura figura : figuras) {
            total += figura.area();
        }
        return total;
    }
}
