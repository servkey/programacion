import java.io.*;
public class Ejercicio5{
	public static void main(String args[]){
		try{
			File f = new File("puente.txt");	
			FileOutputStream fiw = new FileOutputStream(f);
			OutputStreamWriter osr = new OutputStreamWriter(fiw);
			BufferedWriter bw = new BufferedWriter(osr);
			PrintWriter pw = new PrintWriter(bw);

			pw.println("Buenos días, no hubo puente :)!!");
			pw.close();
			bw.close();
		}catch(FileNotFoundException e){
			System.out.println("Error : archivo no encontrado....");
		}

	}
}