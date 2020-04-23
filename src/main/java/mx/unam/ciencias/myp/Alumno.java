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
            if (materia.equals(m.getNombre()))
                return m.getCalificacion();
            continue;
        }
        System.out.println("No se encontró la materia.");
        return -1;
    }

    /**
     * Inscribe una opción técnica y regresa al alumno actualizado con la opción
     * técnica que esta cursando.
     * @param opcionTecnica la opción técnica a inscribir.
     * @return el alumno actualizado.
     */
    @Override public AlumnoDecorador inscribirOT(OpcionTecnica opcionTecnica) {
        return new AlumnoDecorador(this, opcionTecnica);
    }

    /**
     * Nos dice si el alumno cursa una opción técnica.
     * @return true si el alumno cursa una opción técnica, o false en otro caso.
     */
    @Override public boolean tieneOT() {
        return false;
    }

    /**
     * Regresa una representación en cadena del componente.
     * @return una representación en cadena del componente.
     */
    @Override public String toString() {
        return this.getID().toString() + ": " + this.getNombre();
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
