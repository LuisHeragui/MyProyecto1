package mx.unam.ciencias.myp;

import java.util.Map;

/**
 * Clase para representar un administrador.
 * Extiende a Usuario.
 */
public class Administrador extends Usuario {

    /* La lista de profesores. */
    private Lista<Profesor> profesores;

    /**
     * Constructor que define el estado incial del administrador.
     * @param profesores la lista de profesores.
     */
    public Administrador() {
        this.profesores = new ListaProfesores();
        this.setMenu(new MenuAdministrador());
    }

    /**
     * Regresa la lista de alumnos totales.
     * @return la lista de alumnos totales.
     */
    public String getAlumnosTotales() {
        ListaAlumnos alumnos = new ListaAlumnos();
        Iterador<Profesor> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = iteradorP.next();
            ListaAlumnos alumnosProf = profesor.getListaAlumnos();
            Iterador<Map.Entry> iteradorM = alumnosProf.creaIterador();
            while (iteradorM.hasNext()) {
                Map.Entry me = (Map.Entry)iteradorM.next();
                AlumnoAbstracto alumno = me.getValue();
                if (alumnos.contiene(alumno))
                    continue;
                else
                    alumnos.agrega(alumno);
            }
        }
        alumnos.toString();
    }

    /**
     * Regresa la lista de alumnos del área especificada.
     * @param area el área de la que queremos obtener la lista.
     * @return la lista de alumnos del área.
     */
    public String getAlumnosArea(String area) {
        ListaAlumnos alumnos = new ListaAlumnos();
        String materia1 = "";
        String materia2 = "";
        if (area.equals("fm")) {
            materia1 = "física";
            materia2 = "matemáticas";
        } else if (area.equals("cbs")) {
            materia1 = "biología";
            materia2 = "química";
        } else if (area.equals("cs")) {
            materia1 = "historia";
            materia2 = "ciencias sociales";
        } else if (area.equals("ha")) {
            materia1 = "filosofía";
            materia2 = "artes plásticas";
        } else {
            System.out.println("No existe el área " + area);
            return "";
        }
        Iterador<Profesor> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = iteradorP.next();
            if (materia1.equals(profesor.consultarCurso()) ||
                materia2.equals(profesor.consultarCurso())) {
                ListaAlumnos alumnosProf = profesor.getListaAlumnos();
                Iterador<Map.Entry> iteradorM = alumnosProf.creaIterador();
                while (iteradorM.hasNext()) {
                    Map.Entry me = (Map.Entry)iteradorM.next();
                    AlumnoAbstracto alumno = me.getValue();
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
     * @param opcionTecnica la opción técnica de la que queremos obtener la
     * lista.
     * @return la lista de alumnos de la opción técnica.
     */
    public String getAlumnosOT(String opcionTecnica) {
        ListaAlumnos alumnos = new ListaAlumnos();
        Iterador<Profesor> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = iteradorP.next();
            if (opcionTecnica.equals(profesor.consultarCurso())) {
                ListaAlumnos alumnosProf = profesor.getListaAlumnos();
                Iterador<Map.Entry> iteradorM = alumnosProf.creaIterador();
                while (iteradorM.hasNext()) {
                    Map.Entry me = (Map.Entry)iteradorM.next();
                    AlumnoAbstracto alumno = me.getValue();
                    alumnos.agrega(alumno);
                }
                return alumnos.toString();
            } else
                continue;
        }
        System.out.println("No hay profesor dando la opción técnica.");
        return ""
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
     * @param nombre el nombre del alumno.
     * @param id el id del alumno.
     * @return el certificado de graduación de un alumno.
     */
    public String graduarAlumno(int id) {
        AlumnoAbstracto alumno = buscaAlumno(id);
        if (alumno.equals(null))
            return "\n";
        String s = "CERTIFICADO DE GRADUACIÓN\n" +
                   "-------------------------\n"
                   "Nombre: " + alumno.getNombre() + "\n" +
                   alumno.getMaterias().toString() + "\n" +
                   alumno.getProfesores().toString() + "\n" +
                   "Promedio: " + alumno.getPromedio().toString() + "\n";
        if (alumno.tieneOT())
            s += "Opción Técnica: " + alumno.getOT();
        return s;
    }

    private AlumnoAbstracto buscaAlumno(int id) {
        Iterador<Profesor> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = iteradorP.next();
            ListaAlumnos alumnosProf = profesor.getListaAlumnos();
            Iterador<Map.Entry> iteradorM = alumnosProf.creaIterador();
            while (iteradorM.hasNext()) {
                Map.Entry me = (Map.Entry)iteradorM.next();
                AlumnoAbstracto alumno = me.getValue();
                if (id == alumno.getID())
                    return alumno;
                continue;
            }
        }
        System.out.println("El alumno no se encuentra en el sistema.");
        return null;
    }

    /**
     * Inscribe a un alumno en el sistema. Le asigna un id, una lista de
     * materias y una lista de profesores.
     * @param nombre el nombre del alumno.
     */
    public void inscribirAlumno(String nombre, int id, ListaMaterias materias) {
        ListaProfesores profesores = new ListaProfesores();
        Iterador<Profesor> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = iteradorP.next();
            Iterador<Materia> iteradorM = materias.creaIterador();
            while (iteradorM.hasNext()) {
                Materia materia = iteradorM.next();
                if (profesor.getCurso().equals(materia.getNombre()))
                    profesores.agrega(profesor);
                else
                    continue;
            }
        }
        AlumnoAbstracto alumno = new Alumno(nombre, id, materias, profesores);
        Iterador<Profesor> iterador = profesores.creaIterador();
        while (iterador.hasNext()) {
            Profesor profesor = iterador.next();
            profesor.getListaAlumnos.agrega(alumno);
        }
    }

    /**
     * Da de baja a un alumno del sistema. Lo elimina de todas las listas.
     * @param nombre el nombre del alumno.
     * @param id el id del alumno.
     */
    public void bajaAlumno(int id) {
        Iterador<Profesor> iteradorP = profesores.creaIterador();
        while (iteradorP.hasNext()) {
            Profesor profesor = iteradorP.next();
            ListaAlumnos alumnosProf = profesor.getListaAlumnos();
            Iterador<Map.Entry> iteradorM = alumnosProf.creaIterador();
            while (iteradorM.hasNext()) {
                Map.Entry me = (Map.Entry)iteradorM.next();
                AlumnoAbstracto alumno = me.getValue();
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
     */
    public void contratarProfesor(String nombre, int id, Object curso) {
        if (profesores.estaLlena()) {
            System.out.println("Ya no podemos contratar más profesores.");
            return;
        }
        Profesor profesor = new Profesor(nombre, id, curso.getNombre());
        profesores.agrega(profesor);
    }

    /**
     * Despide a un profesor. Lo elimina de todas las listas.
     * @param nombre el nombre del profesor.
     * @param id el id del profesor.
     */
    public void despedirProfesor(int id) {
        Iterador<Profesor> iterador = profesores.creaIterador();
        while (iterador.hasNext()) {
            Profesor profesor = iterador.next();
            if (id == profesor.getID()) {
                ListaAlumnos alumnosProf = profesor.getListaAlumnos();
                Iterador<Map.Entry> iteradorM = alumnosProf.creaIterador();
                while (iteradorM.hasNext()) {
                    Map.Entry me = (Map.Entry)iteradorM.next();
                    AlumnoAbstracto alumno = me.getValue();
                    alumno.getProfesores().elimina(profesor);
                }
                profesores.elimina(profesor);
            } else
                continue;
        }
    }
}
