public class Copia{
	private String punto;
	private int identificador;
	//Relación de asociación
	private Libro libro;

	public void setPunto(String punto){
		this.punto = punto;
	}

	public String getPunto(){
		return punto;
	}

	public void setIdentificador(int identificador){
		this.identificador = identificador;
	}

	public int getIdentificador(){
		return identificador;
	}

	public void mostrarDatosLibro(){
		if (libro != null){
			System.out.println("********************************");
			System.out.println("Datos del libro al que está asociada a la copia: " + identificador);
			System.out.println("Titulo de libro: " + libro.getTitulo());
			System.out.println("Autores de libro: " + libro.getAutores());
			System.out.println("********************************");
		}else{
			System.out.println("No existe libro asociado...");
		}
	}

	public void asociarLibro(Libro libro){
		this.libro = libro;
	}

}