package tema7.conjuntos;

import tema7.listas.ejemploCola.Proceso;

import java.util.Comparator;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        TreeSet<Proceso> procesosOrdenados =
                new TreeSet<>(Comparator.comparing(Proceso::getPid).reversed());




    }
}
