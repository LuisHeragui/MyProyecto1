package mx.unam.ciencias.myp;

/**
 * Clase que asigna el comportamiento del iterador de la lista de profesores.
 */
public class IteradorListaProfesores implements Iterador {

    /* La colección sobre la que se va a iterar. */
    private Profesor[] listaProfesores;
    /* La posicion del iterador. */
    int posicion = 0;

    /**
     * Constructor que define el estado inicial del iterable para ser iterado.
     * @param listaProfesores la lista de profesores que será iterada.
     */
    public IteradorListaProfesores(Profesor[] listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    /**
     * Nos dice si quedan elementos por recorrer en la lista.
     * @return true si hay un elemento siguiente, false en otro caso.
     */
    @Override public boolean hasNext() {
        if (posicion >= listaProfesores.length ||
            listaProfesores[posicion] == null)
            return false;
        return true;
    }

    /**
     * Nos da elemento siguiente.
     * @return el elemento siguiente.
     */
    @Override public Profesor next() {
        if (hasNext()) {
            Profesor profesor = listaProfesores[posicion];
            posicion++;
            return profesor;
        }
        return null;
    }
}
