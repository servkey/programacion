public class ConstructorTest{
	public static void main(String[] args){
		System.out.println("---------a1-------------");
		A a1 = new A("p1");
		System.out.println("------------------------");
	
		System.out.println("\n---------b1-------------");
		B b1 = new B("p1", "p2");
		System.out.println("------------------------");
	
		System.out.println("\n---------a2-------------");
		A a2 = new C1("p1", "p2", "p3");
		System.out.println("------------------------");

		System.out.println("\n---------a2-------------");
		B a3 = new C2("p1", "p2", "p3", "p4");
		System.out.println("------------------------");

		//Correcto
		//a1 = b1;
		//Incorrecto 
		//b1 = a1;
	}
}