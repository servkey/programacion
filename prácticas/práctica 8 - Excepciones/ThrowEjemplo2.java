class ThrowEjemplo2{
	public void ejemplo(){
		throw new ArithmeticException();
	}
	public static void main(String args[]){
		try{
			System.out.println("Antes de Lanzar");
			ThrowEjemplo2 ejemplo = new ThrowEjemplo2();
			ejemplo.ejemplo();
		}catch(ArithmeticException e){
			//Atrapa excepción
			System.out.println("Excepción atrapada");
		}
		System.out.println("Después del bloque try/catch");
	}
}
