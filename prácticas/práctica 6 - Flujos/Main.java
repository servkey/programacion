import java.io.*;

public class Main{
	public static void main(String args[]) throws Exception{
		//System.setOut(new PrintStream(new FileOutputStream("salida.txt")));
		//System.setErr(new PrintStream(new FileOutputStream("errores.txt")));
 
		int in = 0;
		//while (in != -1){
			//System.out.println("Escribe una letra: ");
			in = System.in.read();
			System.out.println("Escribiste: " + in);
		//}
		System.out.println("Hola!");
		System.err.println("Hola!");
	}
}