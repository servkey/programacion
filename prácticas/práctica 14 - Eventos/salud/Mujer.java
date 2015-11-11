package salud;
import java.util.Date;

public class Mujer extends Persona{
		private float cadera;

		public Mujer(){

		}

		public Mujer(String nombre, int edad, float peso, float estatura, Date fechaNac, float cintura, float cuello, float cadera){
			super(nombre, edad,peso,estatura,fechaNac,cintura,cuello);
			this.cadera=cadera;
		}
	
		public float porGrasa(){
		return (495/(getCintura()+cadera-getCuello()+getEstatura()))-450;
		}
	}