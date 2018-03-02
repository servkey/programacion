public class Persona{
	//Atributos
	private String nombre;
	private String fechaNacimiento;
	private String correoElectronico;
	private String enfermedadesCronicas;
	

	//Métodos
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}


	public void setFechaNacimiento(String fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaNacimiento(){
		return fechaNacimiento;
	}


	public void setCorreoElectronico(String correoElectronico){
		this.correoElectronico = correoElectronico;
	}

	public String getCorreoElectronico(){
		return correoElectronico;
	}


	public void setEnfermedadesCronicas(String enfermedadesCronicas){
		this.enfermedadesCronicas = enfermedadesCronicas;
	}

	public String getEnfermedadesCronicas(){
		return enfermedadesCronicas;
	}



}