public class Socio extends Persona{
	private String matricula;	
	
	public Socio(){
	}

	public Socio(String nombre, String apellidoPaterno, String apellidoMaterno, String email, String matricula){
		setNombre(nombre);
		setApellidoPaterno(apellidoPaterno);
		setApellidoMaterno(apellidoMaterno);
		setEmail(email);
		setMatricula(matricula);
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;	
	}		

	public String getMatricula(){
		return this.matricula;	
	}


	public String toString(){
		String persona = "Nombre = " + getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno() + ", Matrícula = " + matricula;
		return persona;

	}
}