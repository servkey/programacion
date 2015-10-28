import java.io.*;


public class Escritura{
	public static void main(String args[]){
		File f = new File("ejemplo.txt");
		//Escritura
		try{
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter pw = new PrintWriter(bw);
			pw.write(args[0]);
			pw.write(": continuando..."); 
			pw.close();
			bw.close();

		}catch(IOException e){
			System.out.println("Error en la escritura de archivo: " + e);
		}
	}
}
