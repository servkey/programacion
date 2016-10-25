import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;


public class Ejercicio3{
	public static void main(String args[]){
		//System.in

		//System.in = InputStream
		//InputSream
		//FileInputSream
		
		try{
			System.out.println("Escribe algo:");
			InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("Ejercicio2.java")));
		
			BufferedReader br = new BufferedReader(isr);
				
			String s = br.readLine();
			System.out.println("Escribiste: " + s);

			/*int numero = Integer.parseInt(s);
			int resultado = numero * 19;
			System.out.println("Res: " + resultado);*/			

		}catch(FileNotFoundException eF){

		}catch(IOException e){

		}catch(NumberFormatException e1){
			System.err.println("No escribiste un número");
		}
	}
}


