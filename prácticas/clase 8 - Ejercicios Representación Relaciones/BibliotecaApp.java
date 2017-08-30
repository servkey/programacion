public class BibliotecaApp{
	public static void main(String args[]){
		Persona p1 = new Persona();
		p1.setNombre("Bart");
		p1.setFechaNacimiento("10/10/86");
		p1.setEmail("brt@uv.mx");
		p1.setSituacionMarital("Soltero");

		Socio s1 = new Socio();	
		s1.setNombre("Socio1");
		s1.setFechaNacimiento("07/11/56");
		s1.setEmail("socio1@uv.mx");
		s1.setSituacionMarital("Casado");
		s1.setMatricula("S1584781");

		Trabajador t1 = new Trabajador();
		t1.setNombre("Socio1");
		t1.setFechaNacimiento("07/11/56");
		t1.setEmail("socio1@uv.mx");
		t1.setSituacionMarital("Casado");
		t1.setNumeroPersonal(10493);

		//Arreglo de tipo persona
		Persona personas[] = new Persona[3];
		personas[0] = p1;
		personas[1] = s1;
		personas[2] = t1; //libro1
	
		//Socio ptmp = (Socio) personas[2];

		Libro libro1 = new Libro();
		libro1.setTitulo("Estructura de Datos I");
		libro1.setAutores("Luis Joyanes");
		libro1.setNumeroDePaginas(270);
		libro1.setISBN("1391-4414");
		libro1.agregarCopia("A1391-4414", "21/08/2017", "ROJO");
		libro1.agregarCopia("A1231-1442", "11/09/2017", "Blanco");

		libro1 = null; //Ref Libro1 es nula



		//System.out.println("Título de libro a partir de la copia: " + copia1.getLibro().getTitulo());
		

		/*System.out.println("\nDatos del libro: ");
		System.out.println("Título de libro: ");
		System.out.println(libro1.getTitulo());	
		System.out.println("Autores: ");
		System.out.println(libro1.getAutores());	
		
		Copia copiasLibro1[] = libro1.getCopias();	
		
		System.out.println("Datos de la copia");

		for (int i = 0; i < libro1.getIndice(); i++){
			System.out.println("-----------------------------");	
			System.out.println(copiasLibro1[i].getIdentificador());	
			System.out.println("Fecha de registro: ");
			System.out.println(copiasLibro1[i].getFechaRegistro());	
			System.out.println(copiasLibro1[i].getPunto());	
		}
		*/

		

		/*	
		System.out.println("\nID Copia: ");
		System.out.println(copia1.getIdentificador());	
		System.out.println("Fecha de registro: ");
		System.out.println(copia1.getFechaRegistro());	
		System.out.println(copia1.getPunto());	


		System.out.println("\nDatos de la Persona");
		System.out.println(p1.getNombre());	
		System.out.println("Fecha nacimiento: ");
		System.out.println(p1.getFechaNacimiento());	
		System.out.println("Email: ");
		System.out.println(p1.getEmail());	
		System.out.println("Situación marital: ");
		System.out.println(p1.getSituacionMarital());	


		System.out.println("\nDatos del socio");
		System.out.println(s1.getNombre());	
		System.out.println("Fecha nacimiento: ");
		System.out.println(s1.getFechaNacimiento());	
		System.out.println("Email: ");
		System.out.println(s1.getEmail());	
		System.out.println("Situación marital: ");
		System.out.println(s1.getSituacionMarital());	
		System.out.println("Matrícula: ");
		System.out.println(s1.getMatricula());	

		System.out.println("\nDatos del trabajador");
		System.out.println(t1.getNombre());	
		System.out.println("Fecha nacimiento: ");
		System.out.println(t1.getFechaNacimiento());	
		System.out.println("Email: ");
		System.out.println(t1.getEmail());	
		System.out.println("Situación marital: ");
		System.out.println(t1.getSituacionMarital());	
		System.out.println("Número personal: ");
		System.out.println(t1.getNumeroPersonal());	

		*/


	}
}