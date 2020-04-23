package mx.unam.ciencias.myp;

/**
 * Clase para representar un alumno.
 * Extiende a AlumnoAbstracto.
 */
public class Alumno extends AlumnoAbstracto {

    /* El nombre del alumno. */
    private String nombre;
    /* El id del alumno. */
    private int id;
    /* La lista de materias del alumno. */
    private Lista<Materia> materias;
    /* La lista de profesores del alumno. */
    private Lista<Profesor> profesores;
    /* El promedio del alumno. */
    private double promedio;

    /**
     * Constructor que define el estado inicial del alumno.
     * @param nombre el nombre del alumno.
     * @param id el id del alumno.
     * @param materias las materias del alumno.
     * @param profesores los profesores del alumno.
     */
    public Alumno(String nombre, int id, ListaMaterias materias,
                  ListaProfesores profesores) {
        this.nombre = nombre;
        this.id = id;
        this.materias = materias;
        this.profesores = profesores;
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
    @Override public ListaMaterias getMaterias() {
        return materias;
    }

    /**
     * Regresa la lista de profesores del alumno.
     * @return la lista de profesores del alumno.
     */
    @Override public ListaProfesores getProfesores() {
        return profesores;
    }

    /**
     * Regresa el promedio del alumno.
     * @return el promedio del alumno.
     */
    @OVerride public double getPromedio() {
        int suma = 0;
        Iterador<Materia> iterador = materias.creaIterador();
        while (iterador.hasNext()) {
            Materia materia = iterador.next();
            suma += materia.getCalificacion();
        }
        return suma/materias.longitud();
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
     * Inscribe una opción técnica.
     * @param opcionTecnica la opción técnica a inscribir.
     */
    public void inscribirOT(String opcionTecnica) {
        //Aquí va el código.
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    @Override public String toString() {
        //Aquí va el código.
    }
}
