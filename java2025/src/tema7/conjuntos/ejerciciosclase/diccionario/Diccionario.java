package tema7.conjuntos.ejerciciosclase.diccionario;

import java.util.Comparator;
import java.util.TreeSet;

public class Diccionario {

    private TreeSet<Entrada> palabras;

    public Diccionario() {
        this.palabras = new TreeSet<>(Comparator.comparing(Entrada::getPalabra));
    }

    public TreeSet<Entrada> getPalabras() {
        return palabras;
    }

    public void setPalabras(TreeSet<Entrada> palabras) {
        this.palabras = palabras;
    }

    public void addEntrada(Entrada entrada) {
        this.palabras.add(entrada);
    }

    public void removeEntrada(Entrada entrada) {
        this.palabras.remove(entrada);
    }

    public void listarPalabras() {
        System.out.println("DICCIONARIO: --------------------");
        for(Entrada ent: this.palabras) {
            System.out.println(ent.getPalabra() + " -> " + ent.getTraduccion());
        }
    }

    /**
     * Busca UNO A UNO, no hay metodo "get" para obtener un elemento concreto
     * TreeSet tiene métodos para implementar colecciones ordenadas (está más
     * pensado para valores numéricos): getFirst, getLast, pollFirst, pollLast
     *
     * @param palabra
     * @return
     */
    public String buscarEntrada(String palabra) {
        for(Entrada ent: this.palabras) {
            if (ent.getPalabra().equalsIgnoreCase(palabra)) {
                return ent.getTraduccion();
            }
        }
        return "No encontrado en diccionario";
    }


}
