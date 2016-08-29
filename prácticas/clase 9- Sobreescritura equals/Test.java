public class Test{
	public static void main(String args[]){
		B b1 = new B();

		B b2 = new B(11);
		B b3 = new B(11);

		if (b2.equals(b3)){
			System.out.println("Son iguales b2 y b3");
		}else
		{
			System.out.println("No son iguales b2 y b3");
		}

		String cad1 = new String("Hola");
		String cad2 = new String("Hola");
		
		if (cad1 == cad2){
			System.out.println("Son iguales cad1 y cad2");
		}else
		{
			System.out.println("No son iguales cad1 y cad2");

		}

		String cad3 = "Hola";
		String cad4 = "Hola";
		
		if (cad3.equals(cad4)){
			System.out.println("Son iguales cad3 y cad4");
		}else
		{
			System.out.println("No son iguales cad3 y cad4");
		}
	}
}