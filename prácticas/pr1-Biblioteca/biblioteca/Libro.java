public class Libro{
	private String titulo;
	private String autores;
	private String editorial;
	private String numeroPaginas;
	private String anio;
	private String genero;
	//Relación de asociación....
	private Copia copias[] = new Copia[13];
	
	public void setAutores(String autores){
		this.autores = autores;
	}

	public String getAutores(){
		return autores;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo(){
		return titulo;
	}

	//Método asociar
	public void asociarCopia(Copia copia){
		for (int i = 0; i < copias.length; i++){		
			if (copias[i] == null){
				copia.asociarLibro(this);
				copias[i] = copia;

				
				break;
			}
		}
	}


	public void desasociarCopia(Copia copia){
		for (int i = 0; i < copias.length; i++){
			if (copias[i] == copia){
				copias[i] = null;
				break;
			}
		}		
	}


	public void mostrarDatosLibro(){
		System.out.println("***Mostrando información de libro***");
		System.out.println("Titulo: " + titulo);
		System.out.println("Autores: " + autores);
		mostrarCopias();
	}

	public void mostrarCopias(){
		System.out.println("Copias: ");

		for (int i = 0; i < copias.length; i++){
			if (copias[i] != null){
				System.out.println("Identificador de copia: " + copias[i].getIdentificador());		
			}
		}
	}
}