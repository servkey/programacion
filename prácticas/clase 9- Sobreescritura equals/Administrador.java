public class Administrador extends Trabajador{
	private int departamento;

	public Administrador(String curp, String nombre, int departamento){
		super(curp, nombre);
		this.departamento = departamento;
	}

	public int getDepartamento(){
		return departamento;
	}

	public void mostrar(){
		super.mostrar();
		System.out.println("Depto: " + departamento);
	}	
}