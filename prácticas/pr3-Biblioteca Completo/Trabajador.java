public class Trabajador extends Persona{
	private int numeroPersonal;
	
	public Trabajador(){
	}

	public Trabajador(String nombre, String fechaNacimiento, String correoElectronico, String enfermedadesCronicas, int numeroPersonal){
		super(nombre, fechaNacimiento, correoElectronico, enfermedadesCronicas);
		this.numeroPersonal = numeroPersonal;		
	}

	
	public void setNumeroPersonal(int numeroPersonal){
		this.numeroPersonal = numeroPersonal;
	}

	public int getNumeroPersonal(){
		return numeroPersonal;
	}
}