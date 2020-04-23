package mx.unam.ciencias.myp;

/**
 * Interfaz para definir el comportamiento de una lista.
 */
public interface Lista {

	/**
     * Agrega un elemento a la lista.
     * @param elemento el elemento a agregar.
     */
	public void agrega(Object elemento);

	/**
     * Elimina un elemento de la lista.
     * @param elemento el elemento a eliminar.
     */
	public void elimina(Object elemento);

	/**
     * Regresa una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
	public String toString();

	/**
     * Regresa un iterador para poder iterar la lista.
     * @return un iterador para iterar la lista.
     */
	public Iterador<Object> creaIterador();
}
