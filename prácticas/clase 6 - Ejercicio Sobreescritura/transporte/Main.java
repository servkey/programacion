public class Main{
	public static void main(String args[]){
		Vehiculo v = new Vehiculo();
		v.setMarca("MarcaX");
		//boolean result = v.trasladar(0);
		

		Vehiculo v1 = new Automovil("V8");
		v1.setMarca("MarcaY");	
		v1.trasladar(5);

	}
}