package mx.unam.ciencias.myp;

/**
 * Clase que asigna el comportamiento del iterador de la lista de alumnos.
 */
public class IteradorListaAlumnos implements Iterador {

    /* La colección sobre la que se va a iterar. */
    private Hashtable<Integer, Alumno> listaAlumnos;
    /* La posicion del iterador. */
    int posicion = 0;

    /**
     * Constructor que define el estado inicial del iterable para ser iterado.
     */
    public IteradorListaAlumnos(Hashtable<Integer, Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * Nos dice si quedan elementos por recorrer en la lista.
     * @return true si hay un elemento siguiente, false en otro caso.
     */
    @Override public boolean hasNext() {
        if (posicion >= listaAlumnos.size() ||
            listaAlumnos.get(posicion) == null)
            return false;
        return true;
    }

    /**
     * Nos da elemento siguiente.
     * @return el elemento siguiente.
     */
    @Override public Alumno next() {
        if (hasNext()) {
            Alumno alumno = listaAlumnos.get(posicion);
            posicion++;
            return alumno;
        }
        return null;
    }
}
