public class ConstructorTest{
	public static void main(String[] args){
		System.out.println("---------a1-------------");
		A a1 = new A();
		System.out.println("------------------------");
	
		System.out.println("\n---------b1-------------");
		B b1 = new B();
		System.out.println("------------------------");
	
		System.out.println("\n---------a2-------------");
		A a2 = new C1();
		System.out.println("------------------------");
		
	}
}