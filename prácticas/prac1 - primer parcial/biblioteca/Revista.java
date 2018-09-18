public class Revista extends Publicacion{
	private String issn;
	private String indice;

	public Revista(){
	}

	public Revista(String genero, String idioma, String autores, String titulo, String fechaPublicacion, String issn, String indice){
		super(genero, idioma, autores, titulo, fechaPublicacion);
		this.issn = issn;
		this.indice = indice;
	}	

	public void setIssn(String issn){
		this.issn = issn;
	}

	public String getIssn(){
		return issn;
	}

	public void setIndice(String indice){
		this.indice = indice;
	}

	public String getIndice(){
		return indice;
	}
}