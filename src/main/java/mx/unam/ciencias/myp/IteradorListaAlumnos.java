package mx.unam.ciencias.myp;

import java.util.Set;
import java.util.Iterator;

/**
 * Clase que asigna el comportamiento del iterador de la lista de alumnos.
 */
public class IteradorListaAlumnos implements Iterador<> {

    /* La tabla sobre la que se va a iterar. */
    private TreeMap<Integer, AlumnoAbstracto> listaAlumnos;

    /**
     * Constructor que define el estado inicial del iterable para ser iterado.
     * @param listaAlumnos la lista de alumnos que será iterada.
     */
    public IteradorListaAlumnos(TreeMap<Integer, AlumnoAbstracto> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * Nos dice si quedan elementos por recorrer en la lista.
     * @return true si hay un elemento siguiente, false en otro caso.
     */
    @Override public boolean hasNext() {
        Set set = listaAlumnos.entrySet();
        Iterator i = set.iterator();
        return i.hasNext();
    }

    /**
     * Nos da elemento siguiente.
     * @return el elemento siguiente.
     */
    @Override public Map.Entry next() {
        Set set = listaAlumnos.entrySet();
        Iterator i = set.iterator();
        return i.next();
    }
}
