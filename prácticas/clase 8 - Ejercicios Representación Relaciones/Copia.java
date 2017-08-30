public class Copia{
	public String identificador;
	public String fechaRegistro;
	public String punto;

	//Relación tipo agregación
	private Libro libro;

	public Copia(Libro libro){
		this.libro = libro;
	}

	public Libro getLibro(){
		return libro;
	}

	public void setLibro(Libro libro){
		this.libro = libro;
	}
	
	
	public String getIdentificador(){
		return identificador;
	}

	public void setIdentificador(String identificador){
		this.identificador = identificador;
	}

	public String getFechaRegistro(){
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro){
		this.fechaRegistro = fechaRegistro;
	}

	public String getPunto(){
		return punto;
	}	

	public void setPunto(String punto){
		this.punto = punto;
	}
}