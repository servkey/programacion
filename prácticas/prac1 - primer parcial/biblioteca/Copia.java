public class Copia{
	private String codCopia;
	private Publicacion publicacion;
	private Prestamo prestamo;
	
	public Copia(Publicacion publicacion){
		this.publicacion = publicacion;
	}
	
	public Copia(String codCopia){
		this.codCopia = codCopia;
	}
	
	public void setCodCopia(String codCopia){
		this.codCopia = codCopia;
	}

	public boolean estaPrestada(){
		boolean resultado = false;
		if (prestamo != null){
			resultado = true;
		}
		return resultado;
	}

	public String getCodCopia(){
		return codCopia;
	}

	public void asociarPrestamo(Prestamo prestamo){
		this.prestamo = prestamo;
	}

	public void desasociarPrestamo(){
		this.prestamo = null;
	}

	public void informacionDetallada(){
		System.out.println("Titulo: " + publicacion.getTitulo());
		System.out.println("Autores: " + publicacion.getAutores());

	}
	
}