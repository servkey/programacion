package diario.dominio;
import java.io.Serializable;

public class Alimento implements Serializable{
	private String nombre;
	private int calorias;
	private int carbohidratos;
	
	public Alimento(String nombre, int calorias, int carbohidratos){
		this.nombre = nombre;
		this.calorias = calorias;
		this.carbohidratos = carbohidratos;
	}
	
	public int getCalorias(){
		return calorias;
	}

	public int getCarbohidratos(){
		return carbohidratos;
	}
	
	public String toString(){
		//String resultadoFormateado = String.format("Nombre del alimento: %s, Calorías: %d, Carbohidratos: %d", nombre, calorias, carbohidratos);
		//return resultadoFormateado;
		return nombre;
	}
}

