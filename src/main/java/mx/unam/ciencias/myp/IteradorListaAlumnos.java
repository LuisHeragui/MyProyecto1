package mx.unam.ciencias.myp;

import java.util.Hashtable;

/**
 * Clase que asigna el comportamiento del iterador de la lista de alumnos.
 */
public class IteradorListaAlumnos implements Iterador<Object> {

    /* La tabla sobre la que se va a iterar. */
    private Hashtable<Integer, AlumnoAbstracto> listaAlumnos;

    /**
     * Constructor que define el estado inicial del iterable para ser iterado.
     * @param listaAlumnos la lista de alumnos que será iterada.
     */
    public IteradorListaAlumnos(Hashtable<Integer, AlumnoAbstracto> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * Nos dice si quedan elementos por recorrer en la lista.
     * @return true si hay un elemento siguiente, false en otro caso.
     */
    @Override public boolean hasNext() {
        return listaAlumnos.values().iterator().hasNext();
    }

    /**
     * Nos da elemento siguiente.
     * @return el elemento siguiente.
     */
    @Override public AlumnoAbstracto next() {
        return listaAlumnos.values().iterator().next();
    }
}
