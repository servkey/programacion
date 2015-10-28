public class ThrowEjemplo3{
	public void ejemplo(){
		int x = 10/0;
	}
	public static void main(String args[]){
		try{
			System.out.println("Antes de Lanzar");
			ThrowEjemplo3 ejemplo = new ThrowEjemplo3();
			ejemplo.ejemplo();
		}catch(ArithmeticException e){
			//Atrapa excepción
			System.out.println("Excepción atrapada");
			throw e;
		}
		System.out.println("Después del bloque try/catch");
	}
}
