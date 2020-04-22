package mx.unam.ciencias.myp;

/**
 * Clase para representar un alumno.
 * Extiende a AlumnoAbstracto.
 */
public class AlumnoDecorador extends AlumnoAbstracto {

    /* El alumno a decorar. */
    private Alumno alumno;
    /* La opción técnica del alumno. */
    private OpcionTecnica opcionTecnica;

    /**
     * Constructor que define el estado inicial del alumno decorador.
     * @param alumno el alumno a ser decorado.
     * @param opcionTecnica la opción técnica del alumno.
     */
    public AlumnoDecorador(Alumno alumno, OpcionTecnica opcionTecnica) {
        this.alumno = alumno;
        this.opcionTecnica = opcionTecnica;
        this.setMenu(new MenuAlumno());
    }

    /**
     * Regresa el nombre del alumno.
     * @return el nombre del alumno.
     */
    @Override public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el id del alumno.
     * @return el id del alumno.
     */
    @Override public int getID() {
        return id;
    }

    /**
     * Regresa la lista de materias del alumno.
     * @return la lista de materias del alumno.
     */
    @Override public ArrayList<Materia> getMaterias() {
        return materias;
    }

    /**
     * Regresa la lista de profesores del alumno.
     * @return la lista de profesores del alumno.
     */
    @Override public ArrayList<String> getProfesores() {
        return profesores;
    }

    /**
     * Regresa el promedio del alumno.
     * @return el promedio del alumno.
     */
    @OVerride public abstract double getPromedio() {
        //Aquí va el código.
    }

    /**
     * Regresa la calificacion del alumno de la materia especificada.
     * @param materia la materia de la que consultaremos la calificación.
     * @return la calificacion del alumno de la materia especificada.
     */
    @Override public int consultarCalificacion(String materia) {
        //Aquí va el código.
    }

    /**
     * Regresa el nombre de la opción técnica.
     * @return el nombre de la opción técnica.
     */
    public String getOT() {
        return opcionTecnica.getNombre();
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    @Override public String toString() {
        //Aquí va el código.
    }
}
