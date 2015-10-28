public class Demo{
	public static void main(String args[]){
		int nums[] = new int[4];
		try{
			//Antes de generar la excepción
			System.out.println("Antes de generar la excepción");
			nums[10] = 20;
		}catch(ArrayIndexOutOfBoundsException e){
			//Atrapa la excepción
			System.out.println("Índice fuera de límite");
		}
		System.out.println("Después de atrapar la excepción");
	}
}
