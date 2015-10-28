public class ExcepcionSubclase{
	public static void main(String args[]){
		int nums[] = new int[4];
		for (int i = 0; i < 5; i++){
			try{
				System.out.println("---------Iteración " + i + "------------");
				//Antes de generar la excepción
				System.out.println("Antes de generar la excepción");
				if (i == 0){
					Object o = new Object();
					o = null;
					o.toString();
				}
				
				nums[i] = 20;
				System.out.println("Después de asignar valor al arreglo");
	
			}catch(ArrayIndexOutOfBoundsException e){
				//Atrapa la excepción
				System.out.println("ArrayIndexOutOfBoundsException: Índice fuera de límite");
			}catch(Throwable e){
				//Atrapando la excepción general
				System.out.println("(Throwable: Ocurrio un error");
			}
			System.out.println("Después de atrapar la excepción");
		}
	}
}
