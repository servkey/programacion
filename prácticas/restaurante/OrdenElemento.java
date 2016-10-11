package restaurante;
public class OrdenElemento{
	protected int cantidad;
	private ElementoMenu elementoMenu;

	public OrdenElemento(int cantidad, ElementoMenu elementoMenu){
		this.cantidad = cantidad;
		this.elementoMenu = elementoMenu;
	}

	public int getCantidad(){
		return cantidad;
	}

	public ElementoMenu getElementoMenu(){
		return elementoMenu;
	}

	public boolean equals(OrdenElemento oe){
		boolean resultado = false;
		if(this.cantidad == oe.getCantidad() && this.elementoMenu == oe.getElementoMenu()){
			resultado = true;
		}
		return resultado;
	}
}