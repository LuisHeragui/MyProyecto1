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
    private ListaMaterias materias;
    /* La lista de profesores del alumno. */
    private ListaProfesores profesores;

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
     * Regresa los nombres de las materias del alumno.
     * @return los nombres de las materias del alumno.
     */
    @Override public String getNombreMaterias() {
        String s = "";
        Iterador<Object> iterador = this.materias.creaIterador();
        while (iterador.hasNext()) {
            Materia materia = (Materia)iterador.next();
            s += materia.getNombre() + "\n";
        }
        return s;
    }

    /**
     * Regresa una materia del alumno.
     * @param materia la materia a regresar.
     * @return una materia del alumno.
     */
    @Override public Materia getMateria(String nombre) {
        Iterador<Object> iterador = materias.creaIterador();
        while (iterador.hasNext()) {
            Materia materia = (Materia)iterador.next();
            if (materia.getNombre().equals(nombre))
                return materia;
            continue;
        }
        System.out.println("No se encontró la materia " + nombre + ".");
        return null;
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
        Iterador<Object> iterador = materias.creaIterador();
        while (iterador.hasNext()) {
            Materia materia = (Materia)iterador.next();
            suma += materia.getCalificacion();
        }
        return suma/materias.longitud();
    }

    /**
     * Regresa la calificacion del alumno de la materia especificada.
     * @param nombre la materia de la que consultaremos la calificación.
     * @return la calificacion del alumno de la materia especificada.
     */
    @Override public int consultarCalificacion(String nombre) {
        Iterador<Object> iterador = materias.creaIterador();
        while (iterador.hasNext()) {
            Materia materia = (Materia)iterador.next();
            if (nombre.equals(materia.getNombre()))
                return materia.getCalificacion();
        }
        return -1;
    }

    /**
     * Inscribe una opción técnica y regresa al alumno actualizado con la opción
     * técnica que esta cursando.
     * @param opcionTecnica la opción técnica a inscribir.
     * @return el alumno actualizado.
     */
    @Override public AlumnoDecorador inscribirOT(OpcionTecnica opcionTecnica) {
        System.out.println("Inscrito correctamente.");
        AlumnoDecorador alumno = new AlumnoDecorador(this, opcionTecnica);
        opcionTecnica.getProfesor().getListaAlumnos().agrega(alumno);
        return alumno;
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
        return this.getID() + ": " + this.getNombre();
    }

    /**
     * Regresa true si el objeto es igual al objeto recibido, o false en otro
     * caso.
     * @param alumno el alumno que vamos a comparar.
     * @return true si el objeto es igual al objeto recibido, o false en otro
     * caso.
     */
    @Override public boolean equals(Object objeto) {
        if (objeto instanceof Alumno) {
            Alumno alumno = (Alumno)objeto;
            if (this.getNombre().equals(alumno.getNombre()) &&
                this.getID() == alumno.getID())
                return true;
        }
        return false;
    }
}
