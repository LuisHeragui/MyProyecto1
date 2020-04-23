package mx.unam.ciencias.myp;

/**
 * Clase que asigna el comportamiento del menu de alumnos.
 */
public class MenuAlumno implements Menu {

	/**
	 * Imprime el menu de los alumnos.
	 */
	public void imprimirMenu () {
		System.out.print("1.- Consultar calificaión de alguna materia.\n" +
						 "2.- Consultar Promedio.\n" +
						 "3.- Inscribirse a alguna Opción Tecnica.\n" +
						 "0.- Salir.\n");
	}
}
