import java.util.Scanner;

public class BibliotecaApp{

	public static void main(String args[]){

		Libro l1 = new Libro();
		l1.setTitulo("Algoritmos");
		l1.setAutores("Luis...");

		Libro l2 = new Libro();
		l2.setTitulo("Algoritmos II");
		l2.setAutores("Juan...");

		Libro l3 = new Libro();
		l3.setTitulo("Matemáticas");
		l3.setAutores("Pablo...");

		Libro catalogoLibros[] = new Libro[4];
		catalogoLibros[0] = l2;
		catalogoLibros[1] = l1;
		catalogoLibros[2] = l3;

		Copia c11 = new Copia();
		c11.setIdentificador(111);
		Copia c12 = new Copia();
		c12.setIdentificador(112);
		Copia c2 = new Copia();
		c2.setIdentificador(211);
		Copia c3 = new Copia();	
		c3.setIdentificador(311);

		l1.asociarCopia(c11);
		l1.asociarCopia(c12);
		l2.asociarCopia(c2);
		l3.asociarCopia(c3);

	

		Socio catalogoSocios[] = new Socio[3];

		Socio s1 = new Socio();
		s1.setNombre("Juan");
		s1.setMatricula("S1837812");
		s1.setCorreoElectronico("juan@uv.mx");
		s1.setEnfermedadesCronicas("NA");


		Socio s2 = new Socio();
		s2.setNombre("Ana");
		s2.setMatricula("S1731332");
		s2.setCorreoElectronico("ana@uv.mx");
		s2.setEnfermedadesCronicas("NA");

		Socio s3 = new Socio();
		s3.setNombre("Rodrigo");
		s3.setMatricula("S0831332");
		s3.setCorreoElectronico("rodrigo@uv.mx");
		s3.setEnfermedadesCronicas("Hipertensión arterial");

		catalogoSocios[0] = s3;
		catalogoSocios[1] = s1;
		catalogoSocios[0] = s2;



		Trabajador catalogoTrabajadores[] = new Trabajador[3];
		Trabajador t1 = new Trabajador();
		t1.setNombre("Marco");
		t1.setNumeroPersonal(1029);
		t1.setCorreoElectronico("marco@uv.mx");
		t1.setEnfermedadesCronicas("Ninguna");


		catalogoTrabajadores[0] = t1;


		Prestamo catalogoPrestamos[] = new Prestamo[3];

		Prestamo p1 = new Prestamo();
		p1.setFechaSolicitud("02/03/2018");
		p1.asociarTrabajador(t1);
		p1.asociarSocio(s2);
		p1.asociarCopia(c2);	
	
		Prestamo p2 = new Prestamo();
		p2.setFechaSolicitud("01/03/2018");
		p2.asociarTrabajador(t1);
		p2.asociarSocio(s1);
		p2.asociarCopia(c3);	

		catalogoPrestamos[0] = p1;
		catalogoPrestamos[1] = p2;

		int r = 0;
		do{

			System.out.println("\n\n\n");
			System.out.println("-------------------------------------------");

			System.out.println("Sistema de Biblioteca....");
			System.out.println("Opciones disponibles:");
			System.out.println("1 - Catálogos libros y copias");
			System.out.println("2 - Catálogos socios");
			System.out.println("3 - Catálogos trabajadores");									
			System.out.println("4 - Catálogos préstamos");
			System.out.println("5 - Salir");
			System.out.print("Escribe una opción: ");

			System.out.println();
			Scanner in = new Scanner(System.in);
			r = in.nextInt();

			switch(r){
				case 1:
					for (int i = 0; i < catalogoLibros.length; i++){
						if (catalogoLibros[i] != null){
							catalogoLibros[i].mostrarDatosLibro();
						}
					}					
					
					break;
				case 2:
					System.out.println("**Mostrando socios**");	
					for (int i = 0; i < catalogoSocios.length; i++){
						if (catalogoSocios[i] != null){
							System.out.println("----------------");
							System.out.println("Nombre: " + catalogoSocios[i].getNombre());
							System.out.println("Email: " + catalogoSocios[i].getCorreoElectronico());
							System.out.println("Enfermedades: " + catalogoSocios[i].getEnfermedadesCronicas());
							System.out.println("Matrícula: " + catalogoSocios[i].getMatricula());
							System.out.println("----------------");
						
						}
					}		
					break;			
				case 3:
					System.out.println("**Mostrando trabajadores**");
					for (int i = 0; i < catalogoTrabajadores.length; i++){
						if (catalogoTrabajadores[i] != null){
							System.out.println("----------------");
							System.out.println("Nombre: " + catalogoTrabajadores[i].getNombre());
							System.out.println("Email: " + catalogoTrabajadores[i].getCorreoElectronico());
							System.out.println("Enfermedades: " + catalogoTrabajadores[i].getEnfermedadesCronicas());
							System.out.println("No. personal: " + catalogoTrabajadores[i].getNumeroPersonal());
							System.out.println("----------------");
						
						}
					}		

					break;
				case 4:

					System.out.println("**Mostrando préstamos**");
					for (int i = 0; i < catalogoPrestamos.length; i++){
						if (catalogoPrestamos[i] != null){
							System.out.println("----------------");
							catalogoPrestamos[i].mostrarDatosPrestamo();
							System.out.println("----------------");
						}
					}		

					break;
			}

		}while(r != 5);

	}	
}