public class Revista extends Publicacion{
	private String ISSN;
	private String indice;
	
	public Revista(){
	}

	public Revista(Date fechaPublicacion, String genero, String titulo, String ISSN, String indice){
		super(fechaPublicacion, genero, titulo);
		this.ISSN = ISSN;
		this.indice = indice;
	}
	

	public String getISSN(){
		return ISSN;
	}

	public void setISSN(String ISSN){
		this.ISSN = ISSN;
	}


	public String getIndice(){
		return indice;
	}

	public void setIndice(String indice){
		this.indice = indice;
	}

}