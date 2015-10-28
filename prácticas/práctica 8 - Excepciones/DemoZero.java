public class DemoZero{
	public static double dividir(int dividendo, int divisor){
		double resultado = dividendo/divisor;
		return resultado;
	}
	
	public static void main(String args[]){
		try{
			double resultado = DemoZero.dividir(10,0);	
			System.out.println("Resultado: " + resultado);
		}catch(ArithmeticException e){
			System.out.println("División Inválida entre 0");
		}
	}
}
