package mx.unam.ciencias.myp;

/**
 * Interfaz que define el comportamiento de los componentes que conforman al
 * compuesto de todas las listas y sus elementos.
 */
public interface ComponenteLista {

    /**
     * Agrega un componente al componente actual.
     * @param componente el componente a agregar.
     */
    public void agrega(ComponenteLista componente);

    /**
     * Elimina un componente del componente actual.
     * @param componente el componente a eliminar.
     */
    public void elimina(ComponenteLista componente);

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    public String toString();

    /**
     * Regresa un iterador para poder iterar al componente.
     * @return un iterador para iterar al componente.
     */
    public Iterador creaIterador();
}
