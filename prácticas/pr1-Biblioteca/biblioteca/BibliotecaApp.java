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
					break;
			
				case 3:
					break;
				case 4:
					break;
			}

		}while(r != 5);

	}	
}