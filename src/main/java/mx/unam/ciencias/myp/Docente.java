package mx.unam.ciencias.myp;

/**
 * Clase abstracta que define a un docente.
 * Extiende a Usuario e implementa ComponenteLista.
 */
public class Docente extends Usuario implements ComponenteLista {

    /* El nombre del docente. */
    private String nombre;
    /* El id del docente. */
    private int id;
    /* La lista de alumnos del docente. */
    private ComponenteLista listaAlumnos;
    /* El curso que da el docente. */
    private String curso;
    /* El grupo al que da clase el docente. */
    private String grupo;

    public Docente(String nombre, int id, String curso, String grupo) {
        this.nombre = nombre;
        this.id = id;
        this.curso = curso;
        this.grupo = grupo;
    }

    /**
     * Regresa el nombre del docente.
     * @return el nombre del docente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa la lista de alumnos del docente.
     * @return la lista de alumnos del docente.
     */
    public ComponenteLista consultarListaAlumnos() {
        //Aquí va el código.
    }

    /**
     * Regresa el grupo al que da clase el docente.
     * @return el grupo al que da clase el docente.
     */
    public String consultarGrupo() {
        return grupo;
    }

    /**
     * Regresa el curso que da el docente.
     * @return el curso que da el docente.
     */
    public String consultarCurso() {
        return curso;
    }

    /**
     * Asigna una calificación a un alumno.
     * @param alumno el alumno al que se le asignará una calificación.
     */
    public void asignarCalificacion(Alumno alumno) {
        //Aquí va el código.
    }

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
        //Aquí va el código.
    }

    /**
     * Regresa un iterador para poder iterar al componente.
     * @return un iterador para iterar al componente.
     */
    @Override public Iterador creaIterador() {
        return new IteradorNulo();
    }
}
