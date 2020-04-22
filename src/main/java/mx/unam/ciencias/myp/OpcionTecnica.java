package mx.unam.ciencias.myp;

/**
 * Clase para representar una opción técnica.
 */
public class OpcionTecnica {

    /* El nombre de la opción técnica. */
    private String nombre;
    /* La calificación asignada a la opción técnica. */
    private int calificacion;
    /* El profesor asignado a la opción técnica. */
    private Profesor profesor;

    /**
     * Constructor que define el estado inicial de una opción técnica.
     * @param nombre el nombre de la opción técnica;
     */
    public OpcionTecnica(String nombre) {
        this.nombre = nombre;
        calificacion = 10;
        profesor = null;
    }

    /**
     * Regresa el nombre de la opción técnica.
     * @return el nombre de la opción técnica.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa la calificación de la opción técnica.
     * @return la calificaión de la opción técnica.
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Define la calificación de la opción técnica.
     * @param calificacion la calificacion de la opción técnica.
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Regresa el profesor de la opción técnica.
     * @return el profesor de la opción técnica.
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Define al profesor de la opción técnica.
     * @param profesor el profesor de la opción técnica.
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
