wwwwimport java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente{
	public static void main(String args[]){
		try{
			Socket socket = new Socket("localhost", 9090);
			//Escribiendo 
			System.out.println("Enviando información al servidor.....:");

			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osr = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osr);
			PrintWriter pw = new PrintWriter(bw);
			pw.write("Saludos desde el cliente Java \n");
			pw.flush();


			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Leyendo del servidor Java personalizado");
			
			String texto = br.readLine();

			while (texto != null){
				System.out.println(texto);
				texto = br.readLine();
			}

					
	
			pw.close();
			bw.close();
			br.close();
			socket.close();
		}catch(UnknownHostException ue){
			System.out.println("Error: host no encontrado...");
		}catch(IOException ioe){
			System.out.println("Error de escritura o lectura en socket...." + ioe);
		}

	}
}