import java.util.Date;

public class Prestamo{
	private Date fechaEntrega;
	private Date fechaDevolucion;
	
	//Representación de la relación entre clases asociación
	private Copia copias[];
	private Persona persona;

	public Prestamo(Persona persona, Copia copias[]){
		
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
		return false;
	}

	public boolean eliminarCopia(Copia copia){
		return false;
	}


	public boolean agregarPersona(Persona persona){
		return false;
	}


	public boolean eliminarPersona(Persona persona){
		return false;
	}

}



