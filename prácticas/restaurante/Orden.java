package restaurante;
import java.util.Date;
public abstract class Orden{
	public Date fecha;
	private OrdenElemento[] elementosDeOrden = new OrdenElemento[10];
	
	public Orden(Date fecha){
		this.fecha = fecha;
	}

	public abstract boolean solicitar();



	public boolean agregarElemento(int cantidad, ElementoMenu em)
	{
		boolean resultado = false;
		for(int i = 0; i < elementosDeOrden.length;i++)
		{
			if(elementosDeOrden[i] == null){
				elementosDeOrden[i] = new OrdenElemento(cantidad, em);
				resultado = true;
				break;
			}		
		}					
		return resultado;
	}



	public boolean eliminarElemento(int cantidad, ElementoMenu em)
	{
		boolean resultado = false;

		OrdenElemento oe = new OrdenElemento(cantidad, em);
		for(int i = 0; i < elementosDeOrden.length;i++)
		{
			
			if(elementosDeOrden[i].equals(oe)){
				elementosDeOrden[i] = null;
				resultado = true;
				break;
			}		
		}					
		return resultado;
	}
	
}