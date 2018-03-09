public class Persona{
	//Atributos
	private String nombre;
	private String fechaNacimiento;
	private String correoElectronico;
	private String enfermedadesCronicas;

	public Persona(){
	}

	public Persona(String nombre, String fechaNacimiento, String correoElectronico, String enfermedadesCronicas){
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.correoElectronico = correoElectronico;
		this.enfermedadesCronicas = enfermedadesCronicas;	
	}
	
	public void caminar(){
		System.out.println("Caminando como persona.....");
	}
	
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

	
	public String toString(){
		return super.toString() + ", " + nombre + ", " + fechaNacimiento + ", " + correoElectronico + ", " + enfermedadesCronicas;
 	}

}