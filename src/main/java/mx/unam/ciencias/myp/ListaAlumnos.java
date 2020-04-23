package mx.unam.ciencias.myp;

import java.util.Hashtable;

/**
 * Clase para representar una lista de alumnos.
 * Extiende a Lista<T>.
 */
public class ListaAlumnos implements Lista<AlumnoAbstracto> {

    /* La lista de alumnos. */
    private Hashtable<Integer, AlumnoAbstracto> listaAlumnos;

    /**
     * Constructor que define el estado incial de la lista de alumnos.
     */
    public ListaAlumnos() {
        listaAlumnos = new Hashtable<>();
    }

    /**
     * Agrega un alumno a la lista.
     * @param alumno el alumno a agregar.
     */
    @Overide public void agrega(AlumnoAbstracto alumno) {
        listaAlumnos.put(alumno.getID(), alumno);
    }

    /**
     * Elimina un alumno del la lista.
     * @param alumno el alumno a eliminar.
     */
    @Overide public void elimina(AlumnoAbstracto alumno) {
        listaAlumnos.remove(alumno.getID());
    }

    /**
     * Regresa una representación de la lista.
     * @return una representación de la lista.
     */
    @Override public String toString() {
        String s = "";
        Iterador<Materia> iterador = this.creaIterador();
        while (iterador.hasNext()) {
            AlumnoAbstracto alumno = iterador.next();
            s += alumno.toString() + "\n";
    }

    /**
     * Regresa un iterador para poder iterar la lista.
     * @return un iterador para iterar la lista.
     */
    @Overide public Iterador creaIterador() {
        return new IteradorListaAlumnos(listaAlumnos);
    }
}
