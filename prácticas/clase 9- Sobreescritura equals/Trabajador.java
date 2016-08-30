public class Trabajador{
	private String curp;
	private String nombre;

	public Trabajador(String curp, String nombre){
		this.curp = curp;
		this.nombre = nombre;
	}
	
	public void mostrar(){
		System.out.println("Curp: " + curp + ", Nombre: " + nombre);
	}

	public String toString(){
		return curp + ", " + nombre;
	}


	public String getNombre(){
		return nombre;
	}

	public String getCurp(){
		return curp;
	}

	public boolean equals(Trabajador t){
		boolean resultado = false;
		if (this.curp.equals(t.getCurp())){
			resultado = true;
		}
		return resultado;
	}
	
	public static void main(String args[]){
		Administrador a1 = new Administrador("MOJL102931", "Juan López", 10);
		Trabajador a2 = new Administrador("X1JL232931", "Ana López", 15);

		Administrador a3 = new Administrador("LYL214931", "Miguel Jiménez", 20);

	
		Trabajador trabajadores[] = new Trabajador[10];
		trabajadores[0] = a1;
		trabajadores[1] = a2;
		trabajadores[2] = a3;
		
		for (int i = 0; i < trabajadores.length; i++){
			if (trabajadores[i] != null){
				trabajadores[i].mostrar();
			}
		}

		/*a1.mostrar();
		a2.mostrar();*/
 
		/*Trabajador t1 = new Trabajador("MOJL102931", "Juan López");
		
		Trabajador t2 = new Trabajador("MOJL102931", "Luis Jiménez");
		
		System.out.println(t1);
		System.out.println(t2);
		
		if (t1.equals(t2)){
			System.out.println("t1 y t2 son iguales");	
		}else{
			System.out.println("t1 y t2 no son iguales");	
		}*/
		
	}
}