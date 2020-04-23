package mx.unam.ciencias.myp;

import java.util.ArrayList;

/**
 * Clase para representar una lista de materias.
 * Implementa Lista.
 */
public class ListaMaterias implements Lista {

    /* La lista de materias. */
    private ArrayList<Materia> materias;

    /**
     * Constructor que define el estado incial de la lista de materias.
     */
    public ListaMaterias() {
        materias = new ArrayList<>();
    }

    /**
     * Regresa la longitud de la lista.
     * @return la longitud de la lista.
     */
    public int longitud() {
        return materias.size();
    }

    /**
     * Limpia la lista de materias.
     */
    public void limpia() {
        materias.clear();
    }

    /**
     * Agrega una materia a la lista.
     * @param materia al materia a agregar.
     */
    @Override public void agrega(Object objeto) {
        Materia materia = (Materia)objeto;
        materias.add(materia);
    }

    /**
     * Elimina una materia de la lista.
     * @param materia la materia a eliminar.
     */
    @Override public void elimina(Object objeto) {
        Materia materia = (Materia)objeto;
        materias.remove(materia);
    }

    /**
     * Regresa una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
    @Override public String toString() {
        String s = "";
        Iterador<Object> iterador = this.creaIterador();
        if (iterador.hasNext()) {
            Materia materia = (Materia)iterador.next();
            s += materia.getNombre() + ": " + materia.getCalificacion();
        }
        while (iterador.hasNext()) {
            Materia materia = (Materia)iterador.next();
            s += ", " + materia.getNombre() + ": " + materia.getCalificacion();
        }
        return s;
    }

    /**
     * Regresa un iterador para poder iterar la lista.
     * @return un iterador para iterar la lista.
     */
    @Override public Iterador<Object> creaIterador() {
        return new IteradorListaMaterias(materias);
    }
}
