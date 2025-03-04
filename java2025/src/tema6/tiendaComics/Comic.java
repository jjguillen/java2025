package tema6.tiendaComics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Comic {

    protected UUID id;
    protected String titulo;
    protected LocalDate fecha;
    protected Double precio;
    protected Integer numPaginas;
    protected ArrayList<Autor> autores;

    public Comic(String titulo, LocalDate fecha, Double precio, Integer numPaginas) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.fecha = fecha;
        this.precio = precio;
        this.numPaginas = numPaginas;
        this.autores = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comic{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autores=").append(autores);
        sb.append('}');
        return sb.toString();
    }

    public void addAutor(Autor autor) {
        if (!this.autores.contains(autor)) {
            this.autores.add(autor);
        }
    }


}
