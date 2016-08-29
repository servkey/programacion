public class A{
	private int x;

	public void setX(int x){
		this.x = x;
	}

	public int getX(){
		return x;
	}

	public boolean equals(A a){
		boolean result = false;
		if (a.getX() == this.x)
			result = true;
		return result;
	}

	public A(int x){
		this.x = x;
		System.out.println("En constructor de A con parámetros, x =  " + getX());
	}
}