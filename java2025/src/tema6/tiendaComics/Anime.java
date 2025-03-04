package tema6.tiendaComics;

import java.time.LocalDate;
import java.util.UUID;

public class Anime extends Comic {
    private Integer numEpisodio;
    private String serie;


    public Anime(String titulo, LocalDate fecha, Double precio, Integer numPaginas,
                 Integer numEpisodio, String serie) {
        super(titulo, fecha, precio, numPaginas);
        this.numEpisodio = numEpisodio;
        this.serie  = serie;
    }

    public Integer getNumEpisodio() {
        return numEpisodio;
    }

    public void setNumEpisodio(Integer numEpisodio) {
        this.numEpisodio = numEpisodio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Anime{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autores=").append(autores);
        sb.append(", numEpisodio=").append(numEpisodio);
        sb.append(", serie='").append(serie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
