public class Pelicula{
	private String titulo;
	private String director;
	private String anio;

	public Pelicula(){
	
	}

	public Pelicula(String titulo, String director, String anio){
		this.titulo = titulo;
		this.director = director;
		this.anio = anio;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setDirector(String director){
		this.director = director;
	}

	public String getDirector(){
		return director;
	}

	public void setAnio(String anio){
		this.anio = anio;
	}

	public String getAnio(){
		return anio;
	}

	public String toString(){
		return titulo + ", " + director + ", " + anio;
	}

}