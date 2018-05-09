import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class PeliculaLeerObj{
	public static void main(String args[]) throws FileNotFoundException, ClassNotFoundException, IOException{
		File f = new File("peliculas.bin");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		ois.close();
		Pelicula p = (Pelicula)obj;
		System.out.println("Titulo: " + p.getTitulo());
		System.out.println("Director: " + p.getDirector());
		System.out.println("Año: " + p.getAnio());
	}
}