public class Persona{
	private String nombre;
	private String fechaNacimiento;
	private String email;
	private String gustosLectura;

	public Persona(){
	}

	public Persona(String nombre){
		//Inicializar....
		this.nombre = nombre;
	}

	public Persona(String nombre, String fechaNacimiento){
		//Inicializar....
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona(String nombre, String fechaNacimiento, String email, String gustosLectura){
		//Inicializar....
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.gustosLectura = gustosLectura;
	}

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

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setGustosLectura(String gustosLectura){
		this.gustosLectura = gustosLectura;
	}

	public String getGustosLectura(){
		return gustosLectura;
	}

	public void comer(Object alimento){
		System.out.println("Comiendo objeto = "+ alimento.toString());			
	}


	public void comer(Socio socio){
		System.out.println("Comiendo socio = "+ socio.toString());			
	}
	
	public void comer(String alimento){
		System.out.println("Comiendo únicamente  = "+ alimento);
	}

	public void comer(String alimento, String bebida){
		System.out.println("Comiendo de alimento = "+ alimento);
		System.out.println("Bebiendo = "+ bebida);

	}

	public void comer(String alimento, String bebida, String postre){
		System.out.println("Comiendo de alimento = "+ alimento);
		System.out.println("Bebiendo = "+ bebida);
		System.out.println("Disfrutando del postre = "+ postre);
	}

}