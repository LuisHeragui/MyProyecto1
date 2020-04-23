package mx.unam.ciencias.myp;

import java.util.Scanner;

public class ProyectoMain{
	
	public static void main(String[] args) {
		
		Administrador administrador = new Administrador();
		administrador.contratarProfesor();

		int idProfesor = 0;
		int idAlumno = 0;

		//Creacion de las Materias y Opcion Tecnica.
		Materia fisicaA = new Materia("física", "A");
		Materia fisicaB = new Materia("física", "B");
		Materia matematicasA = new Materia("matemáticas", "A");
		Materia matematicasB = new Materia("matemáticas", "B");
		Materia biologiaA = new Materia("biología", "A");
		Materia biologiaB = new Materia("biología", "B");
		Materia quimicaA = new Materia("química", "A");
		Materia quimicaB = new Materia("química", "B");
		Materia historiaA = new Materia("historia", "A");
		Materia historiaB = new Materia("historia", "B");
		Materia cienciasSocialesA = new Materia("cienciasSociales", "A");
		Materia cienciasSocialesB = new Materia("cienciasSociales", "B");
		Materia filosofiaA = new Materia("filosofía", "A");
		Materia filosofiaB = new Materia("filosofía", "B");
		Materia artesPlasticasA = new Materia("artesPlásticas", "A");
		Materia artesPlasticasB = new Materia("artesPlásticas", "B");
		OpcionTecnica agenteViajesHoteleria = new OpcionTecnica("agenteViajesyHotelería", "");
		OpcionTecnica fotografoLaboratoristaPrensa = OpcionTecnica("fotógrafoLaboratoristaPrensa", "");
		OpcionTecnica nutriologo = new OpcionTecnica("nutriólogo", "");
		OpcionTecnica laboratoristaQuimico = new OpcionTecnica("laboratoristaQuímico", "");

		//Contratacion de los profesores.
		administrador.contratarProfesor("Juanito", idProfesor++, fisicaA);
		administrador.contratarProfesor("Luis", idProfesor++, matematicasA);
		administrador.contratarProfesor("Diego", idProfesor++, biologiaA);
		administrador.contratarProfesor("Osito", idProfesor++, quimicaA);
		administrador.contratarProfesor("Claudia", idProfesor++, historiaA);
		administrador.contratarProfesor("Regina", idProfesor++, cienciasSocialesA);
		administrador.contratarProfesor("Pepe", idProfesor++, filosofiaA);
		administrador.contratarProfesor("Vaquero", idProfesor++, artesPlásticasA);
		administrador.contratarProfesor("Salama", idProfesor++, agenteViajesyHotelería);
		administrador.contratarProfesor("Chaneque", idProfesor++, fotografoLaboratoristaPrensa);
		administrador.contratarProfesor("Dafne", idProfesor++, nutriologo);
		administrador.contratarProfesor("Fernando", idProfesor++, laboratoristaQuimico);

		//Creamos Lista de materias del alumno que se va a inscribir
		ListaMaterias materias = new ListaMaterias();

		materias.agrega(fisicaA);
		materias.agrega(matematicasA);

		//Primer grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Jose", idAlumno++, materias);
		administrador.inscribirAlumno("Pancho", idAlumno++, materias);
		administrador.inscribirAlumno("Ines", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Segeundo Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Tercer Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Cuarto Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Quinto Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Sexto Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Septimo Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Octavo Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Noveno Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Decimo Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//Onceavo Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);

		//DOceavo Grupo
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Alberto", idAlumno++, materias);
		administrador.inscribirAlumno("Blaa", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);
		administrador.inscribirAlumno("Nuria", idAlumno++, materias);


		Scanner sc = new Scanner(System.in);

		imprime("HUevos");
	}

	//Metodo auxiliar para no escribir mucho
	public static void imprime(Object o){
		System.out.print(o);
	}
}