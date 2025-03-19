package tema7.collections.ejemploCola;

import java.util.LinkedList;

/**
 * Clase genérica para implementar colas
 * @param <E>
 */
public class Cola<E> {
    LinkedList<E> elementos;

    public Cola() {
        this.elementos = new LinkedList<>();
    }

    /**
     * Insertar por el principio
     * @param elemento
     * @return
     */
    public boolean insertar(E elemento) {
        return this.elementos.add(elemento);
    }

    /**
     * Saca el último elemento de la cola, lo muestra y lo elimina
     * @return
     */
    public E sacarElemento() {
        return this.elementos.poll();
    }

    /**
     * Muestra el último elemento de la cola
     * @return
     */
    public E mostrarElemento() {
        return this.elementos.peek();
    }




}
