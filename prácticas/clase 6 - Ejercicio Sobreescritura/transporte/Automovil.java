public class Automovil extends Vehiculo{
	private String motor;

	public Automovil(String motor){
		this.motor = motor;
	}
	
	public void setMotor(String motor){
		this.motor = motor;
	}	

	public boolean trasladar(int x){
		super.trasladar(x);
		boolean resultado = false;
		if (x > 5){
			resultado = true;
		}

		System.out.println("Trasladando automóvil, motor = " + motor + " Bandera = " + resultado);
		return resultado;

	}
}