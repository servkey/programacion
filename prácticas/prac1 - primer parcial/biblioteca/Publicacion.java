public class Publicacion{
	private String genero;
	private String idioma;
	private String autores;
	private String titulo;		
	private String fechaPublicacion;
	//Relación de composición	
	private Copia copias[] = new Copia[10];

	public Publicacion(){
	}

	public Publicacion(String genero, String idioma, String autores, String titulo, String fechaPublicacion){
		this.genero = genero;
		this.idioma = idioma;
		this.autores = autores;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
	}

	public void setGenero(String genero){
		this.genero = genero;
	}	

	public String getGenero(){
		return genero;
	}	

	public void setIdioma(String idioma){
		this.idioma = idioma;
	}	

	public String getIdioma(){
		return idioma;
	}

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

	public void setFechaPublicacion(String fechaPublicacion){
		this.fechaPublicacion = fechaPublicacion;
	}	

	public String getFechaPublicacion(){
		return fechaPublicacion;
	}

	public Copia[] getCopias(){
		return copias;
	}

	public void componerConCopia(String codCopia){
		Copia ctmp = new Copia(codCopia);	
		for (int i = 0; i < copias.length; i++){
			if (copias[i] == null){
				copias[i] = ctmp;
				break;
			}
		}
	}

	public void mostrarCopias(){
		for (int i = 0; i < copias.length; i++){
			if (copias[i] != null){
				System.out.println("Código copia = " + copias[i].getCodCopia());				
			}
		}
	}


	public Copia buscarCopia(String codCopia){
		Copia tmpcopia = null;
		for (int i = 0; i < copias.length; i++){
			if (copias[i].getCodCopia().equals(codCopia)){
				tmpcopia = copias[i];
				break;
			}
		}
		return tmpcopia;		
	}


}