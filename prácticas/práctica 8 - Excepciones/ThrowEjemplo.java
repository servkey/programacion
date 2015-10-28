class ThrowEjemplo{
	public static void main(String args[]){
		try{
			System.out.println("Antes de Lanzar");
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			//Atrapa excepción
			System.out.println("Excepción atrapada");
		}
		System.out.println("Después del bloque try/catch");
	}
}
