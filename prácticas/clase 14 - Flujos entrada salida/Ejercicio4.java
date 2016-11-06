import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;


public class Ejercicio4{
	public static void main(String args[]){
		//System.in

		//System.in = InputStream
		//InputSream
		//FileInputSream
		
		try{
			BufferedReader brTeclado = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Escribe nombre de archivo: ");
			String nombre = brTeclado.readLine();
	

			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(nombre))));

			System.out.println("El archivo tiene el siguiente contenido: ");

			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

			String s = br.readLine();
			while(s != null){
				System.out.println(s);	
				s = br.readLine();
			}
			/*int numero = Integer.parseInt(s);
			int resultado = numero * 19;
			System.out.println("Res: " + resultado);*/			
			br.close();
		}catch(FileNotFoundException eF){

		}catch(IOException e){

		}catch(NumberFormatException e1){
			System.err.println("No escribiste un número");
		}
	}
}


