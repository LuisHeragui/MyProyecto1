package mx.unam.ciencias.myp;

import java.util.Hashtable;

/**
 * Clase para representar una lista de alumnos.
 * Extiende a ComponenteLista.
 */
public class ListaAlumnos implements ComponenteLista {

    /* La lista de alumnos. */
    private Hashtable<Integer, Alumno> listaAlumnos;

    /**
     * Constructor que define el estado incial de la lista de alumnos.
     */
    public ListaAlumnos() {
        listaAlumnos = new Hashtable<>();
    }

    /**
     * Agrega un componente al componente actual.
     * @param componente el componente a agregar.
     */
    public void agrega(ComponenteLista componente) {
        if (componente instanceof AlumnoAbstracto)
            listaAlumnos.put(componente.getID(), componente);
        return;
    }

    /**
     * Elimina un componente del componente actual.
     * @param componente el componente a eliminar.
     */
    public void elimina(ComponenteLista componente) {
        listaAlumnos.remove(componente.getID());
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    public String toString() {
        return listaAlumnos.toString();
    }

    /**
     * Regresa un iterador para poder iterar al componente.
     * @return un iterador para iterar al componente.
     */
    public Iterador creaIterador() {
        return new IteradorCompuesto(new IteradorListaAlumnos(listaAlumnos));
    }
}
