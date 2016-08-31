import java.util.Date;
public class Libro extends Publicacion{
	private String ISBN;

	public Libro(){
	}

	public Libro(Date fechaPublicacion, String genero, String titulo, String ISBN){
		super(fechaPublicacion, genero, titulo);
		this.ISBN = ISBN;
	}	

	public String getISBN(){
		return ISBN;
	}

	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}

}