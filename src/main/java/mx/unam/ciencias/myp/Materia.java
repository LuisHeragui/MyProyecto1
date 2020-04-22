package mx.unam.ciencias.myp;

/**
 * Clase para representar una materia.
 */

public class Materia {

	/* El nombre de la materia. */
	private String nombre;
	/* El grupo, A o B. */
	private String grupo;
	/* La calificación asignada a la materia. */
	private int calificacion;
	/* El profesor asignado a la materia. */
	private Profesor profesor;

	/**
     * Constructor que define el estado inicial de una materia.
     * @param nombre el nombre de la materia;
     */
	public Materia(String nombre) {
		this.nombre = nombre;
		calificacion = 10;
		profesor = null;
	}

	/**
     * Regresa el nombre de la materia.
     * @return el nombre de la materia.
     */
	public String getNombre() {
		return nombre;
	}

	/**
     * Regresa la calificación de la materia.
     * @return la calificaión de la materia.
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Define la calificación de la materia.
     * @param calificacion la calificacion de la materia.
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Regresa el profesor de la materia.
     * @return el profesor de la materia.
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Define al profesor de la materia.
     * @param profesor el profesor de la materia.
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

}