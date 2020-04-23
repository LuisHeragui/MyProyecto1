package mx.unam.ciencias.myp;

import java.util.Scanner;

public class ProyectoMain{
	
	public static void main(String[] args) {
		
		Usuario administrador = new Administrador();

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
		administrador.inscribirAlumno("Jhony", idAlumno++, materias);
		administrador.inscribirAlumno("Paula", idAlumno++, materias);

		materias.limpia();
		materias.agrega(biologiaA);
		materias.agrega(quimicaA);

		//Segeundo Grupo
		administrador.inscribirAlumno("Agustin", idAlumno++, materias);
		administrador.inscribirAlumno("Ricardo", idAlumno++, materias);
		administrador.inscribirAlumno("Montserrat", idAlumno++, materias);
		administrador.inscribirAlumno("Emilia", idAlumno++, materias);
		administrador.inscribirAlumno("Luisa", idAlumno++, materias);
		administrador.inscribirAlumno("Rafael", idAlumno++, materias);
		administrador.inscribirAlumno("Alfonso", idAlumno++, materias);
		administrador.inscribirAlumno("Angela", idAlumno++, materias);

		materias.limpia();
		materias.agrega(historiaA);
		materias.agrega(cienciasSocialesA);


		//Tercer Grupo
		administrador.inscribirAlumno("Trunks", idAlumno++, materias);
		administrador.inscribirAlumno("Picoro", idAlumno++, materias);
		administrador.inscribirAlumno("Goku", idAlumno++, materias);
		administrador.inscribirAlumno("Gohan", idAlumno++, materias);
		administrador.inscribirAlumno("Krillin", idAlumno++, materias);
		administrador.inscribirAlumno("Bulma", idAlumno++, materias);
		administrador.inscribirAlumno("Milk", idAlumno++, materias);
		administrador.inscribirAlumno("Vegeta", idAlumno++, materias);

		materias.limpia();
		materias.agrega(filosofiaA);
		materias.agrega(artesPlásticasA);


		//Cuarto Grupo
		administrador.inscribirAlumno("Naruto", idAlumno++, materias);
		administrador.inscribirAlumno("Sasuke", idAlumno++, materias);
		administrador.inscribirAlumno("Sakura", idAlumno++, materias);
		administrador.inscribirAlumno("Hinata", idAlumno++, materias);
		administrador.inscribirAlumno("Kakashi", idAlumno++, materias);
		administrador.inscribirAlumno("Shoji", idAlumno++, materias);
		administrador.inscribirAlumno("Ino", idAlumno++, materias);
		administrador.inscribirAlumno("Shikamaru", idAlumno++, materias);

		materias.limpia();
		materias.agrega();
		materias.agrega();


		//Quinto Grupo
		administrador.inscribirAlumno("Luffy", idAlumno++, materias);
		administrador.inscribirAlumno("Zoro", idAlumno++, materias);
		administrador.inscribirAlumno("Nami", idAlumno++, materias);
		administrador.inscribirAlumno("Usopp", idAlumno++, materias);
		administrador.inscribirAlumno("Sanji", idAlumno++, materias);
		administrador.inscribirAlumno("Chopper", idAlumno++, materias);
		administrador.inscribirAlumno("Franky", idAlumno++, materias);
		administrador.inscribirAlumno("Robin", idAlumno++, materias);


		Scanner sc = new Scanner(System.in);

		imprime("HUevos");
	}

	//Metodo auxiliar para no escribir mucho
	public static void imprime(Object o){
		System.out.print(o);
	}
}