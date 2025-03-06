package tema6.tiendaComics;

import java.time.LocalDate;

public class NovelaGrafica extends Comic {
    private String resumen;


    public NovelaGrafica(String titulo, LocalDate fecha, Double precio,
                         Integer numPaginas, Integer numEjemplares, String resumen) {
        super(titulo, fecha, precio, numPaginas, numEjemplares);
        this.resumen = resumen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NovelaGrafica{");
        sb.append(super.toString());
        sb.append(", resumen='").append(resumen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
