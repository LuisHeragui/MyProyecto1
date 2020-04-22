package mx.unam.ciencias.aa;

/**
 * Clase para representar un administrador.
 * Extiende a Usuario e implementa ComponenteLista.
 */
public class Administrador extends Usuario implements ComponenteLista {

    /* Las listas de alumnos y profesores que tiene el aministrador. */
    private ComponenteLista listas;

    /**
     * Constructor que define el estado incial del administrador.
     * @param listas las listas de alumnos y profesores.
     */
    public Administrador(ComponenteLista listas) {
        this.listas = listas;
    }

    /**
     * Regresa la lista de alumnos totales.
     * @return la lista de alumnos totales.
     */
    public ComponenteLista getAlumnosTotales() {
        //Aquí va el código.
    }

    /**
     * Regresa la lista de alumnos de la materia especificada.
     * @param materia la materia de la que queremos obtener la lista.
     * @return la lista de alumnos de la materia.
     */
    public ComponenteLista getAlumnosArea(String materia) {
        //Aquí va el código.
    }

    /**
     * Regresa la lista de alumnos de la opción técnica especificada.
     * @param opcionTecnica la opción técnica de la que queremos obtener la
     * lista.
     * @return la lista de alumnos de la opción técnica.
     */
    public ComponenteLista getAlumnosOT() {
        //Aquí va el código.
    }

    /**
     * Regresa la lista de profesores totales.
     * @return la lista de profesores totales.
     */
    public ComponenteLista getProfesores() {
        //Aquí va el código.
    }

    /**
     * Regresa el certificado de graduación del alumno especificado.
     * @param nombre el nombre del alumno.
     * @param id el id del alumno.
     * @return el certificado de graduación de un alumno.
     */
    public String graduarAlumno(String nombre, int id) {
        //Aquí va el código.
    }

    /**
     * Inscribe a un alumno en el sistema. Le asigna un id, una lista de
     * materias y una lista de profesores.
     * @param nombre el nombre del alumno.
     */
    public void inscribirAlumno(String nombre) {
        //Aquí va el código.
    }

    /**
     * Da de baja a un alumno del sistema. Lo elimina de todas las listas.
     * @param nombre el nombre del alumno.
     * @param id el id del alumno.
     */
    public void bajaAlumno(String nombre, int id) {
        //Aquí va el código.
    }

    /**
     * Contrata a un profesor. Le asigna un id, una materia, un grupo, y se
     * agrega al sistema.
     * @param nombre el nombre del profesor.
     */
    public void contratarProfesor(String nombre) {
        //Aquí va el código.
    }

    /**
     * Despide a un profesor. Lo elimina de todas las listas.
     * @param nombre el nombre del profesor.
     * @param id el id del profesor.
     */
    public void despedirProfesor(String nombre, int id) {
        //Aquí va el código.
    }
}
