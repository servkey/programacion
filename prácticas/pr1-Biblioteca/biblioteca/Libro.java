public class Libro{
	private String titulo;
	private String autores;
	private String editorial;
	private String numeroPaginas;
	private String anio;
	private String genero;
	//Relación de asociación....
	private Copia copias[] = new Copia[13];
	
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

	public void mostrarCopias(){
		System.out.println("Mostrando copias del libro: " + titulo);
		for (int i = 0; i < copias.length; i++){
			if (copias[i] != null){
				System.out.println("Identificador de copia: " + copias[i].getIdentificador());		
			}
		}
	}
}