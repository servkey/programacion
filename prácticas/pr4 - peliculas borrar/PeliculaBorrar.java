import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class PeliculaBorrar{
	public static void main(String args[]){
		try{
			//Hacer la lectura del archivo....
			Scanner con = new Scanner(System.in);
			String na = "peliculas.txt";			

			File f = new File(na);
			String atmp = na + ".tmp";

			File fn = new File(atmp);

			FileInputStream fis = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			in.mark(1000);

			String linea;
			int nl = 1;

			while((linea = in.readLine()) != null){		
				System.out.println((nl++) + ":\t" + linea);
			}


			FileOutputStream fos = new FileOutputStream(fn, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter out = new PrintWriter(bw);



			System.out.print("Escriba la # línea a eliminar:");
			int numeroLinea = con.nextInt();
			nl = 1;
			System.out.println("Leyendo nuevamente....");
			in.reset();
			while((linea = in.readLine()) != null){	

				if (nl != numeroLinea){
					out.println(linea);	
					System.out.println((nl) + ":\t" + linea);
				}
				else	
					System.out.println("**Eliminando línea " + numeroLinea + "****");
				nl++;
			}				
			in.close();
			out.close();
			f.delete();
			boolean rf = fn.renameTo(new File(na));
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}