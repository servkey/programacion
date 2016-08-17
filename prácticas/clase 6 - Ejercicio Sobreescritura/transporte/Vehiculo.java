public class Vehiculo{
	private String marca;

	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public boolean trasladar(int x){
		boolean resultado = false;
		if (x > 10)
		{
			resultado = true;
		}

		System.out.println("Trasladando vehículo = " + marca + ", X = " + x);
		return resultado;
	}
}