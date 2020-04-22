package mx.unam.ciencias.myp;

import java.util.Stack;

/**
 * Clase que asigna el comportamiento del iterador para el compuesto.
 */
public class IteradorCompuesto implements Iterador {

    /* La pila para iterar el compuesto. */
    private Stack pila = new Stack();

    /**
     * Constructor que define el estado inicial del iterable para ser iterado.
     */
    public IteradorCompuesto(Iterador iterador) {
        pila.push(iterador);
    }

    /**
     * Nos dice si quedan elementos por recorrer en la lista.
     * @return true si hay un elemento siguiente, false en otro caso.
     */
    @Override public boolean hasNext() {
        if (stack.empty())
            return false;
        Iterador iterador = (Iterador)pila.peek();
        if (!iterador.hasNext()) {
            pila.pop();
            return hasNext();
        }
        return true;
    }

    /**
     * Nos da elemento siguiente.
     * @return el elemento siguiente.
     */
    @Override public T next() {
        if (hasNext()) {
            Iterador iterador = (Iterador)pila.peek();
            ComponenteLista componente = (ComponenteLista)iterador.next();
            if (componente instanceof ListaAlumnos ||
                componente instanceof ListaProfesores)
                pila.push(componente.creaIterador());
            return componente;
        } else {
            return null;
        }
    }
}
