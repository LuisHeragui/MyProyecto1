package mx.unam.ciencias.myp;

import java.util.Arrays;

/**
 * Clase para representar una lista de profesores.
 * Implementa Lista.
 */
public class ListaProfesores implements Lista {

    /* El máximo número de profesores que puede tener la lista. */
    private static final int MAX_ITEMS = 20;
    /* El número de profesores en la lista de profesores. */
    private int numeroDeProfesores = 0;
    /* La lista de profesores. */
    private Profesor[] profesores;
    /* Booleano para saber si la lista esta llena. */
    private boolean estaLlena;

    /**
     * Constructor que define el estado incial de la lista de profesores.
     */
    public ListaProfesores() {
        profesores = new Profesor[MAX_ITEMS];
        estaLlena = false;
    }

    /**
     * Regresa true si la lista esta llena, o false en otro caso.
     * @return true si la lista esta llena, o false en otro caso.
     */
    public boolean estaLlena() {
        return estaLlena;
    }

    /**
     * Ordena el arreglo recibido usando SelectionSort.
     * @param arreglo el arreglo a ordenar.
     */
    public void selectionSort(Profesor[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int m = i;
            for (int j = i + 1; j < arreglo.length; j++)
                if (arreglo[m].getID() > arreglo[j].getID())
                    m = j;
            intercambia(arreglo, i, m);
        }
    }

    /* Método auxiliar para intercambiar dos elementos dentro de un arreglo. */
    private void intercambia(Profesor[] arreglo, int a, int b) {
        if (a == b)
            return;
        Profesor auxiliar = arreglo[a];
        arreglo[a] = arreglo[b];
        arreglo[b] = auxiliar;
    }

    /**
     * Agrega un profesor a la lista.
     * @param profesor el profesor a agregar.
     */
    @Override public void agrega(Object objeto) {
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] != null)
                continue;
            else {
                Profesor profesor = (Profesor)objeto;
                profesores[i] = profesor;
                selectionSort(profesores);
                if (i == profesores.length - 1)
                    estaLlena = true;
                return;
            }
        }
        estaLlena = true;
        System.out.println("La lista de profesores está llena.");
        return;
    }

    /**
     * Elimina un profesor de la lista.
     * @param profesor el profesor a eliminar.
     */
    @Override public void elimina(Object objeto) {
        Profesor profesor = (Profesor)objeto;
        for (int i = 0; i < profesores.length; i++)
            if (profesores[i].equals(profesor))
                profesores[i] = null;
            else
                continue;
        selectionSort(profesores);
    }

    /**
     * Regresa una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
    @Override public String toString() {
        String s = "";
        Iterador<Object> iterador = this.creaIterador();
        if (iterador.hasNext()) {
            Profesor profesor = (Profesor)iterador.next();
            s += profesor.toString();
        }
        while (iterador.hasNext()) {
            Profesor profesor = (Profesor)iterador.next();
            s += ", " + profesor.toString();
        }
        return s;
    }

    /**
     * Regresa un iterador para poder iterar la lista.
     * @return un iterador para iterar la lista.
     */
    @Override public Iterador<Object> creaIterador() {
        return new IteradorListaProfesores(profesores);
    }
}
