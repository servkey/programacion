package salud;
import java.util.Date;

public class Persona{
	private String nombre;
	private int edad;
	private float peso;
	private float estatura;
	private Date fechaNac;
	private float cintura;
	private float cuello;
	
	public Persona(){
	}

	public Persona(String nombre, int edad, float peso, float estatura, Date fechaNac, float cintura, float cuello){
		this.nombre=nombre;
		this.edad=edad;
		this.peso=peso;
		this.estatura=estatura;
		this.fechaNac=fechaNac;
		this.cintura=cintura;
		this.cuello=cuello;
	}

	public float getEstatura(){
		return estatura;
	}

	public float getCintura(){
		return cintura;
	}

	public float getCuello(){
		return cuello;
	}	

	public String toString(){
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nPeso: " + peso + "\nEstatura: " + estatura + "\nFecha de nacimiento " + fechaNac 	+ "\nCintura " + cintura + "\nCuello " + cuello;
	}

	public double indMasaCor(){
		return peso/Math.pow(estatura, 2);
	}

	public float porGrasa(){
		return (495/(cintura-cuello+estatura))-450;
	}
}


