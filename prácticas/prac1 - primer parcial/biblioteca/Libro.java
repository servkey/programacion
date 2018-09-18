public class Libro extends Publicacion{
	private String isbn;
	private String editorial;

	public Libro(){
	}

	public Libro(String genero, String idioma, String autores, String titulo, String fechaPublicacion, String isbn, String editorial){
		super(genero, idioma, autores, titulo, fechaPublicacion);
		this.isbn = isbn;
		this.editorial = editorial;
	}	

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	public String getIsbn(){
		return isbn;
	}

	public void setEditorial(String editorial){
		this.editorial = editorial;
	}

	public String getEditorial(){
		return editorial;
	}
}