package mx.unam.ciencias.myp;

import java.util.Scanner;

public class ProyectoMain{

	public static void main(String[] args) {

		// El aministrador para llevar a cabe la ejecución del programa.
		Administrador administrador = new Administrador();

		// Variable global que sirve como contador de profesores y como id único.
		int idProfesor = 0;
		// Variable global que sirve como contador de alumnos y como id único.
		int idAlumno = 0;
		// Variable global que sirve para alternar entre grupos al inscribir un
		// alumno.
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

		//Creamos Lista de materias que tendrán los alumnos.
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

		ListaMaterias materias2 = new ListaMaterias();
		materias2.agrega(biologiaA);
		materias2.agrega(quimicaA);

		//Segundo Grupo
		administrador.inscribirAlumno("Luffy", idAlumno++, materias2);
		administrador.inscribirAlumno("Zoro", idAlumno++, materias2);
		administrador.inscribirAlumno("Nami", idAlumno++, materias2);
		administrador.inscribirAlumno("Usopp", idAlumno++, materias2);
		administrador.inscribirAlumno("Sanji", idAlumno++, materias2);
		administrador.inscribirAlumno("Chopper", idAlumno++, materias2);
		administrador.inscribirAlumno("Franky", idAlumno++, materias2);
		administrador.inscribirAlumno("Robin", idAlumno++, materias2);

		ListaMaterias materias3 = new ListaMaterias();
		materias3.agrega(historiaA);
		materias3.agrega(cienciasSocialesA);


		//Tercer Grupo
		administrador.inscribirAlumno("Trunks", idAlumno++, materias3);
		administrador.inscribirAlumno("Picoro", idAlumno++, materias3);
		administrador.inscribirAlumno("Goku", idAlumno++, materias3);
		administrador.inscribirAlumno("Gohan", idAlumno++, materias3);
		administrador.inscribirAlumno("Krillin", idAlumno++, materias3);
		administrador.inscribirAlumno("Bulma", idAlumno++, materias3);
		administrador.inscribirAlumno("Milk", idAlumno++, materias3);
		administrador.inscribirAlumno("Vegeta", idAlumno++, materias3);

		ListaMaterias materias4 = new ListaMaterias();
		materias4.agrega(filosofiaA);
		materias4.agrega(artesPlasticasA);


		//Cuarto Grupo
		administrador.inscribirAlumno("Naruto", idAlumno++, materias4);
		administrador.inscribirAlumno("Sasuke", idAlumno++, materias4);
		administrador.inscribirAlumno("Sakura", idAlumno++, materias4);
		administrador.inscribirAlumno("Hinata", idAlumno++, materias4);
		administrador.inscribirAlumno("Kakashi", idAlumno++, materias4);
		administrador.inscribirAlumno("Shoji", idAlumno++, materias4);
		administrador.inscribirAlumno("Ino", idAlumno++, materias4);
		administrador.inscribirAlumno("Shikamaru", idAlumno++, materias4);


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
												imprime("ALUMNOS TOTALES\n" +
														"---------------\n" +
														administrador.getAlumnosTotales()
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
														limpiaPantalla();
														imprime("ALUMNOS POR ÁREA\n" +
																"----------------\n" +
																administrador.getAlumnosArea(opcion));
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
														limpiaPantalla();
														imprime("ALUMNOS POR OPCIÓN TÉCNICA\n" +
																"--------------------------\n" +
																administrador.getAlumnosOT(opcion));
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
												imprime("PROFESORES: " + administrador.getProfesores()
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
														limpiaPantalla();
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
																imprime("\nAlumno " + nombre + " " + " inscrito.\n");
																break;
															case 2:
																materias2.limpia();
																if (grupo == 0) {
																	materias2.agrega(biologiaA);
																	materias2.agrega(quimicaA);
																	grupo = 1;
																} else {
																	materias2.agrega(biologiaB);
																	materias2.agrega(quimicaB);
																	grupo = 0;
																}
																imprime("\nEscriba el nombre del alumno.\n");
																String nombre2 = sc.next();
																administrador.inscribirAlumno(nombre2, idAlumno++, materias2);
																imprime("\nAlumno " + nombre2 + "inscrito.");
																break;
															case 3:
																materias3.limpia();
																if (grupo == 0) {
																	materias3.agrega(historiaA);
																	materias3.agrega(cienciasSocialesA);
																	grupo = 1;
																} else {
																	materias3.agrega(historiaB);
																	materias3.agrega(cienciasSocialesB);
																	grupo = 0;
																}
																imprime("\nEscriba el nombre del alumno.\n");
																String nombre3 = sc.next();
																administrador.inscribirAlumno(nombre3, idAlumno++, materias3);
																imprime("\nAlumno " + nombre3 + "inscrito.");
																break;
															case 4:
																materias4.limpia();
																if (grupo == 0) {
																	materias4.agrega(filosofiaA);
																	materias4.agrega(artesPlasticasA);
																	grupo = 1;
																} else {
																	materias4.agrega(filosofiaB);
																	materias4.agrega(artesPlasticasB);
																	grupo = 0;
																}
																imprime("\nEscriba el nombre del alumno.\n");
																String nombre4 = sc.next();
																administrador.inscribirAlumno(nombre4, idAlumno++, materias4);
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
																if (fisicaA.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, fisicaA);
																} else if (fisicaB.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, fisicaB);
																} else {
																	imprime("\nNo quedan grupos de física disponibles.");
																}
																break;

															case 2:
																if (matematicasA.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, matematicasA);
																} else if (matematicasB.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, matematicasB);
																} else {
																	imprime("\nNo quedan grupos de matemáticas disponibles.");
																}
																break;

															case 3:
																if (biologiaA.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, biologiaA);
																} else if (biologiaB.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, biologiaB);
																} else {
																	imprime("\nNo quedan grupos de biología disponibles.");
																}
																break;

															case 4:
																if (quimicaA.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, quimicaA);
																} else if (quimicaB.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, quimicaB);
																} else {
																	imprime("\nNo quedan grupos de química disponibles.");
																}
																break;

															case 5:
																if (historiaA.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, historiaA);
																} else if (historiaB.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, historiaB);
																} else {
																	imprime("\nNo quedan grupos de historia disponibles.");
																}
																break;

															case 6:
																if (cienciasSocialesA.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, cienciasSocialesA);
																} else if (cienciasSocialesB.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, cienciasSocialesB);
																} else {
																	imprime("\nNo quedan grupos de ciencias sociales disponibles.");
																}
																break;

															case 7:
																if (filosofiaA.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, filosofiaA);
																} else if (filosofiaB.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, filosofiaB);
																} else {
																	imprime("\nNo quedan grupos de filosofía disponibles.");
																}
																break;

															case 8:
																if (artesPlasticasA.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, artesPlasticasA);
																} else if (artesPlasticasB.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, artesPlasticasB);
																} else {
																	imprime("\nNo quedan grupos de artes plásticas disponibles.");
																}
																break;

															case 9:
																if (agenteViajesHoteleria.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, agenteViajesHoteleria);
																} else {
																	imprime("\nEl grupo de agentes de viajes y hotelería ya está ocupado.");
																}
																break;

															case 10:
																if (fotografoLaboratoristaPrensa.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, fotografoLaboratoristaPrensa);
																} else {
																	imprime("\nEl grupo de fotógrafo laboratorista y prensa ya está ocupado.");
																}
																break;

															case 11:
																if (nutriologo.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, nutriologo);
																} else {
																	imprime("\nEl grupo de nutriólogo ya está ocupado.");
																}
																break;

															case 12:
																if (laboratoristaQuimico.getProfesor() == null) {
																	administrador.contratarProfesor(nombre, idProfesor++, laboratoristaQuimico);
																} else {
																	imprime("\nEl grupo de laboratorista químico ya está ocupado.");
																}
																break;

															default:
																imprime("\nNo existe dicho curso.\n");
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
									limpiaPantalla();
									imprime("¿Cómo desea continuar en el sistema?\n" +
                           					"Digite el número de la opción que desee.\n\n" +
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
									imprime("\nBienvenido, profesor(a) " +
											profesor.getNombre() + "\n");
									profesor.imprimirMenu();
									imprime("\n¿Qué desea hacer?\n");
									while (sc.hasNext()) {
										if (sc.hasNextInt()) {
											opcion = sc.nextInt();
											while (opcion != 0) {
												switch (opcion) {
													case 1:
														limpiaPantalla();
														imprime("ALUMNOS\n" +
																"-------\n" +
																profesor.getListaAlumnos().toString());
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
														limpiaPantalla();
														imprime("Grupo: " + profesor.consultarGrupo());
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
														limpiaPantalla();
														imprime("Curso: " + profesor.consultarCurso());
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
														limpiaPantalla();
														imprime("ALUMNOS\n" +
																"-------\n" +
																profesor.getListaAlumnos().toString()
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
											limpiaPantalla();
											imprime("¿Cómo desea continuar en el sistema?\n" +
                           							"Digite el número de la opción que desee.\n\n" +
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
							imprime("ALUMNOS\n" +
							 		"-------\n" + administrador.getAlumnosTotales() +
									"\n\nIngrese su id.\n");
							while (sc.hasNext()) {
								if (sc.hasNextInt()) {
									opcion = sc.nextInt();			//hacer método
									AlumnoAbstracto alumno = administrador.getAlumno(opcion);
									if (alumno == null) {
										limpiaPantalla();
										imprime("ID incorrecto. Vuelve a intentarlo. \n");
										imprime("\n" + administrador.getAlumnosTotales() +
												"\n\nIngrese su id.\n");
										sc = new Scanner(System.in);
										continue;
									}
									limpiaPantalla();
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
														if (sc.hasNext()) {
															String materia = sc.next();
															int c = alumno.consultarCalificacion(materia);
															imprime("La calificación es " + c);
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
														limpiaPantalla();
														imprime(ots +
																"\nDigite el índice de " +
																"la opción técnica a la que " +
																"se desea inscribir.\n");
														while (sc.hasNext()) {
															if (sc.hasNextInt()) {
																opcion = sc.nextInt();
																switch (opcion) {
																	case 1:
																		alumno = alumno.inscribirOT(agenteViajesHoteleria);
																		break;
																	case 2:
																		alumno = alumno.inscribirOT(fotografoLaboratoristaPrensa);
																		break;
																	case 3:
																		alumno = alumno.inscribirOT(nutriologo);
																		break;
																	case 4:
																		alumno = alumno.inscribirOT(laboratoristaQuimico);
																		break;
																	default:
																		imprime("\nNo existe esa opción técnica\n");
																		sc = new Scanner(System.in);
																		break;
																}
																break;
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
											limpiaPantalla();
											imprime("¿Cómo desea continuar en el sistema?\n" +
                           							"Digite el número de la opción que desee.\n\n" +
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
