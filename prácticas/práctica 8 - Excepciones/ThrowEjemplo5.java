import java.io.*;
public class ThrowEjemplo5{
	public static void main(String args[]) throws FileNotFoundException{
		System.out.println("Antes de Lanzar");
		throw new FileNotFoundException();
	}
}

