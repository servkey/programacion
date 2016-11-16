package diarioejercicio;
import java.io.Serializable;
public class Persona implements Serializable{
	private String nombre;
	private String apellidoPaterno;

	public Persona(String nombre, String apellidoPaterno){
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public String toString(){
		return nombre + ":" + apellidoPaterno;
	}
}