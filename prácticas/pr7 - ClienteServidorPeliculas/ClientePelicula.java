import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientePelicula{

	public void conectar(String ip, int puerto) throws IOException{
		System.out.println("Intentando conectarse a servidor.....");
	
		Socket cliente = new Socket(ip, puerto);
		System.out.println("Conexión exitosa....");

		//Creando objetos para lectura
		InputStream is = cliente.getInputStream();			
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader in = new BufferedReader(isr);
			
		//Creando objetos para escritura
		OutputStream os = cliente.getOutputStream();			
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter out = new PrintWriter(bw);

		//Lectura del teclado
		Scanner lecturaconsola = new Scanner(System.in);	
			
		//Leyendo petición del servidor
		String ptitulo = in.readLine();

		System.out.println(ptitulo);
		String titulo = lecturaconsola.nextLine();

		out.println(titulo);
		out.flush();

		String pdirector = in.readLine();
		System.out.println(pdirector);
		String director = lecturaconsola.nextLine();

		out.println(director);
		out.flush();

		String panio = in.readLine();
		System.out.println(panio);
		String anio = lecturaconsola.nextLine();

		out.println(anio);
		out.flush();

		out.close();
		in.close();
		cliente.close();
		System.out.println("Cerrando conexión...");
	}

	public static void main(String args[]){
		try{
			String ip = args[0];
			int puerto = Integer.parseInt(args[1]);
			
			ClientePelicula cp = new ClientePelicula();
			cp.conectar(ip, puerto);
		}catch(IOException e){
			System.out.println("El cliente no pudo conectarse....");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Parámetros inválidos: java ClientePelicula <ip> <puerto>");
		}
	}
	

}