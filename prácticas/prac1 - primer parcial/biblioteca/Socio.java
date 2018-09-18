public class Socio extends Persona{
	private String matricula;

	public Socio(){
	}

	public Socio(String nombre){
		super(nombre);
	}


	public Socio(String nombre, String fechaNacimiento){
		super(nombre, fechaNacimiento);
	}

	public Socio(String nombre, String fechaNacimiento, String email, String gustosLectura, String matricula){
		super(nombre, fechaNacimiento, email, gustosLectura);
		this.matricula = matricula;
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public String getMatricula(){
		return matricula;
	}
}
