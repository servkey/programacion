package restaurante;
public class Menu{
	private String nombre;
	//Agregación
	private ElementoMenu[] elementosMenu = new ElementoMenu[10];
	
	public Menu(String nombre){
		this.nombre = nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public boolean agregarElementoMenu(ElementoMenu em){
		boolean resultado = false;
		for(int i = 0; i < elementosMenu.length; i++){
			if (elementosMenu[i] == null){
				elementosMenu[i] = em;
				resultado = true;
				break;
			}
		}	
		return resultado;	
	}


	public boolean eliminarElementoMenu(ElementoMenu em){
		boolean resultado = false;
		for(int i = 0; i < elementosMenu.length; i++){
			if (elementosMenu[i] == em){
				elementosMenu[i] = null;
				resultado = true;
				break;
			}
		}	
		return resultado;	
	}
}
