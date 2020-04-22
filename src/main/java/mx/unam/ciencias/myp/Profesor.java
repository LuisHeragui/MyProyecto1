package mx.unam.ciencias.myp;

/**
 * Clase abstracta que define a un profesor.
 * Extiende a Usuario e implementa ComponenteLista.
 */
public class Profesor extends Usuario implements ComponenteLista {

    /* El nombre del profesor. */
    private String nombre;
    /* El id del profesor. */
    private int id;
    /* La lista de alumnos del profesor. */
    private ComponenteLista listaAlumnos;
    /* El curso que da el profesor. */
    private String curso;
    /* El grupo al que da clase el profesor. */
    private String grupo;

    /**
     * Constructor que define el estado incial del profesor.
     * @param nombre el nombre del profesor.
     * @param id el id del profesor.
     * @param curso el curso que da el profesor.
     * @param grupo el grupo al que da clase el profesor.
     */
    public Profesor(String nombre, int id, String curso, String grupo) {
        this.nombre = nombre;
        this.id = id;
        this.curso = curso;
        this.grupo = grupo;
        this.setMenu(new MenuProfesor());
    }

    /**
     * Regresa el nombre del profesor.
     * @return el nombre del profesor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa la lista de alumnos del profesor.
     * @return la lista de alumnos del profesor.
     */
    public ComponenteLista consultarListaAlumnos() {
        //Aquí va el código.
    }

    /**
     * Regresa el grupo al que da clase el profesor.
     * @return el grupo al que da clase el profesor.
     */
    public String consultarGrupo() {
        return grupo;
    }

    /**
     * Regresa el curso que da el profesor.
     * @return el curso que da el profesor.
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
