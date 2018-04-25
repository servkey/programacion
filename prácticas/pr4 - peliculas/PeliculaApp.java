import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PeliculaApp{
	public static void guardar(String na, Pelicula p){
		try{
			File f = new File(na);
			FileOutputStream fos = new FileOutputStream(f, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter out = new PrintWriter(bw);
			out.println(p.toString());

			out.close();
		}catch(FileNotFoundException e){
			System.out.println("Archivo no encontrado....");
		}
	}	
		
	public static void main(String args[]){
		String na = "peliculas.txt";
		
		String r = "";

		do{
			Scanner in = new Scanner(System.in);
			Pelicula p = new Pelicula();

			System.out.println("Ingrese datos película");
			System.out.print("Título: ");
			String t = in.nextLine();	
			p.setTitulo(t);
			
			System.out.print("\nDirector: ");
			String d = in.nextLine();	
			p.setDirector(d);

			System.out.print("\nAño: ");
			String a = in.nextLine();	
			p.setAnio(a);
			
			guardar(na, p);

			System.out.println("\nDesea ingresar otra película: ");
			r = in.nextLine();	
		}while(r.equals("S"));

	}
}