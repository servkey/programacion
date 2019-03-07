public class BibliotecaTest{
	public static void main(String args[]){
		System.out.println("#####Probando#####");

		Libro l1 = new Libro();
		l1.setTitulo("L1-Algoritmos");
		l1.setAutor("A1");

		Libro l2 = new Libro();
		l2.setTitulo("L2-Matemáticas Discretas");
		l2.setAutor("A2");

		Libro libros[] = new Libro[10];
		libros[0] = l1;
		libros[1] = l2;

		Copia c1 = new Copia();
		c1.setId("IDCL1001");

		Copia c2 = new Copia();
		c2.setId("IDCL2001");

		Copia c3 = new Copia();
		c3.setId("IDCL1002");

		//Asociar copias con libros
		l1.agregarCopia(c1);
		l1.agregarCopia(c3);

		l2.agregarCopia(c2);
	
		Trabajador t1 = new Trabajador();
		t1.setNombre("T1");
		t1.setNumeroPersonal(102);

		Trabajador t2 = new Trabajador();
		t2.setNombre("T2");
		t2.setNumeroPersonal(302);
		
		Trabajador trabajadores[] = new Trabajador[10];
		trabajadores[0] = t1;
		trabajadores[1] = t2;


		Socio s1 = new Socio();
		s1.setNombre("S1");
		s1.setMatricula("S109312");

		Socio s2 = new Socio();
		s2.setNombre("S2");
		s2.setMatricula("S191344");
		
		Socio socios[] = new Socio[10];
		socios[0] = s1;
		socios[1] = s2;

		//Recorrer libros
		for (int indice = 0; indice < 10; indice++){
			if (libros[indice] != null){
				System.out.println("Título de libro1: " + libros[indice].getTitulo());
				System.out.println("******Mostrando copias del libro " + libros[indice].getTitulo() + "*******");
				for (int i = 0; i < 10; i++){
					if (libros[indice] != null){
						Copia c = libros[indice].getCopia(i);
						if (c != null){
							System.out.println("ID Copia: " + c.getId());
						}
					}
				}	
			}
		}
		//Creando un prestamo
		Prestamo p1 = new Prestamo();
		
		p1.asociarTrabajador(t2);
		p1.asociarSocio(s1);
		p1.asociarCopia(c2);
		p1.asociarCopia(c1);
		p1.setFechaSalida("10/10/19");
		p1.setFechaDevolucion("14/10/19");

		System.out.println("************Datos de socios con prestamos************");

		//Mostrar datos de socios
		for (int i = 0; i < 10; i++){
			Socio s = socios[i];
			System.out.println("**************************************************");
			if (s != null){
				System.out.println("Nombre del socio: " + s.getNombre());		
				System.out.println("Matricula del socio: " + s.getMatricula());		
				Prestamo p = s.getPrestamo();
				if (p != null){
					System.out.println("Datos del prestamo:");
					System.out.println("Fecha de salida: " + p.getFechaSalida());
				
					for (int k = 0; k < 10; k++){
						Copia c = p.getCopia(k);
						if (c != null){
							System.out.println("IDCopia prestada: " + c.getId());
						}
					}
				}
			}
		}	
		Persona personas[] = new Persona[10];
		personas[0] = s1;
		personas[1] = t1;
		personas[2] = s2;
		personas[3] = t2;
		
		//Polimorfismo
	}
}