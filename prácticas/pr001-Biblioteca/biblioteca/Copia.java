public class Copia{
	private String estado;
	private String id;
	
	//Relación
	private Libro libro;	

	public void asociarLibro(Libro libro){
		this.libro = libro;
	}	

	public boolean desasociarLibro(Libro libro){
		boolean resultado = false;
		if (this.libro == libro){
			this.libro = null;
			resultado = true;
		}
		return resultado;
	}	

	public Libro getLibro(){
		return libro;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public String getEstado(){
		return estado;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

}