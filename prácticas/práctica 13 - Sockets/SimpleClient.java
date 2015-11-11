import java.io.*;
import java.net.*;
public class SimpleClient{
	public static void main(String args[]){
		String hostName = args[0];
		int portNumber = Integer.parseInt(args[1]);
		try{
			Socket echoSocket = new Socket(hostName, portNumber);
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
			//Lectura en entrada estándar - consola
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
			String userInput;
			while ((userInput = stdIn.readLine()) != null) {
			    out.println(userInput);
			    System.out.println("echo: " + in.readLine());
			}
		}catch(Exception e){

		}

	}	
}

