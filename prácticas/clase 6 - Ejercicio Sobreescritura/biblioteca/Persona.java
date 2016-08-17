public class Persona{
	//Características
	private String nombre;
	private String apellidoPaterno;
	private String email;
	private String apellidoMaterno;
		
	//Métodos
	public String toString(){
		String persona = "Nombre = " + nombre + " " + apellidoPaterno + " " + apellidoMaterno;
		return persona;
	}


	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}


	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getApellidoPaterno(){
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno(){
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno = apellidoMaterno;
	}

}