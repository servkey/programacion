import java.io.*;


public class EscrituraAgregar{
	public static void main(String args[]){
		File f = new File("ejemplo_agregar.txt");
		//Escritura
		try{
			FileWriter w = new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter pw = new PrintWriter(bw);
			pw.write(args[0]);
			pw.write(": continuando...\n"); 
			pw.close();
			bw.close();

		}catch(IOException e){
			System.out.println("Error en la escritura de archivo: " + e);
		}
	}
}
