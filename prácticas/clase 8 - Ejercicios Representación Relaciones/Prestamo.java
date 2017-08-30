public class Prestamo{
	private String fechaEntrega;
	private String fechaPrestamo;

	//Relaciones 
	private Copia copias[] = new Copia[10];
	private	Socio socio;
	private Trabajador trabajadores[] = new Trabajador[10];
	private Sede sede;
	
	private int indiceCopias = 0;
	private int indiceTrabajadores = 0;

	public Prestamo(Sede sede, Copia copia, Trabajador trabajador, Socio socio){
		this.sede = sede;
		this.copias[indiceCopia++] = copia;
		this.trabajadores[indiceTrabajadores++] = trabajador;
		this.socio = socio;
	}

	public Prestamo(Sede sede, Copia copias[], Trabajador trabajador, Socio socio){
		this.sede = sede;
		this.copias = copias;
		this.trabajadores[indiceTrabajadores++] = trabajador;
		this.socio = socio;
	}

	public Prestamo(Sede sede, Copia copias[], Trabajador trabajadores[], Socio socio){
		this.sede = sede;
		this.copias = copias;
		this.trabajadores = trabajadores;
		this.socio = socio;


	}


}