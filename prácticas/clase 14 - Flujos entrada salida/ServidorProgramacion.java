import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

import java.net.UnknownHostException;

public class ServidorProgramacion{
	public static void main(String args[]){
		try{

			ServerSocket ss = new ServerSocket(9090);
			System.out.println("Escuchando en el puerto 9090!");
			Socket s = ss.accept();

			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String texto = br.readLine();
			while (texto != null){
				System.out.println(texto);
				texto = br.readLine();
			}

			
			

		}catch(IOException e){
		}
	}
}