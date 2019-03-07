public class Libro{
	private String titulo;
	private String autor;
	private String editorial;
	private String anio;
	private String genero;
	
	//Relación
	private Copia copias[] = new Copia[10];

	public void agregarCopia(Copia copia){
		for(int i = 0; i < 10; i++){
			if (copias[i] == null){
				copias[i] = copia;
				break;
			}
		}
	}

	public Copia getCopia(int indice){
		return copias[indice];
	}

	
	public boolean eliminarCopia(Copia copia){
		boolean resultado = false;
		for(int i = 0; i < 10; i++){
			if (copias[i] == copia){
				copias[i] = null;
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getAutor(){
		return autor;
	}

	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getEditorial(){
		return editorial;
	}

	public void setEditorial(String editorial){
		this.editorial = editorial;
	}

	public String getAnio(){
		return anio;
	}

	public void setAnio(String anio){
		this.anio = anio;
	}
}