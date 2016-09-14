public class Copia{
	private String codigo;
	private String punto;
	private boolean disponibilidad;
	
	//Relación Copia -> Publicación
	private Publicacion publicacion;

	
	public Copia(Publicacion publicacion){
		this.publicacion = publicacion;
	}

	
	public Publicacion getPublicacion(){
		return publicacion;
	}
	
	
	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo = codigo;
	}

	public String getPunto(){
		return punto;
	}

	public void setPunto(String punto){
		this.punto = punto;
	}

	public void setDisponibilidad(boolean disponibilidad){
		this.disponibilidad = disponibilidad;
	}

	public boolean getDisponibilidad(){
		return disponibilidad;
	}

}