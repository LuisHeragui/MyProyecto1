package mx.unam.ciencias.myp;

import java.util.ArrayList;

/**
 * Clase para representar una lista de materias.
 * Implementa Lista<T>.
 */
public class ListaMaterias implements Lista<Materia> {

    /* La lista de materias. */
    private ArrayList<Materia> materias;

    /**
     * Constructor que define el estado incial de la lista de materias.
     */
    public ListaMaterias() {
        materias = new ArrayList<>();
    }

    /**
     * Agrega una materia a la lista.
     * @param materia al materia a agregar.
     */
    @Override public void agrega(Materia materia) {
        materias.add(materia);
    }

    /**
     * Elimina una materia de la lista.
     * @param materia la materia a eliminar.
     */
    @Override public void elimina(Materia materia) {
        materias.remove(materia);
    }

    /**
     * Regresa una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
    @Override public String toString() {
        String s = "";
        Iterador<Materia> iterador = this.creaIterador();
        if (iterador.hasNext()) {
            Materia materia = iterador.next();
            s += materia.getNombre();
        }
        while (iterador.hasNext()) {
            Materia materia = iterador.next();
            s += ", " + materia.getNombre();
        }
    }

    /**
     * Regresa un iterador para poder iterar la lista.
     * @return un iterador para iterar la lista.
     */
    @Override public Iterador<Materia> creaIterador() {
        return new IteradorListaMaterias(materias);
    }
}
