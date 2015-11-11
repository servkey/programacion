import java.io.*;
import java.net.*;
public class SimpleServer{
	public static void main(String args[]){
		int portNumber = Integer.parseInt(args[0]);
		try{
			ServerSocket serverSocket = new ServerSocket(portNumber);
			Socket clientSocket = serverSocket.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("Aceptando Conexión desde " + clientSocket.getRemoteSocketAddress().toString());
			String inputLine, outputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println("Recibiendo desde un cliente: " + inputLine);
				outputLine = "Hola desde el servidor :)";
				out.println(outputLine);
				if (inputLine.equals("Adios"))
			            break;
		  	}

		}catch(Exception e){

		}

	}	
}

