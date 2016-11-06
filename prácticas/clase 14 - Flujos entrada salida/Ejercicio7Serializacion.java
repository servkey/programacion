import java.io.*;

class Persona implements Serializable{
	private String nombre;
	private int edad;

	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString(){
		return nombre + " : " + edad; 
	}
}

public class Ejercicio7Serializacion{
	public static void main(String args[]){
		try{
			File f = new File("bdpersonas.bin");	
			FileOutputStream fos = new FileOutputStream(f, true);
			FileInputStream fis = new FileInputStream(f);

			ObjectOutputStream out = new ObjectOutputStream(fos);
			ObjectInputStream in = new ObjectInputStream(fis);

			Persona p1 = new Persona("Luis", 10);
			Persona p2 = new Persona("Juan", 11);
			out.writeObject(p1);
			out.writeObject(p2);	
			out.close();
	
			p1 = null;
			p2 = null;

			//Recuperar objetos
			p1 = (Persona) in.readObject();
			p2 = (Persona) in.readObject();
		
			
			System.out.println(p1);
			System.out.println(p2);
			in.close();

		}catch(IOException ioe){
			System.out.println("Error de escritura o lectura de objetos...." + ioe);
		}catch(ClassNotFoundException nfe){

		}

	}
}