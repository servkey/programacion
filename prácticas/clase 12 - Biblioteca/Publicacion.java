import java.util.Date;

public class Publicacion{
	private Date fechaPublicacion;
	private String genero;
	private String titulo;

	//Representación relación 
	private Copia copias[];


	
	public Publicacion(){
	}

	public Copia[] getCopias(){
		return copias;
	}

	public Publicacion(Date fechaPublicacion, String genero, String titulo){
		this.fechaPublicacion = fechaPublicacion;
		this.genero = genero;
		this.titulo = titulo;
	}

	public String getGenero(){
		return genero;
	}

	public void setGenero(String genero){
		this.genero = genero;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	
	public Date getFechaPublicacion(){
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion){
		this.fechaPublicacion = fechaPublicacion;
	}

	public boolean asignarCopia(Copia c){
		return false;
	}

	public boolean quitarCopia(Copia c){
		return false;
	}
}