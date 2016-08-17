public class Biblioteca{
	public static void main(String args[]){
		//Socio

		Socio s1 = new Socio("Juan", "López", "Peña", "juan@mexico.mx", "Z102349");

		String resultado = s1.toString();

		System.out.println(resultado);


		//Construir Persona1 
		Persona p1 = new Socio("Luis", "Pérez", "Morales", "luis@mexico.mx", "Z133194");
		
		String tmp = p1.toString();

		System.out.println(p1);
	
		/*

		Persona p1 =  new Persona();
		System.out.println("**Información de Persona****");
		p1.setNombre("Luis");
		p1.setEmail("luis@gmail.com");

		System.out.println(p1.toString());		
		//System.out.println("Representación Cadena:" + p1.toString());
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEmail());
		*/	
		/*int x = 10;
		String nombre = "Luis";

		System.out.println("X = " + x);
		System.out.println("Nombre = " + nombre);*/

	}
}