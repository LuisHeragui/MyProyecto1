package mx.unam.ciencias.myp;

/**
 * Interfaz para crear un iterador para iterar las listas.
 */
public interface Iterador {

    /**
     * Nos dice si quedan elementos por recorrer en la lista.
     * @return true si hay un elemento siguiente, false en otro caso.
     */
    public boolean hasNext();

    /**
     * Nos da elemento siguiente.
     * @return el elemento siguiente.
     */
    public Object next();
}
