public class Trabajador{
	//Características
	private String nombre;
	private int edad;
	private String telefono;
	private String correo;
	public Trabajador(String nombre, String correo){
		this.nombre = nombre;
		this.correo = correo;
	}
	
	public String getNombre(){
		return nombre;
	}

	
	public String getCorreo(){
		return correo;
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