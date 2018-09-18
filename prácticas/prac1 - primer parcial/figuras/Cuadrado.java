public class Cuadrado extends FiguraGeometrica{
	private int lado;

	public Cuadrado(int lado){
		this.lado = lado;
	}

	public double calcularArea(){
		return lado * lado;
	}
}