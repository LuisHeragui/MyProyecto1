package mx.unam.ciencias.myp;

import java.util.TreeMap;
import java.util.Map;

/**
 * Clase para representar una lista de alumnos.
 * Extiende a Lista<T>.
 */
public class ListaAlumnos implements Lista<AlumnoAbstracto> {

    /* La lista de alumnos. */
    private TreeMap<Integer, AlumnoAbstracto> listaAlumnos;

    /**
     * Constructor que define el estado incial de la lista de alumnos.
     */
    public ListaAlumnos() {
        listaAlumnos = new TreeMap<>();
    }

    /**
     * Regresa true si la lista contiene al alumno recibido, o false en otro
     * caso.
     * @param alumno el alumno que vamos a verificar.
     * @return true si la lista contiene al alumno recibido, o false en otro
     * caso.
     */
    public boolean contiene(AlumnoAbstracto alumno) {
        return listaAlumnos.containsValue(alumno);
    }

    /**
     * Agrega un alumno a la lista.
     * @param alumno el alumno a agregar.
     */
    @Override public void agrega(AlumnoAbstracto alumno) {
        listaAlumnos.put(alumno.getID(), alumno);
    }

    /**
     * Elimina un alumno del la lista.
     * @param alumno el alumno a eliminar.
     */
    @Override public void elimina(AlumnoAbstracto alumno) {
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
            Map.Entry me = (Map.Entry)iterador.next();
            AlumnoAbstracto alumno = me.getValue();
            s += alumno.toString() + "\n";
        }
        return s;
    }

    /**
     * Regresa un iterador para poder iterar la lista.
     * @return un iterador para iterar la lista.
     */
    @Override public Iterador creaIterador() {
        return new IteradorListaAlumnos(listaAlumnos);
    }
}
