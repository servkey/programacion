package biblioteca;
public class Persona{
	//Características
	public String nombre;
	private int edad;
	private String telefono;
	private String correo;
	
	public Persona(){

	}

	public Persona(String nombre, int edad, String telefono, String correo){
		this.nombre = nombre;
		this.correo = correo;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	public String getNombre(){
		return nombre;
	}

	
	public String getCorreo(){
		return correo;
	}

	public int getEdad(){
		return edad;
	}


	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	
	public void setCorreo(String correo){
		this.correo = correo;
	}


	public void setEdad(int edad){
		this.edad = edad;
	}


	//Operaciones
	public void mostrar(){
		String out = String.format("Mi nombre es %s, edad = %d, telefono = %s ", nombre, edad, telefono);
		System.out.println(out);
	}
}