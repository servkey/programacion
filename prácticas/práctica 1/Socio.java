public class Socio{
	//Características
	private String nombre;
	private int edad;
	private String telefono;
	private String correo;
	public Socio(String nombre, String correo){
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
		String out = String.format("Hola mi nombres es %s, y mi edad es %s", nombre, edad);
		System.out.println(out);
		System.out.println(nombre + ", " + correo);
	}	

	public static void main(String[] args){
		new Socio("juan", "lmontane@hotmail.com").mostrar();
	}
}