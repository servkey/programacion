public class BibliotecaTest{
	public static void main(String args[]){
		System.out.println("Bienvenido a Sistema Bibliotecario");

		Trabajador catalogoTrabajadores[] = new Trabajador[10];
		Socio catalogoSocios[] = new Socio[10];	
		Libro catalogoLibros[] = new Libro[10];
		Revista catalogoRevista[] = new Revista[10];
		
		Trabajador t1 = new Trabajador("T1", "10/10/10", "t1@uv.mx", "variados", 1948, "no tiene", "diabetes");
		catalogoTrabajadores[0] = t1;
		Trabajador t2 = new Trabajador("T2", "12/12/12", "t2@uv.mx", "no sé", 148, "tiene", "sin diabetes");
		catalogoTrabajadores[1] = t2;
		catalogoTrabajadores[2] = new Trabajador("T3", "13/13/13", "t3@uv.mx", "X", 145, "NA", "lala");
		catalogoTrabajadores[3] = new Trabajador("T4", "14/18/13", "t4@uv.mx", "X", 191, "NA", "blala");
		catalogoTrabajadores[4] = new Trabajador("T5", "15/16/11", "t4@uv.mx", "X", 185, "NA", "l");
		catalogoTrabajadores[5] = new Trabajador("T6", "16/19/12", "t4@uv.mx", "X", 1436, "NA", "#");
		catalogoTrabajadores[6] = new Trabajador("T7", "17/19/14", "t4@uv.mx", "X", 146, "NA", "Tad");
		catalogoTrabajadores[7] = new Trabajador("T8", "18/19/17", "t4@uv.mx", "X", 125, "NA", "l");
		catalogoTrabajadores[8] = new Trabajador("T9", "19/19/18", "t4@uv.mx", "X", 135, "NA", "la");
		catalogoTrabajadores[9] = new Trabajador("T10", "20/20/20", "t4@uv.mx", "X", 1145, "NA", "ya");



		catalogoSocios[0] = new Socio("S1", "11/8/13", "s1@uv.mx", "HP", "S1203930");
		catalogoSocios[1] = new Socio("S2", "12/2/14", "s2@uv.mx", "ninguno", "S120329");
		catalogoSocios[2] = new Socio("S3", "13/3/15", "s3@uv.mx", "terror", "S123211");
		catalogoSocios[3] = new Socio("S4", "14/1/17", "s4@uv.mx", "ficción", "S38469");
		catalogoSocios[4] = new Socio("S5", "15/1/13", "s5@uv.mx", "suspenso", "S29489");
		catalogoSocios[5] = new Socio("S6", "16/3/13", "s6@uv.mx", "drama", "S204893");
		catalogoSocios[6] = new Socio("S7", "17/4/19", "s7@uv.mx", "romance", "S01213");
		catalogoSocios[7] = new Socio("S8", "18/3/13", "s8@uv.mx", "triller psicológico", "S0999");
		catalogoSocios[8] = new Socio("S9", "19/1/11", "s9@uv.mx", "historia", "S018139");
		catalogoSocios[9] = new Socio("S10", "20/11/11", "s10@uv.mx", "ciencia", "S014139");

	
	 	catalogoLibros[0] = new Libro("G1", "I1", "A1", "T1", "F1", "ISBN1", "E1");
	 	catalogoLibros[1] = new Libro("G2", "I2", "A2", "T2", "F2", "ISBN2", "E2");
	 	catalogoLibros[2] = new Libro("G3", "I3", "A3", "T3", "F3", "ISBN3", "E3");
	 	catalogoLibros[3] = new Libro("G4", "I4", "A4", "T4", "F4", "ISBN4", "E4");
	 	catalogoLibros[4] = new Libro("G5", "I5", "A5", "T5", "F5", "ISBN5", "E5");
	 	catalogoLibros[5] = new Libro("G6", "I6", "A6", "T6", "F6", "ISBN6", "E6");
	 	catalogoLibros[6] = new Libro("G7", "I7", "A7", "T7", "F7", "ISBN7", "E7");
	 	catalogoLibros[7] = new Libro("G8", "I8", "A8", "T8", "F8", "ISBN8", "E8");
	 	catalogoLibros[8] = new Libro("G9", "I9", "A9", "T9", "F9", "ISBN9", "E9");
	 	catalogoLibros[9] = new Libro("G10", "I10", "A10", "T10", "F10", "ISBN10", "E10");

		//Agregar copias a los libros y a las revistas
		catalogoLibros[0].componerConCopia("C1L1");
		catalogoLibros[0].componerConCopia("C2L1");
		
		catalogoLibros[1].componerConCopia("C1L2");		
		catalogoLibros[2].componerConCopia("C1L3");		
		catalogoLibros[3].componerConCopia("C1L4");		
		catalogoLibros[4].componerConCopia("C1L5");		
		catalogoLibros[5].componerConCopia("C1L6");		
		catalogoLibros[6].componerConCopia("C1L7");		
		catalogoLibros[7].componerConCopia("C1L8");		
		catalogoLibros[8].componerConCopia("C1L9");		
		catalogoLibros[9].componerConCopia("C1L10");		




		//Construir prestamos...
		Prestamo p1 = new Prestamo(catalogoSocios[7], catalogoTrabajadores[4], "11/09/2018", "14/09/2018", catalogoLibros[2]);

		String codCopia = p1.asociarCopia(catalogoLibros[6]);


		System.out.println("El código de copia que se prestó es: " + codCopia);
		
		System.out.println("\nPrestamos del trabajador T4:");
		catalogoTrabajadores[4].mostrarPrestamos();
		
		
		//Copia c1 = catalogoLibros[6].buscarCopia("C1L6");


		/*System.out.println("***Socios registrados en el sistemas****");
		for(int i = 0; i < catalogoSocios.length; i++){
			System.out.println("Nombre del socio: " + catalogoSocios[i].getNombre());
			System.out.println("Email del socio: " + catalogoSocios[i].getEmail());
			System.out.println("Matrícula del socio: " + catalogoSocios[i].getMatricula());
			System.out.println("-----------------------------------");

		}*/

		/*System.out.println("===========================================================");
		for(int i = 0; i < catalogoLibros.length; i++){
			System.out.println("Título del libro: " + catalogoLibros[i].getTitulo());
			System.out.println("Autores del libro: " + catalogoLibros[i].getAutores());
			System.out.println("Las copias del libro son: ");
			catalogoLibros[i].mostrarCopias();
			System.out.println("-----------------------------------");

		}*/
		
	}
}