package mx.unam.ciencias.myp;

import java.util.Scanner;

public class ProyectoMain{

	public static void main(String[] args) {

		Administrador administrador = new Administrador();

		int idProfesor = 0;
		int idAlumno = 0;
		int grupo = 0;

		//Creacion de las Materias y Opcion Tecnica.
		Materia fisicaA = new Materia("Física", "A");
		Materia fisicaB = new Materia("Física", "B");
		Materia matematicasA = new Materia("Matemáticas", "A");
		Materia matematicasB = new Materia("Matemáticas", "B");
		Materia biologiaA = new Materia("Biología", "A");
		Materia biologiaB = new Materia("Biología", "B");
		Materia quimicaA = new Materia("Química", "A");
		Materia quimicaB = new Materia("Química", "B");
		Materia historiaA = new Materia("Historia", "A");
		Materia historiaB = new Materia("Historia", "B");
		Materia cienciasSocialesA = new Materia("Ciencias Sociales", "A");
		Materia cienciasSocialesB = new Materia("Ciencias Sociales", "B");
		Materia filosofiaA = new Materia("Filosofía", "A");
		Materia filosofiaB = new Materia("Filosofía", "B");
		Materia artesPlasticasA = new Materia("Artes Plásticas", "A");
		Materia artesPlasticasB = new Materia("Artes Plásticas", "B");
		OpcionTecnica agenteViajesHoteleria = new OpcionTecnica("Agente de Viajes y Hotelería", "");
		OpcionTecnica fotografoLaboratoristaPrensa = new OpcionTecnica("Fotógrafo Laboratorista y Prensa", "");
		OpcionTecnica nutriologo = new OpcionTecnica("Nutriólogo", "");
		OpcionTecnica laboratoristaQuimico = new OpcionTecnica("Laboratorista Químico", "");

		//Contratacion de los profesores.
		administrador.contratarProfesor("Juanito", idProfesor++, fisicaA);
		administrador.contratarProfesor("Luis", idProfesor++, matematicasA);
		administrador.contratarProfesor("Diego", idProfesor++, biologiaA);
		administrador.contratarProfesor("Osito", idProfesor++, quimicaA);
		administrador.contratarProfesor("Claudia", idProfesor++, historiaA);
		administrador.contratarProfesor("Regina", idProfesor++, cienciasSocialesA);
		administrador.contratarProfesor("Pepe", idProfesor++, filosofiaA);
		administrador.contratarProfesor("Vaquero", idProfesor++, artesPlasticasA);
		administrador.contratarProfesor("Salma", idProfesor++, agenteViajesHoteleria);
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

		//Segundo Grupo
		administrador.inscribirAlumno("Luffy", idAlumno++, materias);
		administrador.inscribirAlumno("Zoro", idAlumno++, materias);
		administrador.inscribirAlumno("Nami", idAlumno++, materias);
		administrador.inscribirAlumno("Usopp", idAlumno++, materias);
		administrador.inscribirAlumno("Sanji", idAlumno++, materias);
		administrador.inscribirAlumno("Chopper", idAlumno++, materias);
		administrador.inscribirAlumno("Franky", idAlumno++, materias);
		administrador.inscribirAlumno("Robin", idAlumno++, materias);

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
		materias.agrega(artesPlasticasA);


		//Cuarto Grupo
		administrador.inscribirAlumno("Naruto", idAlumno++, materias);
		administrador.inscribirAlumno("Sasuke", idAlumno++, materias);
		administrador.inscribirAlumno("Sakura", idAlumno++, materias);
		administrador.inscribirAlumno("Hinata", idAlumno++, materias);
		administrador.inscribirAlumno("Kakashi", idAlumno++, materias);
		administrador.inscribirAlumno("Shoji", idAlumno++, materias);
		administrador.inscribirAlumno("Ino", idAlumno++, materias);
		administrador.inscribirAlumno("Shikamaru", idAlumno++, materias);


		Scanner sc = new Scanner(System.in);
		String opciones = "1.- Administrador.\n" +
						  "2.- Profesor.\n" +
						  "3.- Alumno.\n" +
						  "0.- Salir.\n";

		String areas = "1. Físico-Matemáticas\n" +
					   "2. Ciencias Biológicas y de la Salud\n" +
					   "3. Ciencias Sociales\n" +
					   "4. Humanidades y Artes\n";

		String cursos = "1. Física\n" +
					   	"2. Matemáticas\n" +
				  		"3. Biología\n" +
						"4. Química\n" +
				  		"5. Historia\n" +
					  	"6. Ciencias Sociales\n" +
					  	"7. Filosofía\n" +
					  	"8. Artes Plásticas\n" +
						"9. Agente de Viajes y Hotelería\n" +
					 	"10. Fotógrafo Laboratorista y Prensa\n" +
					 	"11. Nutriólogo\n" +
					 	"12. Laboratorista Químico\n";

		String ots = "1. Agente de Viajes y Hotelería\n" +
					 "2. Fotógrafo Laboratorista y Prensa\n" +
					 "3. Nutriólogo\n" +
					 "4. Laboratorista Químico\n";

		limpiaPantalla();
        imprime("\nEscuela Nacional Preparatoria N°10 " +
                           "\"Francisco Villa\" UNAM.\n\n" +
                           "¿Cómo desea ingresar al sistema?\n" +
                           "Digite el número de la opción que desee.\n\n" +
                           opciones);

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int opcion = sc.nextInt();
				while (opcion != 0) {
					switch (opcion) {
						case 1:
							limpiaPantalla();
							imprime("\nBienvenido, administrador.\n" +
									"¿Qué desea hacer?\n");
							administrador.imprimirMenu();
							while (sc.hasNext()) {
								if (sc.hasNextInt()) {
									opcion = sc.nextInt();
									while (opcion != 0) {
										switch (opcion) {
											case 1:
												limpiaPantalla();
												imprime(administrador.getAlumnosTotales()
														+ "\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											case 2:
												limpiaPantalla();
												imprime(areas +
														"\n¿De qué área desea consultar los alumnos?\n");
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														imprime(administrador.getAlumnosArea(opcion));
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n" +
																areas);
														sc = new Scanner(System.in);
													}
												}
												imprime("\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											case 3:
												limpiaPantalla();
												imprime(ots +
														"\n¿De qué opción técnica desea consultar los alumnos?\n");
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														imprime(administrador.getAlumnosOT(opcion));
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n" +
																areas);
														sc = new Scanner(System.in);
													}
												}
												imprime("\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											case 4:
												limpiaPantalla();
												imprime(administrador.getProfesores()
														+ "\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											case 5:
												limpiaPantalla();
												imprime(administrador.getAlumnosTotales() +
														"\nDigite el id del " +
												 	    "alumno a graduar.\n");
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														imprime(administrador.graduarAlumno(opcion));
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n" +
																administrador.getAlumnosTotales());
														sc = new Scanner(System.in);
													}
												}
												imprime("\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											case 6:
												limpiaPantalla();
												imprime("\n¿A qué área se inscribe el alumno?\n" +
														areas);
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														switch (opcion) {
															case 1:
																materias.limpia();
																if (grupo == 0) {
																	materias.agrega(fisicaA);
																	materias.agrega(matematicasA);
																	grupo = 1;
																} else {
																	materias.agrega(fisicaB);
																	materias.agrega(matematicasB);
																	grupo = 0;
																}
																imprime("\nEscriba el nombre del alumno.\n");
																String nombre = sc.next();
																administrador.inscribirAlumno(nombre, idAlumno++, materias);
																imprime("\nAlumno " + nombre + "inscrito.");
																break;
															case 2:
																materias.limpia();
																if (grupo == 0) {
																	materias.agrega(biologiaA);
																	materias.agrega(quimicaA);
																	grupo = 1;
																} else {
																	materias.agrega(biologiaB);
																	materias.agrega(quimicaB);
																	grupo = 0;
																}
																imprime("\nEscriba el nombre del alumno.\n");
																String nombre2 = sc.next();
																administrador.inscribirAlumno(nombre2, idAlumno++, materias);
																imprime("\nAlumno " + nombre2 + "inscrito.");
																break;
															case 3:
																materias.limpia();
																if (grupo == 0) {
																	materias.agrega(historiaA);
																	materias.agrega(cienciasSocialesA);
																	grupo = 1;
																} else {
																	materias.agrega(historiaB);
																	materias.agrega(cienciasSocialesB);
																	grupo = 0;
																}
																imprime("\nEscriba el nombre del alumno.\n");
																String nombre3 = sc.next();
																administrador.inscribirAlumno(nombre3, idAlumno++, materias);
																imprime("\nAlumno " + nombre3 + "inscrito.");
																break;
															case 4:
																materias.limpia();
																if (grupo == 0) {
																	materias.agrega(filosofiaA);
																	materias.agrega(artesPlasticasA);
																	grupo = 1;
																} else {
																	materias.agrega(filosofiaB);
																	materias.agrega(artesPlasticasB);
																	grupo = 0;
																}
																imprime("\nEscriba el nombre del alumno.\n");
																String nombre4 = sc.next();
																administrador.inscribirAlumno(nombre4, idAlumno++, materias);
																imprime("\nAlumno " + nombre4 + "inscrito.");
																break;
															default:
																imprime("\nIngrese una opción válida.\n");
																sc = new Scanner(System.in);
																break;
														}
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n" +
																areas);
														sc = new Scanner(System.in);
													}
												}
												imprime("\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											case 7:
												limpiaPantalla();
												imprime(administrador.getAlumnosTotales() +
														"\nDigite el id del " +
												 	    "alumno a dar de baja.\n");
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														administrador.bajaAlumno(opcion);
														imprime("\nAlumno " + opcion +
																" dado de baja.");
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n" +
																administrador.getAlumnosTotales());
														sc = new Scanner(System.in);
													}
												}
												imprime("\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											case 8:
												limpiaPantalla();
												imprime(cursos +
														"\n¿De qué curso es el profesor?\n");
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														imprime("\nEscriba el nombre del profesor.\n");
														String nombre = sc.next();
														switch (opcion) {
															case 1:
																if (fisicaA.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, fisicaA);
																} else if (fisicaB.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, fisicaB);
																} else {
																	imprime("\nNo quedan grupos de física disponibles.");
																}
																break;

															case 2:
																if (matematicasA.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, matematicasA);
																} else if (matematicasB.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, matematicasB);
																} else {
																	imprime("\nNo quedan grupos de matemáticas disponibles.");
																}
																break;

															case 3:
																if (biologiaA.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, biologiaA);
																} else if (biologiaB.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, biologiaB);
																} else {
																	imprime("\nNo quedan grupos de biología disponibles.");
																}
																break;

															case 4:
																if (quimicaA.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, quimicaA);
																} else if (quimicaB.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, quimicaB);
																} else {
																	imprime("\nNo quedan grupos de química disponibles.");
																}
																break;

															case 5:
																if (historiaA.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, historiaA);
																} else if (historiaB.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, historiaB);
																} else {
																	imprime("\nNo quedan grupos de historia disponibles.");
																}
																break;

															case 6:
																if (cienciasSocialesA.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, cienciasSocialesA);
																} else if (cienciasSocialesB.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, cienciasSocialesB);
																} else {
																	imprime("\nNo quedan grupos de ciencias sociales disponibles.");
																}
																break;

															case 7:
																if (filosofiaA.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, filosofiaA);
																} else if (filosofiaB.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, filosofiaB);
																} else {
																	imprime("\nNo quedan grupos de filosofía disponibles.");
																}
																break;

															case 8:
																if (artesPlasticasA.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, artesPlasticasA);
																} else if (artesPlasticasB.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, artesPlasticasB);
																} else {
																	imprime("\nNo quedan grupos de artes plásticas disponibles.");
																}
																break;

															case 9:
																if (agenteViajesHoteleria.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, agenteViajesHoteleria);
																} else {
																	imprime("\nEl grupo de agentes de viajes y hotelería ya está ocupado.");
																}
																break;

															case 10:
																if (fotografoLaboratoristaPrensa.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, fotografoLaboratoristaPrensa);
																} else {
																	imprime("\nEl grupo de fotógrafo laboratorista y prensa ya está ocupado.");
																}
																break;

															case 11:
																if (nutriologo.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, nutriologo);
																} else {
																	imprime("\nEl grupo de nutriólogo ya está ocupado.");
																}
																break;

															case 12:
																if (laboratoristaQuimico.getProfesor().equals(null)) {
																	administrador.contratarProfesor(nombre, idProfesor++, laboratoristaQuimico);
																} else {
																	imprime("\nEl grupo de laboratorista químico ya está ocupado.");
																}
																break;

															default:
																imprime("\nIngrese una opción válida.\n");
																sc = new Scanner(System.in);
																break;
														}
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n" +
																areas);
														sc = new Scanner(System.in);
													}
												}
												imprime("\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											case 9:
												limpiaPantalla();
												imprime(administrador.getProfesores() +
														"\nDigite el id del " +
												 	    "profesor a despedir.\n");
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														administrador.despedirProfesor(opcion);
														imprime("\nProfesor " + opcion +
																" despedido.");
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n" +
																administrador.getProfesores());
														sc = new Scanner(System.in);
													}
												}
												imprime("\n\n¿Qué más desea hacer?\n");
												administrador.imprimirMenu();
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;

											default:
												imprime("\nIngrese una opción válida.\n");
												administrador.imprimirMenu();
												sc = new Scanner(System.in);
												while (sc.hasNext()) {
													if (sc.hasNextInt()) {
														opcion = sc.nextInt();
														break;
													} else {
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
													}
												}
												break;
										}
									}
									imprime("\nGracias por su visita." +
											" Vuelva pronto.\n");
									sc.close();
									System.exit(1);
									break;
								} else {
									limpiaPantalla();
									imprime("\nIngrese una opción válida.\n");
									administrador.imprimirMenu();
									sc = new Scanner(System.in);
								}
							}
							break;

						case 2:
							limpiaPantalla();
							imprime("\n" + administrador.getProfesores() +
									"\n\nIngrese su id.\n");
							while (sc.hasNext()) {
								if (sc.hasNextInt()) {
									opcion = sc.nextInt();				//hacer método
									Profesor profesor = administrador.getProfesor(opcion);
									imprime("\nBienvenido, profesor " +
											profesor.getNombre() + "\n");
									profesor.imprimirMenu();
									imprime("\n¿Qué desea hacer?\n");
									while (sc.hasNext()) {
										if (sc.hasNextInt()) {
											opcion = sc.nextInt();
											while (opcion != 0) {
												switch (opcion) {
													case 1:
														imprime(profesor.getListaAlumnos().toString());
														imprime("\n\n¿Qué más desea hacer?\n");
														profesor.imprimirMenu();
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																profesor.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;

													case 2:
														imprime(profesor.consultarGrupo());
														imprime("\n\n¿Qué más desea hacer?\n");
														profesor.imprimirMenu();
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																profesor.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;

													case 3:
														imprime(profesor.consultarCurso());
														imprime("\n\n¿Qué más desea hacer?\n");
														profesor.imprimirMenu();
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																profesor.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;

													case 4:
														imprime(profesor.getListaAlumnos().toString()
																+ "\nDigite el id del alumno " +
																"al que se le asignará una calificación.\n");
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																imprime("\nDigite la calificación entera.\n");
																while (sc.hasNext()) {
																	if (sc.hasNextInt()) {
																		int cal = sc.nextInt();
																		profesor.asignarCalificacion(opcion, cal);
																		break;
																	} else {
																		limpiaPantalla();
																		imprime("\nIngrese una calificación válida.\n" +
																				profesor.getListaAlumnos().toString());
																		sc = new Scanner(System.in);
																	}
																}
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n" +
																		profesor.getListaAlumnos().toString());
																sc = new Scanner(System.in);
															}
														}
														imprime("\n\n¿Qué más desea hacer?\n");
														profesor.imprimirMenu();
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																profesor.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;

													default:
														imprime("\nIngrese una opción válida.\n");
														administrador.imprimirMenu();
														sc = new Scanner(System.in);
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																administrador.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;
												}
											}
											imprime("\nGracias por su visita." +
													" Vuelva pronto.\n");
											sc.close();
											System.exit(1);
											break;
										} else {
											limpiaPantalla();
											imprime("\nIngrese una opción válida.\n");
											profesor.imprimirMenu();
											sc = new Scanner(System.in);
										}
									}
									break;
								} else {
									limpiaPantalla();
									imprime("\nIngrese una opción válida.\n" +
											administrador.getProfesores());
									sc = new Scanner(System.in);
								}
							}
							break;

						case 3:
							limpiaPantalla();
							imprime("\n" + administrador.getAlumnosTotales() +
									"\n\nIngrese su id.\n");
							while (sc.hasNext()) {
								if (sc.hasNextInt()) {
									opcion = sc.nextInt();			//hacer método
									AlumnoAbstracto alumno = administrador.getAlumno(opcion);
									imprime("\nBienvenido, " +
											alumno.getNombre() +
									 		"\n¿Qué desea hacer?\n");
									alumno.imprimirMenu();
									while (sc.hasNext()) {
										if (sc.hasNextInt()) {
											opcion = sc.nextInt();
											while (opcion != 0) {
												switch (opcion) {
													case 1:
														limpiaPantalla();
														imprime(alumno.getNombreMaterias());
														imprime("\nEscriba correctamente el nombre de la materia " +
																"que desea consultar.\n");
														String materia = sc.nextLine();
														int c = alumno.consultarCalificacion(materia);
														imprime("La calificación es " + c);
														imprime("\n\n¿Qué más desea hacer?\n");
														alumno.imprimirMenu();
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																alumno.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;

													case 2:
														limpiaPantalla();
														imprime("Promedio: " +
																alumno.getPromedio());
														imprime("\n\n¿Qué más desea hacer?\n");
														alumno.imprimirMenu();
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																alumno.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;

													case 3:
														imprime(ots +
																"\nDigite el índice de " +
																"la opción técnica a la que " +
																"se desea inscribir.");
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																switch (opcion) {
																	case 1:
																		alumno = alumno.inscribirOT(agenteViajesHoteleria);
																		imprime("\nInscrito correctamente.");
																		break;
																	case 2:
																		alumno = alumno.inscribirOT(fotografoLaboratoristaPrensa);
																		imprime("\nInscrito correctamente.");
																		break;
																	case 3:
																		alumno = alumno.inscribirOT(nutriologo);
																		imprime("\nInscrito correctamente.");
																		break;
																	case 4:
																		alumno = alumno.inscribirOT(laboratoristaQuimico);
																		imprime("\nInscrito correctamente.");
																		break;
																	default:
																		imprime("\nIngrese una opción válida.\n" +
																				ots);
																		sc = new Scanner(System.in);
																		break;
																}
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n" +
																		ots);
																sc = new Scanner(System.in);
															}
														}
														imprime("\n\n¿Qué más desea hacer?\n");
														alumno.imprimirMenu();
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																alumno.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;

													default:
														limpiaPantalla();
														imprime("\nIngrese una opción válida.\n");
														alumno.imprimirMenu();
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																break;
															} else {
																limpiaPantalla();
																imprime("\nIngrese una opción válida.\n");
																alumno.imprimirMenu();
																sc = new Scanner(System.in);
															}
														}
														break;
												}
											}
											imprime("\nGracias por su visita." +
													" Vuelva pronto.\n");
											sc.close();
											System.exit(1);
											break;
										} else {
											limpiaPantalla();
											imprime("\nIngrese una opción válida.\n");
											alumno.imprimirMenu();
											sc = new Scanner(System.in);
										}
									}
									break;
								} else {
									limpiaPantalla();
									imprime("\nIngrese una opción válida.\n" +
											administrador.getAlumnosTotales());
									sc = new Scanner(System.in);
								}
							}
							break;

						default:
							limpiaPantalla();
							imprime("\nOpción inválida. Vuelva a intentarlo.\n" +
									opciones);
							sc = new Scanner(System.in);
							while (sc.hasNext()) {
								if (sc.hasNextInt()) {
									opcion = sc.nextInt();
									break;
								} else {
									limpiaPantalla();
									imprime("\nIngrese una opción válida.\n" +
											opciones);
									sc = new Scanner(System.in);
								}
							}
							break;
					}
				}
				imprime("\nGracias por su visita. Vuelva pronto.\n");
				sc.close();
				System.exit(1);
			} else {
				limpiaPantalla();
				imprime("\nIngrese una opción válida.\n" + opciones);
				sc = new Scanner(System.in);
			}
		}
		sc.close();
	}

	//Metodo auxiliar para no escribir mucho
	public static void imprime(Object o){
		System.out.print(o);
	}

	// Método auxiliar para limpiar la pantalla.
    private static void limpiaPantalla(){
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
}
