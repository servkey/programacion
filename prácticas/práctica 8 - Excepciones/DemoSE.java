public class DemoSE{
	public static void main(String args[]){
		int nums[] = new int[4];
		//Antes de generar la excepción
		System.out.println("Antes de generar la excepción");
		nums[10] = 20;
		System.out.println("Después de atrapar la excepción");
	}
}
