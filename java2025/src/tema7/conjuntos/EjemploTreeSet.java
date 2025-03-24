package tema7.conjuntos;

import tema7.listas.ejemploCola.Proceso;

import java.util.Comparator;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> palabras = new TreeSet<>();

        palabras.add("hola");
        palabras.add("adiós");
        palabras.add("lluvia");
        palabras.add("calorcito");

        System.out.println(palabras);




    }
}
