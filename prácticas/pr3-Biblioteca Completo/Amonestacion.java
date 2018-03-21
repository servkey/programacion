public class Amonestacion{
	private float multa;
	private String fecha;

	//Asociacion bidireccional
	private Prestamo prestamo;
	private Socio socio;

	public void setMulta(float multa){
		this.multa = multa;
	}


	public float getMulta(){
		return multa;
	}

	public void setFecha(String fecha){
		this.fecha = fecha;
	}


	public String getFecha(){
		return fecha;
	}


	public void asociarSocio(Socio socio){
		this.socio = socio;
	}

	public void desasociarSocio(){
		socio = null;
	}
	public void asociarPrestamo(Prestamo prestamo){
		this.prestamo = prestamo;
	}

	public void desasociarPrestamo(){
		prestamo = null;
	}
}