public class Trabajador extends Persona{
	private int numeroPersonal;
	private String alergias;
	private String enfermedades;
	private Prestamo prestamos[] = new Prestamo[10];


	public Trabajador(){
	}

	public Trabajador(String nombre){
		super(nombre);
	}


	public Trabajador(String nombre, String fechaNacimiento){
		super(nombre, fechaNacimiento);
	}


	//Constructor por defecto....
	public Trabajador(String nombre, String fechaNacimiento, String email, String gustosLectura, int numeroPersonal, String alergias, String enfermedades){
		super(nombre, fechaNacimiento, email, gustosLectura);

		this.numeroPersonal = numeroPersonal;
		this.alergias = alergias;
		this.enfermedades = enfermedades;
	}

	public void setNumeroPersonal(int numeroPersonal){
		this.numeroPersonal = numeroPersonal;
	}

	public int getNumeroPersonal(){
		return numeroPersonal;
	}

	public void setAlergias(String alergias){
		this.alergias = alergias;
	}

	public String getAlergias(){
		return alergias;
	}

	public void setEnfermedades(String enfermedades){
		this.enfermedades = enfermedades;
	}

	public String getEnfermedades(){
		return enfermedades;
	}

	public void realizarPrestamo(Prestamo prestamo){
		for(int i = 0; i < prestamos.length; i++){
			if (prestamos[i] == null){
				prestamos[i] = prestamo;
				break;		
			}
		}		
	}

	public void mostrarPrestamos(){
		for(int i = 0; i < prestamos.length; i++){
			if (prestamos[i] != null){
				System.out.println("Fecha de prestamo: " + prestamos[i].getFechaPrestamo());
				System.out.println("Fecha de entrega: " + prestamos[i].getFechaEntrega());
				System.out.println("Datos del socio:");
				prestamos[i].mostrarDatosSocio();
				System.out.println("Datos de copias prestadas:");			
				prestamos[i].mostrarDatosCopias();
			}
		}		
	}
			


}