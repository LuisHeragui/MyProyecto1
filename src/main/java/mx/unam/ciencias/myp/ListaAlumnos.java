package mx.unam.ciencias.myp;

import java.util.Hashtable;

public class ListaAlumnos implements ComponenteLista {

    /* La lista de alumnos. */
    private Hashtable<int, Alumno> listaAlumnos;

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
        //Aquí va el código.
    }

    /**
     * Elimina un componente del componente actual.
     * @param componente el componente a eliminar.
     */
    public void elimina(ComponenteLista componente) {
        //Aquí va el código.
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    public String toString() {
        //Aquí va el código.
    }

    /**
     * Regresa un iterador para poder iterar al componente.
     * @return un iterador para iterar al componente.
     */
    public Iterador creaIterador() {
        //Aquí va el código.
    }
}
