package diario;

public class InvalidFileNameException extends Exception{
	public InvalidFileNameException(){

	}

	public String toString(){
		return "Error: nombre de archivo inválido....[][]";
	}
}