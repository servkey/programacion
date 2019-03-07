public class Socio extends Persona{
	private String matricula;
			
	private Prestamo prestamo;

	
	public void solicitar(Prestamo prestamo){
		this.prestamo = prestamo;
	}

	public void entregar(){
		this.prestamo = null;
	}
	
	public Prestamo getPrestamo(){
		return prestamo;
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public String getMatricula(){
		return this.matricula;
	}	
}