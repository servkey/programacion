public class Sede{
	//Atributos
	private String direccionPostal;
	private String ciudad;
	private String telefono;
	private String RFC;
	
	//Métodos
	public String getDireccionPostal(){
		return direccionPostal;
	}

	public void setDireccionPostal(String direccionPostal){
		this.direccionPostal = direccionPostal;
	}

	public String getCiudad(){
		return ciudad;
	}

	public void setCiudad(String ciudad){
		this.ciudad = ciudad;
	}	

	public String getTelefono(){
		return telefono;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}	


	public String getRFC(){
		return RFC;
	}

	public void setRFC(String RFC){
		this.RFC = RFC;
	}		
}