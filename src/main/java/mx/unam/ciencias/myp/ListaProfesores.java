package mx.unam.ciencias.myp;

/**
 * Clase para representar una lista de profesores.
 * Extiende a ComponenteLista.
 */
public class ListaProfesores implements ComponenteLista {

    /* El máximo número de profesores que puede tener la lista. */
    private static final int MAX_ITEMS = 20;
    /* El número de profesores en la lista de profesores. */
    private int numeroDeProfesores = 0;
    /* La lista de alumnos. */
    private Profesor[] listaProfesores;

    /**
     * Constructor que define el estado incial de la lista de alumnos.
     */
    public ListaProfesores() {
        listaProfesores = new Profesor[MAX_ITEMS];
    }

    /**
     * Agrega un componente al componente actual.
     * @param componente el componente a agregar.
     */
    @Override public void agrega(ComponenteLista componente) {
        if (componente instanceof Profesor) {
            for (int i = 0; i < listaProfesores.length, i++) {
                if (listaProfesores[i] != null)
                    continue;
                listaProfesores[i] = componente;
            }
        }
        return;
    }

    /**
     * Elimina un componente del componente actual.
     * @param componente el componente a eliminar.
     */
    @Override public void elimina(ComponenteLista componente) {
        //Aquí va el código.
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    @Override public String toString() {
        //Aquí va el código.
    }

    /**
     * Regresa un iterador para poder iterar al componente.
     * @return un iterador para iterar al componente.
     */
    @Override public Iterador creaIterador() {
        //Aquí va el código.
    }
}
