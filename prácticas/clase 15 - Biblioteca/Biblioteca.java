import java.util.Date;

public class Biblioteca{
	public static void main(String args[]){
		Date fecha = new Date("10/10/16");

		Revista r1 = new Revista(fecha, "Computación", "Research in Computing Science", "10293110", "Latindex");
		Revista r2 = new Revista(fecha, "Varios", "Lagrimas y risas", "3021110", "X");
		
		Libro l1 = new Libro(fecha, "Programación", "Algoritmos y Estructura de Datos I", "102912912");
		Libro l2 = new Libro(fecha, "Programación", "Algoritmos y Estructura de Datos II", "01314672");


		
		Copia c1 = new Copia(r1);
		c1.setCodigo("CS0001");

		
		Copia c2 = new Copia(r1);
		c2.setCodigo("CS0002");

		boolean resultado = r1.asignarCopia(c1);

		if (resultado)
		{
			System.out.println("La copia C1 se pudo asignar correctamente....");
		}

		if (r1.asignarCopia(c2))
		{
			System.out.println("La copia C2 se pudo asignar correctamente....");		
		}
			

		Copia c3 = new Copia(r2);
		c3.setCodigo("LRS0001");

		r2.asignarCopia(c3);
	
		Copia c4 = new Copia(l2);
		c4.setCodigo("APES0002");
		
		l2.asignarCopia(c4);

		Publicacion publicaciones[] = new Publicacion[10];
		publicaciones[0] = r1;
		publicaciones[1] = r2;
		publicaciones[2] = l1;
		publicaciones[3] = l2;

		//Navegar de publicación a copias
		for (int i = 0; i < publicaciones.length; i++){
			if (publicaciones[i] != null){
				System.out.println("****** Material de la biblioteca #" + i);
				System.out.println("Título: " +	publicaciones[i].getTitulo());
				System.out.println("Genero: " +	publicaciones[i].getGenero());
				

				System.out.println("****** COPIAS ******");
				
				for (int j = 0; j < publicaciones[i].getCopias().length; j++){
					//Primera forma
					Copia copia = publicaciones[i].getCopias()[j]; 
					if (copia != null){
						System.out.println("Codigo: " +	copia.getCodigo());
					}
					
					// Otra forma
					//if (publicaciones[i].getCopias()[j] != null){					
					//	System.out.println("Codigo: " +	publicaciones[i].getCopias()[j].getCodigo());
					//}
					
				}

				
			}	
		}

		//Navegar de copia a publicación
		System.out.println("La copia c1 está realacionada a la publicación: " + c1.getPublicacion().getTitulo());

		//Publicacion = c1.getPublicacion();
		//System.out.println("La copia c1 está realacionada a la publicación: " + publicacion.getTitulo());


	}

}