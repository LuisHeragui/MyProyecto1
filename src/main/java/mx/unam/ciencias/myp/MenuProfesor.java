package mx.unam.ciencias.myp;

/**
 * Clase que asigna el comportamiento del menu de profesores.
 */
public class MenuProfesor implements Menu {

	/**
	 * Imprime el menu de los profesores.
	 */
	public void imprimirMenu () {
		System.out.println("1.- Consultar Lista de Alumnos." + "\n" +
											 "2.- Consultar Grupo." + "\n" +
											 "3.- Consultar Materia que esta Impartiendo." + "\n" +
											 "4.- Consultar Opcion Tecnica que esta Impartiendo" + "\n" +
											 "5.- Asignar Califiones a cada Alumno." + "\n" +
											 "0.- Salir." + "\n");
	}
}
