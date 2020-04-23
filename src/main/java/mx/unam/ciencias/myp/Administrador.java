package mx.unam.ciencias.myp;

/**
 * Clase para representar un administrador.
 * Extiende a Usuario.
 */
public class Administrador extends Usuario {

    /* La lista de profesores. */
    private ListaProfesores profesores;

    /**
     * Constructor que define el estado incial del administrador.
     */
    public Administrador() {
        this.profesores = new ListaProfesores();
        this.setMenu(new MenuAdministrador());
    }

    /**
     * Regresa al alumno cuyo id es igual al recibido como parámetro.
     * @param id el id del alumno.
     * @return el alumno cuyo id es igual al recibido como parámetro.
     */
    public AlumnoAbstracto getAlumno(int id) {
        Iterador<Object> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = (Profesor)iteradorP.next();
            ListaAlumnos alumnosProf = profesor.getListaAlumnos();
            Iterador<Object> iteradorA = alumnosProf.creaIterador();
            while (iteradorA.hasNext()) {
                AlumnoAbstracto alumno = (AlumnoAbstracto)iteradorA.next();
                if (alumno.getID() == id)
                    return alumno;
                continue;
            }
        }
        System.out.println("No se puedo encontrar al alumno.");
        return null;
    }

    /**
     * Regresa al profesor cuyo id es igual al recibido como parámetro.
     * @param id el id del profesor.
     * @return el profesor cuyo id es igual al recibido como parámetro.
     */
    public Profesor getProfesor(int id) {
        Iterador<Object> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = (Profesor)iteradorP.next();
            if (profesor.getID() == id)
                return profesor;
            continue;
        }
        System.out.println("No se puedo encontrar al profesor.");
        return null;
    }

    /**
     * Regresa la lista de alumnos totales.
     * @return la lista de alumnos totales.
     */
    public String getAlumnosTotales() {
        ListaAlumnos alumnos = new ListaAlumnos();
        Iterador<Object> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = (Profesor)iteradorP.next();
            ListaAlumnos alumnosProf = profesor.getListaAlumnos();
            Iterador<Object> iteradorA = alumnosProf.creaIterador();
            while (iteradorA.hasNext()) {
                AlumnoAbstracto alumno = (AlumnoAbstracto)iteradorA.next();
                if (!alumnos.contiene(alumno))
                    alumnos.agrega(alumno);
            }
        }
        return alumnos.toString();
    }

    /**
     * Regresa la lista de alumnos del área especificada.
     * @param area el área de la que queremos obtener la lista.
     * @return la lista de alumnos del área.
     */
    public String getAlumnosArea(int area) {
        ListaAlumnos alumnos = new ListaAlumnos();
        String materia1 = "";
        String materia2 = "";
        if (area == 1) {
            materia1 = "Física";
            materia2 = "Matemáticas";
        } else if (area == 2) {
            materia1 = "Biología";
            materia2 = "Química";
        } else if (area == 3) {
            materia1 = "Historia";
            materia2 = "Ciencias Sociales";
        } else if (area == 4) {
            materia1 = "Filosofía";
            materia2 = "Artes Plásticas";
        } else {
            System.out.println("No existe el área " + area);
            return "";
        }
        Iterador<Object> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = (Profesor)iteradorP.next();
            if (materia1.equals(profesor.consultarCurso()) ||
                materia2.equals(profesor.consultarCurso())) {
                ListaAlumnos alumnosProf = profesor.getListaAlumnos();
                Iterador<Object> iteradorA = alumnosProf.creaIterador();
                while (iteradorA.hasNext()) {
                    AlumnoAbstracto alumno = (AlumnoAbstracto)iteradorA.next();
                    if (alumnos.contiene(alumno))
                        continue;
                    else
                        alumnos.agrega(alumno);
                }
            } else
                continue;
        }
        return alumnos.toString();
    }

    /**
     * Regresa la lista de alumnos de la opción técnica especificada.
     * @param opcion la opción técnica de la que queremos obtener la
     * lista.
     * @return la lista de alumnos de la opción técnica.
     */
    public String getAlumnosOT(int opcion) {
        String opcionTecnica = "";
        if (opcion == 1) {
            opcionTecnica = "Agente de Viajes y Hotelería";
        } else if (opcion == 2) {
            opcionTecnica = "Fotógrafo Laboratorista y Prensa";
        } else if (opcion == 3) {
            opcionTecnica = "Nutriólogo";
        } else if (opcion == 4) {
            opcionTecnica = "Laboratorista Químico";
        } else {
            return "No existe la opción técnica especificada.";
        }
        ListaAlumnos alumnos = new ListaAlumnos();
        Iterador<Object> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = (Profesor)iteradorP.next();
            if (opcionTecnica.equals(profesor.consultarCurso())) {
                ListaAlumnos alumnosProf = profesor.getListaAlumnos();
                Iterador<Object> iteradorA = alumnosProf.creaIterador();
                while (iteradorA.hasNext()) {
                    AlumnoAbstracto alumno = (AlumnoAbstracto)iteradorA.next();
                    alumnos.agrega(alumno);
                }
                if (alumnos.longitud() == 0) {
                    System.out.println("Por el momento no hay alumnos cursando "
                                        + "esta opción técnica.");
                }
                return alumnos.toString();
            } else
                continue;
        }
        System.out.println("No hay profesor dando la opción técnica.");
        return "";
    }

    /**
     * Regresa la lista de profesores totales.
     * @return la lista de profesores totales.
     */
    public String getProfesores() {
        return profesores.toString();
    }

    /**
     * Regresa el certificado de graduación del alumno especificado.
     * @param id el id del alumno.
     * @return el certificado de graduación de un alumno.
     */
    public String graduarAlumno(int id) {
        AlumnoAbstracto alumno = getAlumno(id);
        if (alumno.equals(null))
            return "\n";
        String s = "CERTIFICADO DE GRADUACIÓN\n" +
                   "-------------------------\n" +
                   "Nombre: " + alumno.getNombre() + "\n" +
                   alumno.getMaterias().toString() + "\n" +
                   alumno.getProfesores().toString() + "\n" +
                   "Promedio: " + alumno.getPromedio() + "\n";
        if (alumno.tieneOT()) {
            AlumnoDecorador alumnoD = (AlumnoDecorador)alumno;
            s += "Opción Técnica: " + alumnoD.getOT();
        }
        return s;
    }

    /**
     * Inscribe a un alumno en el sistema. Le asigna un id, una lista de
     * materias y una lista de profesores.
     * @param nombre el nombre del alumno.
     * @param id el id del alumno.
     * @param materias la lista de materias del alumno.
     */
    public void inscribirAlumno(String nombre, int id, ListaMaterias materias) {
        ListaProfesores profesAlumno = new ListaProfesores();
        Iterador<Object> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = (Profesor)iteradorP.next();
            Iterador<Object> iteradorM = materias.creaIterador();
            while (iteradorM.hasNext()) {
                Materia materia = (Materia)iteradorM.next();
                if (profesor.consultarCurso().equals(materia.getNombre()))
                    profesAlumno.agrega(profesor);
            }
            if (profesAlumno.tiene2Profesores())
                break;
        }
        AlumnoAbstracto alumno = new Alumno(nombre, id, materias, profesAlumno);
        Iterador<Object> iterador = profesAlumno.creaIterador();
        while (iterador.hasNext()) {
            Profesor profesor = (Profesor)iterador.next();
            profesor.getListaAlumnos().agrega(alumno);
        }
    }

    /**
     * Da de baja a un alumno del sistema. Lo elimina de todas las listas.
     * @param id el id del alumno.
     */
    public void bajaAlumno(int id) {
        Iterador<Object> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = (Profesor)iteradorP.next();
            ListaAlumnos alumnosProf = profesor.getListaAlumnos();
            Iterador<Object> iteradorA = alumnosProf.creaIterador();
            while (iteradorA.hasNext()) {
                AlumnoAbstracto alumno = (AlumnoAbstracto)iteradorA.next();
                if (id == alumno.getID())
                    alumnosProf.elimina(alumno);
                continue;
            }
        }
    }

    /**
     * Contrata a un profesor. Le asigna un id, una materia, un grupo, y se
     * agrega al sistema.
     * @param nombre el nombre del profesor.
     * @param id el id del profesor.
     * @param curso el curso que dará el profesor.
     */
    public void contratarProfesor(String nombre, int id, Object curso) {
        if (profesores.estaLlena()) {
            System.out.println("Ya no podemos contratar más profesores.");
            return;
        }
        if (curso instanceof Materia) {
            Materia materia = (Materia)curso;
            Profesor profesor = new Profesor(nombre, id, materia.getNombre(), materia.getGrupo());
            profesores.agrega(profesor);
        }
        else if (curso instanceof OpcionTecnica) {
            OpcionTecnica opcionTecnica = (OpcionTecnica)curso;
            Profesor profesor = new Profesor(nombre, id, opcionTecnica.getNombre(), opcionTecnica.getGrupo());
            profesores.agrega(profesor);
        }
    }

    /**
     * Despide a un profesor. Lo elimina de todas las listas.
     * @param id el id del profesor.
     */
    public void despedirProfesor(int id) {
        Iterador<Object> iterador = profesores.creaIterador();
        while (iterador.hasNext()) {
            Profesor profesor = (Profesor)iterador.next();
            if (id == profesor.getID()) {
                ListaAlumnos alumnosProf = profesor.getListaAlumnos();
                Iterador<Object> iteradorM = alumnosProf.creaIterador();
                while (iteradorM.hasNext()) {
                    AlumnoAbstracto alumno = (AlumnoAbstracto)iterador.next();
                    alumno.getProfesores().elimina(profesor);
                }
                profesores.elimina(profesor);
            } else
                continue;
        }
    }
}
