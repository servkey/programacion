public class Trabajador extends Persona{
	//Características
	private int numero_personal;
	private double salario;
	
	public Trabajador(){
		
	}

	public Trabajador(String nombre, int edad, String telefono, String correo, int numero_personal, double salario){
		super(nombre, edad, telefono, correo);
		this.salario = salario; 
		this.numero_personal = numero_personal;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}

	public int getNumeroPersonal(){
		return numero_personal;
	}
	
	public void setNumeroPersonal(int numero_personal){
		this.numero_personal = numero_personal;
	}



	//Operaciones
	public void mostrar(){
		super.mostrar();
		System.out.println(numero_personal + ", " + salario);
	}	
}