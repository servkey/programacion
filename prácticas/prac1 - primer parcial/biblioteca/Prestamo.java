public class Prestamo{
	private String fechaPrestamo;
	private String fechaEntrega;
	
	private Copia copias[] = new Copia[10];
	private Socio socio;
	private Trabajador trabajador;
	
	public Prestamo(Socio socio, Trabajador trabajador, String fechaPrestamo, String fechaEntrega, Publicacion publicacion){
		this.socio = socio;
		this.trabajador = trabajador;
		this.trabajador.realizarPrestamo(this);
		this.fechaPrestamo = fechaPrestamo;
		this.fechaEntrega = fechaEntrega;
		String codCopia = asociarCopia(publicacion);
		System.out.println("Codigo de copia en el constructor: " + codCopia);
	}

	public String asociarCopia(Publicacion publicacion){
		String codCopia = null;
		Copia copia = null;
		for (int i = 0; i < publicacion.getCopias().length; i++){
			if (publicacion.getCopias()[i] != null){
				//Tiene copias
				if (publicacion.getCopias()[i].estaPrestada() == false){
					copia = publicacion.getCopias()[i];
					break;
				}
			}
		}
	
		if (copia != null)
		{
			for (int i = 0; i < copias.length; i++){
				if (copias[i] == null){
					copias[i] = copia;
					copia.asociarPrestamo(this);
					codCopia = copia.getCodCopia();
					break;
				}
			}
		}
		
		return codCopia;		
	}

	public void mostrarDatosTrabajador(){
		System.out.println("Nombre del trabajador: " + trabajador.getNombre());
	}

	public void mostrarDatosSocio(){
		System.out.println("Nombre del socio: " + socio.getNombre());		
	}

	public void mostrarDatosCopias(){
		for (int i = 0; i < copias.length; i++){
			if (copias[i] != null){
				System.out.println("Código copia: " + copias[i].getCodCopia());
			}
		}
	}

	public void setFechaPrestamo(String  fechaPrestamo){
		this.fechaPrestamo = fechaPrestamo;
	}

	public Trabajador getTrabajador(){
		return trabajador;
	}

	public Socio getSocio(){
		return socio;
	}

	public String getFechaPrestamo(){
		return fechaPrestamo;
	}

	public void setFechaEntrega(String  fechaEntrega){
		this.fechaEntrega = fechaEntrega;
	}

	public String getFechaEntrega(){
		return fechaEntrega;
	}

}