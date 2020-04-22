package mx.unam.ciencias.myp;

/**
 * Clase abstracta para representar un alumno.
 * Extiende a Usuario e Implementa ComponenteLista.
 */
public abstract class AlumnoAbstracto extends Usuario implements ComponenteLista {

    /**
     * Regresa el nombre del alumno.
     * @return el nombre del alumno.
     */
    public abstract String getNombre();

    /**
     * Regresa el id del alumno.
     * @return el id del alumno.
     */
    public abstract int getID();

    /**
     * Regresa la lista de materias del alumno.
     * @return la lista de materias del alumno.
     */
    public abstract ArrayList<Materia> getMaterias();

    /**
     * Regresa la lista de profesores del alumno.
     * @return la lista de profesores del alumno.
     */
    public abstract ArrayList<String> getProfesores();

    /**
     * Regresa el promedio del alumno.
     * @return el promedio del alumno.
     */
    public abstract double getPromedio();

    /**
     * Regresa la calificacion del alumno de la materia especificada.
     * @param materia la materia de la que consultaremos la calificación.
     * @return la calificacion del alumno de la materia especificada.
     */
    public abstract int consultarCalificacion(String materia);

    /**
     * Agrega un componente al componente actual.
     * @param componente el componente a agregar.
     */
    @Override public void agrega(ComponenteLista componente) {
        throw new UnsupportedOperationException();
    }

    /**
     * Elimina un componente del componente actual.
     * @param componente el componente a eliminar.
     */
    @Override public void elimina(ComponenteLista componente) {
        throw new UnsupportedOperationException();
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    @Override public String toString() {
        return;
    }

    /**
     * Regresa un iterador para poder iterar al componente.
     * @return un iterador para iterar al componente.
     */
    @Override public Iterador creaIterador() {
        return new IteradorNulo();
    }
}
