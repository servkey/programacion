public class Prestamo{
	private String fechaSalida;
	private String fechaDevolucion;
	
	//Relaciones
	private Copia copias[] = new Copia[10];
	private Socio socio;
	private Trabajador trabajador;
	
	public void asociarCopia(Copia copia){
		for(int i = 0; i < 10; i++){
			if (copias[i] == null){
				copias[i] = copia;
				break;
			}
		}
	}
	
	public void desasociarCopia(Copia copia){
		for(int i = 0; i < 10; i++){
			if (copias[i] == copia){
				copias[i] = null;
				break;
			}
		}
	}

	public Copia getCopia(int indice){
		return copias[indice];
	}	

	public void asociarSocio(Socio socio){
		this.socio = socio;
		this.socio.solicitar(this);
	}

	public void desasociarSocio(Socio socio){
		if (socio == this.socio){
			this.socio = null;
			this.socio.entregar();
		}
	}

	public Socio getSocio(){
		return socio;
	}


	public void asociarTrabajador(Trabajador trabajador){
		this.trabajador = trabajador;
	}

	public void desasociarTrabajador(Trabajador trabajador){
		if (trabajador == this.trabajador){
			this.trabajador = null;
		}
	}

	public Trabajador getTrabajador(){
		return trabajador;
	}

	public String getFechaSalida(){
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida){
		this.fechaSalida = fechaSalida;
	}

	public String getFechaDevolucion(){
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion){
		this.fechaDevolucion = fechaDevolucion;
	}
}