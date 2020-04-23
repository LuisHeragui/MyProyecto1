package mx.unam.ciencias.myp;

import java.util.ArrayList;

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
    @Override public double getPromedio() {
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
        Iterador<Materia> iterador = materias.creaIterador();
        while (iterador.hasNext()) {
            Materia m = iterador.next();
            if (m.equals(materia))
                return m.getCalificacion();
            iterador.next();
        }
        System.out.println("No se encontró la matria");
        return -1;
    }

    /**
     * Regresa el nombre de la opción técnica.
     * @return el nombre de la opción técnica.
     */
    public String getOT() {
        return opcionTecnica.getNombre();
    }

    /**
     * Inscribe una opción técnica y regresa al alumno actualizado con la opción
     * técnica que esta cursando.
     * @param opcionTecnica la opción técnica a inscribir.
     * @return el alumno actualizado.
     */
    @Override public AlumnoDecorador inscribirOT(OpcionTecnica opcionTecnica) {
        System.out.println("Ya está inscrito en una opción técnica");
        return this;
    }

    /**
     * Nos dice si el alumno cursa una opción técnica.
     * @return true si el alumno cursa una opción técnica, o false en otro caso.
     */
    @Override public boolean tieneOT() {
        return true;
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    @Override public String toString() {
        return this.getID().toString + ": " + this.getNombre();
    }

    /**
     * Regresa true si el objeto es igual al objeto recibido, o false en otro
     * caso.
     * @param alumno el alumno que vamos a comparar.
     * @return true si el objeto es igual al objeto recibido, o false en otro
     * caso.
     */
    @Override public boolean equals(AlumnoAbstracto alumno) {
        if (this.getNombre().equals(alumno.getNombre()) &&
            this.getID() == alumno.getID())
            return true;
        return false;
    }
}
