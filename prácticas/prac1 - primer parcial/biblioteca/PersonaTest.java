public class PersonaTest{
	public static void main(String args[]){
		//Persona construida
		Persona p = new Persona("Luis", "10/10/!0", "lmontane@uv.mx", "terror");
		
		/*
		System.out.println("Datos de una persona");
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Fecha de nacimiento: " + p.getFechaNacimiento());
		System.out.println("Email: " + p.getEmail());
		System.out.println("Gustos: " + p.getGustosLectura());*/

		System.out.println("****************************************************");

		Socio s = new Socio("Socio 1", "11/11/11", "socio1@uv.mx", "NA", "S18181823"); 
		System.out.println("Datos del socio");
		System.out.println("Nombre: " + s.getNombre());
		System.out.println("Email: " + s.getEmail());
		System.out.println("#Personal: " + s.getMatricula());
		
		s.comer(p);
		s.comer(s);
		s.comer("ensalada");
		s.comer("pollo", "jamaica");
		s.comer("pescado", "horchata", "galletas");

		
		System.out.println("****************************************************");

		/*Trabajador t = new Trabajador("T1", "10/10/20", "t1@uv.mx", "variado", 13913, "X", "NA");
		System.out.println("Datos del trabajador");		
		System.out.println("Nombre: " + t.getNombre());
		System.out.println("Email: " + t.getEmail());
		System.out.println("#Personal: " + t.getNumeroPersonal());*/
	}
}