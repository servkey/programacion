import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class ServidorTest{
	public static void main(String args[]){
		int puerto = 5000;
		try{
			System.out.println("Iniciando servidor.....: [" + puerto + "]");

			ServerSocket servidor = new ServerSocket(puerto);
			Socket cliente = servidor.accept();

			System.out.println("Cliente conectado....");
			InputStream is = cliente.getInputStream();			
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader in = new BufferedReader(isr);
			
			String texto_cliente = in.readLine();
			//Segunda línea
			texto_cliente += "\n" + in.readLine();
			//Tercera línea
			texto_cliente += "\n" + in.readLine();
			//Cuarta línea
			texto_cliente += "\n" + in.readLine();
			
			System.out.println("Mensaje enviado por el cliente: \n" + texto_cliente);

			OutputStream os = cliente.getOutputStream();			
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter out = new PrintWriter(bw);
			
			out.println("Saludado desde el servidor....");
			out.flush();
			cliente.close();
		}catch(IOException e){
			System.out.println("El servidor no pude ser iniciado en el puerto: " + puerto);
		}		

	}
}