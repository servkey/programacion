public class Libro{
	private String titulo;
	private String autores;
	private int numeroDePaginas;
	private String ISBN;

	//Relación tipo asociación:
	private Copia copias[] = new Copia[10];
	private int indice = 0;
		

	public void agregarCopia(String identificador, String fechaRegistro, String punto){
		//Construir la copia
		Copia c = new Copia();							c.setIdentificador(identificador);
		c.setFechaRegistro(fechaRegistro);
		c.setPunto(punto);
		copias[indice++] = c;
	}

	/*public void agregar(Copia copia){
		copias[indice++] = copia;
	}*/
	
	public int getIndice(){
		return indice;
	}	

	public Copia[] getCopias(){
		return copias;	
	}
		
	public Libro(){
	}
	
	public String getTitulo(){
		return titulo;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getAutores(){
		return autores;
	}

	public void setAutores(String autores){
		this.autores = autores;
	}

	public int getNumeroDePaginas(){
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas){
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getISBN(){
		return ISBN;
	}

	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}

}