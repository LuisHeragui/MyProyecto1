package mx.unam.ciencias.myp;

/**
 * Clase abstracta para representar un alumno.
 * Extiende a Usuario e Implementa Universitario<T>.
 */
public abstract class AlumnoAbstracto extends Usuario
implements Universitario<AlumnoAbstracto> {

    /**
     * Regresa el nombre del alumno.
     * @return el nombre del alumno.
     */
    @Override public String getNombre() {
        return null;
    }

    /**
     * Regresa el id del alumno.
     * @return el id del alumno.
     */
    @Override public abstract int getID() {
        return null;
    }

    /**
     * Regresa la lista de materias del alumno.
     * @return la lista de materias del alumno.
     */
    public abstract ListaMaterias getMaterias();

    /**
     * Regresa una materia del alumno.
     * @param materia la materia a regresar.
     * @return una materia del alumno.
     */
    public abstract Materia getMateria(String materia);

    /**
     * Regresa la lista de profesores del alumno.
     * @return la lista de profesores del alumno.
     */
    public abstract ListaProfesores getProfesores();

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
     * Inscribe una opción técnica y regresa al alumno actualizado con la opción
     * técnica que esta cursando.
     * @param opcionTecnica la opción técnica a inscribir.
     * @return el alumno actualizado.
     */
    public abstract AlumnoDecorador inscribirOT(OpcionTecnica opcionTecnica);

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    @Override public String toString() {
        return null;
    }

    /**
     * Regresa true si el objeto es igual al objeto recibido, o false en otro
     * caso.
     * @param alumno el alumno que vamos a comparar.
     * @return true si el objeto es igual al objeto recibido, o false en otro
     * caso.
     */
    @Override public boolean equals(AlumnoAbstracto alumno) {
        return null;
    }
}
