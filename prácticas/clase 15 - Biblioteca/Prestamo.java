import java.util.Date;

public class Prestamo{
	private Date fechaEntrega;
	private Date fechaDevolucion;
	
	//Representación de la relación entre clases asociación
	private Copia copias[];
	private Persona persona;

	public Prestamo(Persona persona, Copia copias[]){
		this.persona = persona;
		this.copias = copias;
	}

	public Copia[] getCopia(){
		return copias;
	}
	

	public Persona getPersona(){
		return persona;
	}


	public Date getFechaEntrega(){
		return fechaEntrega;
	}	

	public void setFechaEntrega(Date fechaEntrega){
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaDevolucion(){
		return fechaDevolucion;
	}	

	public void setFechaDevolucion(Date fechaDevolucion){
		this.fechaDevolucion = fechaDevolucion;
	}

	public boolean agregarCopia(Copia copia){
		boolean resultado = false;
		for (int i = 0;  i < copias.length; i++){
			if (copias[i] == null){
				copias[i] = copia;
				resultado = true;
				break;
			}
		} 
		return resultado;
	}

	public boolean eliminarCopia(Copia copia){
		boolean resultado = false;
		for (int i = 0;  i < copias.length; i++){
			if (copias[i] == copia){
				copias[i] = null;
				resultado = true;
				break;
			}
		} 
		return resultado; 
	}


	public boolean actualizarPersona(Persona persona){
		this.persona = persona;
		return true;
	}
}



