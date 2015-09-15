public class Socio{
	//Características
	private String nombre;
	private int edad;
	private String telefono;
	private String correo;
	private int numero_socio;

	public Socio(String nombre, int edad, String telefono, String correo, int numero_socio){
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.numero_socio = numero_socio;
	}
	
	public String getNombre(){
		return nombre;
	}

	
	public String getCorreo(){
		return correo;
	}

	public int getNumeroSocio(){
		return numero_socio;
	}


	public int setNumeroSocio(int numero_socio){
		return numero_socio;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	
	public void setCorreo(String correo){
		this.correo = correo;
	}

	//Operaciones
	public void mostrar(){
			System.out.println(nombre + ", " + correo);
	}	

}