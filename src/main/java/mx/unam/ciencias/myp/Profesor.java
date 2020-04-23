package mx.unam.ciencias.myp;

/**
 * Clase abstracta que define a un profesor.
 * Extiende a Usuario e implementa Universitario<T>.
 */
public class Profesor extends Usuario implements Universitario {

    /* El nombre del profesor. */
    private String nombre;
    /* El id del profesor. */
    private int id;
    /* La lista de alumnos del profesor. */
    private ListaAlumnos listaAlumnos;
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
        listaAlumnos = new ListaAlumnos();
        this.setMenu(new MenuProfesor());
    }

    /**
     * Regresa el nombre del profesor.
     * @return el nombre del profesor.
     */
    @Override public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el id del profesor.
     * @return el id del profesor.
     */
    @Override public int getID() {
        return id;
    }

    /**
     * Regresa la lista de alumnos del profesor.
     * @return la lista de alumnos del profesor.
     */
    public ListaAlumnos getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * Regresa una representación en cadena de la lista de alumnos del profesor.
     * @return una representación en cadena de la lista de alumnos del profesor.
     */
    public String consultarListaAlumnos() {
        return listaAlumnos.toString();
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
    public void asignarCalificacion(int id, int calificacion) {
        Iterador iterador = listaAlumnos.creaIterador();
        AlumnoAbstracto alumno = null;
        while (iterador.hasNext()) {
            alumno = (AlumnoAbstracto)iterador.next();
            if (alumno.getID() == id) {
                alumno.getMateria(curso).setCalificacion(calificacion);
                System.out.println("Calificación asignada exitosamente.");
                return;
            } else
                continue;
        }
        System.out.println("El alumno seleccionado no se encuentra en la " +
                           "lista de alumnos.");
        return;
    }

    /**
     * Regresa una representación en cadena del profesor.
     * @return una representación en cadena del profesor.
     */
    @Override public String toString() {
        return this.getID() + ": " + this.getNombre();
    }

    /**
     * Regresa true si el profesor es igual al profesor especificado, o false en
     * otro caso.
     * @param profesor el profesor que vamos a comparar.
     * @return true si el profesor es igual al profesor especificado, o false en
     * otro caso.
     */
    @Override public boolean equals(Object objeto) {
        if (objeto instanceof Profesor) {
            Profesor profesor = (Profesor)objeto;
            if (this.getNombre().equals(profesor.getNombre()) &&
                this.getID() == profesor.getID())
            return true;
        }
        return false;
    }
}
