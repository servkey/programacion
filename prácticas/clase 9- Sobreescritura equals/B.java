public class B extends A{
	
	public B(){
		super(0);
		System.out.println("En constructor de B sin parámetros, x = " + getX());
	}
		
	public B(int x){
		super(x);
		System.out.println("En constructor de B con parámetros, x = " + getX());
	}
}