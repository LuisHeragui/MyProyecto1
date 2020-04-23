package mx.unam.ciencias.myp;

import java.util.Hashtable;

/**
 * Clase para representar una lista de alumnos.
 * Extiende a Lista.
 */
public class ListaAlumnos implements Lista {

    /* La lista de alumnos. */
    private Hashtable<Integer, AlumnoAbstracto> listaAlumnos;

    /**
     * Constructor que define el estado incial de la lista de alumnos.
     */
    public ListaAlumnos() {
        listaAlumnos = new Hashtable<>();
    }

    /**
     * Regresa la longitud de la lista.
     * @return la longitud de la lista.
     */
    public int longitud() {
        return listaAlumnos.size();
    }

    /**
     * Regresa true si la lista contiene al alumno recibido, o false en otro
     * caso.
     * @param alumno el alumno que vamos a verificar.
     * @return true si la lista contiene al alumno recibido, o false en otro
     * caso.
     */
    public boolean contiene(AlumnoAbstracto alumno) {
        return listaAlumnos.contains(alumno);
    }

    /**
     * Agrega un alumno a la lista.
     * @param alumno el alumno a agregar.
     */
    @Override public void agrega(Object objeto) {
        if (objeto instanceof AlumnoAbstracto) {
            AlumnoAbstracto alumno = (AlumnoAbstracto)objeto;
            listaAlumnos.put(alumno.getID(), alumno);
        }
        return;
    }

    /**
     * Elimina un alumno del la lista.
     * @param alumno el alumno a eliminar.
     */
    @Override public void elimina(Object objeto) {
        AlumnoAbstracto alumno = (AlumnoAbstracto)objeto;
        listaAlumnos.remove(alumno.getID());
    }

    /**
     * Regresa una representación de la lista.
     * @return una representación de la lista.
     */
    @Override public String toString() {
        String s = "";
        Iterador<Object> iterador = this.creaIterador();
        while (iterador.hasNext()) {
            AlumnoAbstracto alumno = (AlumnoAbstracto)iterador.next();
            s += alumno.toString() + "\n";
        }
        return s;
    }

    /**
     * Regresa un iterador para poder iterar la lista.
     * @return un iterador para iterar la lista.
     */
    @Override public Iterador<Object> creaIterador() {
        return new IteradorListaAlumnos(listaAlumnos);
    }
}
