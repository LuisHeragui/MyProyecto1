package mx.unam.ciencias.myp;

/**
 * Clase que asigna el comportamiento del iterador nulo.
 */
public class IteradorNulo implements Iterador {

    /**
     * Nos dice si quedan elementos por recorrer en la lista.
     * @return true si hay un elemento siguiente, false en otro caso.
     */
    public boolean hasNext() {
        return false;
    }

    /**
     * Nos da elemento siguiente.
     * @return el elemento siguiente.
     */
    public T next() {
        return null;
    }
}
