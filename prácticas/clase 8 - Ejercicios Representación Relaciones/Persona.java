public class Persona{
	private String nombre;
	private String fechaNacimiento;
	private String email;
	private String enfermedades;
	private String alergias;
	private String situacionMarital;
	private String antiguedad;
	private String gustos;

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getFechaNacimiento(){
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}


	public String getEnfermedades(){
		return enfermedades;
	}

	public void setEnfermedades(String enfermedades){
		this.enfermedades = enfermedades;
	}

	public String getAlergias(){
		return alergias;
	}

	public void setAlergias(String alergias){
		this.alergias = alergias;
	}

	public String getSituacionMarital(){
		return situacionMarital;
	}

	public void setSituacionMarital(String situacionMarital){
		this.situacionMarital = situacionMarital;
	}

	public String getAntiguedad(){
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad){
		this.antiguedad = antiguedad;
	}

	public String getGustos(){
		return gustos;
	}

	public void setGustos(String gustos){
		this.gustos = gustos;
	}
}