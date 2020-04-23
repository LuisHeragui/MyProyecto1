package mx.unam.ciencias.myp;

/**
 * Clase que asigna el comportamiento del menu de administradores.
 */
public class MenuAdministrador implements Menu {

	/**
	 * Imprime el menu de los administradores.
	 */
	public void imprimirMenu () {
		String s = "1.- Consultar lista de alumnos inscritos en la escuela.\n" +
				   "2.- Consultar lista de alumnos de cada área.\n" +
				   "3.- Consultar lista de alumnos de opciones técnicas.\n" +
				   "4.- Consultar lista de profesores.\n" +
				   "5.- Graduar un alumno.\n" +
				   "6.- Inscribir un alumno.\n" +
				   "7.- Dar de baja un alumno.\n" +
				   "8.- Contratar un profesor.\n" +
				   "9.- Despedir un profesor.\n" +
				   "0.- Salir\n";
		System.out.print(s);
	}
}
