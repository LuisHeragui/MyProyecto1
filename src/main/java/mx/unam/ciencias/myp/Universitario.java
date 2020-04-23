package mx.unam.ciencias.myp;

/**
 * Interfaz que define el comportamiento de los universitarios.
 */
public interface Universitario<T> {

    /**
     * Regresa el nombre del universitario.
     * @return el nombre del universitario.
     */
    public String getNombre();

    /**
     * Regresa el id del universitario.
     * @return el id del universitario.
     */
    public int getID();

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    public String toString();

    /**
     * Regresa true si el universitario es igual al universitario especificado,
     * o false en otro caso.
     * @return true si el universitario es igual al universitario especificado,
     * o false en otro caso.
     */
    public boolean equals(T universitario);
}
