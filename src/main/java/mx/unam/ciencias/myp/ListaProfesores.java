package mx.unam.ciencias.myp;

import java.util.Arrays;

/**
 * Clase para representar una lista de profesores.
 * Implementa Lista<T>.
 */
public class ListaProfesores implements Lista<Profesor> {

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
     * Agrega un componente al componente actual.
     * @param componente el componente a agregar.
     */
    @Override public void agrega(ComponenteLista componente) {
        if (componente instanceof Profesor) {
            for (int i = 0; i < profesores.length, i++) {
                if (profesores[i] != null)
                    continue;
                else {
                    profesores[i] = (Profesor)componente;
                    selectionSort(profesores);
                    if (i == profesores.length - 1)
                        estaLlena = true;
                    return;
                }
            }
            estaLlena = true;
            System.out.println("La lista de profesores está llena.");
        }
        return;
    }

    /**
     * Elimina un componente del componente actual.
     * @param componente el componente a eliminar.
     */
    @Override public void elimina(ComponenteLista componente) {
        for (int i = 0; i < profesores.length; i++)
            if (profesores[i].equals(componente))
                profesores[i] = null;
            else
                continue;
        selectionSort(profesores);
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    @Override public String toString() {
        return Arrays.toString(profesores);
    }

    /**
     * Regresa un iterador para poder iterar al componente.
     * @return un iterador para iterar al componente.
     */
    @Override public Iterador creaIterador() {
        return new IteradorCompuesto(new IteradorListaProfesores(profesores));
    }
}
