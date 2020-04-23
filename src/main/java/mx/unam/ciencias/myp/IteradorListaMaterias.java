package mx.unam.ciencias.myp;

import java.util.Stack;

/**
 * Clase que asigna el comportamiento del iterador de la lista de materias.
 */
public class IteradorListaMaterias implements Iterador<Materia> {

    /* La lista sobre la que se va a iterar. */
    private ArrayList<Materia> materias;
    /* La posicion del iterador. */
    int posicion = 0;

    /**
     * Nos da un iterable para ser iterado.
     */
    public IteradorListaMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    /**
     * Nos dice si quedan elementos por recorrer en la lista.
     * @return true si hay un elemento siguiente, false en otro caso.
     */
    @Override public boolean hasNext() {
      if (posicion >= materias.size() || materias.get(posicion) == null)
          return false;
      return true;
    }

    /**
     * Nos da el elemento siguiente.
     * @return el elemento siguiente.
     */
    @Override public Materia next() {
        if (hasNext()) {
            Materia materia = materias.get(posicion);
            posicion++;
            return materia;
        }
        return null;
    }
}
