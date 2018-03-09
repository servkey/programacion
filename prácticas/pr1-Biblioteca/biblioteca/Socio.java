public class Socio extends Persona{
	private String matricula;
	//Asociación
	private Amonestacion amonestaciones[] = new Amonestacion[3];
	
	public Socio(){
	}

	public void verAmonestaciones(){
		System.out.println("Viendo amonestaciones!");
	}

	public Socio(String nombre, String fechaNacimiento, String correoElectronico, String enfermedadesCronicas, String matricula){
		super(nombre, fechaNacimiento, correoElectronico, enfermedadesCronicas);
		this.matricula = matricula;		
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public String getMatricula(){
		return matricula;
	}

	public void asociarAmonestacion(Amonestacion amonestacion){
		for (int i = 0; i < amonestaciones.length; i++){
			if (amonestaciones[i] == null){
				amonestaciones[i] = amonestacion;
			}
		}
	}

	public void desasociarAmonestacion(Amonestacion amonestacion){
		for (int i = 0; i < amonestaciones.length; i++){
			if (amonestaciones[i] == amonestacion){
				amonestaciones[i] = null;
			}
		}
	}
}